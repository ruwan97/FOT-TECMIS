/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fot;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Ishanka
 */
public class Student {
    private  String student_ID=null;
    private  String Name=null;
    private String Address=null;
    private String Telephone_No=null;
    private String Gender=null;
    private String Department_ID=null;
    private String Mentor_ID=null;
    private byte[] picture=null;
    private static String Regno=null;
    
    public void setRegno(String regno)
    {
        this.Regno=regno;
    }
    public String getRegno()
    {
        return Regno;
    }
    
    
    //get database connection
    Connection con=MyConnection.getConnection();
    
    
    public void setstudent_ID(String sid)
    {
        this.student_ID=sid;
    }
    
    public void setName(String sname)
    {
        this.Name=sname;
    }
    
    public void setAddress(String add)
    {
        this.Address=add;
    }
    
    public void setTelephone_NO(String tpno)
    {
        this.Telephone_No=tpno;
    }
    
    public void setGender(String gen)
    {
        this.Gender=gen;
    }
      
    public void setDepartment_ID(String depid)
    {
        this.Department_ID=depid;
    }
    
    public void setMentor_ID(String menid)
    {
        this.Mentor_ID=menid;
    }
    
    public String getstudent_ID()
    {
        return student_ID;
    }
    
     public String getName()
    {
        return Name;
    }
     
     public String getAddress()
    {
        return Address;
    }
     
     public String getTelephone_NO()
    {
       return Telephone_No;
    }
    
    public String getGender()
    {
        return Gender;
    }
      
    public String getDepartment_ID()
    {
        return Department_ID;
    }
    
    public String getMentor_ID()
    {
        return Mentor_ID;
    }
    
    public byte[] getPicture() {
        return picture;
    }

   
    public void setPicture(byte[] picture) {
        this.picture = picture;
    }
    public void updateStudent()
    {
        if(getAddress().equals("")||getTelephone_NO().equals(""))
        {
            JOptionPane.showMessageDialog(null,"You have to fill all the fields");
        }
        else
        {
            try
            {
               Connection con=MyConnection.getConnection();
               String sql="UPDATE student set stu_p_no='"+getTelephone_NO()+"',stu_address='"+getAddress()+"',image='"+getPicture()+"' where stu_id='"+getRegno()+"' " ;
               PreparedStatement ps=con.prepareStatement(sql);
               ps.execute();
               JOptionPane.showMessageDialog(null, "Data update successfully");
            }catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }    
        }
    }
    void seeAttendance()
    {
        
    }
    
    void seeMedicals()
    {
    
    }
    ResultSet seeCoursedetails()
    {
      String sql="SELECT `sub_dept_id` AS 'Department ID', `sub_id` AS 'Subject ID', `sub_name` AS 'Subject Name', `lec_id` AS 'Lecturer ID' FROM `subject`";
       ResultSet re=null;
        try {
            PreparedStatement st=con.prepareStatement(sql);
            re=st.executeQuery();
            return re;
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
        return re;
    }
    void seeGrades()
    {
    
    }
    
    void timeTable()
    {
    
    }
    ResultSet seeNotices()
    {
        String sql="select `no` AS 'Notice No',`date` AS 'Date',`title` AS 'Title',`notice` AS 'Notice' from notice";  
            
        ResultSet re=null;
        try{
            PreparedStatement st=con.prepareStatement(sql);
            re=st.executeQuery();
            return re;
        } catch(SQLException ex){
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
        return re;
        
       
    }

   
    
    
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fot;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author user
 */
public class Course {
    private String depId=null;
    private String subId=null;
    private String subName=null;
    private String lecId=null;
 
    public void setCourseDepId(String depId)
    {
        this.depId=depId;
    }
    
    public void setCourseSubId(String subId)
    {
        this.subId=subId;
    }
    
    public void setCourseSubName(String subName)
    {
        this.subName=subName;
    }
    
    public void setCourseLecId(String lecId)
    {
        this.lecId=lecId;
    }
    
    public String getCourseDepId()
    {
        return depId;
    }
    
    public String getCourseSubId()
    {
        return subId;
    }
    
    public String getCourseSubName()
    {
        return subName;
    }
    
    public String getCourseLecId()
    {
        return lecId;
    }
    
    public void createCourse()
    {
        Connection con=null;
        
        try
        {
       
            
                con=MyConnection.getConnection();
                String result="insert into subject(sub_dept_id,sub_id,sub_name,lec_id) values('"+getCourseDepId()+"','"+getCourseSubId()+"','"+getCourseSubName()+"','"+getCourseLecId()+"')";
                PreparedStatement ps=con.prepareStatement(result);
                ps.execute();
                javax.swing.JOptionPane.showMessageDialog(null, "Data added successfully");
          
                          
        }
        
        catch(Exception e)
        {
                javax.swing.JOptionPane.showMessageDialog(null,e);
        }
}
     public ResultSet searchCourse(String subId) 
    {
        ResultSet rs=null;
        try{
            Connection con=MyConnection.getConnection();
            String sql="SELECT * FROM subject WHERE sub_id='"+subId+"' LIMIT 1";
            PreparedStatement ps=con.prepareCall(sql);
            rs=ps.executeQuery();
        }
        catch(Exception e)
        {
            javax.swing.JOptionPane.showMessageDialog(null, e);
        }    
        return rs;
    }      
     
     public void editCourse()
    {
        Connection con=null;
        
        try
        {
            con=MyConnection.getConnection();
            String result="update subject set sub_dept_id='"+ getCourseDepId()+"',sub_name='"+ getCourseSubName()+"',lec_id='"+ getCourseLecId()+"' where sub_id='"+ getCourseSubId()+"'";
            PreparedStatement ps=con.prepareStatement(result);
            ps.execute();
            javax.swing.JOptionPane.showMessageDialog(null, "Data update successfully");
            
            
        }
        
        catch(Exception e)
        {
            javax.swing.JOptionPane.showMessageDialog(null, e);
        }
    }
     
     
      public void deleteCourse()
    {
        Connection con=null;
        
        try
        {
            con=MyConnection.getConnection();
            String result="delete from subject where Sub_id='"+getCourseSubId()+"'";
            PreparedStatement ps=con.prepareStatement(result);
            ps.execute();
            javax.swing.JOptionPane.showMessageDialog(null, "Data delete successfully");
        }
        
        catch(Exception e)
        {
            
            javax.swing.JOptionPane.showMessageDialog(null, e);
        }
    }
    
}

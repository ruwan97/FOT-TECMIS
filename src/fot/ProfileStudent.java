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
public class ProfileStudent {
    
    
   
    private String depId=null;
    private String menterId=null;
    private String gender=null;
    private String id=null;
    private String name=null;
    private String add=null;
    private String bday=null;
    private String pno=null;
    private String pwd=null;
    private byte[] picture=null;
    
  
    public void setProfileDepId(String depId)
    {
        this.depId=depId;
    }
    
    public void setProfileLecId(String menterId)
    {
        this.menterId=menterId;
    }
    
    public void setProfileGender(String gender)
    {
        this.gender=gender;
    }
    
    public void setProfileStuId(String id )
    {
        this.id=id;
    }
    
     public void setProfileStuName(String name )
    {
        this.name=name;
    }
     
     public void setProfileStuAddress(String add )
    {
        this.add=add;
    }
     
     public void setProfileStuBday(String bday )
    {
        this.bday=bday;
    }
     
     public void setProfileStuPno(String pno )
    {
        this.pno=pno;
    }
     
     
     public void setProfileStuPwd(String pwd )
    {
        this.pwd=pwd;
    }
     
     public void setProfilePic(byte[] picture )
    {
        this.picture=picture;
    }
     
     
    public String getProfileDepId()
    {
        return depId;
    }
    
    public String getProfileLecId()
    {
        return menterId;
    }
    
    public String getProfileGender()
    {
        return gender;
    }
    
    public String getProfileId()
    {
        return id;
    }
    
     public String getProfileName( )
    {
        return name;
    }
     
     public String getProfileAddress()
    {
        return add;
    }
     
     public String getProfileBday( )
    {
        return bday;
    }
     
     public String getProfilePno( )
    {
        return pno;
    }
       
     public String getProfilePwd( )
     {
        return pwd;
    }
     
       
    public byte[] getProfilePic()
    {
        return picture;
    }
    
    
   
    
    public void createProfileStudent()
    {
        Connection con=null;
        
        try
        {
                con=MyConnection.getConnection();
                String result="insert into student(stu_dept_id,menter_id,gender,stu_id,stu_name,stu_address,stu_b_day,stu_p_no,image) "+ "values('"+getProfileDepId()+"','"+getProfileLecId()+"','"+getProfileGender()+"','"+getProfileId()+"','"+getProfileName()+"','"+getProfileAddress()+"','"+getProfileBday()+"','"+getProfilePno()+"','"+getProfilePic()+"')";
                PreparedStatement ps=con.prepareStatement(result);
                ps.execute();
                
                String result1="insert into user(user_id,user_pwd)" +"values('"+getProfileId()+"','"+getProfilePwd()+"')";
                PreparedStatement ps1=con.prepareStatement(result1);
                ps1.execute();
                
                javax.swing.JOptionPane.showMessageDialog(null, "Data added successfully");             
        }
        
        catch(Exception e)
        {
                javax.swing.JOptionPane.showMessageDialog(null,e);
        }
    }
    
     public ResultSet searchProfile(String stuId) 
    {
        Edit_Profile edit=new Edit_Profile();
        
        
        
        ResultSet rs=null;
        try{
            Connection con=MyConnection.getConnection();
            String sql="SELECT s.stu_id,s.stu_dept_id,s.menter_id,s.stu_name,s.stu_address,s.stu_b_day,s.stu_p_no,s.gender,s.image,u.user_pwd FROM student s, user u WHERE s.stu_id = u.user_id and s.stu_id='"+stuId+"' LIMIT 1";
            PreparedStatement ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            
        }
        catch(Exception e)
        {
            javax.swing.JOptionPane.showMessageDialog(null, e);
        }    
        return rs;
    }
     
    public void editProfile()
    {
        Connection con=null;
        
        try
        {
            con=MyConnection.getConnection();
            String result="update student set stu_dept_id='"+ getProfileDepId()+"',menter_id='"+ getProfileLecId()+"',gender='"+ getProfileGender()+"',stu_name='"+ getProfileName()+"',stu_address='"+ getProfileAddress()+"',stu_b_day='"+ getProfileBday()+"', stu_p_no='"+ getProfilePno()+"', image='"+getProfilePic()+"' where stu_id='"+ getProfileId()+"'";
            PreparedStatement ps=con.prepareStatement(result);
            ps.execute();
            String result1="update user set user_pwd='"+getProfilePwd()+"' where user_id='"+getProfileId()+"'";
            PreparedStatement ps1=con.prepareStatement(result1);
            ps1.execute();
            
            
            
            javax.swing.JOptionPane.showMessageDialog(null, "Data update successfully");
            
            
        }
        
        catch(Exception e)
        {
            javax.swing.JOptionPane.showMessageDialog(null, e);
        }
    }
    
     public void deleteProfile()
    {
        Connection con=null;
        
        
        try
        {
            con=MyConnection.getConnection();
            
            String result="delete from student where stu_id='"+getProfileId()+"'";
            PreparedStatement ps=con.prepareStatement(result);
            ps.execute();
            
            String result1="delete from user where user_id='"+getProfileId()+"'";
            PreparedStatement ps1=con.prepareStatement(result1);
            ps1.execute();
            
            javax.swing.JOptionPane.showMessageDialog(null, "Data delete successfully");
        }
        
        catch(Exception e)
        {
            
            javax.swing.JOptionPane.showMessageDialog(null, e);
        }
    }
      
}












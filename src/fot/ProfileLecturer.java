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
public class ProfileLecturer {
 
    private String depId=null;
    private String gender=null;
    private String id=null;
    private String name=null;
    private String add=null;
    private String pno=null;
    private String pwd=null;
    private byte[] picture=null;
    
  
    public void setProfileLecturerDepId(String depId)
    {
        this.depId=depId;
    }
    
    public void setProfileLecturerGender(String gender)
    {
        this.gender=gender;
    }
    
    public void setProfileLecturerId(String id )
    {
        this.id=id;
    }
    
     public void setProfileLecturerName(String name )
    {
        this.name=name;
    }
     
     public void setProfileLecturerAddress(String add )
    {
        this.add=add;
    }
     
     public void setProfileLecturerPno(String pno )
    {
        this.pno=pno;
    }
     
     
     public void setProfileLecturerPwd(String pwd )
    {
        this.pwd=pwd;
    }
     
     public void setProfileLecturerPic(byte[] picture )
    {
        this.picture=picture;
    }
     
     
    public String getProfileDepId()
    {
        return depId;
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
    
   
    
    public void createProfileLecturer()
    {
        Connection con=null;
        
        try
        {
                con=MyConnection.getConnection();
                String result="insert into lecturer(lec_dept_id,gender,lec_id,lec_name,lec_address,lec_p_no,image) "+ "values('"+getProfileDepId()+"','"+getProfileGender()+"','"+getProfileId()+"','"+getProfileName()+"','"+getProfileAddress()+"','"+getProfilePno()+"','"+getProfilePic()+"')";
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
    
    
     public ResultSet searchProfile(String lecId) 
    {
        Edit_Profile edit=new Edit_Profile();
        
        
        
        ResultSet rs=null;
        try{
            Connection con=MyConnection.getConnection();
            String sql="SELECT l.lec_id,l.lec_dept_id,l.lec_name,l.lec_address,l.lec_p_no,l.gender,l.image,u.user_pwd FROM  lecturer l, user u WHERE l.lec_id = u.user_id and l.lec_id='"+lecId+"' LIMIT 1";
            PreparedStatement ps=con.prepareStatement(sql);
            
            rs=ps.executeQuery();
            
               
              
                
        }
        catch(Exception e)
        {
            javax.swing.JOptionPane.showMessageDialog(null, e);
        }    
        return rs;
    }
     
     public void editProfileLecturer()
     {
        Connection con=null;
        
        try
        {
           con=MyConnection.getConnection();
           
            String result="update lecturer set lec_dept_id='"+ getProfileDepId()+"',gender='"+ getProfileGender()+"',lec_name='"+ getProfileName()+"',lec_address='"+ getProfileAddress()+"',lec_p_no='"+getProfilePno()+"',image='"+getProfilePic()+"' where lec_id='"+ getProfileId()+"'";
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
            
            String result="delete from lecturer where lec_id='"+getProfileId()+"'";
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

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
public class ProfileTecnical {
    
       
   
    private String depId=null;
    private String gender=null;
    private String id=null;
    private String name=null;
    private String pno=null;
    private String pwd=null;
    private byte[] picture=null;
    
  
    public void setProfileDepId(String depId)
    {
        this.depId=depId;
    }
    
   
    public void setProfileGender(String gender)
    {
        this.gender=gender;
    }
    
    public void setProfileId(String id )
    {
        this.id=id;
    }
    
     public void setProfileName(String name )
    {
        this.name=name;
    }
    
     
     public void setProfilePno(String pno )
    {
        this.pno=pno;
    }
     
     
     public void setProfilePwd(String pwd )
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
    
    
   
    
    public void createProfileTecnical()
    {
        Connection con=null;
        
        try
        {
                con=MyConnection.getConnection();
                String result="insert into tecnical_officer(tec_dept_id,gender,tec_id,tec_name,tec_p_no,image) "+ "values('"+getProfileDepId()+"','"+getProfileGender()+"','"+getProfileId()+"','"+getProfileName()+"','"+getProfilePno()+"','"+getProfilePic()+"')";
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
    
      public ResultSet searchProfile(String tecId) 
    {
        Edit_Profile edit=new Edit_Profile();
        
        
        
        ResultSet rs=null;
        try{
            Connection con=MyConnection.getConnection();
            String sql="SELECT t.tec_id,t.tec_dept_id,t.tec_name,t.tec_p_no,t.gender,t.image,u.user_pwd FROM tecnical_officer t, user u WHERE t.tec_id = u.user_id and t.tec_id='"+tecId+"' LIMIT 1";
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
           
            String result="update tecnical_officer set tec_dept_id='"+ getProfileDepId()+"',gender='"+ getProfileGender()+"',tec_name='"+ getProfileName()+"',tec_p_no='"+ getProfilePno()+"',image='"+getProfilePic()+"' where tec_id='"+ getProfileId()+"'";
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
            
            String result="delete from tecnical_officer where tec_id='"+getProfileId()+"'";
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

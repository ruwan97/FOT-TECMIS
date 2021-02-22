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
public class ProfileAdmin {
    
         
   
    private String gender=null;
    private String id=null;
    private String name=null;
    private String pno=null;
    private String pwd=null;
    private byte[] picture=null;
    
  
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
   
    }
    
   
     
    



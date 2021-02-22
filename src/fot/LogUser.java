/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fot;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author user
 */
public class LogUser {

  
    private static String id=null;
    private String name=null;
    private String gender=null;
    private String pno=null;
    private String pwd=null;
    private byte[] picture=null;

    
    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
    
     public void setName(String name) {
        this.name = name;
    }
     
     public String getName() {
        return name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public String getGender() {
        return gender;
    }

    public void setPno(String pno) {
        this.pno = pno;
    }
    
    public String getPno() {
        return pno;
    }
    
    
    public static void setId(String aId) {
        id = aId;
    }
    
    public static String getId() {
        return id;
    }
    
     public byte[] getPicture() {
        return picture;
    }

    public void setPicture(byte[] picture) {
        this.picture = picture;
    }
    
    
     public void editProfile()
    {
        Connection con=null;
        
        try
        {
            con=MyConnection.getConnection();
           
            String result="update admin set gender='"+ getGender()+"',ad_name='"+ getName()+"',ad_p_no='"+ getPno()+"',image='"+ getPicture()+"' where ad_id='"+ getId()+"'";
            PreparedStatement ps=con.prepareStatement(result);
            ps.execute();
            
            String result1="update user set user_pwd='"+getPwd()+"' where user_id='"+getId()+"'";
            PreparedStatement ps1=con.prepareStatement(result1);
            ps1.execute();
         
            javax.swing.JOptionPane.showMessageDialog(null, "Data update successfully");
            
            
        }
        
        catch(Exception e)
        {
            javax.swing.JOptionPane.showMessageDialog(null, e);
        }
    }


   
}

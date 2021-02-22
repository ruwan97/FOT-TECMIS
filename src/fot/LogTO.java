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
public class LogTO {

    private static String id=null;
    private String depId=null;
    private String name=null;
    private String gender=null;
    private String pno=null;
    

     public void setDepId(String depId) {
        this.depId = depId;
    }
     
     public String getDepId() {
        return depId;
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
    
    
    public static void setId(String tId) {
        id = tId;
    }
    
    public static String getId() {
        return id;
    }
    
    
     public void editProfile()
    {
        Connection con=null;
        
        try
        {
            con=MyConnection.getConnection();
           
            String result="update tecnical_officer set tec_p_no='"+ getPno()+"' where tec_id='"+ getId()+"'";
            PreparedStatement ps=con.prepareStatement(result);
            ps.execute();
         
             javax.swing.JOptionPane.showMessageDialog(null, "Data update successfully");
            
            
        }
        
        catch(Exception e)
        {
            javax.swing.JOptionPane.showMessageDialog(null, e);
        }
    }
    
}

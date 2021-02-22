/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fot;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class MyConnection {
    public static Connection getConnection()
    {
        Connection con=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tecmis","root","123");
        }catch(Exception e)
        {
            javax.swing.JOptionPane.showMessageDialog(null, e);
            Logger.getLogger(MyConnection.class.getName()).log(Level.SEVERE,null,e);
            System.err.println(e);
        }    
        return con;
    }
    public static void main(String args[])
            
    {
        getConnection();
    }        
}

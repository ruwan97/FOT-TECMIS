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
public class tec_att {
    
    
    private String type=null;
    private String status=null;
    private String id=null;
    private String sub=null;
    private String day=null;
    private String hours=null;

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the sub
     */
    public String getSub() {
        return sub;
    }

    /**
     * @param sub the sub to set
     */
    public void setSub(String sub) {
        this.sub = sub;
    }

    /**
     * @return the day
     */
    public String getDay() {
        return day;
    }

    /**
     * @param day the day to set
     */
    public void setDay(String day) {
        this.day = day;
    }

    /**
     * @return the hours
     */
    public String getHours() {
        return hours;
    }

    /**
     * @param hours the hours to set
     */
    public void setHours(String hours) {
        this.hours = hours;
    }
   
     public void createAtt()
    {
        Connection con=null;
        
        try
        {  
                con=MyConnection.getConnection();
                String result="insert into attendance(stu_id,sub_id,type,status,day,hours) values('"+getId()+"','"+getSub()+"','"+getType()+"','"+getStatus()+"','"+getDay()+"','"+getHours()+"')";
                PreparedStatement ps=con.prepareStatement(result);
                ps.execute();
                javax.swing.JOptionPane.showMessageDialog(null, "Data added successfully");               
        }
        
        catch(Exception e)
        {
               javax.swing.JOptionPane.showMessageDialog(null,e);
        }
}
     
public void createMedi()
    {
        Connection con=null;
        
        try
        {  
                con=MyConnection.getConnection();
                String result="insert into medical(stu_id,sub_id,type,day,hours) values('"+getId()+"','"+getSub()+"','"+getType()+"','"+getDay()+"','"+getHours()+"')";
                PreparedStatement ps=con.prepareStatement(result);
                ps.execute();
                javax.swing.JOptionPane.showMessageDialog(null, "Data added successfully");               
        }
        
        catch(Exception e)
        {
               javax.swing.JOptionPane.showMessageDialog(null,e);
        }
}
    public ResultSet searchAtt(String id, String sub, String day) 
    {
        ResultSet rs=null;
        try{
            Connection con=MyConnection.getConnection();
            String sql="SELECT * FROM attendance WHERE stu_id='"+id+"' and sub_id='"+sub+"' and day='"+day+"' LIMIT 1";
            PreparedStatement ps=con.prepareCall(sql);
            rs=ps.executeQuery();
        }
        catch(Exception e)
        {
            javax.swing.JOptionPane.showMessageDialog(null, e);
        }    
        return rs;
    }  
    
    public ResultSet searchMedi(String id, String sub, String day) 
    {
        ResultSet rs=null;
        try{
            Connection con=MyConnection.getConnection();
            String sql="SELECT * FROM medical WHERE stu_id='"+id+"' and sub_id='"+sub+"' and day='"+day+"' LIMIT 1";
            PreparedStatement ps=con.prepareCall(sql);
            rs=ps.executeQuery();
        }
        catch(Exception e)
        {
            javax.swing.JOptionPane.showMessageDialog(null, e);
        }    
        return rs;
    }  
   
    public void edit()
    {
        Connection con=null;
        
        try
        {
            con=MyConnection.getConnection();
            String result="update attendance set type='"+getType()+"',hours='"+getHours()+"',status='"+getStatus()+"' WHERE stu_id='"+getId()+"' and sub_id='"+getSub()+"' and day='"+getDay()+"'";
            PreparedStatement ps=con.prepareStatement(result);
            ps.execute();
            javax.swing.JOptionPane.showMessageDialog(null, "Data update successfully");    
        }
        
        catch(Exception e)
        {
            javax.swing.JOptionPane.showMessageDialog(null, e);
        }
    }
 
    public void editMedi()
    {
        Connection con=null;
        
        try
        {
            con=MyConnection.getConnection();
            String result="update medical set type='"+getType()+"',hours='"+getHours()+"' WHERE stu_id='"+getId()+"' and sub_id='"+getSub()+"' and day='"+getDay()+"'";
            PreparedStatement ps=con.prepareStatement(result);
            ps.execute();
            javax.swing.JOptionPane.showMessageDialog(null, "Data update successfully");    
        }
        
        catch(Exception e)
        {
            javax.swing.JOptionPane.showMessageDialog(null, e);
        }
    }
     public void delete()
    {
        Connection con=null;
        
        try
        {
            con=MyConnection.getConnection();
            String result="delete from attendance WHERE stu_id='"+getId()+"' and sub_id='"+getSub()+"' and day='"+getDay()+"'";
            PreparedStatement ps=con.prepareStatement(result);
            ps.execute();
            javax.swing.JOptionPane.showMessageDialog(null, "Data delete successfully");
        }
        
        catch(Exception e)
        {
            
            javax.swing.JOptionPane.showMessageDialog(null, e);
        }
    }
     
    public void deleteMedi()
    {
        Connection con=null;
        
        try
        {
            con=MyConnection.getConnection();
            String result="delete from medical WHERE stu_id='"+getId()+"' and sub_id='"+getSub()+"' and day='"+getDay()+"'";
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

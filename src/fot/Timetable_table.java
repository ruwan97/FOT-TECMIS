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
public class Timetable_table {
  
    private String time=null;
    private String name=null;
    private String mon=null;
    private String tue=null;
    private String wed=null;
    private String thu=null;
    private String fri=null;
    
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
    
     public String getMon() {
        return mon;
    }

    public void setMon(String mon) {
        this.mon = mon;
    }

    public String getTue() {
        return tue;
    }

    public void setTue(String tue) {
        this.tue = tue;
    }

    public String getWed() {
        return wed;
    }

    public void setWed(String wed) {
        this.wed = wed;
    }

    public String getThu() {
        return thu;
    }

    public void setThu(String thu) {
        this.thu = thu;
    }

    public String getFri() {
        return fri;
    }

    public void setFri(String fri) {
        this.fri = fri;
    }

     public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    
    
    public void createTimetable()
    {
        Connection con=null;
        
        try
        {
       
            
                con=MyConnection.getConnection();
                String result="insert into ict_"+getName()+"(time,mon,tue,wed,thu,fri) values('"+getTime()+"','"+getMon()+"','"+getTue()+"','"+getWed()+"','"+getThu()+"','"+getFri()+"')";
                PreparedStatement ps=con.prepareStatement(result);
                ps.execute();
                javax.swing.JOptionPane.showMessageDialog(null, "Data added successfully");
          
                          
        }
        
        catch(Exception e)
        {
                javax.swing.JOptionPane.showMessageDialog(null,e);
        }
}
      public void editTime()
    {
        Connection con=null;
        
        try
        {
            con=MyConnection.getConnection();
            String result="update ict_"+getName()+" set mon='"+ getMon()+"',tue='"+ getTue()+"',wed='"+ getWed()+"',thu='"+ getThu()+"', fri='"+ getFri()+"' where time='"+ getTime()+"'";
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
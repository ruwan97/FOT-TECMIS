/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fot;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Notice {
    private String no=null;
    private String date=null;
    private String title=null;
    private String notice=null;
  
    public void setNoticeNo(String no)
    {
        this.no=no;
    }
    
    public void setNoticeDate(String date)
    {
        this.date=date;
    }
    
    public void setNoticeTitle(String title)
    {
        this.title=title;
    }
    
    public void setNoticeNotice(String notice)
    {
        this.notice=notice;
    }
    
    public String getNoticeNo()
    {
        return no;
    }
    
    public String getNoticeDate()
    {
        return date;
    }
    
    public String getNoticeTitle()
    {
        return title;
    }
    
    public String getNoticeNotice()
    {
        return notice;
    }
    
    public void createNotice()
    {
        Connection con=null;
        
        try
        {
                con=MyConnection.getConnection();
                String result="insert into notice(date,title,notice) values('"+getNoticeDate()+"','"+getNoticeTitle()+"','"+getNoticeNotice()+"')";
                PreparedStatement ps=con.prepareStatement(result);
                ps.execute();
                JOptionPane.showMessageDialog(null, "Data added successfully");             
        }
        
        catch(Exception e)
        {
                JOptionPane.showMessageDialog(null,e);
        }
    }
    
    public ResultSet searchNotice(String noti_no)
    {
        ResultSet rs=null;
        try{
            Connection con=MyConnection.getConnection();
            String sql="SELECT *FROM notice WHERE no='"+noti_no+"' LIMIT 1";
            PreparedStatement ps=con.prepareCall(sql);
            rs=ps.executeQuery();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }    
        return rs;
    }        
    
     public void editNotice()
    {
        Connection con=null;
        
        try
        {
            con=MyConnection.getConnection();
            String result="update notice set date='"+getNoticeDate()+"',title='"+getNoticeTitle()+"',notice='"+getNoticeNotice()+"' where no='"+getNoticeNo()+"'";
            PreparedStatement ps=con.prepareStatement(result);
            ps.execute();
            JOptionPane.showMessageDialog(null, "Data update successfully");
            
            
        }
        
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
     
      public void deleteNotice()
    {
        Connection con=null;
        
        try
        {
            con=MyConnection.getConnection();
            String result="delete from notice where no='"+getNoticeNo()+"'";
            PreparedStatement ps=con.prepareStatement(result);
            ps.execute();
            JOptionPane.showMessageDialog(null, "Data delete successfully");
        }
        
        catch(Exception e)
        {
            
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
}



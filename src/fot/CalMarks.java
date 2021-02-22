/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fot;

import com.mysql.cj.protocol.Resultset;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class CalMarks {
    Connection con=DBConnection.getConnection();
    public String getGrade(String stu_id,String sub_id)
    {
        float quiz=0,asses=0,mid=0,finalT=0;
        quiz=getquizMark(stu_id,sub_id);
        asses=getassesMark(stu_id,sub_id);
        mid=getmidMark(stu_id,sub_id);
       finalT=getFinalTheoryMarks(stu_id,sub_id); 
        return null;
   
    }

   float getquizMark(String stu_id, String sub_id) {
        float q1,q2,q3;
        String sql="select q1,q2,q3 from ict_ca";
        try {
            PreparedStatement pr=con.prepareStatement(sql);
            ResultSet result =pr.executeQuery();
            if(result.next())
            {
                q1=result.getFloat("q1");
                q2=result.getFloat("q2");
                q3=result.getFloat("q3");
                
                if (q1<q2 && q1<q3) {
                    return (float)(q2+q3)/20*100/10;
                    
                }
                if (q2<q3 && q2<q1) {
                    return (float)(q1+q3)/20*100/10;
                }
                if (q3<q1 && q3<q2) {
                    return (float)(q2+q1)/20*100/10;
                }
            }    
        } catch (SQLException ex) {
            Logger.getLogger(CalMarks.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
        
    }

    float getassesMark(String stu_id, String sub_id) {
        float ass1,ass2;
        String sql="select ass1,ass2 from ict_ca";
        PreparedStatement pr;
        try {
            pr = con.prepareStatement(sql);
            ResultSet result=pr.executeQuery();
            if(result.next()){
                ass1=result.getFloat("ass1");
                ass2=result.getFloat("ass2");
                
                return (float)(ass1+ass2)/20*100/10;
            }
        } catch (SQLException ex) {
            Logger.getLogger(CalMarks.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

     float getmidMark(String stu_id, String sub_id) {
      float mid;
      String sql="select mid from ict_ca";
      PreparedStatement pr;
        try {
            pr=con.prepareStatement(sql);
            ResultSet result=pr.executeQuery();
            if (result.next()) {
                mid=result.getFloat("mid");
                
                return (float)mid/20*100/10;
            }
        } catch (SQLException ex) {
            Logger.getLogger(CalMarks.class.getName()).log(Level.SEVERE, null, ex);
        }
      return 0;
    }

    private float getFinalTheoryMarks(String stu_id, String sub_id) {
       float theory;
       String sql="select * from ict_final_exam where stu_id='"+stu_id+"'and sub_id='"+sub_id+"'";
       PreparedStatement pr;
        try {
            pr=con.prepareStatement(sql);
            ResultSet result=pr.executeQuery();
            if (result.next()) {
                theory=result.getFloat("theory");
                
                return theory/100*30;
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(CalMarks.class.getName()).log(Level.SEVERE, null, ex);
        }
       return 0;
    }

   
   
    
}

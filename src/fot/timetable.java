/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fot;

import fot.Admin_TimeTable;
import fot.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Ishanka
 */
public class timetable extends javax.swing.JFrame {
   
    /**
     * Creates new form timetable
     */
    public timetable() {
        initComponents();
        
    }
    
    void showTimetable()
    {
        Connection con=null;
        con=MyConnection.getConnection();
        
        String getYear=year.getSelectedItem().toString();
        
    
        if(getYear.equals("Level_I"))
        {
            try {
                String sql="SELECT *FROM ict_level_i";
                PreparedStatement ps=con.prepareStatement(sql);
                ResultSet rs=ps.executeQuery();
                timetable.setModel(DbUtils.resultSetToTableModel(rs));
                timetable.setVisible(true);
                
            } catch (Exception e) {
               
                timetable.setVisible(false);
            }
        } 
       
        if(getYear.equals("Level_II")){
           
            try {
                String sql="SELECT *FROM ict_level_ii";
                PreparedStatement ps=con.prepareStatement(sql);
                ResultSet rs=ps.executeQuery();
                timetable.setModel(DbUtils.resultSetToTableModel(rs));
                timetable.setVisible(true);
            } 
            catch (Exception e) {
                
                 timetable.setVisible(false);
            }
        }

        if(getYear.equals("Level_III"))
        {
            try {
                String sql="SELECT *FROM ict_level_iii";
                PreparedStatement ps=con.prepareStatement(sql);
                ResultSet rs=ps.executeQuery();
                timetable.setModel(DbUtils.resultSetToTableModel(rs));
                timetable.setVisible(true);
            } 
            catch (Exception e) {
                 timetable.setVisible(false);
            }
        } 

        if(getYear.equals("Level_IV"))
        {
            try {
                String sql="SELECT *FROM ict_level_iv";
                PreparedStatement ps=con.prepareStatement(sql);
                ResultSet rs=ps.executeQuery();
                timetable.setModel(DbUtils.resultSetToTableModel(rs));
                 timetable.setVisible(true);
            } 
            catch (Exception e) {
                timetable.setVisible(false);
            }
        } 

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        name = new javax.swing.JLabel();
        pic = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        noticeName = new javax.swing.JLabel();
        year = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        timetable = new javax.swing.JTable();
        proBack = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("View Timetable");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        name.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        name.setForeground(new java.awt.Color(255, 255, 255));
        name.setText("Time Table  ");
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 180, 40));

        pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/time1.png"))); // NOI18N
        getContentPane().add(pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 120, 130));

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/exit.png"))); // NOI18N
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 50, 30, 30));

        noticeName.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        noticeName.setForeground(new java.awt.Color(255, 255, 255));
        noticeName.setText("Year");
        getContentPane().add(noticeName, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 110, 40, -1));

        year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Level_I", "Level_II", "Level_III", "Level_IV" }));
        year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearActionPerformed(evt);
            }
        });
        getContentPane().add(year, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, -1, -1));

        timetable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Time", "Monday", "Tuesday", "Wednesday", "Thrsday", "Friday"
            }
        ));
        jScrollPane1.setViewportView(timetable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 530, 160));

        proBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/profBack.jpg"))); // NOI18N
        getContentPane().add(proBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        Admin_TimeTable tm=new Admin_TimeTable();  
        tm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_exitMouseClicked

    private void yearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearActionPerformed
        // TODO add your handling code here:
        showTimetable();
    }//GEN-LAST:event_yearActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(timetable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(timetable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(timetable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(timetable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new timetable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel exit;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel name;
    private javax.swing.JLabel noticeName;
    private javax.swing.JLabel pic;
    private javax.swing.JLabel proBack;
    private javax.swing.JTable timetable;
    private javax.swing.JComboBox<String> year;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fot;

import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Edit_Lec_Course extends javax.swing.JFrame {

    public Edit_Lec_Course() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        editDepId = new javax.swing.JLabel();
        editSubNameTxt = new javax.swing.JTextField();
        editSubName = new javax.swing.JLabel();
        editLecId = new javax.swing.JLabel();
        editDepIdTxt = new javax.swing.JTextField();
        editLecIdTxt = new javax.swing.JTextField();
        update = new javax.swing.JButton();
        Exit = new javax.swing.JLabel();
        editSubID = new javax.swing.JLabel();
        editSubIdTxt = new javax.swing.JTextField();
        editSearch = new javax.swing.JLabel();
        noticeBackImg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        editDepId.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        editDepId.setForeground(new java.awt.Color(255, 255, 255));
        editDepId.setText("Department ID");
        getContentPane().add(editDepId, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        editSubNameTxt.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        getContentPane().add(editSubNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 300, 30));

        editSubName.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        editSubName.setForeground(new java.awt.Color(255, 255, 255));
        editSubName.setText("Subject Name");
        getContentPane().add(editSubName, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));

        editLecId.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        editLecId.setForeground(new java.awt.Color(255, 255, 255));
        editLecId.setText("Lecturer ID");
        getContentPane().add(editLecId, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, -1, -1));

        editDepIdTxt.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        getContentPane().add(editDepIdTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 150, 25));

        editLecIdTxt.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        getContentPane().add(editLecIdTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 150, 25));

        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        getContentPane().add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 380, -1, -1));

        Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/exit.png"))); // NOI18N
        Exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClicked(evt);
            }
        });
        getContentPane().add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, -1, -1));

        editSubID.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        editSubID.setForeground(new java.awt.Color(255, 255, 0));
        editSubID.setText("Enter Subject Code");
        getContentPane().add(editSubID, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        editSubIdTxt.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        getContentPane().add(editSubIdTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 150, 25));

        editSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/search.png"))); // NOI18N
        editSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editSearchMouseClicked(evt);
            }
        });
        getContentPane().add(editSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, 30, 30));

        noticeBackImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/interface1.jpg"))); // NOI18N
        noticeBackImg.setPreferredSize(new java.awt.Dimension(600, 450));
        getContentPane().add(noticeBackImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 450));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked
        Lec_Course co=new Lec_Course(); 
        co.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ExitMouseClicked

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        Course co=new Course();
       
       co.setCourseDepId(editDepIdTxt.getText());
       co.setCourseSubId(editSubIdTxt.getText());
       co.setCourseSubName(editSubNameTxt.getText());
       co.setCourseLecId(editLecIdTxt.getText());
            
       co.editCourse();

       clearCourse();
    }//GEN-LAST:event_updateActionPerformed

    private void editSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editSearchMouseClicked
       String search=editSubIdTxt.getText();
        Course co=new Course();
        
        ResultSet rs=co.searchCourse(search);
        try {
            if(rs.next())
            {
               editDepIdTxt.setText(rs.getString("sub_dept_id"));
               editSubNameTxt.setText(rs.getString("sub_name"));
               editLecIdTxt.setText(rs.getString("lec_id"));
            }
            else
            {
                 javax.swing.JOptionPane.showMessageDialog(null, "Data not in the database");
                 clearCourse();
            }
        } 
        catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"error....");
        } 
                
    }//GEN-LAST:event_editSearchMouseClicked

    public void clearCourse()
    {
        editDepIdTxt.setText(null);
        editSubIdTxt.setText(null);
        editSubNameTxt.setText(null);
        editLecIdTxt.setText(null);
    }
    
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
            java.util.logging.Logger.getLogger(Edit_Lec_Course.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Edit_Lec_Course.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Edit_Lec_Course.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Edit_Lec_Course.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Edit_Lec_Course().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Exit;
    private javax.swing.JLabel editDepId;
    private javax.swing.JTextField editDepIdTxt;
    private javax.swing.JLabel editLecId;
    private javax.swing.JTextField editLecIdTxt;
    private javax.swing.JLabel editSearch;
    private javax.swing.JLabel editSubID;
    private javax.swing.JTextField editSubIdTxt;
    private javax.swing.JLabel editSubName;
    private javax.swing.JTextField editSubNameTxt;
    private javax.swing.JLabel noticeBackImg;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}

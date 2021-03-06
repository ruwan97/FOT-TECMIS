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
public class form_Student extends javax.swing.JFrame {

    /**
     * Creates new form form_Student
     */
    public form_Student() {
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

        stuBar = new javax.swing.JPanel();
        stuName = new javax.swing.JLabel();
        stuPwd = new javax.swing.JLabel();
        stuPwdTxt = new javax.swing.JPasswordField();
        stuTxt = new javax.swing.JTextField();
        stuSubmit = new javax.swing.JButton();
        stuClear = new javax.swing.JButton();
        stuLabel = new javax.swing.JLabel();
        stuImg = new javax.swing.JLabel();
        stuExit = new javax.swing.JLabel();
        errMsg = new javax.swing.JLabel();
        stuBack = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Login");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        stuBar.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout stuBarLayout = new javax.swing.GroupLayout(stuBar);
        stuBar.setLayout(stuBarLayout);
        stuBarLayout.setHorizontalGroup(
            stuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        stuBarLayout.setVerticalGroup(
            stuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );

        getContentPane().add(stuBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 5, 260));

        stuName.setBackground(new java.awt.Color(255, 255, 255));
        stuName.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        stuName.setForeground(new java.awt.Color(255, 255, 255));
        stuName.setText("User Name");
        getContentPane().add(stuName, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 120, 30));

        stuPwd.setBackground(new java.awt.Color(255, 255, 255));
        stuPwd.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        stuPwd.setForeground(new java.awt.Color(255, 255, 255));
        stuPwd.setText("Password");
        getContentPane().add(stuPwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 120, 30));

        stuPwdTxt.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        stuPwdTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stuPwdTxtActionPerformed(evt);
            }
        });
        getContentPane().add(stuPwdTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 150, 30));

        stuTxt.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        getContentPane().add(stuTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 150, 30));

        stuSubmit.setText("Login");
        stuSubmit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        stuSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stuSubmitActionPerformed(evt);
            }
        });
        getContentPane().add(stuSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, -1, -1));

        stuClear.setText("Clear");
        stuClear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        stuClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stuClearActionPerformed(evt);
            }
        });
        getContentPane().add(stuClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, -1, -1));

        stuLabel.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        stuLabel.setForeground(new java.awt.Color(255, 255, 0));
        stuLabel.setText("STUDENT");
        getContentPane().add(stuLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));

        stuImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/student.png"))); // NOI18N
        getContentPane().add(stuImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 120, 130));

        stuExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/exit.png"))); // NOI18N
        stuExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        stuExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stuExitMouseClicked(evt);
            }
        });
        getContentPane().add(stuExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, -1, -1));
        getContentPane().add(errMsg, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 140, 20));

        stuBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/interface1.jpg"))); // NOI18N
        getContentPane().add(stuBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 300));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void stuSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stuSubmitActionPerformed
    
         String password=stuPwdTxt.getText().trim();
         String user_name=stuTxt.getText().trim();
         
        if(user_name.isEmpty() && password.isEmpty())
        {
            errMsg.setText("Please enter both fields!!!");
        }
        else if(password.isEmpty())
        {
            errMsg.setText("Please enter password!!!");
        }
        else if(user_name.isEmpty())
        {
            errMsg.setText("Please enter user name!!!");
        }
        else{
            ResultSet rs=null;
            try{
                Connection con=MyConnection.getConnection();
                String sql="call stuLogin('"+user_name+"','"+password+"')";
                PreparedStatement ps=con.prepareStatement(sql);
                rs=ps.executeQuery();
                if(rs.next()==true)
                {
                    Student stu=new Student();
                    stu.setRegno(rs.getString("user_id"));
                    
                    stu1 inter=new stu1();
                    inter.setVisible(true);
                    this.setVisible(false);
                }
                else{
                    errMsg.setText("invalid user");
                }
               
            }
            catch(Exception e)
            {
                errMsg.setText("system error");
            }    
        }             
    }//GEN-LAST:event_stuSubmitActionPerformed

    private void stuClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stuClearActionPerformed
        stuTxt.setText(null);
        stuPwdTxt.setText(null);
    }//GEN-LAST:event_stuClearActionPerformed

    private void stuExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stuExitMouseClicked
        forms_Login log=new forms_Login();  // back to the user profiles
        log.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_stuExitMouseClicked

    private void stuPwdTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stuPwdTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stuPwdTxtActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(form_Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form_Student().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel errMsg;
    private javax.swing.JLabel stuBack;
    private javax.swing.JPanel stuBar;
    private javax.swing.JButton stuClear;
    private javax.swing.JLabel stuExit;
    private javax.swing.JLabel stuImg;
    private javax.swing.JLabel stuLabel;
    private javax.swing.JLabel stuName;
    private javax.swing.JLabel stuPwd;
    private javax.swing.JPasswordField stuPwdTxt;
    private javax.swing.JButton stuSubmit;
    private javax.swing.JTextField stuTxt;
    // End of variables declaration//GEN-END:variables
}

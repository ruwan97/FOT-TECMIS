/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fot;

/**
 *
 * @author user
 */
public class Admin_Profile extends javax.swing.JFrame {

    /**
     * Creates new form Admin_Profile
     */
    public Admin_Profile() {
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

        createProfile = new javax.swing.JLabel();
        createTxt = new javax.swing.JLabel();
        editProfile = new javax.swing.JLabel();
        editTxt = new javax.swing.JLabel();
        deleteProfiles = new javax.swing.JLabel();
        deleteTxt = new javax.swing.JLabel();
        ViewProfile = new javax.swing.JLabel();
        viewTxt = new javax.swing.JLabel();
        NoticeExit = new javax.swing.JLabel();
        noticeBackImg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Create & Maintain Profiles");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        createProfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/createProfile.png"))); // NOI18N
        createProfile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        createProfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createProfileMouseClicked(evt);
            }
        });
        getContentPane().add(createProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 50, 50));

        createTxt.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        createTxt.setForeground(new java.awt.Color(255, 255, 255));
        createTxt.setText("Create Profiles");
        createTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        createTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createTxtMouseClicked(evt);
            }
        });
        getContentPane().add(createTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, -1, -1));

        editProfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/editProfile.png"))); // NOI18N
        editProfile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editProfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editProfileMouseClicked(evt);
            }
        });
        getContentPane().add(editProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 50, 50));

        editTxt.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        editTxt.setForeground(new java.awt.Color(255, 255, 255));
        editTxt.setText("Edit Profiles");
        editTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editTxtMouseClicked(evt);
            }
        });
        getContentPane().add(editTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, -1, -1));

        deleteProfiles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/deleteProfile.png"))); // NOI18N
        deleteProfiles.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteProfiles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteProfilesMouseClicked(evt);
            }
        });
        getContentPane().add(deleteProfiles, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 50, 50));

        deleteTxt.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        deleteTxt.setForeground(new java.awt.Color(255, 255, 255));
        deleteTxt.setText("Delete profiles");
        deleteTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteTxtMouseClicked(evt);
            }
        });
        getContentPane().add(deleteTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, -1, -1));

        ViewProfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/viewProfile.png"))); // NOI18N
        ViewProfile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ViewProfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ViewProfileMouseClicked(evt);
            }
        });
        getContentPane().add(ViewProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 50, 50));

        viewTxt.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        viewTxt.setForeground(new java.awt.Color(255, 255, 255));
        viewTxt.setText("View Profiles");
        viewTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        viewTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewTxtMouseClicked(evt);
            }
        });
        getContentPane().add(viewTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, -1, -1));

        NoticeExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/exit.png"))); // NOI18N
        NoticeExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        NoticeExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NoticeExitMouseClicked(evt);
            }
        });
        getContentPane().add(NoticeExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, -1, -1));

        noticeBackImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src/image/interface.jpg"))); // NOI18N
        noticeBackImg.setPreferredSize(new java.awt.Dimension(350, 400));
        getContentPane().add(noticeBackImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void createProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createProfileMouseClicked
        Create_Profile p=new Create_Profile();
        p.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_createProfileMouseClicked

    private void createTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createTxtMouseClicked
        Create_Profile p=new Create_Profile();
        p.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_createTxtMouseClicked

    private void editProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editProfileMouseClicked
        Edit_Profile p=new Edit_Profile();
        p.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_editProfileMouseClicked

    private void editTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editTxtMouseClicked
       Edit_Profile p=new Edit_Profile();
        p.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_editTxtMouseClicked

    private void deleteProfilesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteProfilesMouseClicked
       Delete_Profile p=new Delete_Profile();
        p.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_deleteProfilesMouseClicked

    private void deleteTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteTxtMouseClicked
        Delete_Profile p=new Delete_Profile();
        p.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_deleteTxtMouseClicked

    private void ViewProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewProfileMouseClicked
        View_Profile p=new View_Profile();
        p.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ViewProfileMouseClicked

    private void viewTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewTxtMouseClicked
       View_Profile p=new View_Profile();
        p.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_viewTxtMouseClicked

    private void NoticeExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NoticeExitMouseClicked
        Admin_Interface inter=new Admin_Interface();  // back to the user profiles
        inter.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_NoticeExitMouseClicked

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
            java.util.logging.Logger.getLogger(Admin_Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_Profile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NoticeExit;
    private javax.swing.JLabel ViewProfile;
    private javax.swing.JLabel createProfile;
    private javax.swing.JLabel createTxt;
    private javax.swing.JLabel deleteProfiles;
    private javax.swing.JLabel deleteTxt;
    private javax.swing.JLabel editProfile;
    private javax.swing.JLabel editTxt;
    private javax.swing.JLabel noticeBackImg;
    private javax.swing.JLabel viewTxt;
    // End of variables declaration//GEN-END:variables
}
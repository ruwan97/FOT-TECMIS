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
public class Admin_TimeTable extends javax.swing.JFrame {

    /**
     * Creates new form Admin_Profile
     */
    public Admin_TimeTable() {
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

        createTimeTable = new javax.swing.JLabel();
        createTxt = new javax.swing.JLabel();
        editTimeTable = new javax.swing.JLabel();
        editTxt = new javax.swing.JLabel();
        TimeTableExit = new javax.swing.JLabel();
        ViewCourse = new javax.swing.JLabel();
        viewTxt = new javax.swing.JLabel();
        noticeBackImg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Create & Maintain Timetables");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        createTimeTable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/createTimetable.png"))); // NOI18N
        createTimeTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        createTimeTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createTimeTableMouseClicked(evt);
            }
        });
        getContentPane().add(createTimeTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 50, 50));

        createTxt.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        createTxt.setForeground(new java.awt.Color(255, 255, 255));
        createTxt.setText("Create TimeTables");
        createTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        createTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createTxtMouseClicked(evt);
            }
        });
        getContentPane().add(createTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, -1, -1));

        editTimeTable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/editTimetable.png"))); // NOI18N
        editTimeTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editTimeTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editTimeTableMouseClicked(evt);
            }
        });
        getContentPane().add(editTimeTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 50, 50));

        editTxt.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        editTxt.setForeground(new java.awt.Color(255, 255, 255));
        editTxt.setText("Edit TimeTables");
        editTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editTxtMouseClicked(evt);
            }
        });
        getContentPane().add(editTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, -1, -1));

        TimeTableExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/exit.png"))); // NOI18N
        TimeTableExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TimeTableExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TimeTableExitMouseClicked(evt);
            }
        });
        getContentPane().add(TimeTableExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, -1, -1));

        ViewCourse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/viewTimetable.png"))); // NOI18N
        ViewCourse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ViewCourse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ViewCourseMouseClicked(evt);
            }
        });
        getContentPane().add(ViewCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 50, 50));

        viewTxt.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        viewTxt.setForeground(new java.awt.Color(255, 255, 255));
        viewTxt.setText("View TimeTables");
        viewTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        viewTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewTxtMouseClicked(evt);
            }
        });
        getContentPane().add(viewTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, -1, -1));

        noticeBackImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/interface.jpg"))); // NOI18N
        noticeBackImg.setPreferredSize(new java.awt.Dimension(350, 400));
        getContentPane().add(noticeBackImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 300));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void createTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createTxtMouseClicked
        Create_Timetable tm=new Create_Timetable();
        tm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_createTxtMouseClicked

    private void editTimeTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editTimeTableMouseClicked
         Edit_Timetable tm=new Edit_Timetable();
        tm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_editTimeTableMouseClicked

    private void editTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editTxtMouseClicked
        Edit_Timetable tm=new Edit_Timetable();
        tm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_editTxtMouseClicked

    private void TimeTableExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TimeTableExitMouseClicked
        Admin_Interface inter=new Admin_Interface();  // back to the user profiles
        inter.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_TimeTableExitMouseClicked

    private void createTimeTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createTimeTableMouseClicked
        Create_Timetable tm=new Create_Timetable();
        tm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_createTimeTableMouseClicked

    private void ViewCourseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewCourseMouseClicked
         timetable tm=new timetable();
        tm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ViewCourseMouseClicked

    private void viewTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewTxtMouseClicked
        timetable tm=new timetable();
        tm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_viewTxtMouseClicked

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
            java.util.logging.Logger.getLogger(Admin_TimeTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_TimeTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_TimeTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_TimeTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_TimeTable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TimeTableExit;
    private javax.swing.JLabel ViewCourse;
    private javax.swing.JLabel createTimeTable;
    private javax.swing.JLabel createTxt;
    private javax.swing.JLabel editTimeTable;
    private javax.swing.JLabel editTxt;
    private javax.swing.JLabel noticeBackImg;
    private javax.swing.JLabel viewTxt;
    // End of variables declaration//GEN-END:variables
}

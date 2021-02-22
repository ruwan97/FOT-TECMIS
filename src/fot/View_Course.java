/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fot;
    import java.sql.Connection;
    import java.sql.PreparedStatement;
    import java.sql.ResultSet;
    import java.sql.Statement;
    import java.util.ArrayList;
    import javax.swing.JOptionPane;
    import javax.swing.table.DefaultTableModel;

public class View_Course extends javax.swing.JFrame {
    
    private Connection con;
    
    
    public View_Course() {
        initComponents();
        showUser();
    }
    
     public ArrayList<CourseView> courseList()
    {
        ArrayList<CourseView> courseList = new ArrayList<>();
        
        try{
            con=MyConnection.getConnection();
            String result="SELECT `sub_dept_id` AS 'Department ID', `sub_id` AS 'Subject ID', `sub_name` AS 'Subject Name', `lec_id` AS 'Lecturer ID' FROM `subject`";
            Statement st=con.createStatement();
            ResultSet rs= st.executeQuery(result);
            PreparedStatement ps=con.prepareStatement(result);
            ps.execute();
            
            CourseView Course;
            while(rs.next())
            {
               Course= new CourseView(rs.getString("Department ID"),rs.getString("Subject ID"),rs.getString("Subject Name"),rs.getString("Lecturer ID"));
               courseList.add(Course);
            }   
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);   
        }
        return courseList;
    }
    
    public void showUser()
    {
        ArrayList<CourseView> list= courseList();
        DefaultTableModel model=(DefaultTableModel)table.getModel();
        
        Object[] row= new Object[20];
        for(int i=0;i<list.size();i++)
        {
            row[0]=list.get(i).getCourseDepId();
            row[1]=list.get(i).getCourseSubId();
            row[2]=list.get(i).getCourseSubName();
            row[3]=list.get(i).getCourseLecId();
            model.addRow(row);
        }
      
        
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Table = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        NoticeExit = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        noticepic = new javax.swing.JLabel();
        sub = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        noticeBack = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("View Course");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Table.setBackground(new java.awt.Color(255, 255, 255));
        Table.setForeground(new java.awt.Color(255, 255, 255));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Department ID", "Subject ID", "Subject Name", "Lecturer ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        Table.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setResizable(false);
            table.getColumnModel().getColumn(1).setResizable(false);
            table.getColumnModel().getColumn(2).setResizable(false);
            table.getColumnModel().getColumn(3).setResizable(false);
        }

        getContentPane().add(Table, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 640, 130));

        NoticeExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/exit.png"))); // NOI18N
        NoticeExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        NoticeExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NoticeExitMouseClicked(evt);
            }
        });
        getContentPane().add(NoticeExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Course Details ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, -1, -1));

        noticepic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/course1.png"))); // NOI18N
        noticepic.setText("jLabel3");
        getContentPane().add(noticepic, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 120, 130));

        sub.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        sub.setForeground(new java.awt.Color(255, 255, 255));
        sub.setText("Subject Name");
        getContentPane().add(sub, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, -1, -1));

        name.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 300, 30));

        noticeBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/interface1.jpg"))); // NOI18N
        noticeBack.setPreferredSize(new java.awt.Dimension(700, 400));
        getContentPane().add(noticeBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void NoticeExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NoticeExitMouseClicked
        Admin_Course co=new Admin_Course();  // back to the user profiles
        co.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_NoticeExitMouseClicked

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        int r=table.getSelectedRow();
        
        String sub=table.getValueAt(r,2).toString();
      
        name.setText(sub);
    }//GEN-LAST:event_tableMouseClicked

    
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
            java.util.logging.Logger.getLogger(View_Course.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_Course.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_Course.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_Course.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View_Course().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NoticeExit;
    private javax.swing.JScrollPane Table;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField name;
    private javax.swing.JLabel noticeBack;
    private javax.swing.JLabel noticepic;
    private javax.swing.JLabel sub;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}

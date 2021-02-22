/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fot;

import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author user
 */
public class View_Profile extends javax.swing.JFrame {
 
     private Connection con;
     
     
    public View_Profile() {
        initComponents();
        showUserStudent();
        showUserLecturer();
        showUserTecnical();
    }
    
    public ArrayList<StudentView> studentList()
    {
        ArrayList<StudentView> studentList = new ArrayList<>();
        
        try{
            con=MyConnection.getConnection();
            String result="select * from student";
            Statement st=con.createStatement();
            ResultSet rs= st.executeQuery(result);
            PreparedStatement ps=con.prepareStatement(result);
            ps.execute();
            
            StudentView Student;
            while(rs.next())
            {
                Student= new StudentView(rs.getString("stu_id"),rs.getString("stu_dept_id"),rs.getString("menter_id"),rs.getString("stu_name"),rs.getString("stu_address"),rs.getString("gender"),rs.getString("stu_b_day"),rs.getString("stu_p_no"),rs.getString("image"));
               studentList.add(Student);
            }   
        }
        catch(Exception e)
        {
            javax.swing.JOptionPane.showMessageDialog(null, e);   
        }
        return studentList;
    }
    
     public void showUserStudent()
    {
        ArrayList<StudentView> list= studentList();
        DefaultTableModel model=(DefaultTableModel)stuTable.getModel();
        
        Object[] row= new Object[20];
        for(int i=0;i<list.size();i++)
        {
            row[0]=list.get(i).getStudentId();
            row[1]=list.get(i).getStudentDepId();
            row[2]=list.get(i).getStudentMenterId();
            row[3]=list.get(i).getStudentName();
            row[4]=list.get(i).getStudentAddress();
            row[5]=list.get(i).getStudentGender();
            row[6]=list.get(i).getStudentBday();
            row[7]=list.get(i).getStudentPno();
            row[8]=list.get(i).getStudentImage();
            model.addRow(row);
        }
      
        
    }
     
     public ArrayList<LecturerView> lecturerList()
    {
        ArrayList<LecturerView> lecturerList = new ArrayList<>();
        
        try{
            con=MyConnection.getConnection();
            String result="select * from lecturer";
            Statement st=con.createStatement();
            ResultSet rs= st.executeQuery(result);
            PreparedStatement ps=con.prepareStatement(result);
            ps.execute();
            
            LecturerView Lecturer;
            while(rs.next())
            {
                Lecturer= new LecturerView(rs.getString("lec_id"),rs.getString("lec_dept_id"),rs.getString("lec_name"),rs.getString("lec_address"),rs.getString("gender"),rs.getString("lec_p_no"),rs.getString("image"));
               lecturerList.add(Lecturer);
            }   
        }
        catch(Exception e)
        {
            javax.swing.JOptionPane.showMessageDialog(null, e);   
        }
        return lecturerList;
    }
    
     public void showUserLecturer()
    {
        ArrayList<LecturerView> list= lecturerList();
        DefaultTableModel model=(DefaultTableModel)lecTable.getModel();
        
        Object[] row= new Object[20];
        for(int i=0;i<list.size();i++)
        {
            row[0]=list.get(i).getLecturerId();
            row[1]=list.get(i).getLecturerDepId();
            row[2]=list.get(i).getLecturerName();
            row[3]=list.get(i).getLecturerAddress();
            row[4]=list.get(i).getLecturerGender();
            row[5]=list.get(i).getLecturerPno();
            row[6]=list.get(i).getLecturerImage();
            model.addRow(row);
        }
      
        
    }
     
       public ArrayList<TecnicalView> tecnicalList()
    {
        ArrayList<TecnicalView> tecnicalList = new ArrayList<>();
        
        try{
            con=MyConnection.getConnection();
            String result="select * from tecnical_officer";
            Statement st=con.createStatement();
            ResultSet rs= st.executeQuery(result);
            PreparedStatement ps=con.prepareStatement(result);
            ps.execute();
            
            TecnicalView Tecnical;
            while(rs.next())
            {
                Tecnical= new TecnicalView(rs.getString("tec_id"),rs.getString("tec_dept_id"),rs.getString("tec_name"),rs.getString("gender"),rs.getString("tec_p_no"),rs.getString("image"));
                tecnicalList.add(Tecnical);
            }   
        }
        catch(Exception e)
        {
            javax.swing.JOptionPane.showMessageDialog(null, e);   
        }
        return tecnicalList;
    }
    
     public void showUserTecnical()
    {
        ArrayList<TecnicalView> list= tecnicalList();
        DefaultTableModel model=(DefaultTableModel)table2.getModel();
        
        Object[] row= new Object[20];
        for(int i=0;i<list.size();i++)
        {
            row[0]=list.get(i).getTecnicalId();
            row[1]=list.get(i).getTecnicalDepId();
            row[2]=list.get(i).getTecnicalName();
            row[3]=list.get(i).getTecnicalGender();
            row[4]=list.get(i).getTecnicalPno();
            row[5]=list.get(i).getTecnicalImage();
            model.addRow(row);
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

        editTecName = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        Student = new javax.swing.JPanel();
        stuExit = new javax.swing.JLabel();
        Table = new javax.swing.JScrollPane();
        stuTable = new javax.swing.JTable();
        viewStuId = new javax.swing.JLabel();
        viewStuIdTxt = new javax.swing.JTextField();
        editSearch = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lecExit = new javax.swing.JLabel();
        back1 = new javax.swing.JLabel();
        Table1 = new javax.swing.JScrollPane();
        lecTable = new javax.swing.JTable();
        back2 = new javax.swing.JLabel();
        viewLecturerId = new javax.swing.JLabel();
        viewLecIdTxt = new javax.swing.JTextField();
        viewLecSearch = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        tecExit = new javax.swing.JLabel();
        back3 = new javax.swing.JLabel();
        Table2 = new javax.swing.JScrollPane();
        table2 = new javax.swing.JTable();
        viewTecId = new javax.swing.JLabel();
        viewTecIdTxt = new javax.swing.JTextField();
        viewLecSearch1 = new javax.swing.JLabel();

        editTecName.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        editTecName.setForeground(new java.awt.Color(255, 255, 255));
        editTecName.setText("Name");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("View Profile");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jTabbedPane1.setVerifyInputWhenFocusTarget(false);

        Student.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        stuExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/exit.png"))); // NOI18N
        stuExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        stuExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stuExitMouseClicked(evt);
            }
        });
        Student.add(stuExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 20, -1, -1));

        Table.setBackground(new java.awt.Color(255, 255, 255));
        Table.setForeground(new java.awt.Color(255, 255, 255));

        stuTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student ID", "Department ID", "Menter ID", "Name", "Address", "Gender", "Birth Day", "Phone Number", "Image"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Table.setViewportView(stuTable);
        if (stuTable.getColumnModel().getColumnCount() > 0) {
            stuTable.getColumnModel().getColumn(0).setResizable(false);
            stuTable.getColumnModel().getColumn(1).setResizable(false);
            stuTable.getColumnModel().getColumn(2).setResizable(false);
            stuTable.getColumnModel().getColumn(3).setResizable(false);
            stuTable.getColumnModel().getColumn(4).setResizable(false);
            stuTable.getColumnModel().getColumn(5).setResizable(false);
            stuTable.getColumnModel().getColumn(6).setResizable(false);
            stuTable.getColumnModel().getColumn(7).setResizable(false);
            stuTable.getColumnModel().getColumn(8).setResizable(false);
        }

        Student.add(Table, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 790, 160));

        viewStuId.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        viewStuId.setForeground(new java.awt.Color(255, 255, 0));
        viewStuId.setText("Student ID");
        Student.add(viewStuId, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        viewStuIdTxt.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        viewStuIdTxt.setText("tgxxx");
        Student.add(viewStuIdTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 150, 30));

        editSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/search.png"))); // NOI18N
        editSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editSearchMouseClicked(evt);
            }
        });
        Student.add(editSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 30, 30));

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/profBack.jpg"))); // NOI18N
        Student.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 620));

        jTabbedPane1.addTab("Student", Student);

        lecExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/exit.png"))); // NOI18N
        lecExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lecExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lecExitMouseClicked(evt);
            }
        });

        back1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/profBack.jpg"))); // NOI18N

        Table1.setBackground(new java.awt.Color(255, 255, 255));
        Table1.setForeground(new java.awt.Color(255, 255, 255));

        lecTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Lecturer ID", "Department ID", "Name", "Address", "Gender", "Phone Number", "Image"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Table1.setViewportView(lecTable);
        if (lecTable.getColumnModel().getColumnCount() > 0) {
            lecTable.getColumnModel().getColumn(0).setResizable(false);
            lecTable.getColumnModel().getColumn(1).setResizable(false);
            lecTable.getColumnModel().getColumn(2).setResizable(false);
            lecTable.getColumnModel().getColumn(3).setResizable(false);
            lecTable.getColumnModel().getColumn(3).setHeaderValue("Address");
            lecTable.getColumnModel().getColumn(4).setResizable(false);
            lecTable.getColumnModel().getColumn(5).setResizable(false);
            lecTable.getColumnModel().getColumn(6).setResizable(false);
        }

        back2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/profBack.jpg"))); // NOI18N

        viewLecturerId.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        viewLecturerId.setForeground(new java.awt.Color(255, 255, 0));
        viewLecturerId.setText("Lecturer ID");

        viewLecIdTxt.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        viewLecIdTxt.setText("lecxx");

        viewLecSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/search.png"))); // NOI18N
        viewLecSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        viewLecSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewLecSearchMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Table1, javax.swing.GroupLayout.PREFERRED_SIZE, 759, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lecExit))
                .addGap(25, 25, 25))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(viewLecturerId)
                .addGap(58, 58, 58)
                .addComponent(viewLecIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(viewLecSearch)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(back1)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(back2)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lecExit)
                .addGap(2, 2, 2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(viewLecturerId)
                            .addComponent(viewLecIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(93, 93, 93)
                        .addComponent(Table1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(viewLecSearch))
                .addContainerGap(294, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(back1)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(back2)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Lecturer", jPanel2);

        tecExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/exit.png"))); // NOI18N
        tecExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tecExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tecExitMouseClicked(evt);
            }
        });

        back3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/profBack.jpg"))); // NOI18N

        Table2.setBackground(new java.awt.Color(255, 255, 255));
        Table2.setForeground(new java.awt.Color(255, 255, 255));

        table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tecnical ID", "Department ID", "Name", "Gender", "Phone Number", "Image"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Table2.setViewportView(table2);
        if (table2.getColumnModel().getColumnCount() > 0) {
            table2.getColumnModel().getColumn(0).setResizable(false);
            table2.getColumnModel().getColumn(1).setResizable(false);
            table2.getColumnModel().getColumn(2).setResizable(false);
            table2.getColumnModel().getColumn(3).setResizable(false);
            table2.getColumnModel().getColumn(4).setResizable(false);
            table2.getColumnModel().getColumn(5).setResizable(false);
        }

        viewTecId.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        viewTecId.setForeground(new java.awt.Color(255, 255, 0));
        viewTecId.setText("Tecnical ID");

        viewTecIdTxt.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        viewTecIdTxt.setText("tecxx");

        viewLecSearch1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/search.png"))); // NOI18N
        viewLecSearch1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        viewLecSearch1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewLecSearch1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(tecExit)
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(Table2, javax.swing.GroupLayout.PREFERRED_SIZE, 759, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(viewTecId)
                .addGap(58, 58, 58)
                .addComponent(viewTecIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(viewLecSearch1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(back3)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tecExit)
                .addGap(2, 2, 2)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(viewTecId)
                        .addComponent(viewTecIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(viewLecSearch1))
                .addGap(99, 99, 99)
                .addComponent(Table2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(288, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(back3)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Technical Officer", jPanel3);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 450));
        jTabbedPane1.getAccessibleContext().setAccessibleName("");
        jTabbedPane1.getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tecExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tecExitMouseClicked
        Admin_Profile p=new Admin_Profile();  // back to the user profiles
        p.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_tecExitMouseClicked

    private void lecExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lecExitMouseClicked
        Admin_Profile p=new Admin_Profile();  // back to the user profiles
        p.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lecExitMouseClicked

    private void stuExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stuExitMouseClicked
        Admin_Profile p=new Admin_Profile();  // back to the user profiles
        p.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_stuExitMouseClicked

    private void editSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editSearchMouseClicked
        
        View_Student stu =new View_Student(viewStuIdTxt.getText().trim());
        stu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_editSearchMouseClicked

    private void viewLecSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewLecSearchMouseClicked
        
            View_Lecturer lec =new View_Lecturer(viewLecIdTxt.getText().trim());
            lec.setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_viewLecSearchMouseClicked

    private void viewLecSearch1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewLecSearch1MouseClicked
        View_Tecnical tec =new View_Tecnical(viewTecIdTxt.getText().trim());
            tec.setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_viewLecSearch1MouseClicked
    
     
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
            java.util.logging.Logger.getLogger(View_Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View_Profile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Student;
    private javax.swing.JScrollPane Table;
    private javax.swing.JScrollPane Table1;
    private javax.swing.JScrollPane Table2;
    private javax.swing.JLabel back;
    private javax.swing.JLabel back1;
    private javax.swing.JLabel back2;
    private javax.swing.JLabel back3;
    private javax.swing.JLabel editSearch;
    private javax.swing.JLabel editTecName;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lecExit;
    private javax.swing.JTable lecTable;
    private javax.swing.JLabel stuExit;
    private javax.swing.JTable stuTable;
    private javax.swing.JTable table2;
    private javax.swing.JLabel tecExit;
    private javax.swing.JTextField viewLecIdTxt;
    private javax.swing.JLabel viewLecSearch;
    private javax.swing.JLabel viewLecSearch1;
    private javax.swing.JLabel viewLecturerId;
    private javax.swing.JLabel viewStuId;
    private javax.swing.JTextField viewStuIdTxt;
    private javax.swing.JLabel viewTecId;
    private javax.swing.JTextField viewTecIdTxt;
    // End of variables declaration//GEN-END:variables
}

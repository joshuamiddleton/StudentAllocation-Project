/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import components.Student;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.table.DefaultTableModel;

public class StudentManager extends javax.swing.JFrame {
    Student student;
    /**
     * Creates new form StudentManager
     */
    public StudentManager() {
        initComponents();
        student = new Student(0, "", "", "");
        populateTable();
    }
    
    private void populateTable(){
        String filePath = "C:\\Users\\Necro\\Desktop\\text.txt";
        File file = new File(filePath);
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            
            DefaultTableModel model = (DefaultTableModel)tbl_removeStudent.getModel();
            model.setRowCount(0);
            Object[] lines = br.lines().toArray();
            
            for (Object line : lines) {
                String[] row = line.toString().split(" ");
                model.addRow(row);
            }
        } catch (FileNotFoundException fnf) {
            System.out.println("File not found: " + fnf.toString());
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_studentName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbox_grade = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        cbox_role = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        btn_addStudent = new javax.swing.JButton();
        btn_removeStudent = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_removeStudent = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Student Manager");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Add Student");

        jLabel3.setText("Name:");

        jLabel4.setText("Average Grade:");

        cbox_grade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "First", "Second", "Third" }));

        jLabel5.setText("Preferred Role:");

        cbox_role.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Researching", "More researching", "Special Research", "Research" }));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Remove Student");

        btn_addStudent.setText("Add");
        btn_addStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addStudentActionPerformed(evt);
            }
        });

        btn_removeStudent.setText("Delete");
        btn_removeStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_removeStudentActionPerformed(evt);
            }
        });

        tbl_removeStudent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Role", "Grade"
            }
        ));
        tbl_removeStudent.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tbl_removeStudent);
        if (tbl_removeStudent.getColumnModel().getColumnCount() > 0) {
            tbl_removeStudent.getColumnModel().getColumn(0).setMaxWidth(30);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_removeStudent)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_addStudent)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel1)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(45, 45, 45)
                                                    .addComponent(jLabel3))
                                                .addComponent(jLabel4))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txt_studentName)
                                                .addComponent(cbox_grade, 0, 120, Short.MAX_VALUE)))))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(12, 12, 12)
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbox_role, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
                            .addComponent(jLabel6))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_studentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbox_grade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cbox_role, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_addStudent))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_removeStudent))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_addStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addStudentActionPerformed
            student.setName(txt_studentName.getText());
            student.setGrade(cbox_grade.getSelectedItem().toString());
            student.setRole(cbox_role.getSelectedItem().toString());
            try{
                student.setStudentID(Student.readLineNum("C:\\Users\\Necro\\Desktop\\text.txt"));
            }catch(IOException ioe){
                System.out.println("IO Exception: " + ioe.toString());
            }
            if(student.getStudentID() == 0){
                System.out.println(student.getStudentID());
                student.setStudentID(1);
                System.out.println(student.getStudentID());
            }
            student.populateTextFile();
            populateTable();
    }//GEN-LAST:event_btn_addStudentActionPerformed

    private void btn_removeStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_removeStudentActionPerformed
        int[] row = tbl_removeStudent.getSelectedRows();
        String id, name, role, grade;
        
        //int rowValue;
        for(int i = 0; i < tbl_removeStudent.getSelectedRowCount(); i++){
            id = tbl_removeStudent.getModel().getValueAt(row[i], 0).toString();
            name = tbl_removeStudent.getModel().getValueAt(row[i], 1).toString();
            role = tbl_removeStudent.getModel().getValueAt(row[i], 2).toString();
            grade = tbl_removeStudent.getModel().getValueAt(row[i], 3).toString();
            //rowValue = Integer.valueOf((String) tbl_removeStudent.getModel().getValueAt(row[i], 0));
            student.removeStudent(id, name, role, grade);
        }
        populateTable();
    }//GEN-LAST:event_btn_removeStudentActionPerformed

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
            java.util.logging.Logger.getLogger(StudentManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentManager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_addStudent;
    private javax.swing.JButton btn_removeStudent;
    private javax.swing.JComboBox<String> cbox_grade;
    private javax.swing.JComboBox<String> cbox_role;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbl_removeStudent;
    private javax.swing.JTextField txt_studentName;
    // End of variables declaration//GEN-END:variables
}

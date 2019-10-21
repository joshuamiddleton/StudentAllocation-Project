/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import Components.Student;
import Components.Usability;

public class StudentManager extends javax.swing.JFrame {
    Student student;
    /**
     * Creates new form StudentManager
     */
    public StudentManager() {
        initComponents();
        student = new Student(0, "", "", "");

    }
    


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headerPanel = new javax.swing.JPanel();
        groupTitle = new javax.swing.JLabel();
        applicationTitle = new javax.swing.JLabel();
        headerSeparator = new javax.swing.JSeparator();
        addStudentPanel = new javax.swing.JPanel();
        addStudentTitle = new javax.swing.JLabel();
        studentNameLabel = new javax.swing.JLabel();
        studentNameInput = new javax.swing.JTextField();
        studentNumberLabel = new javax.swing.JLabel();
        studentNumberInput = new javax.swing.JTextField();
        studentRoleLabel = new javax.swing.JLabel();
        studentRolePrompt = new javax.swing.JLabel();
        anyRoleTickBox = new javax.swing.JCheckBox();
        specificationTickBox = new javax.swing.JCheckBox();
        developerTickBox = new javax.swing.JCheckBox();
        projectManagerTickBox = new javax.swing.JCheckBox();
        testerTickBox = new javax.swing.JCheckBox();
        designerTickBox = new javax.swing.JCheckBox();
        studentRoleLabel1 = new javax.swing.JLabel();
        studentRolePrompt1 = new javax.swing.JLabel();
        teamManagementSpinnerLabel = new javax.swing.JLabel();
        teamManagementSpinner = new javax.swing.JSpinner();
        ProgrammingSpinnerLabel = new javax.swing.JLabel();
        programmingSpinner = new javax.swing.JSpinner();
        designSpinnerLabel = new javax.swing.JLabel();
        designSpinner = new javax.swing.JSpinner();
        reportWritingSpinnerLabel = new javax.swing.JLabel();
        reportWritingSpinner = new javax.swing.JSpinner();
        negotiationSpinnerLabel = new javax.swing.JLabel();
        negotiationSpinner = new javax.swing.JSpinner();
        planningSpinnerLabel = new javax.swing.JLabel();
        planningSpinner = new javax.swing.JSpinner();
        bodySeperator = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        groupTitle.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        groupTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        groupTitle.setText("Group 11 - Software Engineering");

        applicationTitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        applicationTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        applicationTitle.setText("Student Allocation Application");

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(headerSeparator, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
                    .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(groupTitle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
                        .addComponent(applicationTitle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(groupTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(applicationTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(headerSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        addStudentTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        addStudentTitle.setText("Add Student:");

        studentNameLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        studentNameLabel.setText("Student Name:");

        studentNameInput.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        studentNameInput.setText("Please enter student name.");
        studentNameInput.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                studentNameInputFocusLost(evt);
            }
        });
        studentNameInput.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentNameInputMouseClicked(evt);
            }
        });
        studentNameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentNameInputActionPerformed(evt);
            }
        });

        studentNumberLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        studentNumberLabel.setText("Student Number:");

        studentNumberInput.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        studentNumberInput.setText("Please enter student number.");
        studentNumberInput.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                studentNumberInputFocusLost(evt);
            }
        });
        studentNumberInput.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentNumberInputMouseClicked(evt);
            }
        });
        studentNumberInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentNumberInputActionPerformed(evt);
            }
        });

        studentRoleLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        studentRoleLabel.setText("Please select the student's role(s):");

        studentRolePrompt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        studentRolePrompt.setText("(Select any if there is no preference, else select one or many roles for the student)");

        anyRoleTickBox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        anyRoleTickBox.setText("Any Role");
        anyRoleTickBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anyRoleTickBoxActionPerformed(evt);
            }
        });

        specificationTickBox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        specificationTickBox.setText("Specification");
        specificationTickBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                specificationTickBoxActionPerformed(evt);
            }
        });

        developerTickBox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        developerTickBox.setText("Developer");
        developerTickBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                developerTickBoxActionPerformed(evt);
            }
        });

        projectManagerTickBox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        projectManagerTickBox.setText("Project Manager");
        projectManagerTickBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                projectManagerTickBoxActionPerformed(evt);
            }
        });

        testerTickBox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        testerTickBox.setText("Tester");
        testerTickBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testerTickBoxActionPerformed(evt);
            }
        });

        designerTickBox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        designerTickBox.setText("Designer");
        designerTickBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                designerTickBoxActionPerformed(evt);
            }
        });

        studentRoleLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        studentRoleLabel1.setText("Please rate the student's skill(s):");

        studentRolePrompt1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        studentRolePrompt1.setText("(1 = Very Poor / 2 = Poor / 3 = Okay / 4 = Good / 5 = Very Good)");

        teamManagementSpinnerLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        teamManagementSpinnerLabel.setText("Team Management:");

        teamManagementSpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));

        ProgrammingSpinnerLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ProgrammingSpinnerLabel.setText("Programming:");

        programmingSpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));

        designSpinnerLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        designSpinnerLabel.setText("Design:");

        designSpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));

        reportWritingSpinnerLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        reportWritingSpinnerLabel.setText("Report Writing:");

        reportWritingSpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));

        negotiationSpinnerLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        negotiationSpinnerLabel.setText("Negotiation:");

        negotiationSpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));

        planningSpinnerLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        planningSpinnerLabel.setText("Planning:");

        planningSpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));

        javax.swing.GroupLayout addStudentPanelLayout = new javax.swing.GroupLayout(addStudentPanel);
        addStudentPanel.setLayout(addStudentPanelLayout);
        addStudentPanelLayout.setHorizontalGroup(
            addStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addStudentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addStudentPanelLayout.createSequentialGroup()
                        .addGroup(addStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(studentNameInput)
                            .addComponent(studentNumberInput, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, addStudentPanelLayout.createSequentialGroup()
                                .addComponent(designerTickBox, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(testerTickBox, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(projectManagerTickBox, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, addStudentPanelLayout.createSequentialGroup()
                                .addComponent(anyRoleTickBox, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(specificationTickBox, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(developerTickBox, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(addStudentTitle, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(studentNameLabel, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(studentNumberLabel, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(studentRoleLabel, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(studentRolePrompt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(studentRoleLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(studentRolePrompt1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, addStudentPanelLayout.createSequentialGroup()
                                .addGroup(addStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(teamManagementSpinnerLabel)
                                    .addComponent(teamManagementSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(reportWritingSpinnerLabel)
                                    .addComponent(reportWritingSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(addStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(negotiationSpinnerLabel)
                                    .addComponent(negotiationSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ProgrammingSpinnerLabel)
                                    .addComponent(programmingSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(addStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(addStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(planningSpinnerLabel)
                                        .addComponent(planningSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(addStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(designSpinnerLabel)
                                        .addComponent(designSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(bodySeperator))
                .addContainerGap())
        );
        addStudentPanelLayout.setVerticalGroup(
            addStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addStudentPanelLayout.createSequentialGroup()
                .addComponent(addStudentTitle)
                .addGap(18, 18, 18)
                .addComponent(studentNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(studentNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(studentNumberLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(studentNumberInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(studentRoleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(studentRolePrompt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(anyRoleTickBox)
                    .addComponent(specificationTickBox)
                    .addComponent(developerTickBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(designerTickBox)
                    .addComponent(testerTickBox)
                    .addComponent(projectManagerTickBox))
                .addGap(18, 18, 18)
                .addComponent(studentRoleLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(studentRolePrompt1)
                .addGap(18, 18, 18)
                .addGroup(addStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addStudentPanelLayout.createSequentialGroup()
                        .addComponent(teamManagementSpinnerLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(teamManagementSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(addStudentPanelLayout.createSequentialGroup()
                        .addComponent(ProgrammingSpinnerLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(programmingSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(addStudentPanelLayout.createSequentialGroup()
                        .addComponent(designSpinnerLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(designSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addStudentPanelLayout.createSequentialGroup()
                        .addComponent(reportWritingSpinnerLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(reportWritingSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(addStudentPanelLayout.createSequentialGroup()
                        .addComponent(negotiationSpinnerLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(negotiationSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(addStudentPanelLayout.createSequentialGroup()
                        .addComponent(planningSpinnerLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(planningSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(bodySeperator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jButton1.setText("Add Student");

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addStudentPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addStudentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void studentNumberInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentNumberInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentNumberInputActionPerformed

    private void studentNameInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentNameInputActionPerformed
    }//GEN-LAST:event_studentNameInputActionPerformed

    private void anyRoleTickBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anyRoleTickBoxActionPerformed
        if(anyRoleTickBox.isSelected()) {
            specificationTickBox.setSelected(false);
            specificationTickBox.setEnabled(false);
            developerTickBox.setSelected(false);
            developerTickBox.setEnabled(false);
            designerTickBox.setSelected(false);
            designerTickBox.setEnabled(false);
            testerTickBox.setSelected(false);
            testerTickBox.setEnabled(false);
            projectManagerTickBox.setSelected(false);
            projectManagerTickBox.setEnabled(false);
        }
        else {
            if(!anyRoleTickBox.isSelected()) {
            specificationTickBox.setSelected(false);
            specificationTickBox.setEnabled(true);
            developerTickBox.setSelected(false);
            developerTickBox.setEnabled(true);
            designerTickBox.setSelected(false);
            designerTickBox.setEnabled(true);
            testerTickBox.setSelected(false);
            testerTickBox.setEnabled(true);
            projectManagerTickBox.setSelected(false);
            projectManagerTickBox.setEnabled(true);
            }
        }
    }//GEN-LAST:event_anyRoleTickBoxActionPerformed

    private void specificationTickBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_specificationTickBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_specificationTickBoxActionPerformed

    private void developerTickBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_developerTickBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_developerTickBoxActionPerformed

    private void projectManagerTickBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_projectManagerTickBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_projectManagerTickBoxActionPerformed

    private void testerTickBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testerTickBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_testerTickBoxActionPerformed

    private void designerTickBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_designerTickBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_designerTickBoxActionPerformed

    private void studentNameInputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentNameInputMouseClicked
        Usability.emptyTextField(studentNameInput, "Please enter student name.");
    }//GEN-LAST:event_studentNameInputMouseClicked

    private void studentNameInputFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_studentNameInputFocusLost
        Usability.setPlaceholderText(studentNameInput, "Please enter student name.");
    }//GEN-LAST:event_studentNameInputFocusLost

    private void studentNumberInputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentNumberInputMouseClicked
        Usability.emptyTextField(studentNumberInput, "Please enter student number.");
    }//GEN-LAST:event_studentNumberInputMouseClicked

    private void studentNumberInputFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_studentNumberInputFocusLost
        Usability.setPlaceholderText(studentNumberInput, "Please enter student number.");
    }//GEN-LAST:event_studentNumberInputFocusLost

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentManager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ProgrammingSpinnerLabel;
    private javax.swing.JPanel addStudentPanel;
    private javax.swing.JLabel addStudentTitle;
    private javax.swing.JCheckBox anyRoleTickBox;
    private javax.swing.JLabel applicationTitle;
    private javax.swing.JSeparator bodySeperator;
    private javax.swing.JSpinner designSpinner;
    private javax.swing.JLabel designSpinnerLabel;
    private javax.swing.JCheckBox designerTickBox;
    private javax.swing.JCheckBox developerTickBox;
    private javax.swing.JLabel groupTitle;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JSeparator headerSeparator;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JSpinner negotiationSpinner;
    private javax.swing.JLabel negotiationSpinnerLabel;
    private javax.swing.JSpinner planningSpinner;
    private javax.swing.JLabel planningSpinnerLabel;
    private javax.swing.JSpinner programmingSpinner;
    private javax.swing.JCheckBox projectManagerTickBox;
    private javax.swing.JSpinner reportWritingSpinner;
    private javax.swing.JLabel reportWritingSpinnerLabel;
    private javax.swing.JCheckBox specificationTickBox;
    private javax.swing.JTextField studentNameInput;
    private javax.swing.JLabel studentNameLabel;
    private javax.swing.JTextField studentNumberInput;
    private javax.swing.JLabel studentNumberLabel;
    private javax.swing.JLabel studentRoleLabel;
    private javax.swing.JLabel studentRoleLabel1;
    private javax.swing.JLabel studentRolePrompt;
    private javax.swing.JLabel studentRolePrompt1;
    private javax.swing.JSpinner teamManagementSpinner;
    private javax.swing.JLabel teamManagementSpinnerLabel;
    private javax.swing.JCheckBox testerTickBox;
    // End of variables declaration//GEN-END:variables
}

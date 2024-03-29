/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import Components.Student;
import Components.Usability;
import javax.swing.ButtonGroup;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class StudentManager extends javax.swing.JFrame {
    Student student;
    ButtonGroup group;
    String roleValue;
    /**
     * Creates new form StudentManager
     */
    public StudentManager() {
        initComponents();
        student = new Student(0, "", 0, "", "");
        roleValue = "Autofill";
        setupRadioGroup();
    }
    
    private int calculateGrade(){
        String totalString = teamManagementSpinner.getValue() + " " + programmingSpinner.getValue() + " " + designSpinner.getValue() + " " + reportWritingSpinner.getValue() + " " + negotiationSpinner.getValue() + " " + planningSpinner.getValue();
        String[] splitString = totalString.split("\\s+");
        int totalInt = 0;
        
        for(int i = 0; i < splitString.length; i++){
            totalInt += Integer.parseInt(splitString[i]);
        }
        
        return totalInt;
    }
    
    private String roleConversion(int role){
        String roleString;
        
        switch (role){
            case 1: roleString = "Autofill";
                    break;
            case 2: roleString = "Specification";
                    break;
            case 3: roleString = "Developer";
                    break;
            case 4: roleString = "Designer";
                    break;
            case 5: roleString = "Tester";
                    break;
            case 6: roleString = "Project Manager";
                    break;
            default: roleString = "Invalid Role";
                    break;
        }
        
        return roleString;
    }
    
    private void setupRadioGroup(){
        group = new ButtonGroup();
        group.add(rbtn_any);
        group.add(rbtn_spec);
        group.add(rbtn_dev);
        group.add(rbtn_des);
        group.add(rbtn_test);
        group.add(rbtn_pm);
        rbtn_any.setSelected(true);
    }
    
    private int calculateOverallSkill(){
        int total = 0;
        total += Integer.parseInt(teamManagementSpinner.getValue().toString());
        total += Integer.parseInt(programmingSpinner.getValue().toString());
        total += Integer.parseInt(designSpinner.getValue().toString());
        total += Integer.parseInt(reportWritingSpinner.getValue().toString());
        total += Integer.parseInt(negotiationSpinner.getValue().toString());
        total += Integer.parseInt(planningSpinner.getValue().toString());
        return total;
    }
    
    private String castSkillToString(){
        String condensedSkill;
        condensedSkill = teamManagementSpinner.getValue().toString() + " " + programmingSpinner.getValue().toString() + " " + designSpinner.getValue().toString() + " " + reportWritingSpinner.getValue().toString() + " " + negotiationSpinner.getValue().toString() + " " + planningSpinner.getValue().toString();
        System.out.println(condensedSkill);
        return condensedSkill;
    }
    
    private void setTextEmpty(){
        studentNameInput.setText("Please enter Student name.");
        studentNumberInput.setText("Please enter student number.");
        teamManagementSpinner.setValue(1);
        programmingSpinner.setValue(1);
        designSpinner.setValue(1);
        reportWritingSpinner.setValue(1);
        planningSpinner.setValue(1);
        negotiationSpinner.setValue(1);
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
        rbtn_any = new javax.swing.JRadioButton();
        rbtn_spec = new javax.swing.JRadioButton();
        rbtn_dev = new javax.swing.JRadioButton();
        rbtn_des = new javax.swing.JRadioButton();
        rbtn_test = new javax.swing.JRadioButton();
        rbtn_pm = new javax.swing.JRadioButton();
        btn_addStudent = new javax.swing.JButton();
        btn_close = new javax.swing.JButton();

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
                    .addComponent(groupTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
                    .addComponent(applicationTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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

        rbtn_any.setText("Any Role");
        rbtn_any.addHierarchyListener(new java.awt.event.HierarchyListener() {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt) {
                rbtn_anyHierarchyChanged(evt);
            }
        });
        rbtn_any.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn_anyActionPerformed(evt);
            }
        });

        rbtn_spec.setText("Specification");
        rbtn_spec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn_specActionPerformed(evt);
            }
        });

        rbtn_dev.setText("Developer");
        rbtn_dev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn_devActionPerformed(evt);
            }
        });

        rbtn_des.setText("Designer");
        rbtn_des.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn_desActionPerformed(evt);
            }
        });

        rbtn_test.setText("Tester");
        rbtn_test.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn_testActionPerformed(evt);
            }
        });

        rbtn_pm.setText("Project Manager");
        rbtn_pm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn_pmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addStudentPanelLayout = new javax.swing.GroupLayout(addStudentPanel);
        addStudentPanel.setLayout(addStudentPanelLayout);
        addStudentPanelLayout.setHorizontalGroup(
            addStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addStudentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addStudentPanelLayout.createSequentialGroup()
                        .addGroup(addStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(addStudentPanelLayout.createSequentialGroup()
                                .addGroup(addStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(studentNameInput)
                                    .addComponent(studentNumberInput, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(studentRolePrompt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(addStudentTitle, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(studentNameLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(studentNumberLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(studentRoleLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(studentRoleLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(studentRolePrompt1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, addStudentPanelLayout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addGroup(addStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(teamManagementSpinnerLabel)
                                            .addComponent(teamManagementSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(reportWritingSpinnerLabel)
                                            .addComponent(reportWritingSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(65, 65, 65)
                                        .addGroup(addStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(negotiationSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ProgrammingSpinnerLabel)
                                            .addComponent(programmingSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addStudentPanelLayout.createSequentialGroup()
                                                .addComponent(negotiationSpinnerLabel)
                                                .addGap(10, 10, 10)))))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(bodySeperator))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addStudentPanelLayout.createSequentialGroup()
                        .addGroup(addStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(addStudentPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(addStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(designSpinnerLabel)
                                    .addComponent(designSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(planningSpinnerLabel)
                                    .addComponent(planningSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(addStudentPanelLayout.createSequentialGroup()
                                .addGroup(addStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbtn_any)
                                    .addComponent(rbtn_des))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(addStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbtn_spec)
                                    .addComponent(rbtn_test))
                                .addGap(59, 59, 59)
                                .addGroup(addStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbtn_dev)
                                    .addComponent(rbtn_pm))))
                        .addGap(51, 51, 51))))
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
                    .addComponent(rbtn_any)
                    .addComponent(rbtn_spec)
                    .addComponent(rbtn_dev))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtn_des)
                    .addComponent(rbtn_test)
                    .addComponent(rbtn_pm))
                .addGap(18, 18, 18)
                .addComponent(studentRoleLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(studentRolePrompt1)
                .addGap(18, 18, 18)
                .addGroup(addStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addStudentPanelLayout.createSequentialGroup()
                        .addGroup(addStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(addStudentPanelLayout.createSequentialGroup()
                                .addComponent(teamManagementSpinnerLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(teamManagementSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                .addComponent(planningSpinnerLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(planningSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addComponent(bodySeperator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(addStudentPanelLayout.createSequentialGroup()
                        .addComponent(ProgrammingSpinnerLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(programmingSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(negotiationSpinnerLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(negotiationSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        btn_addStudent.setText("Add Student");
        btn_addStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addStudentActionPerformed(evt);
            }
        });

        btn_close.setText("Cancel");
        btn_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_closeActionPerformed(evt);
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
                .addComponent(btn_addStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_close, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(btn_addStudent)
                    .addComponent(btn_close))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void studentNumberInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentNumberInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentNumberInputActionPerformed

    private void studentNameInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentNameInputActionPerformed
    }//GEN-LAST:event_studentNameInputActionPerformed

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

    private void btn_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_closeActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_closeActionPerformed

    private void btn_addStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addStudentActionPerformed
        String length;
        
        try {
            group.getSelection().getActionCommand();
            student.setGrade(calculateGrade());
            if(!studentNameInput.getText().matches(".*\\d+.*")){
                student.setName(studentNameInput.getText());
                student.setStudentID(Integer.parseInt(studentNumberInput.getText()));
                length = "" + student.getStudentID();
                if(length.length() == 8){
                    if(student.checkForExistingID("" + student.getStudentID()) == 1){
                        JOptionPane optionPane = new JOptionPane("Student ID already exists, please remove or edit existing student.", JOptionPane.ERROR_MESSAGE);
                        JDialog dialog = optionPane.createDialog("Failure");
                        dialog.setAlwaysOnTop(true);
                        dialog.setVisible(true);
                    }else{
                        student.setRole(roleValue);
                        student.setSkillLevel(castSkillToString());
                        student.populateTextFile();
                        setTextEmpty();
                    }
                }else{
                    JOptionPane optionPane = new JOptionPane("Student ID length incorrect, correct length is 8.", JOptionPane.ERROR_MESSAGE);
                    JDialog dialog = optionPane.createDialog("Failure");
                    dialog.setAlwaysOnTop(true);
                    dialog.setVisible(true);
                }                
            }else{
                JOptionPane optionPane = new JOptionPane("Student Name contains digits.", JOptionPane.ERROR_MESSAGE);
                JDialog dialog = optionPane.createDialog("Failure");
                dialog.setAlwaysOnTop(true);
                dialog.setVisible(true);
            }
        } catch (NumberFormatException numberFormatException) {
            JOptionPane optionPane = new JOptionPane("Student ID contains invalid characters.", JOptionPane.ERROR_MESSAGE);
            JDialog dialog = optionPane.createDialog("Failure");
            dialog.setAlwaysOnTop(true);
            dialog.setVisible(true);
            System.out.println("Number Format Exception: " + numberFormatException.toString());
        }
    }//GEN-LAST:event_btn_addStudentActionPerformed

    private void rbtn_anyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_anyActionPerformed
        roleValue = "Autofill";
    }//GEN-LAST:event_rbtn_anyActionPerformed

    private void rbtn_anyHierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_rbtn_anyHierarchyChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtn_anyHierarchyChanged

    private void rbtn_specActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_specActionPerformed
        roleValue = "Specification";
    }//GEN-LAST:event_rbtn_specActionPerformed

    private void rbtn_devActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_devActionPerformed
        roleValue = "Developer";
    }//GEN-LAST:event_rbtn_devActionPerformed

    private void rbtn_desActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_desActionPerformed
        roleValue = "Designer";
    }//GEN-LAST:event_rbtn_desActionPerformed

    private void rbtn_testActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_testActionPerformed
        roleValue = "Tester";
    }//GEN-LAST:event_rbtn_testActionPerformed

    private void rbtn_pmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_pmActionPerformed
        roleValue = "Project Manager";
    }//GEN-LAST:event_rbtn_pmActionPerformed

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
    private javax.swing.JLabel applicationTitle;
    private javax.swing.JSeparator bodySeperator;
    private javax.swing.JButton btn_addStudent;
    private javax.swing.JButton btn_close;
    private javax.swing.JSpinner designSpinner;
    private javax.swing.JLabel designSpinnerLabel;
    private javax.swing.JLabel groupTitle;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JSeparator headerSeparator;
    private javax.swing.JSpinner negotiationSpinner;
    private javax.swing.JLabel negotiationSpinnerLabel;
    private javax.swing.JSpinner planningSpinner;
    private javax.swing.JLabel planningSpinnerLabel;
    private javax.swing.JSpinner programmingSpinner;
    private javax.swing.JRadioButton rbtn_any;
    private javax.swing.JRadioButton rbtn_des;
    private javax.swing.JRadioButton rbtn_dev;
    private javax.swing.JRadioButton rbtn_pm;
    private javax.swing.JRadioButton rbtn_spec;
    private javax.swing.JRadioButton rbtn_test;
    private javax.swing.JSpinner reportWritingSpinner;
    private javax.swing.JLabel reportWritingSpinnerLabel;
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
    // End of variables declaration//GEN-END:variables
}

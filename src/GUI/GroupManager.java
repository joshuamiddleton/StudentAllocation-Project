/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javax.swing.table.DefaultTableModel;
import Components.Settings;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GroupManager extends javax.swing.JFrame {
    Settings set;
    DefaultTableModel model;
    FileReader fr;
    BufferedReader br;
    /**
     * Creates new form GroupManager
     */
    public GroupManager() {
        initComponents();
        set = new Settings();
        loadSavedSession();
    }
    
    private int getDifference(){
        int groupSize = groupRangeSlider.getValue();
        int roleCount = 0;
        model = (DefaultTableModel)tbl_roleDistribution.getModel();
        
        for(int i = 0; i < model.getRowCount(); i++){
            roleCount += Integer.parseInt(model.getValueAt(i, 1).toString());
        }
        
        int difference = roleCount - groupSize;
        
        return difference;
    }
    
    /**
     * Makes sure that the roles match the group size.
     */
    private void normalizeGroupRoles(){
        int difference = getDifference();
        model = (DefaultTableModel)tbl_roleDistribution.getModel();
        int buffer;
        int x = 0;
        
        while(difference != 0){
            if(difference < 0){
                if (x < model.getRowCount()) {
                    buffer = Integer.parseInt(model.getValueAt(x, 1).toString());
                    buffer++;
                    model.setValueAt(buffer, x, 1);
                    x++;
                    difference = getDifference();
                }else{
                    x = 0;
                }
            }else if(difference > 0){
                if(x < model.getRowCount()){
                    buffer = Integer.parseInt(model.getValueAt(x, 1).toString());
                    if(buffer != 0){
                        buffer--;
                    }else{
                        //Do Nothing
                    }
                    model.setValueAt(buffer, x, 1);
                    x++;
                    difference = getDifference();
                }else{
                    x = 0;
                }
            }
        }
    }
    
    private void loadSavedSession(){
        try {
            File file = new File("./src/Data/settings.txt");
            fr = new FileReader(file);
            br = new BufferedReader(fr);
            model = (DefaultTableModel)tbl_roleDistribution.getModel();
            
            //Sets group slider value
            String slider = br.readLine();
            slider = slider.replaceAll("[^\\d]", "");
            groupRangeSlider.setValue(Integer.parseInt(slider));
            
            //Sets role distribution
            slider = br.readLine();
            slider = slider.replaceAll("[^\\d`]", "");
            String[] roleDist = slider.split("`");
            for(int i = 0; i < roleDist.length; i++){
                model.setValueAt(roleDist[i], i, 1);
            }
            
            br.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GroupManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GroupManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialise the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupManagerTitle = new javax.swing.JLabel();
        groupSizeTitle = new javax.swing.JLabel();
        groupRangeSlider = new javax.swing.JSlider();
        slider2 = new javax.swing.JLabel();
        slider3 = new javax.swing.JLabel();
        slider4 = new javax.swing.JLabel();
        slider5 = new javax.swing.JLabel();
        slider6 = new javax.swing.JLabel();
        roleDistributionTitle = new javax.swing.JLabel();
        roleTable = new javax.swing.JScrollPane();
        tbl_roleDistribution = new javax.swing.JTable();
        saveButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        groupManagerTitle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        groupManagerTitle.setText("Group Manager");

        groupSizeTitle.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        groupSizeTitle.setText("Group Size");

        groupRangeSlider.setMaximum(6);
        groupRangeSlider.setMinimum(2);

        slider2.setText("2");

        slider3.setText("6");

        slider4.setText("3");

        slider5.setText("4");

        slider6.setText("5");

        roleDistributionTitle.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        roleDistributionTitle.setText("Role Distribution");

        tbl_roleDistribution.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Specification", "0"},
                {"Developer", "0"},
                {"Designer", "0"},
                {"Tester", "0"},
                {"Project Manager", "0"}
            },
            new String [] {
                "Role", "Number"
            }
        ));
        roleTable.setViewportView(tbl_roleDistribution);

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(roleDistributionTitle)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(roleTable, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(groupRangeSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(slider2, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(slider4, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(slider5, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(slider6, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(slider3, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(groupManagerTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(saveButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cancelButton))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(groupSizeTitle)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(groupManagerTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(groupSizeTitle)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(slider3)
                    .addComponent(slider2)
                    .addComponent(slider4)
                    .addComponent(slider5)
                    .addComponent(slider6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(groupRangeSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(roleDistributionTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(roleTable, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton)
                    .addComponent(cancelButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        normalizeGroupRoles();
        int groupSize = groupRangeSlider.getValue();
        model = (DefaultTableModel)tbl_roleDistribution.getModel();
        int spec = 0;
        int dev = 0;
        int des = 0;
        int test = 0;
        int pm = 0;
        int anyRole = 0;
        
        for(int i = 0; i < model.getRowCount(); i++){
            model.getValueAt(i, 1);
            
            switch (i){
                case 0: spec = Integer.parseInt(model.getValueAt(i, 1).toString());
                        break;
                case 1: dev = Integer.parseInt(model.getValueAt(i, 1).toString());
                        break;
                case 2: des = Integer.parseInt(model.getValueAt(i, 1).toString());
                        break;
                case 3: test = Integer.parseInt(model.getValueAt(i, 1).toString());
                        break;
                case 4: pm = Integer.parseInt(model.getValueAt(i, 1).toString());
                        break;
                default: System.out.println("Too many roles. Please update save button method.");
                        break;
            }
        }
        set.condenseSettings(groupSize, spec, dev, des, test, pm);
    }//GEN-LAST:event_saveButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

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
            java.util.logging.Logger.getLogger(GroupManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GroupManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GroupManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GroupManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GroupManager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel groupManagerTitle;
    private javax.swing.JSlider groupRangeSlider;
    private javax.swing.JLabel groupSizeTitle;
    private javax.swing.JLabel roleDistributionTitle;
    private javax.swing.JScrollPane roleTable;
    private javax.swing.JButton saveButton;
    private javax.swing.JLabel slider2;
    private javax.swing.JLabel slider3;
    private javax.swing.JLabel slider4;
    private javax.swing.JLabel slider5;
    private javax.swing.JLabel slider6;
    private javax.swing.JTable tbl_roleDistribution;
    // End of variables declaration//GEN-END:variables
}

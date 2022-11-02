/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.doctor;

import java.awt.CardLayout;
import javax.swing.JPanel;
import model.MainSystem;
import model.Doctor;
import model.DoctorDirectory;
import model.Hospital;

/**
 *
 * @author akshb
 */
public class doctorScreen extends javax.swing.JPanel {

    /**
     * Creates new form doctorScreen
     */
    private JPanel bottomPanel;
    private MainSystem rootDataObj;

    public doctorScreen(JPanel bottomPanel, MainSystem rootDataObj) {
        initComponents();
        this.bottomPanel = bottomPanel;
        this.rootDataObj = rootDataObj;
        for (Hospital option : this.rootDataObj.getRootHospitalDirectory()) {
            hospitalDropdown.addItem(option.toString());
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

        titleLabel = new javax.swing.JLabel();
        subTitleLabel1 = new javax.swing.JLabel();
        doctorIdTextField = new javax.swing.JTextField();
        nextScreenButton = new javax.swing.JButton();
        hospitalDropdown = new javax.swing.JComboBox<>();
        validationLabel = new javax.swing.JLabel();

        titleLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("WELCOME DOCTORS");

        subTitleLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        subTitleLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subTitleLabel1.setText("Please Enter your Doctor ID Number Below to Begin Patient Treatment");

        doctorIdTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorIdTextFieldActionPerformed(evt);
            }
        });

        nextScreenButton.setText("GO");
        nextScreenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextScreenButtonActionPerformed(evt);
            }
        });

        validationLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        validationLabel.setForeground(new java.awt.Color(255, 0, 51));
        validationLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(subTitleLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
            .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(hospitalDropdown, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(doctorIdTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                            .addComponent(validationLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(363, 363, 363)
                        .addComponent(nextScreenButton, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(subTitleLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(hospitalDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(doctorIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(validationLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nextScreenButton)
                .addContainerGap(254, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void doctorIdTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorIdTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doctorIdTextFieldActionPerformed

    private void nextScreenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextScreenButtonActionPerformed
        // TODO add your handling code here:
        Doctor doctorLogin = doctorExists(doctorIdTextField.getText());
        Hospital selectedHospital = rootDataObj.getRootHospitalDirectory().get(hospitalDropdown.getSelectedIndex());

        if (doctorLogin != null) {
            PatientRegisterScreen patientRegister = new PatientRegisterScreen(bottomPanel, doctorLogin, selectedHospital, rootDataObj);
            bottomPanel.add("patientScreen", patientRegister);
            CardLayout layout = (CardLayout) bottomPanel.getLayout();
            layout.next(bottomPanel);
        } else {
            validationLabel.setText("Please enter valid doctor ID or recheck the hospital field");
        }


    }//GEN-LAST:event_nextScreenButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField doctorIdTextField;
    private javax.swing.JComboBox<String> hospitalDropdown;
    private javax.swing.JButton nextScreenButton;
    private javax.swing.JLabel subTitleLabel1;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel validationLabel;
    // End of variables declaration//GEN-END:variables

    private Doctor doctorExists(String text) {
        Hospital selectedHospital = rootDataObj.getRootHospitalDirectory().get(hospitalDropdown.getSelectedIndex());
        DoctorDirectory tempDoctorDir = selectedHospital.getDoctors();
        for (var doctor : tempDoctorDir.getDoctors()) {
            if (doctor.getPersonId().toString() == null ? text == null : doctor.getPersonId().toString().equals(text)) {
                return doctor;
            }
        }
        return null;
    }
}

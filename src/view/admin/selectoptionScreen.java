/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.admin;

import java.awt.CardLayout;
import java.util.UUID;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Admin;
import model.City;
import model.Community;
import model.House;
import model.Patient;
import view.admin.patientDetails;
import view.admin.hospitalDetails;

/**
 *
 * @author bharv
 */

public class selectoptionScreen extends javax.swing.JPanel {
    /**
     * Creates new form selectoptionScreen
     */
    Admin admin;
    JPanel bottomPanel;

    public selectoptionScreen(JPanel bottomPanel) {
        admin = new Admin();
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

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        PatientBtn = new javax.swing.JButton();
        DoctorBtn = new javax.swing.JButton();
        HospitalBtn = new javax.swing.JButton();
        BackBtn = new javax.swing.JButton();
        CommunityBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();

        jSplitPane1.setDividerLocation(130);

        PatientBtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        PatientBtn.setText("Patient");
        PatientBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatientBtnActionPerformed(evt);
            }
        });

        DoctorBtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        DoctorBtn.setText("Doctor");
        DoctorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoctorBtnActionPerformed(evt);
            }
        });

        HospitalBtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        HospitalBtn.setText("Hospital");
        HospitalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HospitalBtnActionPerformed(evt);
            }
        });

        BackBtn.setText("BACK");
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });

        CommunityBtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        CommunityBtn.setText("Community");
        CommunityBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CommunityBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(DoctorBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PatientBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BackBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CommunityBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HospitalBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {BackBtn, CommunityBtn, DoctorBtn, HospitalBtn, PatientBtn});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BackBtn)
                .addGap(199, 199, 199)
                .addComponent(PatientBtn)
                .addGap(29, 29, 29)
                .addComponent(DoctorBtn)
                .addGap(28, 28, 28)
                .addComponent(HospitalBtn)
                .addGap(28, 28, 28)
                .addComponent(CommunityBtn)
                .addContainerGap(193, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {DoctorBtn, HospitalBtn, PatientBtn});

        jSplitPane1.setLeftComponent(jPanel1);

        Title.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("Please select one option from the Left Panel");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Title, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 681, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(Title)
                .addContainerGap(504, Short.MAX_VALUE))
        );

        jSplitPane1.setRightComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 605, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void DoctorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoctorBtnActionPerformed
        // TODO add your handling code here:
//        DoctorScreen DoctorScreen = new DoctorScreen(bottomPanel);
//        bottomPanel.add("DoctorScreen", DoctorScreen);
//        CardLayout layout = (CardLayout) bottomPanel.getLayout();
//        layout.next(bottomPanel);
        doctorDetails DoctorDetails = new doctorDetails(admin);
            jSplitPane1.setRightComponent(DoctorDetails);
    }//GEN-LAST:event_DoctorBtnActionPerformed

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        // TODO add your handling code here:
        adminScreen admins = new adminScreen(bottomPanel);
        bottomPanel.add("adminscreen", admins);
        CardLayout layout = (CardLayout) bottomPanel.getLayout();
        layout.next(bottomPanel);
    }//GEN-LAST:event_BackBtnActionPerformed

    private void PatientBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PatientBtnActionPerformed
        // TODO add your handling code here:
//        patientDetails PatientScreen = new patientDetails(bottomPanel);
//        bottomPanel.add("patientDetails", PatientScreen);
//        CardLayout layout = (CardLayout) bottomPanel.getLayout();
//        layout.next(bottomPanel);

        patientDetails PatientDetails = new patientDetails(admin);
            jSplitPane1.setRightComponent(PatientDetails);
        
    }//GEN-LAST:event_PatientBtnActionPerformed

    private void HospitalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HospitalBtnActionPerformed
        // TODO add your handling code here:
        hospitalDetails HospitalDetails = new hospitalDetails(admin);
            jSplitPane1.setRightComponent(HospitalDetails);
            
    }//GEN-LAST:event_HospitalBtnActionPerformed

    private void CommunityBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CommunityBtnActionPerformed
        // TODO add your handling code here:
        communityDetails CommunityDetails = new communityDetails(admin);
            jSplitPane1.setRightComponent(CommunityDetails);
    }//GEN-LAST:event_CommunityBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JButton CommunityBtn;
    private javax.swing.JButton DoctorBtn;
    private javax.swing.JButton HospitalBtn;
    private javax.swing.JButton PatientBtn;
    private javax.swing.JLabel Title;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}

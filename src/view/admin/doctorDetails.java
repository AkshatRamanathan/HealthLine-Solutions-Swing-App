/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.admin;

import java.awt.CardLayout;
import java.util.UUID;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Admin;
import model.City;
import model.Community;
import model.House;
import model.Patient;

/**
 *
 * @author bharv
 */
public class doctorDetails extends javax.swing.JPanel {

    
    /**
     * Creates new form doctorDetails
     */
    Admin admin;
    public doctorDetails(Admin admin) {
        this.admin = admin;
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

        jPanel3 = new javax.swing.JPanel();
        Title1 = new javax.swing.JLabel();
        nameField2 = new javax.swing.JTextField();
        emailField2 = new javax.swing.JTextField();
        emailLabel2 = new javax.swing.JLabel();
        nameLabel2 = new javax.swing.JLabel();
        phoneLabel2 = new javax.swing.JLabel();
        address2 = new javax.swing.JLabel();
        roadLabel2 = new javax.swing.JLabel();
        roadField2 = new javax.swing.JTextField();
        houseNumField2 = new javax.swing.JTextField();
        phoneField2 = new javax.swing.JTextField();
        cityField2 = new javax.swing.JTextField();
        districtField2 = new javax.swing.JTextField();
        areaField2 = new javax.swing.JTextField();
        pincodeField2 = new javax.swing.JTextField();
        pincodeLabel2 = new javax.swing.JLabel();
        cityLabel2 = new javax.swing.JLabel();
        districtLabel2 = new javax.swing.JLabel();
        areaLabel2 = new javax.swing.JLabel();
        SaveBtn1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        EditBtn1 = new javax.swing.JButton();
        ViewBtn1 = new javax.swing.JButton();
        DeleteBtn1 = new javax.swing.JButton();
        search1 = new javax.swing.JLabel();
        searchField1 = new javax.swing.JTextField();
        nameLabel3 = new javax.swing.JLabel();
        emailLabel3 = new javax.swing.JLabel();
        phoneLabel3 = new javax.swing.JLabel();
        address3 = new javax.swing.JLabel();
        roadLabel3 = new javax.swing.JLabel();
        roadField3 = new javax.swing.JTextField();
        houseNumField3 = new javax.swing.JTextField();
        phoneField3 = new javax.swing.JTextField();
        emailField3 = new javax.swing.JTextField();
        nameField3 = new javax.swing.JTextField();
        areaField3 = new javax.swing.JTextField();
        districtField3 = new javax.swing.JTextField();
        cityField3 = new javax.swing.JTextField();
        pincodeField3 = new javax.swing.JTextField();
        pincodeLabel3 = new javax.swing.JLabel();
        cityLabel3 = new javax.swing.JLabel();
        districtLabel3 = new javax.swing.JLabel();
        areaLabel3 = new javax.swing.JLabel();
        UpdateBtn1 = new javax.swing.JButton();

        Title1.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        Title1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title1.setText("Add New Doctor Details Here");

        nameField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameField2ActionPerformed(evt);
            }
        });

        emailLabel2.setText("Emaill ID:");

        nameLabel2.setText("Name:");

        phoneLabel2.setText("Phone Number:");

        address2.setText("House Number:");

        roadLabel2.setText("Road Name:");

        houseNumField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                houseNumField2ActionPerformed(evt);
            }
        });

        pincodeLabel2.setText("PIN Code:");

        cityLabel2.setText("City:");

        districtLabel2.setText("District:");

        areaLabel2.setText("Area Name:");

        SaveBtn1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        SaveBtn1.setText("Save Doctor Information");
        SaveBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveBtn1ActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Email ID", "Phone Number", "Area Name", "CIty", "PIN Code"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("View Doctor Details Here");

        EditBtn1.setText("EDIT");

        ViewBtn1.setText("VIEW");
        ViewBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewBtn1ActionPerformed(evt);
            }
        });

        DeleteBtn1.setText("DELETE");
        DeleteBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtn1ActionPerformed(evt);
            }
        });

        search1.setText("Search Doctor Here:");

        nameLabel3.setText("Name:");

        emailLabel3.setText("Emaill ID:");

        phoneLabel3.setText("Phone Number:");

        address3.setText("House Number:");

        roadLabel3.setText("Road Name:");

        houseNumField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                houseNumField3ActionPerformed(evt);
            }
        });

        nameField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameField3ActionPerformed(evt);
            }
        });

        pincodeLabel3.setText("PIN Code:");

        cityLabel3.setText("City:");

        districtLabel3.setText("District:");

        areaLabel3.setText("Area Name:");

        UpdateBtn1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        UpdateBtn1.setText("Update Doctor Information");
        UpdateBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Title1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(roadLabel2)
                                            .addComponent(address2))
                                        .addGap(27, 27, 27)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(roadField2)
                                            .addComponent(houseNumField2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(phoneLabel2)
                                            .addComponent(emailLabel2)
                                            .addComponent(nameLabel2))
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(27, 27, 27)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(phoneField2, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                                    .addComponent(emailField2)))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(nameField2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(districtLabel2)
                                    .addComponent(cityLabel2)
                                    .addComponent(areaLabel2)
                                    .addComponent(pincodeLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cityField2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(districtField2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(areaField2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pincodeField2)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(256, 256, 256)
                                .addComponent(SaveBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(roadLabel3)
                                            .addComponent(address3))
                                        .addGap(27, 27, 27)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(roadField3)
                                            .addComponent(houseNumField3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(phoneLabel3)
                                            .addComponent(emailLabel3)
                                            .addComponent(nameLabel3))
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(27, 27, 27)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(phoneField3)
                                                    .addComponent(emailField3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(nameField3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(districtLabel3)
                                            .addComponent(cityLabel3)
                                            .addComponent(areaLabel3)
                                            .addComponent(pincodeLabel3))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(cityField3, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(districtField3, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(areaField3, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(pincodeField3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(UpdateBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(search1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(searchField1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 35, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(ViewBtn1)
                        .addGap(58, 58, 58)
                        .addComponent(EditBtn1)
                        .addGap(56, 56, 56)
                        .addComponent(DeleteBtn1))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 731, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {DeleteBtn1, EditBtn1, ViewBtn1});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(Title1)
                .addGap(39, 39, 39)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel2)
                    .addComponent(nameField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(areaLabel2)
                    .addComponent(areaField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel2)
                    .addComponent(emailField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(districtLabel2)
                    .addComponent(districtField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneLabel2)
                    .addComponent(phoneField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cityLabel2)
                    .addComponent(cityField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(address2)
                    .addComponent(houseNumField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pincodeLabel2)
                    .addComponent(pincodeField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roadLabel2)
                    .addComponent(roadField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(SaveBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(search1)
                    .addComponent(searchField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EditBtn1)
                    .addComponent(ViewBtn1)
                    .addComponent(DeleteBtn1))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel3)
                    .addComponent(nameField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(areaLabel3)
                    .addComponent(areaField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel3)
                    .addComponent(emailField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(districtLabel3)
                    .addComponent(districtField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneLabel3)
                    .addComponent(phoneField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cityLabel3)
                    .addComponent(cityField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(address3)
                    .addComponent(houseNumField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pincodeLabel3)
                    .addComponent(pincodeField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roadLabel3)
                    .addComponent(roadField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(UpdateBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nameField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameField2ActionPerformed

    private void houseNumField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_houseNumField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_houseNumField2ActionPerformed

    private void SaveBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBtn1ActionPerformed
        // TODO add your handling code here:
//        Doctor doctor = new Doctor();
//        patient.setName(nameField2.getText());
//        patient.setEmailId(emailField2.getText());
//        patient.setPhoneNumber(Long.parseLong(phoneField2.getText()));
//        patient.setPersonId(UUID.randomUUID());
//        House house = new House();
//        house.setHouseNumber(Integer.parseInt(houseNumField2.getText()));
//        house.setRoadName(roadField2.getText());
//        Community newCommunity = new Community(areaField2.getText(), districtField2.getText());
//        patient.setCommunity(newCommunity);
//        City newCity = new City(cityField2.getText(), pincodeField2.getText());
//        patient.setCity(newCity);
//        JOptionPane.showMessageDialog(this, "New Patient Information Saved!");
    }//GEN-LAST:event_SaveBtn1ActionPerformed

    private void ViewBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ViewBtn1ActionPerformed

    private void DeleteBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteBtn1ActionPerformed

    private void houseNumField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_houseNumField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_houseNumField3ActionPerformed

    private void nameField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameField3ActionPerformed

    private void UpdateBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UpdateBtn1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeleteBtn1;
    private javax.swing.JButton EditBtn1;
    private javax.swing.JButton SaveBtn1;
    private javax.swing.JLabel Title1;
    private javax.swing.JButton UpdateBtn1;
    private javax.swing.JButton ViewBtn1;
    private javax.swing.JLabel address2;
    private javax.swing.JLabel address3;
    private javax.swing.JTextField areaField2;
    private javax.swing.JTextField areaField3;
    private javax.swing.JLabel areaLabel2;
    private javax.swing.JLabel areaLabel3;
    private javax.swing.JTextField cityField2;
    private javax.swing.JTextField cityField3;
    private javax.swing.JLabel cityLabel2;
    private javax.swing.JLabel cityLabel3;
    private javax.swing.JTextField districtField2;
    private javax.swing.JTextField districtField3;
    private javax.swing.JLabel districtLabel2;
    private javax.swing.JLabel districtLabel3;
    private javax.swing.JTextField emailField2;
    private javax.swing.JTextField emailField3;
    private javax.swing.JLabel emailLabel2;
    private javax.swing.JLabel emailLabel3;
    private javax.swing.JTextField houseNumField2;
    private javax.swing.JTextField houseNumField3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField nameField2;
    private javax.swing.JTextField nameField3;
    private javax.swing.JLabel nameLabel2;
    private javax.swing.JLabel nameLabel3;
    private javax.swing.JTextField phoneField2;
    private javax.swing.JTextField phoneField3;
    private javax.swing.JLabel phoneLabel2;
    private javax.swing.JLabel phoneLabel3;
    private javax.swing.JTextField pincodeField2;
    private javax.swing.JTextField pincodeField3;
    private javax.swing.JLabel pincodeLabel2;
    private javax.swing.JLabel pincodeLabel3;
    private javax.swing.JTextField roadField2;
    private javax.swing.JTextField roadField3;
    private javax.swing.JLabel roadLabel2;
    private javax.swing.JLabel roadLabel3;
    private javax.swing.JLabel search1;
    private javax.swing.JTextField searchField1;
    // End of variables declaration//GEN-END:variables
}
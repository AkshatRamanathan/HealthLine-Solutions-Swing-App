/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.patient;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.City;
import model.Community;
import model.Hospital;
import model.MainSystem;
import model.Doctor;
import model.DoctorDirectory;

/**
 *
 * @author deva
 */
public class PatientPanel extends javax.swing.JPanel {

    /**
     * Creates new form PatientPanel
     */
    String selectedCity = "";
    String selectedCommunity = "";
    MainSystem rootDataObj;
    ArrayList<Doctor> docList;
    private JPanel bottomPanel;
    public PatientPanel(JPanel bottomPanel, MainSystem rootDataObj) {
        this.docList = new ArrayList<>();
        initComponents();
        this.bottomPanel = bottomPanel;
        this.rootDataObj = rootDataObj;
        populateCityValues();
        
        txtName.setEditable(false);
        txtEmail.setEditable(false);
        txtHospitalName.setEditable(false);
        txtHouse.setEditable(false);
        txtAreaName.setEditable(false);
        txtDistrict.setEditable(false);
        txtCity.setEditable(false);
        txtPincode.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        doctorViewPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtAreaName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtHospitalName = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtHouse = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtPincode = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtDistrict = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        cityDropdown = new javax.swing.JComboBox<>();
        communityDropdown = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        doctorTable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        applyButton = new javax.swing.JButton();

        jLabel10.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Search for a Doctor");

        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        jLabel1.setText("Name");

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        jLabel2.setText("Email ID");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        jLabel3.setText("Hospital Name");

        txtAreaName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAreaNameActionPerformed(evt);
            }
        });

        jLabel4.setText("House");

        txtHospitalName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHospitalNameActionPerformed(evt);
            }
        });

        jLabel9.setText("Area Name");

        txtHouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHouseActionPerformed(evt);
            }
        });

        jLabel12.setText("City");

        txtPincode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPincodeActionPerformed(evt);
            }
        });

        jLabel13.setText("District");

        txtDistrict.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDistrictActionPerformed(evt);
            }
        });

        jLabel14.setText("Pincode");

        txtCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCityActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout doctorViewPanelLayout = new javax.swing.GroupLayout(doctorViewPanel);
        doctorViewPanel.setLayout(doctorViewPanelLayout);
        doctorViewPanelLayout.setHorizontalGroup(
            doctorViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(doctorViewPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(doctorViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(doctorViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(doctorViewPanelLayout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(doctorViewPanelLayout.createSequentialGroup()
                            .addGroup(doctorViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(29, 29, 29)
                            .addGroup(doctorViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtAreaName, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtHospitalName, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtHouse, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtDistrict, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtPincode, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        doctorViewPanelLayout.setVerticalGroup(
            doctorViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(doctorViewPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(doctorViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(doctorViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(doctorViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtHospitalName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(doctorViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtHouse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(doctorViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAreaName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(doctorViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(txtDistrict, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(doctorViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(doctorViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtPincode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        cityDropdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityDropdownActionPerformed(evt);
            }
        });
        cityDropdown.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cityDropdownKeyPressed(evt);
            }
        });

        doctorTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Email", "Phone No", "Hospital Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(doctorTable);

        jLabel5.setText("City");

        jLabel6.setText("Community");

        applyButton.setText("Apply");
        applyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applyButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 989, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 899, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnView)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 729, Short.MAX_VALUE)
                        .addComponent(doctorViewPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cityDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(256, 256, 256))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(communityDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(applyButton)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addComponent(btnSearch))))))
                .addGap(40, 1150, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch)
                    .addComponent(cityDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(communityDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(applyButton))
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnView)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(doctorViewPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(640, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        String searchval = txtSearch.getText();
        String choosenCity = cityDropdown.getSelectedItem().toString();
        String choosenCommitte = cityDropdown.getSelectedItem().toString();
        filterDoctorTable(searchval);
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:

        // Need to check if dropdown is doctor or hospital
        int selectedRowIndex = doctorTable.getSelectedRow();
        if(selectedRowIndex < 0 ){
            JOptionPane.showMessageDialog(this, "Please select a row to view");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) doctorTable.getModel();
            Doctor selectedDoc = (Doctor) model.getValueAt(selectedRowIndex, 0);
            txtName.setText(String.valueOf(selectedDoc.getName()));
            txtEmail.setText(String.valueOf(selectedDoc.getEmailId()));
            txtHospitalName.setText(String.valueOf(selectedDoc.getHospitalName()));
            txtHouse.setText(String.valueOf(selectedDoc.getHouse().getRoadName()));
            txtAreaName.setText(String.valueOf(selectedDoc.getCommunity().getAreaName()));
            txtDistrict.setText(String.valueOf(selectedDoc.getCommunity().getDistrict()));
            txtCity.setText(String.valueOf(selectedDoc.getCity().getCityName()));
            txtPincode.setText(String.valueOf(selectedDoc.getCity().getPinCode()));
    }//GEN-LAST:event_btnViewActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtAreaNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAreaNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAreaNameActionPerformed

    private void txtHospitalNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHospitalNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHospitalNameActionPerformed

    private void txtHouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHouseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHouseActionPerformed

    private void txtPincodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPincodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPincodeActionPerformed

    private void txtDistrictActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDistrictActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDistrictActionPerformed

    private void cityDropdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityDropdownActionPerformed
        // TODO add your handling code here:
        City selectedCity = this.rootDataObj.getRootCityDirectory().get(cityDropdown.getSelectedIndex());
        communityDropdown.removeAllItems();
        for(Community comObj: selectedCity.getCommunityDirectory()){
            communityDropdown.addItem(comObj.getDistrict());
        }
        communityDropdown.setSelectedItem(null);
    }//GEN-LAST:event_cityDropdownActionPerformed

    private void txtCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCityActionPerformed

    private void cityDropdownKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cityDropdownKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_cityDropdownKeyPressed

    private void applyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applyButtonActionPerformed
        // TODO add your handling code here:
        docList.clear();
        txtName.setText(null);
        txtEmail.setText(null);
        txtHospitalName.setText(null);
        txtHouse.setText(null);
        txtAreaName.setText(null);
        txtDistrict.setText(null);
        txtCity.setText(null);
        txtPincode.setText(null);
        populateDoctorTableData();
        txtSearch.setText("");
    }//GEN-LAST:event_applyButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton applyButton;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnView;
    private javax.swing.JComboBox<String> cityDropdown;
    private javax.swing.JComboBox<String> communityDropdown;
    private javax.swing.JTable doctorTable;
    private javax.swing.JPanel doctorViewPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtAreaName;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtDistrict;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtHospitalName;
    private javax.swing.JTextField txtHouse;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPincode;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    private void populateCityValues() {
        for(City cityObj: this.rootDataObj.getRootCityDirectory()){
            cityDropdown.addItem(cityObj.getCityName());
        }
//      cityDropdown.setSelectedItem(null);
    }
    
    private void populateDoctorTableData() {
        DefaultTableModel model = (DefaultTableModel) doctorTable.getModel();
        model.setRowCount(0);
        
        for(Hospital hospitalObj: this.rootDataObj.getRootHospitalDirectory()){
            if(hospitalObj.getHospitalCommunity().getDistrict() == communityDropdown.getSelectedItem() && 
                    hospitalObj.getHospitalCity().getCityName()== cityDropdown.getSelectedItem()){            
                DoctorDirectory docDir = hospitalObj.getDoctors();
                for(Doctor doc: docDir.getDoctors()) {
                    docList.add(doc);
                }
            }
        }
        for (Doctor docObj: docList){
            Object[] row = new Object[4];
            row[0] = docObj;
            row[1] = docObj.getEmailId();
            row[2] = docObj.getPhoneNumber();
            row[3] = docObj.getHospitalName();
            model.addRow(row);
        }
    }   
    
    private void filterDoctorTable(String name) {
        DefaultTableModel model = (DefaultTableModel) doctorTable.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        doctorTable.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(name));
    }
    
}
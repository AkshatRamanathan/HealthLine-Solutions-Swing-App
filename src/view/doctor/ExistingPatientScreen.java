/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.doctor;

import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author akshb
 */
public class ExistingPatientScreen extends javax.swing.JPanel {

    /**
     * @param bottomPanel the value of bottomPanel
     */
    private JPanel bottomPanel;

    public ExistingPatientScreen(JPanel bottomPanel) {
        initComponents();
        this.bottomPanel = bottomPanel;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        patientTable = new javax.swing.JTable();
        patientSearchField = new javax.swing.JTextField();
        patientSearchButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        patientTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PersonI D", "Name", "Email", "Phone Number"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.Long.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        patientTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(patientTable);
        if (patientTable.getColumnModel().getColumnCount() > 0) {
            patientTable.getColumnModel().getColumn(0).setResizable(false);
            patientTable.getColumnModel().getColumn(1).setResizable(false);
            patientTable.getColumnModel().getColumn(2).setResizable(false);
            patientTable.getColumnModel().getColumn(3).setResizable(false);
        }

        patientSearchField.setText("Search Patient");
        patientSearchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientSearchFieldActionPerformed(evt);
            }
        });

        patientSearchButton.setText("GO");
        patientSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientSearchButtonActionPerformed(evt);
            }
        });

        backButton.setText("Back");
        backButton.setPreferredSize(new java.awt.Dimension(72, 23));
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(patientSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(patientSearchButton)
                        .addGap(192, 192, 192))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(patientSearchButton, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(patientSearchField)
                    .addComponent(backButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(137, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void patientSearchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientSearchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patientSearchFieldActionPerformed

    private void patientSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientSearchButtonActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_patientSearchButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        PatientRegisterScreen patientRegister = new PatientRegisterScreen(bottomPanel);
        bottomPanel.add("patientScreen", patientRegister);
        CardLayout layout = (CardLayout) bottomPanel.getLayout();
        layout.next(bottomPanel);

    }//GEN-LAST:event_backButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton patientSearchButton;
    private javax.swing.JTextField patientSearchField;
    private javax.swing.JTable patientTable;
    // End of variables declaration//GEN-END:variables
}

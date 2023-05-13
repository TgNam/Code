/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lab2_java;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author TgNam
 */
public class Bai1_1 extends javax.swing.JFrame {
    private List<ID> list = new ArrayList<>();
    private DefaultTableModel model;
    private DefaultComboBoxModel comboBoxModel;
    
    public Bai1_1() {
        initComponents();
        initdate();
        setLocationRelativeTo(null);
    }
    public void table1(){
        model = new DefaultTableModel();
        String [] table = {"ID","Name","Country","Gender","Status","Notes"};
        model.setColumnIdentifiers(table);
        tblmodel.setModel(model);
    }
    public void Country(){
    comboBoxModel = new DefaultComboBoxModel();
     comboBoxModel.addElement("HaNoi");
     comboBoxModel.addElement("TuyenQuang");
     comboBoxModel.addElement("HoaBinh");
     comboBoxModel.addElement("ThaiNguyen");
     cbocountry.setModel(comboBoxModel);
    }
    public void initdate(){
        list.add(new ID("N1", "Nam","HaNoi","Male","Single","Hello word"));
        list.add(new ID("N2", "Nam","HaiDuong","Male","Single","Hello word"));
        list.add(new ID("N3", "Hoang","HoaBinh","Female","","Hello "));
        list.add(new ID("N4", "Linh","TuyenQuang","Male","Single","Hello "));
    }
    public void filltable(){
        while (tblmodel.getRowCount()>0) {            
            model.removeRow(0);
        }
        for (ID id : list) {
            model.addRow(new String[] {id.getID(),id.getName(),id.getCountry(),id.getGender(),id.getStatus(),id.getNotes() });
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtfullname = new javax.swing.JTextField();
        Rdomale = new javax.swing.JRadioButton();
        rdoFemale = new javax.swing.JRadioButton();
        cbocountry = new javax.swing.JComboBox<>();
        chkstatus = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        bthcreate = new javax.swing.JButton();
        bthupdate = new javax.swing.JButton();
        bthdelete = new javax.swing.JButton();
        bthreset = new javax.swing.JButton();
        bthexit = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblmodel = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 102, 255));
        jLabel1.setText("Staff Editon");

        jLabel2.setText("Staff Id");

        jLabel3.setText("Fullname");

        jLabel4.setText("Country");

        jLabel5.setText("Gender");

        jLabel6.setText("Status");

        jLabel7.setText("Notes");

        buttonGroup1.add(Rdomale);
        Rdomale.setText("Male");

        buttonGroup1.add(rdoFemale);
        rdoFemale.setText("Female");

        cbocountry.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        chkstatus.setText("Single?");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        bthcreate.setText("Create");
        bthcreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bthcreateActionPerformed(evt);
            }
        });

        bthupdate.setText("Update");
        bthupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bthupdateActionPerformed(evt);
            }
        });

        bthdelete.setText("Delete");
        bthdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bthdeleteActionPerformed(evt);
            }
        });

        bthreset.setText("Reset");
        bthreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bthresetActionPerformed(evt);
            }
        });

        bthexit.setText("Exit");
        bthexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bthexitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(36, 36, 36)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cbocountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(chkstatus)
                                        .addComponent(txtId)
                                        .addComponent(txtfullname, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(Rdomale)
                                            .addGap(18, 18, 18)
                                            .addComponent(rdoFemale)))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(bthcreate)
                                .addGap(18, 18, 18)
                                .addComponent(bthupdate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bthdelete)
                                .addGap(24, 24, 24)
                                .addComponent(bthreset)))
                        .addGap(0, 71, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(208, 208, 208)
                .addComponent(bthexit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtfullname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(cbocountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Rdomale)
                    .addComponent(rdoFemale))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkstatus)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bthcreate)
                        .addComponent(bthreset))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bthupdate)
                        .addComponent(bthdelete)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bthexit)
                .addGap(46, 46, 46))
        );

        jTabbedPane1.addTab("tab1", jPanel1);

        tblmodel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblmodel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblmodelMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblmodel);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 51, 204));
        jLabel8.setText("Staff List");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 487, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab2", jPanel2);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 26)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 255));
        jLabel9.setText("List");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        table1();
        Country();
        filltable();
    }//GEN-LAST:event_formWindowOpened

    private void bthexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bthexitActionPerformed
        int choide = JOptionPane.showConfirmDialog(this, "Exit", "Exit", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (choide==JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_bthexitActionPerformed

    private void bthcreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bthcreateActionPerformed
           StringBuilder sb = new StringBuilder();
           if (txtId.getText().equals("")) {
               sb.append("Ban chua nhap\n");
        }
           if (sb.length()>0) {
            JOptionPane.showMessageDialog(this, sb.toString(), "Save", JOptionPane.PLAIN_MESSAGE);
        }
           else{
               ID id = new ID();
               id.setID(txtId.getText());
               id.setName(txtfullname.getText());
               id.setCountry((String)cbocountry.getSelectedItem());
               id.setGender(Rdomale.isSelected()?"Male":"Female");
               id.setStatus(chkstatus.isSelected()?"Single":"");
               id.setNotes(jTextArea1.getText());
               list.add(id);
               filltable();
               JOptionPane.showMessageDialog(this, "Saved", "Save", JOptionPane.PLAIN_MESSAGE);
               bthresetActionPerformed(evt);
           }
    }//GEN-LAST:event_bthcreateActionPerformed

    private void bthresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bthresetActionPerformed
        txtId.setText("");
        txtfullname.setText("");
        cbocountry.setSelectedIndex(0);
        Rdomale.setSelected(true);
        chkstatus.setSelected(false);
        jTextArea1.setText("");
    }//GEN-LAST:event_bthresetActionPerformed

    private void bthupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bthupdateActionPerformed
        StringBuilder sb = new StringBuilder();
           if (txtId.getText().equals("")) {
               sb.append("Ban chua nhap\n");
        }
           if (sb.length()>0) {
            JOptionPane.showMessageDialog(this, sb.toString(), "Save", JOptionPane.PLAIN_MESSAGE);
        }
           for (ID id : list) {
               if (id.getID().equals(txtId.getText())) {
                  id.setName(txtfullname.getText());
               id.setCountry((String)cbocountry.getSelectedItem());
               id.setGender(Rdomale.isSelected()?"Male":"Female");
               id.setStatus(chkstatus.isSelected()?"Single":"");
               id.setNotes(jTextArea1.getText());
               filltable();
               JOptionPane.showMessageDialog(this, "Update", "Update", JOptionPane.PLAIN_MESSAGE);
               bthresetActionPerformed(evt);
               
               }
               
        }
    }//GEN-LAST:event_bthupdateActionPerformed

    private void bthdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bthdeleteActionPerformed
        StringBuilder sb = new StringBuilder();
           if (txtId.getText().equals("")) {
               sb.append("Ban chua nhap\n");
        }
           if (sb.length()>0) {
            JOptionPane.showMessageDialog(this, sb.toString(), "Save", JOptionPane.PLAIN_MESSAGE);
        }
           for (ID id : list) {
               if (id.getID().endsWith(txtId.getText())) {
                   //xoa doi tuong id 
                   list.remove(id);
                   filltable();
                   JOptionPane.showMessageDialog(this, "Id is deleted");
                   bthresetActionPerformed(evt);
                   return;
               }
        }
    }//GEN-LAST:event_bthdeleteActionPerformed

    private void tblmodelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblmodelMouseClicked
        int row = tblmodel.getSelectedRow();
        if (row>=0) {
            String model = (String)tblmodel.getValueAt(row, 0);
            for (ID id : list) {
                if (id.getID().equals(model)) {
                    txtId.setText(id.getID());
                    txtfullname.setText(id.getName());
                    cbocountry.setSelectedItem(id.getCountry());
                    if (id.getGender().equals("Male")) {
                        Rdomale.setSelected(true);
                    }
                    if (id.getGender().equals("Male")) {
                        rdoFemale.setSelected(true);
                    }
                    if (id.getStatus().equals("Single")) {
                        chkstatus.setSelected(true);
                    }
                    else{
                        chkstatus.setSelected(false);
                    }
                    
                    jTextArea1.setText(id.getNotes());
                }
            }
        }
    }//GEN-LAST:event_tblmodelMouseClicked

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
            java.util.logging.Logger.getLogger(Bai1_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bai1_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bai1_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bai1_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bai1_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Rdomale;
    private javax.swing.JButton bthcreate;
    private javax.swing.JButton bthdelete;
    private javax.swing.JButton bthexit;
    private javax.swing.JButton bthreset;
    private javax.swing.JButton bthupdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbocountry;
    private javax.swing.JCheckBox chkstatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JRadioButton rdoFemale;
    private javax.swing.JTable tblmodel;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtfullname;
    // End of variables declaration//GEN-END:variables
}

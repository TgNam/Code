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
public class Bai4S extends javax.swing.JFrame {
    private List<User> list = new ArrayList<>();
    private DefaultTableModel model;
   
    
    /**
     * Creates new form Bai4S
     */
    public Bai4S() {
        initComponents();
        initData();
        table1();
        Combobox();
        setLocationRelativeTo(null);
    }
    public void table1(){
        model = new  DefaultTableModel();
        String[] Column = new String[]{"User","Pass","Rdo","Major"};        
        model.setColumnIdentifiers(Column);
        tblmodel.setModel(model);
    }
    private void initData(){
        list.add(new User("U01","abc","User","Graphic design"));
        list.add(new User("U02","abc","User","Software Development"));
        list.add(new User("U03","abc","Admin","Maketing"));
        list.add(new User("U04","abc","Admin","Web design"));
    }   
    public void filltable(){
        while (model.getRowCount()>0) {            
            model.removeRow(0);
        }
        for (User bai4 : list) {
            model.addRow(new String[] {bai4.getUser(),bai4.getPass(),bai4.getRdo(),bai4.getMajor()});
        }
        model.fireTableDataChanged();
    }
    public void Combobox(){
        DefaultComboBoxModel comboBoxModel=new DefaultComboBoxModel();
        comboBoxModel.addElement("");
        comboBoxModel.addElement("Graphic design");
        comboBoxModel.addElement("Software Development");
        comboBoxModel.addElement("Maketing");
        comboBoxModel.addElement("Web design");
        cbomajor.setModel(comboBoxModel);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtuser = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        rdouser = new javax.swing.JRadioButton();
        rdoadmin = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        cbomajor = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        bthadd = new javax.swing.JButton();
        bthremove = new javax.swing.JButton();
        bthupdata = new javax.swing.JButton();
        bthreset = new javax.swing.JButton();
        txtpass = new javax.swing.JPasswordField();
        bthexit = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblmodel = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel2.setText("User :");

        jLabel3.setText("Passworl :");

        jLabel4.setText("Rdo :");

        buttonGroup1.add(rdouser);
        rdouser.setText("User");

        buttonGroup1.add(rdoadmin);
        rdoadmin.setText("Admin");

        jLabel5.setText("Mạjor :");

        cbomajor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        bthadd.setText("ADD");
        bthadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bthaddActionPerformed(evt);
            }
        });

        bthremove.setText("REMOVE");
        bthremove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bthremoveActionPerformed(evt);
            }
        });

        bthupdata.setText("UPDATA");
        bthupdata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bthupdataActionPerformed(evt);
            }
        });

        bthreset.setText("RESET");
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
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtuser)
                                    .addComponent(cbomajor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(rdouser, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(rdoadmin, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtpass, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(bthadd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bthremove)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bthupdata)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bthreset)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bthexit)))
                        .addGap(0, 6, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(rdouser)
                    .addComponent(rdoadmin))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbomajor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bthadd)
                    .addComponent(bthremove)
                    .addComponent(bthupdata)
                    .addComponent(bthreset)
                    .addComponent(bthexit))
                .addContainerGap())
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
        jScrollPane1.setViewportView(tblmodel);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(143, 143, 143))
        );

        jTabbedPane1.addTab("tab2", jPanel2);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Table");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bthaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bthaddActionPerformed
        StringBuilder sb = new StringBuilder();
        if (txtuser.getText().equals("")) {
            sb.append("Username is empty\n");
        }
        if (sb.length()>0) {
            JOptionPane.showMessageDialog(this, sb.toString(), "Save", JOptionPane.ERROR_MESSAGE);
        }
        else{
        User user = new User();
        user.setUser(txtuser.getText());
        user.setPass(new String(txtpass.getPassword()));
        user.setRdo(rdouser.isSelected()?"User":"Admin");
        user.setMajor((String)cbomajor.getSelectedItem());
        list.add(user);
        filltable();
        JOptionPane.showMessageDialog(this, "Saved", "Save", JOptionPane.PLAIN_MESSAGE);
        bthresetActionPerformed(evt);
        }
    }//GEN-LAST:event_bthaddActionPerformed

    private void bthremoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bthremoveActionPerformed
        StringBuilder sb = new StringBuilder();
        if (txtuser.getText().equals("")) {
            sb.append("Username is empty\n");
        }
        if (sb.length()>0) {
            JOptionPane.showMessageDialog(this, sb.toString(), "Save", JOptionPane.ERROR_MESSAGE);
        }
        else{
            for (User user : list) {
                if (user.getUser().equals(txtuser.getText())) {
                    int choice = JOptionPane.showConfirmDialog(this, "Do you want to daletw?", "Remove", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
                    if (choice == JOptionPane.YES_OPTION) {
                        list.remove(user);
                        filltable();
                        JOptionPane.showMessageDialog(this, "User is deleted");
                        bthresetActionPerformed(evt);
                    }
                    return;
                }
            }
        }
    }//GEN-LAST:event_bthremoveActionPerformed

    private void bthupdataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bthupdataActionPerformed
        StringBuilder sb = new StringBuilder();
        if (txtuser.getText().equals("")) {
            sb.append("Username is empty\n");
        }
        if (sb.length()>0) {
            JOptionPane.showMessageDialog(this, sb.toString(), "Save", JOptionPane.ERROR_MESSAGE);
        }
        else{
            for (User user : list) {
                if (user.getUser().equals(txtuser.getText())) {
                    user.setPass(new String(txtpass.getPassword()));
                    user.setRdo(rdouser.isSelected()?"User":"Admin");
                    user.setMajor((String)cbomajor.getSelectedItem());
                    filltable();
                    JOptionPane.showMessageDialog(this, "Updated");
                    bthresetActionPerformed(evt);
                }
            }
        }
    }//GEN-LAST:event_bthupdataActionPerformed

    private void bthresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bthresetActionPerformed
        txtuser.setText("");
        txtpass.setText("");
        rdouser.setSelected(true);
        cbomajor.setSelectedIndex(0);
    }//GEN-LAST:event_bthresetActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed

    }//GEN-LAST:event_formWindowClosed

    private void tblmodelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblmodelMouseClicked
        int selected = tblmodel.getSelectedRow();
        if (selected>=0) {
            String username = (String) tblmodel.getValueAt(selected, 0);
            for (User user : list) {
                if (user.getUser().equals(username)) {
                    txtuser.setText(user.getUser());
                    txtpass.setText(user.getPass());
                    if (user.getRdo().equals("User")) {
                        rdouser.setSelected(true);
                    }
                    else{
                        rdoadmin.setSelected(true);
                    }
                    cbomajor.setSelectedItem(user.getMajor());
                }
            }
        }
    }//GEN-LAST:event_tblmodelMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       filltable();
    }//GEN-LAST:event_formWindowOpened

    private void bthexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bthexitActionPerformed
        int choice = JOptionPane.showConfirmDialog(this, "Exit", "Exit", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if (choice==JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_bthexitActionPerformed

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
            java.util.logging.Logger.getLogger(Bai4S.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bai4S.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bai4S.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bai4S.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bai4S().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bthadd;
    private javax.swing.JButton bthexit;
    private javax.swing.JButton bthremove;
    private javax.swing.JButton bthreset;
    private javax.swing.JButton bthupdata;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbomajor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JRadioButton rdoadmin;
    private javax.swing.JRadioButton rdouser;
    private javax.swing.JTable tblmodel;
    private javax.swing.JPasswordField txtpass;
    private javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables
}

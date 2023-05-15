/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package DAY1;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author TgNam
 */
public class Bai4 extends javax.swing.JFrame {
    private QLuser ql = new QLCN();
    private DefaultTableModel tableModel;
    public Bai4() {
        initComponents();
    }
    public void table(){
        tableModel = new DefaultTableModel();
        String[] column = {"User","Password","Rdo"};
        tableModel.setColumnIdentifiers(column);
        tbluser.setModel(tableModel);
    }
    public void  datarow(ArrayList<User> list){
        tableModel = (DefaultTableModel) tbluser.getModel();
        tableModel.setRowCount(0);
        for (User user : list) {
            tableModel.addRow( new Object[]{
            user.getUser(),user.getPassword(),user.getRdo()
            });
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        bthupdata = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        bthreset = new javax.swing.JButton();
        txtuser = new javax.swing.JTextField();
        txtpass = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        bthexit = new javax.swing.JButton();
        rdouser = new javax.swing.JRadioButton();
        rdoadmin = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        bthadd = new javax.swing.JButton();
        bthremove = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbluser = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 51));

        jLabel2.setText("User :");

        bthupdata.setBackground(new java.awt.Color(255, 204, 204));
        bthupdata.setText("UPDATA");
        bthupdata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bthupdataActionPerformed(evt);
            }
        });

        jLabel3.setText("Passworl :");

        bthreset.setBackground(new java.awt.Color(204, 255, 204));
        bthreset.setText("RESET");
        bthreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bthresetActionPerformed(evt);
            }
        });

        jLabel4.setText("Rdo :");

        bthexit.setBackground(new java.awt.Color(0, 204, 204));
        bthexit.setText("Exit");
        bthexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bthexitActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdouser);
        rdouser.setText("User");

        buttonGroup1.add(rdoadmin);
        rdoadmin.setText("Admin");

        bthadd.setBackground(new java.awt.Color(255, 255, 204));
        bthadd.setText("ADD");
        bthadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bthaddActionPerformed(evt);
            }
        });

        bthremove.setBackground(new java.awt.Color(204, 255, 204));
        bthremove.setText("REMOVE");
        bthremove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bthremoveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtuser)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rdouser, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rdoadmin, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtpass, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(bthadd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bthremove)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bthupdata)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bthreset)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bthexit)))
                .addContainerGap(23, Short.MAX_VALUE))
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
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(rdouser)
                    .addComponent(rdoadmin))
                .addGap(25, 25, 25)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bthadd)
                    .addComponent(bthremove)
                    .addComponent(bthupdata)
                    .addComponent(bthreset)
                    .addComponent(bthexit))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab1", jPanel1);

        tbluser.setBackground(new java.awt.Color(255, 255, 204));
        tbluser.setModel(new javax.swing.table.DefaultTableModel(
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
        tbluser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbluserMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbluser);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        jTabbedPane1.addTab("tab2", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bthupdataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bthupdataActionPerformed
        StringBuilder sb = new StringBuilder();
        if (txtuser.getText().equals("")) {
            sb.append("Username is empty\n");
        }
        if (sb.length()>0) {
            JOptionPane.showMessageDialog(this, sb.toString(), "Save", JOptionPane.ERROR_MESSAGE);
        }
        else{
           for (User user : ql.getlist()) {
            if (user.getUser().equals(txtuser.getText())) {
                int index = tbluser.getSelectedRow();
                user.setUser(txtuser.getText());
                user.setPassword(new String(txtpass.getPassword()));
                if (rdouser.isSelected()) {
                    user.setRdo("User");
                }
                if (rdoadmin.isSelected()) {
                    user.setRdo("Admin");
                }       
            JOptionPane.showMessageDialog(this, ql.update(index, user), "Update", JOptionPane.PLAIN_MESSAGE);
            bthresetActionPerformed(evt);
            datarow(ql.getlist());
            return;
            }
            else{
                bthaddActionPerformed(evt);
                return;
            }
        } 
        }
    }//GEN-LAST:event_bthupdataActionPerformed

    private void bthresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bthresetActionPerformed
       txtuser.setText("");
        txtpass.setText("");
        rdouser.setSelected(true);
    }//GEN-LAST:event_bthresetActionPerformed

    private void bthexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bthexitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bthexitActionPerformed

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
        user.setPassword(new String(txtpass.getPassword()));
        if (rdouser.isSelected()) {
            user.setRdo("User");
        }
        if (rdoadmin.isSelected()) {
            user.setRdo("Admin");
        }       
        JOptionPane.showMessageDialog(this, ql.add(user), "Save", JOptionPane.PLAIN_MESSAGE);
        datarow(ql.getlist());
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
        int index = tbluser.getSelectedRow();
        JOptionPane.showMessageDialog(this, ql.remove(index), "Remove", JOptionPane.PLAIN_MESSAGE);
        bthresetActionPerformed(evt);
        datarow(ql.getlist());
        }       
    }//GEN-LAST:event_bthremoveActionPerformed

    private void tbluserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbluserMouseClicked
        int index = tbluser.getSelectedRow();
        String username = tbluser.getValueAt(index, 0).toString();
        for (User user : ql.getlist()) {
            if (user.getUser().equals(username)) {
                txtuser.setText(user.getUser());
                txtpass.setText(user.getPassword());
                if (user.getRdo().equals("User")) {
                    rdouser.setSelected(true);
                }
                if(user.getRdo().equals("Admin")){
                    rdoadmin.setSelected(true);
                }
            }
        }
    }//GEN-LAST:event_tbluserMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        table();
        setLocationRelativeTo(null);
        datarow(ql.getlist());
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(Bai4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bai4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bai4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bai4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bai4().setVisible(true);
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JRadioButton rdoadmin;
    private javax.swing.JRadioButton rdouser;
    private javax.swing.JTable tbluser;
    private javax.swing.JPasswordField txtpass;
    private javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables
}

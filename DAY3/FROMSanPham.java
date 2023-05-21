/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package DAY3;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author TgNam
 */
public class FROMSanPham extends javax.swing.JFrame {
    private QLCN ql = new QLSanPham();
    private DefaultTableModel tableModel;
    
    public FROMSanPham() {
        initComponents();
    }
    public void combobox(){
        DefaultComboBoxModel comboBoxModel = new DefaultComboBoxModel();
        comboBoxModel.addElement("Hàng mới");
        comboBoxModel.addElement("Hàng cũ");
        comboBoxModel.addElement("Hàng đổi trả bảo hành");
        comboBoxModel.addElement("Hàng trưng bày");
        cbosp.setModel(comboBoxModel);
    }
    public void column(){
        tableModel = new DefaultTableModel();
        String [] column={"Tên","Giá","SốLượng","TrạngThái","Dangmục"};
        tableModel.setColumnIdentifiers(column);
        tblsanpham.setModel(tableModel);
    }
    public void datarow(ArrayList<SanPham> list){
        tableModel = (DefaultTableModel) tblsanpham.getModel();
        tableModel.setRowCount(0);
        for (SanPham sanPham : list) {
            tableModel.addRow(new Object[]{sanPham.getTen(),sanPham.getGia(),(int)sanPham.getSoluong(),sanPham.HTTrangThai(),sanPham.getDanhmuc()});
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtuser = new javax.swing.JTextField();
        txtgia = new javax.swing.JTextField();
        txtquantity = new javax.swing.JTextField();
        rdostocking = new javax.swing.JRadioButton();
        rdooutofstock = new javax.swing.JRadioButton();
        cbosp = new javax.swing.JComboBox<>();
        bthadd = new javax.swing.JButton();
        bthupdate = new javax.swing.JButton();
        bthremove = new javax.swing.JButton();
        bthclear = new javax.swing.JButton();
        bthexit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblsanpham = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Tên:");

        jLabel2.setText("Giá:");

        jLabel3.setText("Số lg:");

        jLabel4.setText("TrangThai:");

        jLabel5.setText("DanhMục:");

        buttonGroup1.add(rdostocking);
        rdostocking.setSelected(true);
        rdostocking.setText("Còn Hàng");

        buttonGroup1.add(rdooutofstock);
        rdooutofstock.setText("Hết Hàng");

        cbosp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        bthadd.setText("ADD");
        bthadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bthaddActionPerformed(evt);
            }
        });

        bthupdate.setText("Update");
        bthupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bthupdateActionPerformed(evt);
            }
        });

        bthremove.setText("Remove");
        bthremove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bthremoveActionPerformed(evt);
            }
        });

        bthclear.setText("Clear");
        bthclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bthclearActionPerformed(evt);
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
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtgia)
                            .addComponent(txtuser))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rdostocking)
                                .addGap(18, 18, 18)
                                .addComponent(rdooutofstock))
                            .addComponent(cbosp, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtquantity, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(bthadd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bthupdate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bthremove)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bthclear)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bthexit)))
                        .addContainerGap(127, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(txtuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdostocking)
                    .addComponent(rdooutofstock))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtgia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbosp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtquantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bthadd)
                    .addComponent(bthupdate)
                    .addComponent(bthremove)
                    .addComponent(bthclear)
                    .addComponent(bthexit))
                .addGap(34, 34, 34))
        );

        tblsanpham.setModel(new javax.swing.table.DefaultTableModel(
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
        tblsanpham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblsanphamMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblsanpham);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        combobox();
        column();
        datarow(ql.getList());
        setLocationRelativeTo(null);
    }//GEN-LAST:event_formWindowOpened

    private void bthaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bthaddActionPerformed
        StringBuilder sb = new StringBuilder();
        if (txtuser.getText().equals("")) {
            sb.append("Username is empty");
        }
        if (sb.length() > 0) {
            JOptionPane.showMessageDialog(this, sb.toString(), "Error", JOptionPane.INFORMATION_MESSAGE);
        } else {
            boolean check = true;
            for (SanPham sanPham : ql.getList()) {
                if (txtuser.getText().equals(sanPham.getTen())) {
                    check = false;
                    JOptionPane.showMessageDialog(this, "Đối tượng đã tồn tại", "Save", JOptionPane.INFORMATION_MESSAGE);
                    return;
                }
            }
            if (check) {
                SanPham sanPham = new SanPham();
                sanPham.setTen(txtuser.getText());
                sanPham.setGia(Double.parseDouble(txtgia.getText()));
                sanPham.setSoluong(Integer.parseInt(txtquantity.getText()));
                sanPham.setTrangthai(rdostocking.isSelected() ? 0 : 1);
                sanPham.setDanhmuc((String) cbosp.getSelectedItem());
                JOptionPane.showMessageDialog(this, ql.add(sanPham), "Save", JOptionPane.PLAIN_MESSAGE);
                datarow(ql.getList());
                bthclearActionPerformed(evt);
            }
        }
    }//GEN-LAST:event_bthaddActionPerformed

    private void bthupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bthupdateActionPerformed
        StringBuilder sb = new StringBuilder();
        if (txtuser.getText().equals("")) {
            sb.append("Username is empty");
        }
        if (sb.length() > 0) {
            JOptionPane.showMessageDialog(this, sb.toString(), "Error", JOptionPane.INFORMATION_MESSAGE);
        } else {
            boolean check = true;
            for (SanPham sanPham : ql.getList()) {
                if (txtuser.getText().equals(sanPham.getTen())) {
                    int index = tblsanpham.getSelectedRow();
                        sanPham.setTen(txtuser.getText());
                        sanPham.setGia(Double.parseDouble(txtgia.getText()));
                        sanPham.setSoluong(Integer.parseInt(txtquantity.getText()));
                        sanPham.setTrangthai(rdostocking.isSelected() ? 0 : 1);
                        sanPham.setDanhmuc((String) cbosp.getSelectedItem());
                        JOptionPane.showMessageDialog(this, ql.update(index, sanPham), "Update", JOptionPane.PLAIN_MESSAGE);
                        datarow(ql.getList());
                        bthclearActionPerformed(evt);
                    check = false;
                    return;
                }
            }
             if(check) {
                bthaddActionPerformed(evt);
                datarow(ql.getList());
                bthclearActionPerformed(evt);
            }
        }
    }//GEN-LAST:event_bthupdateActionPerformed

    private void bthremoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bthremoveActionPerformed
        StringBuilder sb = new StringBuilder();
        if (txtuser.getText().equals("")) {
            sb.append("Username is empty");
        }
        if (sb.length() > 0) {
            JOptionPane.showMessageDialog(this, sb.toString(), "Error", JOptionPane.INFORMATION_MESSAGE);
        } else {
            boolean check = true;
            for (SanPham sanPham : ql.getList()) {
                if (txtuser.getText().equals(sanPham.getTen())) {
                        int index = tblsanpham.getSelectedRow();
                        JOptionPane.showMessageDialog(this, ql.remove(index), "Remove", JOptionPane.PLAIN_MESSAGE);
                        datarow(ql.getList());
                        bthclearActionPerformed(evt);
                        check=false;
                        return;
                }
            }
            if (check) {
                JOptionPane.showMessageDialog(this, "Đối tượng không tồn tại", "Remove", JOptionPane.INFORMATION_MESSAGE);
            }
        }    
    }//GEN-LAST:event_bthremoveActionPerformed

    private void bthclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bthclearActionPerformed
        txtuser.setText("");
        txtgia.setText("");
        txtquantity.setText("");
        rdostocking.setSelected(true);
        cbosp.setSelectedIndex(0);
    }//GEN-LAST:event_bthclearActionPerformed

    private void bthexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bthexitActionPerformed
        int choice = JOptionPane.showConfirmDialog(this, "You want to turn off", "Exit", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (choice == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_bthexitActionPerformed

    private void tblsanphamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblsanphamMouseClicked
        int index = tblsanpham.getSelectedRow();
        if (index >= 0) {
            String username = (String) tblsanpham.getValueAt(index, 0);
            for (SanPham sanPham : ql.getList()) {
                if (sanPham.getTen().equals(username)) {
                    txtuser.setText(sanPham.getTen());
                    txtgia.setText(String.valueOf(sanPham.getGia()));
                    txtquantity.setText(String.valueOf((int) sanPham.getSoluong()));
                    if (sanPham.getTrangthai() == 0) {
                        rdostocking.setSelected(true);
                    } else {
                        rdooutofstock.setSelected(true);
                    }
                    cbosp.setSelectedItem(sanPham.getDanhmuc());
                }
            }
        }
    }//GEN-LAST:event_tblsanphamMouseClicked

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
            java.util.logging.Logger.getLogger(FROMSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FROMSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FROMSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FROMSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FROMSanPham().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bthadd;
    private javax.swing.JButton bthclear;
    private javax.swing.JButton bthexit;
    private javax.swing.JButton bthremove;
    private javax.swing.JButton bthupdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbosp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdooutofstock;
    private javax.swing.JRadioButton rdostocking;
    private javax.swing.JTable tblsanpham;
    private javax.swing.JTextField txtgia;
    private javax.swing.JTextField txtquantity;
    private javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables
}

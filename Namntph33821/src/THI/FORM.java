/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package THI;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author TgNam
 */
public class FORM extends javax.swing.JFrame {
    
    private QLSanPham ql = new QLCN();
    private DefaultTableModel tableModel;
    
    public FORM() {
        initComponents();
    }
    
    public void combobox() {
        DefaultComboBoxModel comboBoxModel = new DefaultComboBoxModel();
        comboBoxModel.addElement("Laptop");
        comboBoxModel.addElement("SmartPhone");
        cbodanhmuc.setModel(comboBoxModel);
    }
    
    public void column() {
        tableModel = new DefaultTableModel();
        String[] column = {"Tên SP", "MÃ SP", "Danh Mục", "Tình Trạng", "Đơn Giá"};
        tableModel.setColumnIdentifiers(column);
        tblsanpham.setModel(tableModel);
    }
    
    public void datarow(ArrayList<SanPham> list) {
        tableModel = (DefaultTableModel) tblsanpham.getModel();
        tableModel.setRowCount(0);
        for (SanPham sanPham : list) {
            tableModel.addRow(new Object[]{sanPham.getTen(), sanPham.getMasv(), sanPham.getDanhMuc(), sanPham.HTtrangthai(), sanPham.getDongia()});
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
        txtten = new javax.swing.JTextField();
        txtid = new javax.swing.JTextField();
        txtdongia = new javax.swing.JTextField();
        cbodanhmuc = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        rdoconhang = new javax.swing.JRadioButton();
        rdohethang = new javax.swing.JRadioButton();
        bththem = new javax.swing.JButton();
        bthsua = new javax.swing.JButton();
        bthxoa = new javax.swing.JButton();
        bthreset = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        bthexit = new javax.swing.JButton();
        bthtimkiem = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblsanpham = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Tên SP:");

        jLabel2.setText("Mã Sp:");

        jLabel3.setText("Danh Mục: ");

        cbodanhmuc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setText("Trạng Thái:");

        jLabel5.setText("Đơn giá:");

        buttonGroup1.add(rdoconhang);
        rdoconhang.setSelected(true);
        rdoconhang.setText("Còn hàng");

        buttonGroup1.add(rdohethang);
        rdohethang.setText("Hết hàng");

        bththem.setText("Thêm");
        bththem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bththemActionPerformed(evt);
            }
        });

        bthsua.setText("Sửa");
        bthsua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bthsuaActionPerformed(evt);
            }
        });

        bthxoa.setText("Xóa");
        bthxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bthxoaActionPerformed(evt);
            }
        });

        bthreset.setText("Xóa form");
        bthreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bthresetActionPerformed(evt);
            }
        });

        jButton5.setText("Ghi file");

        jButton6.setText("Đọc file");

        bthexit.setText("Exit");
        bthexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bthexitActionPerformed(evt);
            }
        });

        bthtimkiem.setText("Tìm kiếm");
        bthtimkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bthtimkiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cbodanhmuc, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtten, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                                .addGap(31, 31, 31))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rdoconhang, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rdohethang, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtdongia, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(bthtimkiem)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton5)
                                .addGap(18, 18, 18)
                                .addComponent(jButton6)
                                .addGap(18, 18, 18)
                                .addComponent(bthexit))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(123, 123, 123)
                                .addComponent(bththem)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bthsua)
                                .addGap(18, 18, 18)
                                .addComponent(bthxoa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bthreset)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(29, 29, 29))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdoconhang)
                            .addComponent(rdohethang))
                        .addGap(18, 18, 18)
                        .addComponent(txtdongia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(txtten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbodanhmuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bththem)
                    .addComponent(bthsua)
                    .addComponent(bthxoa)
                    .addComponent(bthreset))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton6)
                    .addComponent(bthexit)
                    .addComponent(bthtimkiem))
                .addContainerGap())
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
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        combobox();
        column();
        datarow(ql.getList());
        setLocationRelativeTo(null);
    }//GEN-LAST:event_formWindowOpened

    private void tblsanphamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblsanphamMouseClicked
        int index = tblsanpham.getSelectedRow();
        if (index >= 0) {
            String username = tblsanpham.getValueAt(index, 0).toString();
            for (SanPham sanPham : ql.getList()) {
                if (sanPham.getTen().trim().equals(username)) {
                    txtten.setText(sanPham.getTen());
                    txtid.setText(sanPham.getMasv());
                    cbodanhmuc.setSelectedItem(sanPham.getDanhMuc());
                    if (sanPham.getTrangthai() == 0) {
                        rdoconhang.setSelected(true);
                    } else {
                        rdohethang.setSelected(true);
                    }
                    txtdongia.setText(String.valueOf((double) sanPham.getDongia()));
                }
            }
        }
    }//GEN-LAST:event_tblsanphamMouseClicked

    private void bththemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bththemActionPerformed
        StringBuilder sb = new StringBuilder();
        if (txtten.getText().trim().equals("")) {
            sb.append("Username is empty");
        }
        
        if (sb.length() > 0) {
            JOptionPane.showMessageDialog(this, sb.toString(), "Error", JOptionPane.INFORMATION_MESSAGE);
        } else {
            if (txtten.getText().length() <= 20) {
                if (txtid.getText().length() <= 20) {
                    
                    try {
                        
                        if (Double.parseDouble(txtdongia.getText().replace(" ", "")) >= 0) {
                            if (txtdongia.getText().replace(" ", "").length() <= 9) {
                                boolean check = true;
                                for (SanPham sanPham : ql.getList()) {
                                    if (txtten.getText().replace(" ", "").equals(sanPham.getTen().replace(" ", ""))) {
                                        check = false;
                                        JOptionPane.showMessageDialog(this, "Đối tượng đã tồn tại", "Save", JOptionPane.INFORMATION_MESSAGE);
                                        return;
                                    }
                                }
                                
                                if (check) {
                                    
                                    SanPham sanPham = new SanPham();
                                    sanPham.setTen(txtten.getText());
                                    sanPham.setMasv(txtid.getText());
                                    sanPham.setDanhMuc(cbodanhmuc.getSelectedItem().toString());
                                    sanPham.setTrangthai(rdoconhang.isSelected() ? 0 : 1);
                                    sanPham.setDongia(Double.parseDouble(txtdongia.getText().replace(" ", "")));
                                    
                                    JOptionPane.showMessageDialog(this, ql.add(sanPham), "Save", JOptionPane.PLAIN_MESSAGE);
                                    datarow(ql.getList());
                                    bthresetActionPerformed(evt);
                                    
                                }
                            } else {
                                txtdongia.setText("");
                                JOptionPane.showMessageDialog(this, "Bạn cần nhập số lượng kí tự <=9", "Lỗi", JOptionPane.ERROR_MESSAGE);
                            }
                        } else {
                            JOptionPane.showMessageDialog(this, "Bạn cần nhập số dương", "Lỗi", JOptionPane.ERROR_MESSAGE);
                        }
                        
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(this, "Bạn cần nhập số!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                        txtdongia.setText("");
                    }
                    
                } else {
                    txtid.setText("");
                    JOptionPane.showMessageDialog(this, "Độ dài quá 20 kí tự", "ID", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                txtten.setText("");
                JOptionPane.showMessageDialog(this, "Độ dài quá 20 kí tự", "User", JOptionPane.INFORMATION_MESSAGE);
            }
        }

    }//GEN-LAST:event_bththemActionPerformed

    private void bthsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bthsuaActionPerformed
        StringBuilder sb = new StringBuilder();
        if (txtten.getText().equals("")) {
            sb.append("Username is empty");
        }
        
        if (sb.length() > 0) {
            JOptionPane.showMessageDialog(this, sb.toString(), "Error", JOptionPane.INFORMATION_MESSAGE);
        } else {
            if (txtten.getText().length() <= 20) {
                if (txtid.getText().length() <= 20) {
                    
                    try {
                        
                        String dongia = txtdongia.getText().replace(" ", "");
                        
                        if (Double.parseDouble(dongia) >= 0) {
                            if (dongia.replace(" ", "").length() <= 9) {
                                boolean check = true;
                                for (SanPham sanPham : ql.getList()) {
                                    if (txtten.getText().replace(" ", "").equals(sanPham.getTen().replace(" ", ""))) {
                                        check = false;
                                        int index = tblsanpham.getSelectedRow();
                                        sanPham.setTen(txtten.getText());
                                        sanPham.setMasv(txtid.getText());
                                        sanPham.setDanhMuc(cbodanhmuc.getSelectedItem().toString());
                                        sanPham.setTrangthai(rdoconhang.isSelected() ? 0 : 1);
                                        sanPham.setDongia(Double.parseDouble(dongia));
                                        JOptionPane.showMessageDialog(this, ql.update(index, sanPham), "Update", JOptionPane.PLAIN_MESSAGE);
                                        datarow(ql.getList());
                                        bthresetActionPerformed(evt);
                                        
                                        return;
                                    }
                                }
                                
                                if (check) {
                                    bththemActionPerformed(evt);
                                    datarow(ql.getList());
                                    bthresetActionPerformed(evt);
                                }
                            } else {
                                txtdongia.setText("");
                                JOptionPane.showMessageDialog(this, "Bạn cần nhập số lượng kí tự <=9", "Lỗi", JOptionPane.ERROR_MESSAGE);
                            }
                        } else {
                            JOptionPane.showMessageDialog(this, "Bạn cần nhập số dương", "Lỗi", JOptionPane.ERROR_MESSAGE);
                        }
                        
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(this, "Bạn cần nhập số!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                        txtdongia.setText("");
                    }
                
                } else {
                    txtid.setText("");
                    JOptionPane.showMessageDialog(this, "Độ dài quá 20 kí tự", "ID", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                txtten.setText("");
                JOptionPane.showMessageDialog(this, "Độ dài quá 20 kí tự", "User", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_bthsuaActionPerformed

    private void bthxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bthxoaActionPerformed
        StringBuilder sb = new StringBuilder();
        if (txtten.getText().equals("")) {
            sb.append("Username is empty");
        }
        if (sb.length() > 0) {
            JOptionPane.showMessageDialog(this, sb.toString(), "Error", JOptionPane.INFORMATION_MESSAGE);
        } else {
            for (SanPham sanPham : ql.getList()) {
                if (sanPham.getTen().trim().equals(txtten.getText())) {
                    int index = tblsanpham.getSelectedRow();
                    JOptionPane.showMessageDialog(this, ql.remove(index), "Xoa", JOptionPane.PLAIN_MESSAGE);
                    datarow(ql.getList());
                    bthresetActionPerformed(evt);
                    return;
                }
            }
        }
    }//GEN-LAST:event_bthxoaActionPerformed

    private void bthresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bthresetActionPerformed
        txtten.setText("");
        txtid.setText("");
        cbodanhmuc.setSelectedItem("");
        rdoconhang.setSelected(true);
        txtdongia.setText("");
    }//GEN-LAST:event_bthresetActionPerformed

    private void bthexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bthexitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bthexitActionPerformed

    private void bthtimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bthtimkiemActionPerformed
        StringBuilder sb = new StringBuilder();
        if (txtten.getText().equals("")) {
            sb.append("Username is empty");
        }
        
        if (sb.length() > 0) {
            JOptionPane.showMessageDialog(this, sb.toString(), "Error", JOptionPane.INFORMATION_MESSAGE);
        } else {
            if (txtten.getText().length() <= 20) {
                boolean check = true;
                for (SanPham sanPham : ql.getList()) {
                    if (sanPham.getTen().trim().equalsIgnoreCase(txtten.getText().trim())) {
                        txtid.setText(sanPham.getMasv());
                        cbodanhmuc.setSelectedItem(sanPham.getDanhMuc());
                        if (sanPham.getTrangthai() == 0) {
                            rdoconhang.setSelected(true);
                        } else {
                            rdohethang.setSelected(true);
                        }
                        txtdongia.setText(String.valueOf((double) sanPham.getDongia()));
                        check = false;
                        break;
                    }
                }
                if (check) {
                    JOptionPane.showMessageDialog(this, "Đối tượng không tồn tại", "!", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                txtten.setText("");
                JOptionPane.showMessageDialog(this, "Độ dài quá 20 kí tự", "User", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_bthtimkiemActionPerformed

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
            java.util.logging.Logger.getLogger(FORM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FORM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FORM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FORM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FORM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bthexit;
    private javax.swing.JButton bthreset;
    private javax.swing.JButton bthsua;
    private javax.swing.JButton bththem;
    private javax.swing.JButton bthtimkiem;
    private javax.swing.JButton bthxoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbodanhmuc;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdoconhang;
    private javax.swing.JRadioButton rdohethang;
    private javax.swing.JTable tblsanpham;
    private javax.swing.JTextField txtdongia;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtten;
    // End of variables declaration//GEN-END:variables
}

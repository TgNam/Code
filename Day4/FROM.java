/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Day4;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author TgNam
 */
public class FROM extends javax.swing.JFrame {
    private QLStudent ql = new QLCN();
    private DefaultTableModel tableModel;
    public FROM() {
        initComponents();
    }
    public void combobox(){
        DefaultComboBoxModel comboBoxModel = new DefaultComboBoxModel();
        comboBoxModel.addElement("Thiết Kế Wed");
        comboBoxModel.addElement("Thiết Kế Đồ Họa");
        comboBoxModel.addElement("Phát triển phần mềm");
        comboBoxModel.addElement("Quản trị kinh doanh");
        cbomajor.setModel(comboBoxModel);
    }
    public void column(){
        tableModel = new DefaultTableModel();
        String [] column ={"Họ và tên","Điểm","Ngành","Học Lực","Thưởng"};
        tableModel.setColumnIdentifiers(column);
        tblstudent.setModel(tableModel);
    }
    public void datarow(ArrayList<Student> list){
        tableModel = (DefaultTableModel) tblstudent.getModel();
        tableModel.setRowCount(0);
        for (Student student : list) {
            tableModel.addRow(new Object[]{student.getUser(),student.getDiem(),student.getMajor(),student.getHocluc(),student.HTthuong()});
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtuser = new javax.swing.JTextField();
        txtdiem = new javax.swing.JTextField();
        cbomajor = new javax.swing.JComboBox<>();
        chkthuong = new javax.swing.JCheckBox();
        bththem = new javax.swing.JButton();
        bthxoa = new javax.swing.JButton();
        bthupdate = new javax.swing.JButton();
        bthreset = new javax.swing.JButton();
        txthocluc = new javax.swing.JTextField();
        bthexit = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblstudent = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Họ Và Tên:");

        jLabel2.setText("Điểm :");

        jLabel3.setText("Ngành:");

        jLabel4.setText("Học Lực:");

        cbomajor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        chkthuong.setText("Có được khen thưởng?");

        bththem.setText("Thêm");
        bththem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bththemActionPerformed(evt);
            }
        });

        bthxoa.setText("Xóa");
        bthxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bthxoaActionPerformed(evt);
            }
        });

        bthupdate.setText("Cập nhật");
        bthupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bthupdateActionPerformed(evt);
            }
        });

        bthreset.setText("Nhập mới");
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkthuong)
                            .addComponent(cbomajor, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txthocluc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
                                .addComponent(txtdiem, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtuser, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(bththem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bthxoa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bthupdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bthreset)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bthexit)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtdiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbomajor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txthocluc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(chkthuong)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bththem)
                    .addComponent(bthxoa)
                    .addComponent(bthupdate)
                    .addComponent(bthreset)
                    .addComponent(bthexit))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        tblstudent.setModel(new javax.swing.table.DefaultTableModel(
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
        tblstudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblstudentMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblstudent);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        setLocationRelativeTo(null);
        combobox();
        column();
        datarow(ql.getList());
    }//GEN-LAST:event_formWindowOpened

    private void bththemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bththemActionPerformed
        Student student = new Student();
        student.setUser(txtuser.getText());
        student.setDiem(Double.parseDouble(txtdiem.getText()));
        student.setMajor(cbomajor.getSelectedItem().toString());
        student.setHocluc(txthocluc.getText());
        student.setThuong(chkthuong.isSelected()?0:1);
        JOptionPane.showMessageDialog(this, ql.add(student), "Save", JOptionPane.PLAIN_MESSAGE);
         datarow(ql.getList());
         bthresetActionPerformed(evt);
    }//GEN-LAST:event_bththemActionPerformed

    private void bthxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bthxoaActionPerformed
        int index = tblstudent.getSelectedRow();
        JOptionPane.showMessageDialog(this, ql.remove(index),"Remove",JOptionPane.PLAIN_MESSAGE);
        datarow(ql.getList());
         bthresetActionPerformed(evt);
    }//GEN-LAST:event_bthxoaActionPerformed

    private void bthupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bthupdateActionPerformed
        int index = tblstudent.getSelectedRow();
        for (Student student : ql.getList()) {
            if (txtuser.getText().equals(student.getUser())) {
                student.setUser(txtuser.getText());
                student.setDiem(Double.parseDouble(txtdiem.getText()));
                student.setMajor(cbomajor.getSelectedItem().toString());
                student.setHocluc(txthocluc.getText());
                student.setThuong(chkthuong.isSelected() ? 0 : 1);
                JOptionPane.showMessageDialog(this, ql.updete(index, student), "Update", JOptionPane.PLAIN_MESSAGE);
            }
        }
        datarow(ql.getList());
        bthresetActionPerformed(evt);
    }//GEN-LAST:event_bthupdateActionPerformed

    private void bthresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bthresetActionPerformed
        txtuser.setText("");
        txtdiem.setText("");
        cbomajor.setSelectedIndex(0);
        txthocluc.setText("");
        chkthuong.setSelected(false);
    }//GEN-LAST:event_bthresetActionPerformed

    private void bthexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bthexitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bthexitActionPerformed

    private void tblstudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblstudentMouseClicked
        int index = tblstudent.getSelectedRow();
        if (index>=0) {
            String username =  tblstudent.getValueAt(index, 0).toString();
            for (Student student : ql.getList()) {
                if (student.getUser().equals(username)) {
                    txtuser.setText(student.getUser());
                    txtdiem.setText(String.valueOf((double)student.getDiem()));
                    cbomajor.setSelectedItem(student.getMajor());
                    txthocluc.setText(student.getHocluc());
                    if (student.getThuong()==0) {
                        chkthuong.setSelected(true);
                    }if (student.getThuong()==1) {
                        chkthuong.setSelected(false);
                    }
                }
            }
        }
    }//GEN-LAST:event_tblstudentMouseClicked


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
            java.util.logging.Logger.getLogger(FROM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FROM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FROM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FROM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FROM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bthexit;
    private javax.swing.JButton bthreset;
    private javax.swing.JButton bththem;
    private javax.swing.JButton bthupdate;
    private javax.swing.JButton bthxoa;
    private javax.swing.JComboBox<String> cbomajor;
    private javax.swing.JCheckBox chkthuong;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tblstudent;
    private javax.swing.JTextField txtdiem;
    private javax.swing.JTextField txthocluc;
    private javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Day2;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author TgNam
 */
public class FROM extends javax.swing.JFrame {
    private DefaultTableModel tableModel;
    private QLStudents ql = new QLCN();
    /**
     * Creates new form FROM
     */
    public FROM() {
        initComponents();
    }
    public void column(){
        tableModel = new DefaultTableModel();
        String [] column ={"Họ tên","Mã SV","Email","Password","Giới Tính","Trang Thái","Chuyên Ngành"};
        tableModel.setColumnIdentifiers(column);
        tblStudents.setModel(tableModel);
    }
    public void combobox(){
        DefaultComboBoxModel comboBoxModel = new DefaultComboBoxModel();
        comboBoxModel.addElement("Graphic design");
        comboBoxModel.addElement("Software Development");
        comboBoxModel.addElement("Maketing");
        comboBoxModel.addElement("Web design");
        cbomajor.setModel(comboBoxModel);
    }
    public void datarow(ArrayList<Student> list){
        //xóa dữ liệu cũ
        tableModel = (DefaultTableModel) tblStudents.getModel();
        tableModel.setRowCount(0);
        //thêm dữ liệu mới vào table
        for (Student student : list) {
            tableModel.addRow(new Object[]{
                student.getUser(),student.getId(),
                student.getEmail(),student.getPassword(),
                student.hienThiGT(),student.TrangThai(),student.getMajor()
            });
        }
        tableModel.fireTableDataChanged();
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
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtuser = new javax.swing.JTextField();
        txtid = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        txtpassword = new javax.swing.JPasswordField();
        rdonam = new javax.swing.JRadioButton();
        rdonu = new javax.swing.JRadioButton();
        chktrangthai = new javax.swing.JCheckBox();
        cbomajor = new javax.swing.JComboBox<>();
        bthadd = new javax.swing.JButton();
        bthupdate = new javax.swing.JButton();
        bthremove = new javax.swing.JButton();
        bthreset = new javax.swing.JButton();
        bthexit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblStudents = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Họ Tên ");

        jLabel2.setText("Mã SV");

        jLabel3.setText("Email");

        jLabel4.setText("Passworl");

        jLabel5.setText("Giới Tính");

        jLabel6.setText("Trang Thái");

        jLabel7.setText("Chuyên ngành ");

        buttonGroup1.add(rdonam);
        rdonam.setSelected(true);
        rdonam.setText("Nam");

        buttonGroup1.add(rdonu);
        rdonu.setText("Nữ");

        chktrangthai.setText("Đang học");

        cbomajor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        bthadd.setText("Add");
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
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtpassword, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(txtemail))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(22, 22, 22)
                        .addComponent(txtuser))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(txtid)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rdonam, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdonu, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(chktrangthai, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbomajor, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(bthadd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bthupdate)
                .addGap(24, 24, 24)
                .addComponent(bthremove)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bthreset)
                .addGap(18, 18, 18)
                .addComponent(bthexit)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(rdonam)
                            .addComponent(rdonu))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(chktrangthai))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(cbomajor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bthadd)
                    .addComponent(bthupdate)
                    .addComponent(bthremove)
                    .addComponent(bthreset)
                    .addComponent(bthexit))
                .addGap(41, 41, 41))
        );

        tblStudents.setModel(new javax.swing.table.DefaultTableModel(
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
        tblStudents.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblStudentsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblStudents);

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
                .addGap(17, 17, 17)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            boolean check=false;
            for (Student student : ql.getlist()) {
                if (txtuser.getText().equals(student.getUser())) {
                    JOptionPane.showMessageDialog(this, "Đối tượng đã tồn tại", "SAVE", JOptionPane.QUESTION_MESSAGE);
                    return;
                }
                else{
                    check=true;
                }
            }
            if(check==true){
                    Student student = new Student();
                    student.setUser(txtuser.getText());
                    student.setId(txtid.getText());
                    student.setEmail(txtemail.getText());
                    student.setPassword(String.valueOf(txtpassword.getPassword()));
                    if (rdonam.isSelected()) {
                        student.setGioitinh(1);
                    }
                    if (rdonu.isSelected()) {
                        student.setGioitinh(1);
                    }
                    student.setTrangthai(chktrangthai.isSelected() ? 1 : 0);
                    student.setMajor((String) cbomajor.getSelectedItem());
                    JOptionPane.showMessageDialog(this, ql.add(student), "Save", JOptionPane.PLAIN_MESSAGE);
                    datarow(ql.getlist());
                    bthresetActionPerformed(evt);
            }
        }
    }//GEN-LAST:event_bthaddActionPerformed

    private void bthupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bthupdateActionPerformed
        StringBuilder sb = new StringBuilder();
        if (txtuser.getText().equals("")) {
            sb.append("Username is empty\n");
        }
        if (sb.length()>0) {
            JOptionPane.showMessageDialog(this, sb.toString(), "Save", JOptionPane.ERROR_MESSAGE);
        }
        else{
            Boolean check = false;
            for (Student student : ql.getlist()) {               
                if (txtuser.getText().equals(student.getUser())) {
                    int index = tblStudents.getSelectedRow();
                    student.setUser(txtuser.getText());
                    student.setId(txtid.getText());
                    student.setEmail(txtemail.getText());
                    student.setPassword(String.valueOf(txtpassword.getPassword()));
                    if (rdonam.isSelected()) {
                    student.setGioitinh(1);
                    }
                    if (rdonu.isSelected()) {
                    student.setGioitinh(0);
                    }
                    student.setTrangthai(chktrangthai.isSelected()? 1 : 0);
                    student.setMajor(cbomajor.getSelectedItem().toString());
                    JOptionPane.showMessageDialog(this, ql.update(index, student), "Update", JOptionPane.PLAIN_MESSAGE);
                    datarow(ql.getlist());
                    bthresetActionPerformed(evt);
                    check = true;
                    break;
                }
            }
            if (check==false) {
                bthaddActionPerformed(evt);
            }
        }
    }//GEN-LAST:event_bthupdateActionPerformed

    private void bthremoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bthremoveActionPerformed
        StringBuilder sb = new StringBuilder();
        if (txtuser.getText().equals("")) {
            sb.append("Username is empty");
        }
        if (sb.length()>0) {
           JOptionPane.showMessageDialog(this, sb.toString(), "Save", JOptionPane.ERROR_MESSAGE); 
        }
        else{
            Boolean check = false;
            for (Student student : ql.getlist()) {
                if (txtuser.getText().equals(student.getUser())) {
                    int index = tblStudents.getSelectedRow();
                    JOptionPane.showConfirmDialog(this, ql.remove(index), "Remove", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
                    datarow(ql.getlist());
                    bthresetActionPerformed(evt);
                    check =true;
                    return;
                }
            }
            if (check==false) {
                JOptionPane.showMessageDialog(this, "Khong co ho ten trung khop","Remove",JOptionPane.QUESTION_MESSAGE);
            }
        }
    }//GEN-LAST:event_bthremoveActionPerformed

    private void bthresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bthresetActionPerformed
            txtuser.setText("");
            txtid.setText("");
            txtemail.setText("");
            txtpassword.setText("");
            rdonam.setSelected(true);
            chktrangthai.setSelected(false);
            cbomajor.setSelectedIndex(0);
    }//GEN-LAST:event_bthresetActionPerformed

    private void bthexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bthexitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bthexitActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        column();
        setLocationRelativeTo(null);
        combobox();
        datarow(ql.getlist());
    }//GEN-LAST:event_formWindowOpened

    private void tblStudentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblStudentsMouseClicked
        int index = tblStudents.getSelectedRow();
        if (index>=0) {
            String username = (String)tblStudents.getValueAt(index, 0);
            for (Student student : ql.getlist()) {
                if (student.getUser().equals(username)) {
                    txtuser.setText(student.getUser());
                    txtid.setText(student.getId());
                    txtemail.setText(student.getEmail());
                    txtpassword.setText(student.getPassword());
                    if (student.getGioitinh()==1) {
                        rdonam.setSelected(true);
                    }
                    if (student.getGioitinh()==0) {
                        rdonu.setSelected(true);
                    }
                    if (student.getTrangthai()==1) {
                        chktrangthai.setSelected(true);
                    }
                    if (student.getTrangthai()==0) {
                        chktrangthai.setSelected(false);
                    }
                    cbomajor.setSelectedItem(student.getMajor());
                }
 
            }
        }
    }//GEN-LAST:event_tblStudentsMouseClicked

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
    private javax.swing.JButton bthadd;
    private javax.swing.JButton bthexit;
    private javax.swing.JButton bthremove;
    private javax.swing.JButton bthreset;
    private javax.swing.JButton bthupdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbomajor;
    private javax.swing.JCheckBox chktrangthai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdonam;
    private javax.swing.JRadioButton rdonu;
    private javax.swing.JTable tblStudents;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtid;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables
}

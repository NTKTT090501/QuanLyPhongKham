/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlyphongkham;

import Entity.BacSi;
import DAO.BacSiDAO;
import java.util.Calendar;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Utilities.Auth;
import Utilities.MsgBox;
import Utilities.XJdbc;

/**
 *
 * @author ADMIN
 */
public class QuanLyBacSi extends javax.swing.JDialog {

    /**
     * Creates new form Doctor
     */
    public QuanLyBacSi(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        txtMaBS = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTenBS = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        rdoNam = new javax.swing.JRadioButton();
        rdoNu = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        txtSDT = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtDiaChi = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtTuoi = new javax.swing.JTextField();
        txtNgaySinh = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtChuyenNganh = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBang = new javax.swing.JTable();
        btnExit = new javax.swing.JButton();
        btnDel = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnNew = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(738, 932));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Thông Tin Bác Sĩ");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(3, 3, 151, 22);
        jPanel2.add(jSeparator1);
        jSeparator1.setBounds(3, 32, 890, 2);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Họ Và Tên BS");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(15, 83, 111, 22);

        txtMaBS.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPanel2.add(txtMaBS);
        txtMaBS.setBounds(140, 40, 414, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Mã Bác Sĩ");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(15, 41, 77, 22);

        txtTenBS.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPanel2.add(txtTenBS);
        txtTenBS.setBounds(140, 80, 414, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Giới Tính");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(15, 125, 71, 22);

        buttonGroup1.add(rdoNam);
        rdoNam.setText("Nam");
        jPanel2.add(rdoNam);
        rdoNam.setBounds(138, 125, 55, 25);

        buttonGroup1.add(rdoNu);
        rdoNu.setText("Nữ");
        jPanel2.add(rdoNu);
        rdoNu.setBounds(211, 125, 45, 25);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("SĐT");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(620, 130, 57, 30);

        txtSDT.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPanel2.add(txtSDT);
        txtSDT.setBounds(680, 130, 190, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Địa Chỉ");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(20, 180, 57, 22);

        txtDiaChi.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPanel2.add(txtDiaChi);
        txtDiaChi.setBounds(113, 172, 760, 90);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Tuổi");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(619, 41, 35, 22);

        txtTuoi.setEditable(false);
        txtTuoi.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPanel2.add(txtTuoi);
        txtTuoi.setBounds(685, 43, 50, 30);

        txtNgaySinh.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPanel2.add(txtNgaySinh);
        txtNgaySinh.setBounds(747, 43, 121, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Chuyên Ngành");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(619, 83, 116, 22);

        txtChuyenNganh.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPanel2.add(txtChuyenNganh);
        txtChuyenNganh.setBounds(750, 80, 120, 30);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 908, 280));

        tblBang.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tblBang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã Bác Sĩ", "Họ Và Tên", "Chuyên Ngành", "Địa Chỉ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblBang.setRowHeight(30);
        tblBang.setRowMargin(4);
        tblBang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblBang);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 910, 340));

        btnExit.setText("Thoát");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 660, 110, 50));

        btnDel.setText("Xóa");
        btnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelActionPerformed(evt);
            }
        });
        getContentPane().add(btnDel, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 660, 110, 50));

        btnUpdate.setText("Sửa");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 660, 110, 50));

        btnAdd.setText("Thêm");
        btnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddMouseClicked(evt);
            }
        });
        getContentPane().add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 660, 110, 50));

        btnNew.setText("Nhập Mới");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });
        getContentPane().add(btnNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 660, 100, 50));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Background/vector-MAY-2020-112.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 932, 738));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseClicked
        // TODO add your handling code here:
        if (checkform()) {
            this.insert();
        }
    }//GEN-LAST:event_btnAddMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        if (checkform()) {
            this.update();
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void tblBangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBangMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            this.row = tblBang.getSelectedRow();
            this.edit();
        }
    }//GEN-LAST:event_tblBangMouseClicked

    private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelActionPerformed
        // TODO add your handling code here:
        this.delete();
    }//GEN-LAST:event_btnDelActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        // TODO add your handling code here:
        this.clearForm();
    }//GEN-LAST:event_btnNewActionPerformed

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
            java.util.logging.Logger.getLogger(QuanLyBacSi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyBacSi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyBacSi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyBacSi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                QuanLyBacSi dialog = new QuanLyBacSi(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDel;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnUpdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JRadioButton rdoNam;
    private javax.swing.JRadioButton rdoNu;
    private javax.swing.JTable tblBang;
    private javax.swing.JTextField txtChuyenNganh;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtMaBS;
    private javax.swing.JTextField txtNgaySinh;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTenBS;
    private javax.swing.JTextField txtTuoi;
    // End of variables declaration//GEN-END:variables
    BacSiDAO dao = new BacSiDAO();
    int row = -1;

    void init() {
        setLocationRelativeTo(null); // đưa cửa sổ ra giữa màn hình
        this.fillTable(); // đổ dữ liệu nhân viên vào bảng
    }
    
    void fillTable() {
        DefaultTableModel model = (DefaultTableModel) tblBang.getModel();
        model.setRowCount(0);
        try {
            List<BacSi> list = dao.selectALL();
            for (BacSi bs : list) {
                Object[] row = {
                    bs.getMaBS(),
                    bs.getTenBS(),
                    bs.getChuyennganh(),
                    bs.getDiachi(),
                    bs.isGioitinh(),
                    bs.getSDT(),
                    bs.getNgaysinh()
                };
                model.addRow(row);
            }
        } catch (Exception e) {
            System.out.println(e);
            MsgBox.alert(this, "Lỗi truy vấn dữ liệu!");
        }
    }

    BacSi getForm() {
        BacSi bs = new BacSi();
        bs.setMaBS(txtMaBS.getText());
        bs.setTenBS(txtTenBS.getText());
        bs.setChuyennganh(txtChuyenNganh.getText());
        bs.setGioitinh(rdoNam.isSelected());
        bs.setGioitinh(!rdoNu.isSelected());
        bs.setDiachi(txtDiaChi.getText());
        bs.setNgaysinh(txtNgaySinh.getText());
        bs.setSDT(txtSDT.getText());
        return bs;
    }

    void setForm(BacSi bs) {
        txtMaBS.setText(bs.getMaBS());
        txtTenBS.setText(bs.getTenBS());
        txtChuyenNganh.setText(bs.getChuyennganh());
        txtDiaChi.setText(bs.getDiachi());
        rdoNam.setSelected(bs.isGioitinh());
        txtSDT.setText(bs.getSDT());
        txtNgaySinh.setText(bs.getNgaysinh());
        txtTuoi.setText(String.valueOf(TinhTuoi()));
   }

    void edit() {
        String mabs = (String) tblBang.getValueAt(this.row, 0);
        BacSi nv = dao.selectById(mabs);
        this.setForm(nv);
    }

    void insert() {
        BacSi bs = this.getForm();
        try {
            dao.insert(bs);
            this.fillTable(); // đỗ lại bảng
            this.clearForm(); // xóa trắng form
            MsgBox.alert(this, "Thêm mới thành công!");

        } catch (Exception e) {
            MsgBox.alert(this, "Cập nhật thất bại!");
            MsgBox.alert(this, "Mã bác sĩ có thể bị trùng,hãy kiểm tra lại!");
        }
    }

    void update() {
        BacSi bs = this.getForm();
        try {
            dao.update(bs); // cập nhật
            this.fillTable(); // đổ lại bảng
            MsgBox.alert(this, "Cập nhật thành công!");

        } catch (Exception e) {
            System.out.println(e);
            MsgBox.alert(this, "Cập nhật thất bại!");
        }
    }

    void delete() {
        if (!Auth.isManage()) {
            MsgBox.alert(this, "Bạn không có quyền xóa bác sĩ!");
        } else {          
            MsgBox.confirm(this, "Bạn thực sự muốn xóa bác sĩ này?");
            String mabs = txtMaBS.getText();
                try {
                    dao.delete(mabs);
                    this.fillTable();
                    this.clearForm();
                    MsgBox.alert(this, "Xóa thành công!");

                } catch (Exception e) {
                    System.out.println(e);
                    MsgBox.alert(this, "Xóa thất bại!");
                }
            }
        }
    

    void clearForm() {
        txtChuyenNganh.setText("");
        txtDiaChi.setText("");
        txtMaBS.setText("");
        txtNgaySinh.setText("");
        txtSDT.setText("");
        txtTenBS.setText("");
        txtTuoi.setText("");
        buttonGroup1.clearSelection();
        this.row = -1;
    }

    boolean checkform() {
//        String dateformat;
//        dateformat = "^/d{4}-/d{2}-/d{2}$";
        String regex = "^[0-3]?[0-9]/[0-3]?[0-9]/(?:[0-9]{2})?[0-9]{2}$";
        if (txtMaBS.getText().equalsIgnoreCase("")) {
            MsgBox.alert(this, "Mã bác sĩ không được trống!");
            return false;
        } else if (txtChuyenNganh.getText().equalsIgnoreCase("")) {
            MsgBox.alert(this, "Bạn chưa nhập chuyên ngành!");
            return false;
        } else if (txtDiaChi.getText().equalsIgnoreCase("")) {
            MsgBox.alert(this, "Bạn chưa nhập địa chỉ!");
            return false;
        } else if (txtNgaySinh.getText().equalsIgnoreCase("")) {
            MsgBox.alert(this, "Bạn chưa nhập Ngày sinh!");
            return false;
        } else if (txtSDT.getText().equalsIgnoreCase("")) {
            MsgBox.alert(this, "Bạn chưa nhập số điện thoại!");
            return false;
        } else if (txtTenBS.getText().equalsIgnoreCase("")) {
            MsgBox.alert(this, "Bạn chưa nhập tên bác sĩ!");
            return false;
        } else if (!txtNgaySinh.getText().matches(regex)) {
            MsgBox.alert(this, "Bạn nhập sai định dạng ngày sinh,hãy kiểm tra lại(dd/mm/yyyy)!");
            return false;
        }
        return true;
    }
    
    int TinhTuoi(){
        int tuoi = 0;
        int namHienTai=0, namNgaySinh=0;      
        BacSi list=dao.selectById(txtMaBS.getText());
        String ngaysinhh=list.getNgaysinh();
        String part[]=ngaysinhh.split("-");
        String part1=part[0];
        namNgaySinh=Integer.parseInt(part1);
        namHienTai=Calendar.getInstance().get(Calendar.YEAR);
        tuoi=namHienTai-namNgaySinh;
        return tuoi;
    }
}



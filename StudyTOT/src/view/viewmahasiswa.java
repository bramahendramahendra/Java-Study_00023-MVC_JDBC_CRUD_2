/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Brama Hendra Mahendra
 */
public class viewmahasiswa extends javax.swing.JFrame {

    /**
     * Creates new form mahasiswa
     */
    public viewmahasiswa() {
        initComponents();
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
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField_nim = new javax.swing.JTextField();
        jTextField_nama = new javax.swing.JTextField();
        jComboBox1_Jurusan = new javax.swing.JComboBox<>();
        jRadioButton_laki = new javax.swing.JRadioButton();
        jRadioButton_perempuan = new javax.swing.JRadioButton();
        jButton_tambah = new javax.swing.JButton();
        jButton_update = new javax.swing.JButton();
        jButton_delete = new javax.swing.JButton();
        jButton_reset = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTextField_cari = new javax.swing.JTextField();
        jButton_cari = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_mahasiswa = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setText("NIM");

        jLabel2.setText("Nama");

        jLabel3.setText("Jurusan");

        jLabel4.setText("Jenis Kelamin");

        jComboBox1_Jurusan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Informatika", "MBTI", "Adbis", "Telekomunikasi" }));

        buttonGroup1.add(jRadioButton_laki);
        jRadioButton_laki.setText("Laki-laki");

        buttonGroup1.add(jRadioButton_perempuan);
        jRadioButton_perempuan.setText("Perempuan");

        jButton_tambah.setText("Tambah");

        jButton_update.setText("Update");

        jButton_delete.setText("Delete");

        jButton_reset.setText("Reset");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton_tambah)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_update)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_delete)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_reset))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1_Jurusan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jRadioButton_laki)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton_perempuan))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextField_nama, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                                .addComponent(jTextField_nim, javax.swing.GroupLayout.Alignment.LEADING)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_nim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1_Jurusan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton_laki)
                            .addComponent(jRadioButton_perempuan)))
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_tambah)
                    .addComponent(jButton_update)
                    .addComponent(jButton_delete)
                    .addComponent(jButton_reset))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jLabel5.setText("Data Tabel Mahasiswa");

        jButton_cari.setText("Cari");

        jTable_mahasiswa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NIM", "Nama", "Jurusan", "Jenis Kelamin"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable_mahasiswa);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jTextField_cari, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_cari))
                            .addComponent(jLabel5)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_cari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_cari))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton_cari;
    private javax.swing.JButton jButton_delete;
    private javax.swing.JButton jButton_reset;
    private javax.swing.JButton jButton_tambah;
    private javax.swing.JButton jButton_update;
    private javax.swing.JComboBox<String> jComboBox1_Jurusan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton_laki;
    private javax.swing.JRadioButton jRadioButton_perempuan;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_mahasiswa;
    private javax.swing.JTextField jTextField_cari;
    private javax.swing.JTextField jTextField_nama;
    private javax.swing.JTextField jTextField_nim;
    // End of variables declaration//GEN-END:variables
    
    public JButton getButtonTambah(){
        return jButton_tambah;
    }
    
    public JButton getButtonUpdate(){
        return jButton_update;
    }
    
    public JButton getButtonDelete(){
        return jButton_delete;
    }
    
    public JButton getButtonReset(){
        return jButton_reset;
    }
    
    public JButton getButtonCari(){
        return jButton_cari;
    }
    
    public String getNim(){
        return jTextField_nim.getText();
    }
    
    public void setNim(String s){
        jTextField_nim.setText(s);
    }
    
    public String getNama(){
        return jTextField_nama.getText();
    }
    
    public void setNama(String s){
        jTextField_nama.setText(s);
    }
    
    public String getJurusan(){
        return jComboBox1_Jurusan.getSelectedItem().toString();
    }
    
    public void setJurusan(String s){
        jComboBox1_Jurusan.setSelectedItem(s);
    }
    
    public char getJenisKelamin(){
        if (jRadioButton_laki.isSelected()) {
            return 'L';
        } else {
            return 'P';
        }
    }
    
    public void setJenisKelamin(char s){
        if (s == 'L') {
            jRadioButton_laki.setSelected(true);
            jRadioButton_perempuan.setSelected(false);
        } else {
            jRadioButton_laki.setSelected(false);
            jRadioButton_perempuan.setSelected(true);
        }
    }
    
    public String getCari(){
        return jTextField_cari.getText();
    }
    
    public void setCari(String s){
        jTextField_cari.setText(s);
    }
    
    public JTable getTableMahasiswa() {
        return jTable_mahasiswa;
    }
    
    public void setTableMahasiswa(DefaultTableModel dtm) {
        jTable_mahasiswa.setModel(dtm);
    }
    
    public int getSelectedMahasiswa() {
        return jTable_mahasiswa.getSelectedRow();
    }
    
    public void reset() {
        setNim("");
        setNama("");
        setCari("");
        setJenisKelamin('L');
        jComboBox1_Jurusan.setSelectedIndex(0);
    }
    
       public void addActionListener(ActionListener x){
//        btnCari.addActionListener(x);
//        btnHapus.addActionListener(x);
//        btnReset.addActionListener(x);
//        btnTambah.addActionListener(x);
//        btnUbah.addActionListener(x);
}
}

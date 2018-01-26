/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nabil.form;

import com.nabil.database.KonekDatabase;
import java.util.UUID;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.text.DocumentFilter;
import com.sun.glass.events.KeyEvent;
import javax.swing.JTextField;
import javax.swing.UIManager;
import de.javasoft.plaf.synthetica.SyntheticaBlackEyeLookAndFeel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.PlainDocument;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.Timer;
import javax.swing.table.TableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;
import com.nabil.utilities.Utilities;
import com.nabil.utilities.Utilities.toolTipTextTable;
import java.io.InputStream;
import javax.swing.ImageIcon;

/**
 *
 * @author Nabil Fawwaz Elqayyim | mail@nabilfawwaz.com | www.nabilfawwaz.com
 */
public final class Main extends javax.swing.JFrame {

    Statement st; //Statement dijadikan variabel
    ResultSet rs; //Resultset dijadikan variabel
    KonekDatabase koneksi; //KonekDatabase.java dijadikan variabel
    PreparedStatement pst; //PreparedStatement dijadikan variabel
    Utilities utilities;

    public Main() {
        initComponents();
        koneksi = new KonekDatabase();
        utilities = new Utilities();
        utilities.welcome();
        textArea_Alamat.setLineWrap(true);
        textArea_Alamat.setWrapStyleWord(true);
        status2.setText(koneksi.labal.getText());
        setTanggal();//Menampilkan Tanggal ketika dijalankan pertama kali        
        setJam();//Menampilkan Jam ketika dijalankan pertama kali   
        makeDigitsOnlySpinnerUsingDocumentFilter(); //Spinner Angsuran hanya numerik
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/com/nabil/images/logo.png")));//Load Icon jFrame        
        setLocationRelativeTo(null);//Menampilkan JFrame di tengah layar ketika dijalankan pertama kali

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ButtonGroup = new javax.swing.ButtonGroup();
        MainPanel = new javax.swing.JPanel();
        MemberPanel = new javax.swing.JPanel();
        textField_Pekerjaan = new javax.swing.JTextField();
        LKeterangan = new javax.swing.JLabel();
        textField_Keterangan = new javax.swing.JTextField();
        textField_Tanggal_Registrasi = new javax.swing.JTextField();
        LTanggal_Registrasi = new javax.swing.JLabel();
        LID_Anggota = new javax.swing.JLabel();
        textField_ID_Anggota = new javax.swing.JTextField();
        button_Hasilkan_ID = new javax.swing.JButton();
        Nama_Lengkap = new javax.swing.JLabel();
        textField_Nama_Lengkap = new javax.swing.JTextField();
        Alamat = new javax.swing.JLabel();
        Pekerjaan = new javax.swing.JLabel();
        Karakter = new javax.swing.JLabel();
        LTanggal_Lahir = new javax.swing.JLabel();
        textField_Tanggal_Lahir = new com.toedter.calendar.JDateChooser();
        radioButton_Pria = new javax.swing.JRadioButton();
        radioButton_Wanita = new javax.swing.JRadioButton();
        LJenis_Kelamin = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        comboBox_Kartu_Identitas = new javax.swing.JComboBox<>();
        textField_Nomor_Identitas = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea_Alamat = new javax.swing.JTextArea();
        Panel_Pinjam_Bayar_Hutang = new javax.swing.JPanel();
        textField_Bayar_Hutang = new javax.swing.JTextField();
        LBayar_Hutang = new javax.swing.JLabel();
        LBayar_Setiap_Bulan = new javax.swing.JLabel();
        textField_Bayar_Setiap_Bulan = new javax.swing.JTextField();
        textField_Total_Pinjaman = new javax.swing.JTextField();
        LAngsuran = new javax.swing.JLabel();
        textField_Jumlah_Pinjam = new javax.swing.JTextField();
        LTotal_Pinjam = new javax.swing.JLabel();
        L_Jumlah_Pinjam = new javax.swing.JLabel();
        LBunga5 = new javax.swing.JLabel();
        LBulan = new javax.swing.JLabel();
        button_Bayar_Hutang = new javax.swing.JButton();
        button_Simpan_Pinjam_Bayar_Hutang = new javax.swing.JButton();
        button_Hitung_Pinjam_Bayar_Hutang = new javax.swing.JButton();
        button_Bersih_Pinjam_Bayar_Hutang = new javax.swing.JButton();
        Spinner_Angsuran = new javax.swing.JSpinner();
        Panel_Simpan1 = new javax.swing.JPanel();
        L_Pinjam_Bayar_Hutang = new javax.swing.JLabel();
        Panel_Simpan_Setor_Uang = new javax.swing.JPanel();
        LJumlah_Simpan_Setor_Uang = new javax.swing.JLabel();
        LTotal_Simpanan = new javax.swing.JLabel();
        button_Hitung_Simpan_Setor_Uang = new javax.swing.JButton();
        Combobox10000 = new javax.swing.JCheckBox();
        button_Bersih_Simpan_Setor_Uang = new javax.swing.JButton();
        textField_Jumlah_Simpan_Setor_Uang = new javax.swing.JTextField();
        textField_Total_Simpanan = new javax.swing.JTextField();
        button_Simpan_Simpan_Setor_Uang = new javax.swing.JButton();
        Panel_Simpan = new javax.swing.JPanel();
        L_Simpan_Setor_Uang = new javax.swing.JLabel();
        TablePanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        table_KSP = new javax.swing.JTable();
        ControlPanel = new javax.swing.JPanel();
        button_Baru = new javax.swing.JButton();
        button_Perbarui = new javax.swing.JButton();
        button_Tentang = new javax.swing.JButton();
        button_Laporan = new javax.swing.JButton();
        button_Cetak = new javax.swing.JButton();
        button_Hapus = new javax.swing.JButton();
        button_Batal = new javax.swing.JButton();
        button_Keluar = new javax.swing.JButton();
        status1 = new javax.swing.JLabel();
        refresh = new javax.swing.JLabel();
        status2 = new javax.swing.JLabel();
        logokoperasi = new javax.swing.JLabel();
        LTgl = new javax.swing.JLabel();
        LJam = new javax.swing.JLabel();
        SearchPanel = new javax.swing.JPanel();
        textField_Cari = new javax.swing.JTextField();
        button_Cari = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Koperasi Simpan Pinjam");
        setBackground(new java.awt.Color(0, 0, 0));
        setIconImages(null);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        MainPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.darkGray, java.awt.Color.gray));

        MemberPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.darkGray, java.awt.Color.gray));

        textField_Pekerjaan.setToolTipText("Pekerjaan Anda");
        textField_Pekerjaan.setEnabled(false);
        textField_Pekerjaan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textField_PekerjaanKeyTyped(evt);
            }
        });

        LKeterangan.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        LKeterangan.setText("Keterangan");

        textField_Keterangan.setToolTipText("Keterangan Anda kenapa ingin simpan/meminjam uang di koperasi ini");
        textField_Keterangan.setEnabled(false);
        textField_Keterangan.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textField_KeteranganFocusGained(evt);
            }
        });
        textField_Keterangan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textField_KeteranganKeyTyped(evt);
            }
        });

        textField_Tanggal_Registrasi.setEditable(false);
        textField_Tanggal_Registrasi.setToolTipText("Tanggal Registrasi");
        textField_Tanggal_Registrasi.setEnabled(false);

        LTanggal_Registrasi.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        LTanggal_Registrasi.setText("Tanggal Registrasi");

        LID_Anggota.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        LID_Anggota.setText("ID Anggota");

        textField_ID_Anggota.setEditable(false);
        textField_ID_Anggota.setToolTipText("ID Anggota");
        textField_ID_Anggota.setEnabled(false);

        button_Hasilkan_ID.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/nabil/images/id.png"))); // NOI18N
        button_Hasilkan_ID.setText("Hasilkan ID");
        button_Hasilkan_ID.setToolTipText("Hasilkan ID");
        button_Hasilkan_ID.setEnabled(false);
        button_Hasilkan_ID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button_Hasilkan_IDMouseEntered(evt);
            }
        });
        button_Hasilkan_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_Hasilkan_IDActionPerformed(evt);
            }
        });

        Nama_Lengkap.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        Nama_Lengkap.setText("Nama Lengkap");

        textField_Nama_Lengkap.setToolTipText("Nama Lengkap Anda");
        textField_Nama_Lengkap.setEnabled(false);
        textField_Nama_Lengkap.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textField_Nama_LengkapKeyTyped(evt);
            }
        });

        Alamat.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        Alamat.setText("Alamat");

        Pekerjaan.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        Pekerjaan.setText("Pekerjaan");

        Karakter.setFont(new java.awt.Font("sansserif", 1, 9)); // NOI18N
        Karakter.setText("90 karakter tersesisa");

        LTanggal_Lahir.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        LTanggal_Lahir.setText("Tanggal Lahir");

        textField_Tanggal_Lahir.setToolTipText("Tanggal Lahir Anda");
        textField_Tanggal_Lahir.setDateFormatString("yyyy-MM-dd");
        textField_Tanggal_Lahir.setEnabled(false);

        ButtonGroup.add(radioButton_Pria);
        radioButton_Pria.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        radioButton_Pria.setText("Pria");
        radioButton_Pria.setToolTipText("Pria");
        radioButton_Pria.setEnabled(false);

        ButtonGroup.add(radioButton_Wanita);
        radioButton_Wanita.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        radioButton_Wanita.setText("Wanita");
        radioButton_Wanita.setToolTipText("Wanita");
        radioButton_Wanita.setEnabled(false);

        LJenis_Kelamin.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        LJenis_Kelamin.setText("Jenis Kelamin");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Kartu Identitas");

        comboBox_Kartu_Identitas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih", "KTP", "SIM", "PASSPORT", "KARTU KELUARGA" }));
        comboBox_Kartu_Identitas.setEnabled(false);

        textField_Nomor_Identitas.setEnabled(false);
        textField_Nomor_Identitas.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                textField_Nomor_IdentitasFocusLost(evt);
            }
        });

        textArea_Alamat.setColumns(20);
        textArea_Alamat.setRows(5);
        textArea_Alamat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textArea_AlamatKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(textArea_Alamat);

        javax.swing.GroupLayout MemberPanelLayout = new javax.swing.GroupLayout(MemberPanel);
        MemberPanel.setLayout(MemberPanelLayout);
        MemberPanelLayout.setHorizontalGroup(
            MemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MemberPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(MemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MemberPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(MemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MemberPanelLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(81, 81, 81)
                                .addComponent(comboBox_Kartu_Identitas, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textField_Nomor_Identitas, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(MemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(MemberPanelLayout.createSequentialGroup()
                                    .addComponent(LKeterangan)
                                    .addGap(102, 102, 102)
                                    .addComponent(textField_Keterangan))
                                .addComponent(LTanggal_Lahir, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, MemberPanelLayout.createSequentialGroup()
                                    .addGroup(MemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(LTanggal_Registrasi)
                                        .addComponent(Pekerjaan))
                                    .addGap(54, 54, 54)
                                    .addGroup(MemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(textField_Pekerjaan, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textField_Tanggal_Registrasi, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textField_Tanggal_Lahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(LJenis_Kelamin, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(MemberPanelLayout.createSequentialGroup()
                        .addGroup(MemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Alamat)
                            .addComponent(LID_Anggota)
                            .addComponent(Nama_Lengkap))
                        .addGap(82, 82, 82)
                        .addGroup(MemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textField_Nama_Lengkap)
                            .addGroup(MemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Karakter, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MemberPanelLayout.createSequentialGroup()
                                    .addComponent(textField_ID_Anggota, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(button_Hasilkan_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(MemberPanelLayout.createSequentialGroup()
                                .addComponent(radioButton_Pria)
                                .addGap(18, 18, 18)
                                .addComponent(radioButton_Wanita))
                            .addComponent(jScrollPane1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(37, 37, 37))
        );
        MemberPanelLayout.setVerticalGroup(
            MemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MemberPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textField_ID_Anggota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_Hasilkan_ID)
                    .addComponent(LID_Anggota))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(MemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(comboBox_Kartu_Identitas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textField_Nomor_Identitas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addGap(24, 24, 24)
                .addGroup(MemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nama_Lengkap)
                    .addComponent(textField_Nama_Lengkap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(MemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MemberPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Karakter))
                    .addComponent(Alamat, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioButton_Pria)
                    .addComponent(radioButton_Wanita)
                    .addComponent(LJenis_Kelamin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textField_Pekerjaan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pekerjaan))
                .addGap(15, 15, 15)
                .addGroup(MemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textField_Tanggal_Registrasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LTanggal_Registrasi))
                .addGap(18, 18, 18)
                .addGroup(MemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LTanggal_Lahir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textField_Tanggal_Lahir, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(MemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LKeterangan)
                    .addComponent(textField_Keterangan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Panel_Pinjam_Bayar_Hutang.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.darkGray, java.awt.Color.gray));
        Panel_Pinjam_Bayar_Hutang.setAlignmentX(2.0F);
        Panel_Pinjam_Bayar_Hutang.setAlignmentY(2.0F);

        textField_Bayar_Hutang.setToolTipText("Bayar hutang pinjaman");
        textField_Bayar_Hutang.setEnabled(false);
        textField_Bayar_Hutang.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textField_Bayar_HutangKeyTyped(evt);
            }
        });

        LBayar_Hutang.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        LBayar_Hutang.setText("Bayar Hutang");

        LBayar_Setiap_Bulan.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        LBayar_Setiap_Bulan.setText("Bayar Setiap Bulan");

        textField_Bayar_Setiap_Bulan.setEditable(false);
        textField_Bayar_Setiap_Bulan.setToolTipText("Bayar pinjaman setiap bulan");
        textField_Bayar_Setiap_Bulan.setEnabled(false);

        textField_Total_Pinjaman.setEditable(false);
        textField_Total_Pinjaman.setToolTipText("Total pinjaman");
        textField_Total_Pinjaman.setEnabled(false);
        textField_Total_Pinjaman.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textField_Total_PinjamanKeyTyped(evt);
            }
        });

        LAngsuran.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        LAngsuran.setText("Angsuran");

        textField_Jumlah_Pinjam.setToolTipText("Jumlah pinjaman");
        textField_Jumlah_Pinjam.setEnabled(false);
        textField_Jumlah_Pinjam.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textField_Jumlah_PinjamKeyTyped(evt);
            }
        });

        LTotal_Pinjam.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        LTotal_Pinjam.setText("Total Pinjaman");

        L_Jumlah_Pinjam.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        L_Jumlah_Pinjam.setText("Jumlah");

        LBunga5.setFont(new java.awt.Font("sansserif", 3, 9)); // NOI18N
        LBunga5.setText("Bunga 5%");

        LBulan.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        LBulan.setText("Bulan");

        button_Bayar_Hutang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/nabil/images/pay.png"))); // NOI18N
        button_Bayar_Hutang.setText("Bayar ");
        button_Bayar_Hutang.setEnabled(false);
        button_Bayar_Hutang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button_Bayar_HutangMouseEntered(evt);
            }
        });
        button_Bayar_Hutang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_Bayar_HutangActionPerformed(evt);
            }
        });

        button_Simpan_Pinjam_Bayar_Hutang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/nabil/images/save.png"))); // NOI18N
        button_Simpan_Pinjam_Bayar_Hutang.setText("Simpan");
        button_Simpan_Pinjam_Bayar_Hutang.setEnabled(false);
        button_Simpan_Pinjam_Bayar_Hutang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button_Simpan_Pinjam_Bayar_HutangMouseEntered(evt);
            }
        });
        button_Simpan_Pinjam_Bayar_Hutang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_Simpan_Pinjam_Bayar_HutangActionPerformed(evt);
            }
        });

        button_Hitung_Pinjam_Bayar_Hutang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/nabil/images/calculate.png"))); // NOI18N
        button_Hitung_Pinjam_Bayar_Hutang.setText("Hitung");
        button_Hitung_Pinjam_Bayar_Hutang.setEnabled(false);
        button_Hitung_Pinjam_Bayar_Hutang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button_Hitung_Pinjam_Bayar_HutangMouseEntered(evt);
            }
        });
        button_Hitung_Pinjam_Bayar_Hutang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_Hitung_Pinjam_Bayar_HutangActionPerformed(evt);
            }
        });

        button_Bersih_Pinjam_Bayar_Hutang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/nabil/images/clear.png"))); // NOI18N
        button_Bersih_Pinjam_Bayar_Hutang.setText("Bersih");
        button_Bersih_Pinjam_Bayar_Hutang.setEnabled(false);
        button_Bersih_Pinjam_Bayar_Hutang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button_Bersih_Pinjam_Bayar_HutangMouseEntered(evt);
            }
        });
        button_Bersih_Pinjam_Bayar_Hutang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_Bersih_Pinjam_Bayar_HutangActionPerformed(evt);
            }
        });

        Spinner_Angsuran.setModel(new javax.swing.SpinnerNumberModel(0, 0, 24, 1));
        Spinner_Angsuran.setToolTipText("Angsuran setiap bulan");
        Spinner_Angsuran.setEnabled(false);

        Panel_Simpan1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.darkGray, java.awt.Color.gray));

        L_Pinjam_Bayar_Hutang.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        L_Pinjam_Bayar_Hutang.setText("Pinjam/Bayar Hutang");

        javax.swing.GroupLayout Panel_Simpan1Layout = new javax.swing.GroupLayout(Panel_Simpan1);
        Panel_Simpan1.setLayout(Panel_Simpan1Layout);
        Panel_Simpan1Layout.setHorizontalGroup(
            Panel_Simpan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_Simpan1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(L_Pinjam_Bayar_Hutang)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Panel_Simpan1Layout.setVerticalGroup(
            Panel_Simpan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_Simpan1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(L_Pinjam_Bayar_Hutang)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout Panel_Pinjam_Bayar_HutangLayout = new javax.swing.GroupLayout(Panel_Pinjam_Bayar_Hutang);
        Panel_Pinjam_Bayar_Hutang.setLayout(Panel_Pinjam_Bayar_HutangLayout);
        Panel_Pinjam_Bayar_HutangLayout.setHorizontalGroup(
            Panel_Pinjam_Bayar_HutangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_Pinjam_Bayar_HutangLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(Panel_Pinjam_Bayar_HutangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LBayar_Hutang)
                    .addComponent(L_Jumlah_Pinjam)
                    .addComponent(LAngsuran)
                    .addComponent(LTotal_Pinjam)
                    .addComponent(LBayar_Setiap_Bulan))
                .addGap(27, 27, 27)
                .addGroup(Panel_Pinjam_Bayar_HutangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(textField_Total_Pinjaman, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                    .addComponent(textField_Bayar_Setiap_Bulan, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textField_Bayar_Hutang, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textField_Jumlah_Pinjam, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LBunga5, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Panel_Pinjam_Bayar_HutangLayout.createSequentialGroup()
                        .addComponent(Spinner_Angsuran, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LBulan)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Panel_Pinjam_Bayar_HutangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(button_Hitung_Pinjam_Bayar_Hutang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button_Bersih_Pinjam_Bayar_Hutang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button_Simpan_Pinjam_Bayar_Hutang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button_Bayar_Hutang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
            .addGroup(Panel_Pinjam_Bayar_HutangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panel_Simpan1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Panel_Pinjam_Bayar_HutangLayout.setVerticalGroup(
            Panel_Pinjam_Bayar_HutangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_Pinjam_Bayar_HutangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panel_Simpan1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(Panel_Pinjam_Bayar_HutangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Panel_Pinjam_Bayar_HutangLayout.createSequentialGroup()
                        .addGroup(Panel_Pinjam_Bayar_HutangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(L_Jumlah_Pinjam)
                            .addComponent(textField_Jumlah_Pinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LBunga5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Panel_Pinjam_Bayar_HutangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(Panel_Pinjam_Bayar_HutangLayout.createSequentialGroup()
                                .addGroup(Panel_Pinjam_Bayar_HutangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Spinner_Angsuran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LBulan)
                                    .addComponent(LAngsuran))
                                .addGap(18, 18, 18)
                                .addGroup(Panel_Pinjam_Bayar_HutangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(LTotal_Pinjam)
                                    .addComponent(textField_Total_Pinjaman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(textField_Bayar_Setiap_Bulan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(LBayar_Setiap_Bulan)))
                    .addGroup(Panel_Pinjam_Bayar_HutangLayout.createSequentialGroup()
                        .addComponent(button_Bersih_Pinjam_Bayar_Hutang)
                        .addGap(18, 18, 18)
                        .addComponent(button_Hitung_Pinjam_Bayar_Hutang)
                        .addGap(18, 18, 18)
                        .addComponent(button_Simpan_Pinjam_Bayar_Hutang)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Panel_Pinjam_Bayar_HutangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textField_Bayar_Hutang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LBayar_Hutang)
                    .addComponent(button_Bayar_Hutang))
                .addContainerGap())
        );

        Panel_Simpan_Setor_Uang.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.darkGray, java.awt.Color.gray));

        LJumlah_Simpan_Setor_Uang.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        LJumlah_Simpan_Setor_Uang.setText("Jumlah");

        LTotal_Simpanan.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        LTotal_Simpanan.setText("Total Simpanan");

        button_Hitung_Simpan_Setor_Uang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/nabil/images/calculate.png"))); // NOI18N
        button_Hitung_Simpan_Setor_Uang.setText("Hitung");
        button_Hitung_Simpan_Setor_Uang.setEnabled(false);
        button_Hitung_Simpan_Setor_Uang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button_Hitung_Simpan_Setor_UangMouseEntered(evt);
            }
        });
        button_Hitung_Simpan_Setor_Uang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_Hitung_Simpan_Setor_UangActionPerformed(evt);
            }
        });

        Combobox10000.setFont(new java.awt.Font("sansserif", 3, 9)); // NOI18N
        Combobox10000.setText("Biaya pertama registrasi Rp10.000");
        Combobox10000.setEnabled(false);

        button_Bersih_Simpan_Setor_Uang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/nabil/images/clear.png"))); // NOI18N
        button_Bersih_Simpan_Setor_Uang.setText("Bersih");
        button_Bersih_Simpan_Setor_Uang.setEnabled(false);
        button_Bersih_Simpan_Setor_Uang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button_Bersih_Simpan_Setor_UangMouseEntered(evt);
            }
        });
        button_Bersih_Simpan_Setor_Uang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_Bersih_Simpan_Setor_UangActionPerformed(evt);
            }
        });

        textField_Jumlah_Simpan_Setor_Uang.setToolTipText("Jumlah yang ingin disimpan");
        textField_Jumlah_Simpan_Setor_Uang.setEnabled(false);
        textField_Jumlah_Simpan_Setor_Uang.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textField_Jumlah_Simpan_Setor_UangKeyTyped(evt);
            }
        });

        textField_Total_Simpanan.setEditable(false);
        textField_Total_Simpanan.setToolTipText("Total uang yang akan disimpan");
        textField_Total_Simpanan.setEnabled(false);

        button_Simpan_Simpan_Setor_Uang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/nabil/images/save.png"))); // NOI18N
        button_Simpan_Simpan_Setor_Uang.setText("Simpan");
        button_Simpan_Simpan_Setor_Uang.setEnabled(false);
        button_Simpan_Simpan_Setor_Uang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button_Simpan_Simpan_Setor_UangMouseEntered(evt);
            }
        });
        button_Simpan_Simpan_Setor_Uang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_Simpan_Simpan_Setor_UangActionPerformed(evt);
            }
        });

        Panel_Simpan.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.darkGray, java.awt.Color.gray));

        L_Simpan_Setor_Uang.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        L_Simpan_Setor_Uang.setText("Simpan/Setor Uang");

        javax.swing.GroupLayout Panel_SimpanLayout = new javax.swing.GroupLayout(Panel_Simpan);
        Panel_Simpan.setLayout(Panel_SimpanLayout);
        Panel_SimpanLayout.setHorizontalGroup(
            Panel_SimpanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_SimpanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(L_Simpan_Setor_Uang)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        Panel_SimpanLayout.setVerticalGroup(
            Panel_SimpanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_SimpanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(L_Simpan_Setor_Uang)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout Panel_Simpan_Setor_UangLayout = new javax.swing.GroupLayout(Panel_Simpan_Setor_Uang);
        Panel_Simpan_Setor_Uang.setLayout(Panel_Simpan_Setor_UangLayout);
        Panel_Simpan_Setor_UangLayout.setHorizontalGroup(
            Panel_Simpan_Setor_UangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_Simpan_Setor_UangLayout.createSequentialGroup()
                .addGroup(Panel_Simpan_Setor_UangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_Simpan_Setor_UangLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(Panel_Simpan_Setor_UangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LJumlah_Simpan_Setor_Uang)
                            .addComponent(LTotal_Simpanan))
                        .addGap(51, 51, 51)
                        .addGroup(Panel_Simpan_Setor_UangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Combobox10000)
                            .addComponent(textField_Total_Simpanan, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textField_Jumlah_Simpan_Setor_Uang, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Panel_Simpan_Setor_UangLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Panel_Simpan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(Panel_Simpan_Setor_UangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(button_Simpan_Simpan_Setor_Uang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button_Hitung_Simpan_Setor_Uang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button_Bersih_Simpan_Setor_Uang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );
        Panel_Simpan_Setor_UangLayout.setVerticalGroup(
            Panel_Simpan_Setor_UangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_Simpan_Setor_UangLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(Panel_Simpan_Setor_UangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Panel_Simpan_Setor_UangLayout.createSequentialGroup()
                        .addComponent(button_Bersih_Simpan_Setor_Uang)
                        .addGap(12, 12, 12)
                        .addComponent(button_Hitung_Simpan_Setor_Uang)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(button_Simpan_Simpan_Setor_Uang))
                    .addGroup(Panel_Simpan_Setor_UangLayout.createSequentialGroup()
                        .addComponent(Panel_Simpan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(Panel_Simpan_Setor_UangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LJumlah_Simpan_Setor_Uang)
                            .addComponent(textField_Jumlah_Simpan_Setor_Uang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addComponent(Combobox10000)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(Panel_Simpan_Setor_UangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LTotal_Simpanan)
                            .addComponent(textField_Total_Simpanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TablePanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.darkGray, java.awt.Color.gray));
        TablePanel.setToolTipText("Tabel Data Anggota");

        table_KSP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "No", "Member ID", "Name", "Address", "Gender", "Occupation", "RegistrationDate", "BirthDate", "Explanation", "Balance", "Installment", "Total", "PayEveryMonth"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table_KSP.setToolTipText("");
        table_KSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                table_KSPMouseEntered(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                table_KSPMouseReleased(evt);
            }
        });
        jScrollPane3.setViewportView(table_KSP);

        javax.swing.GroupLayout TablePanelLayout = new javax.swing.GroupLayout(TablePanel);
        TablePanel.setLayout(TablePanelLayout);
        TablePanelLayout.setHorizontalGroup(
            TablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TablePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        TablePanelLayout.setVerticalGroup(
            TablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TablePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                .addContainerGap())
        );

        ControlPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.darkGray, java.awt.Color.gray));

        button_Baru.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/nabil/images/new.png"))); // NOI18N
        button_Baru.setText(" Baru     ");
        button_Baru.setToolTipText("Buat baru data");
        button_Baru.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button_BaruMouseEntered(evt);
            }
        });
        button_Baru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_BaruActionPerformed(evt);
            }
        });

        button_Perbarui.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/nabil/images/update.png"))); // NOI18N
        button_Perbarui.setText("Perbarui");
        button_Perbarui.setToolTipText("Perbarui data");
        button_Perbarui.setEnabled(false);
        button_Perbarui.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button_PerbaruiMouseEntered(evt);
            }
        });
        button_Perbarui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_PerbaruiActionPerformed(evt);
            }
        });

        button_Tentang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/nabil/images/about.png"))); // NOI18N
        button_Tentang.setText("Tentang");
        button_Tentang.setToolTipText("Tentang pembuat");
        button_Tentang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button_TentangMouseEntered(evt);
            }
        });
        button_Tentang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_TentangActionPerformed(evt);
            }
        });

        button_Laporan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/nabil/images/transaction.png"))); // NOI18N
        button_Laporan.setText("Laporan");
        button_Laporan.setToolTipText("Recapitulation All Transaction");
        button_Laporan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button_LaporanMouseEntered(evt);
            }
        });
        button_Laporan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_LaporanActionPerformed(evt);
            }
        });

        button_Cetak.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/nabil/images/printer.png"))); // NOI18N
        button_Cetak.setText("Cetak    ");
        button_Cetak.setToolTipText("Cetak data");
        button_Cetak.setEnabled(false);
        button_Cetak.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button_CetakMouseEntered(evt);
            }
        });
        button_Cetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_CetakActionPerformed(evt);
            }
        });

        button_Hapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/nabil/images/delete.png"))); // NOI18N
        button_Hapus.setText("Hapus   ");
        button_Hapus.setToolTipText("Hapus data");
        button_Hapus.setEnabled(false);
        button_Hapus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button_HapusMouseEntered(evt);
            }
        });
        button_Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_HapusActionPerformed(evt);
            }
        });

        button_Batal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/nabil/images/cancel.png"))); // NOI18N
        button_Batal.setText(" Batal    ");
        button_Batal.setToolTipText("Membatalkan proses");
        button_Batal.setEnabled(false);
        button_Batal.setFocusable(false);
        button_Batal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_BatalMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button_BatalMouseEntered(evt);
            }
        });
        button_Batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_BatalActionPerformed(evt);
            }
        });

        button_Keluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/nabil/images/logout.png"))); // NOI18N
        button_Keluar.setText("Keluar   ");
        button_Keluar.setToolTipText("Keluar Aplikasi");
        button_Keluar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button_KeluarMouseEntered(evt);
            }
        });
        button_Keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_KeluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ControlPanelLayout = new javax.swing.GroupLayout(ControlPanel);
        ControlPanel.setLayout(ControlPanelLayout);
        ControlPanelLayout.setHorizontalGroup(
            ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ControlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(ControlPanelLayout.createSequentialGroup()
                            .addComponent(button_Baru, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(button_Hapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(ControlPanelLayout.createSequentialGroup()
                            .addComponent(button_Batal, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(button_Perbarui, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(ControlPanelLayout.createSequentialGroup()
                            .addComponent(button_Tentang, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(button_Keluar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(1, 1, 1)))
                    .addGroup(ControlPanelLayout.createSequentialGroup()
                        .addComponent(button_Laporan, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button_Cetak, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        ControlPanelLayout.setVerticalGroup(
            ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ControlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_Hapus)
                    .addComponent(button_Baru))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_Perbarui)
                    .addComponent(button_Batal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_Laporan)
                    .addComponent(button_Cetak))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(button_Tentang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button_Keluar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        button_Baru.getAccessibleContext().setAccessibleDescription("Buat data baru");

        status1.setText("Status:");

        refresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/nabil/images/refresh.png"))); // NOI18N
        refresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refreshMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                refreshMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                refreshMouseExited(evt);
            }
        });

        status2.setText("Status2");
        status2.setToolTipText("");
        status2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                status2MouseEntered(evt);
            }
        });

        logokoperasi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/nabil/images/logo.png"))); // NOI18N
        logokoperasi.setToolTipText("Koperasi Simpan Pinjam Prima Artha Sentosa");

        LTgl.setText("Tanggal");

        LJam.setText("Jam");

        SearchPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.darkGray, java.awt.Color.gray));
        SearchPanel.setLayout(null);

        textField_Cari.setForeground(new java.awt.Color(153, 153, 153));
        textField_Cari.setText("Cari ID");
        textField_Cari.setToolTipText("Cari ID Anggota");
        textField_Cari.setPreferredSize(new java.awt.Dimension(20, 31));
        textField_Cari.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textField_CariFocusGained(evt);
            }
        });
        textField_Cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField_CariActionPerformed(evt);
            }
        });
        SearchPanel.add(textField_Cari);
        textField_Cari.setBounds(8, 10, 190, 27);
        textField_Cari.getAccessibleContext().setAccessibleName("Tes");

        button_Cari.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/nabil/images/search.png"))); // NOI18N
        button_Cari.setToolTipText("Cari ID");
        button_Cari.setMaximumSize(new java.awt.Dimension(45, 35));
        button_Cari.setMinimumSize(new java.awt.Dimension(45, 28));
        button_Cari.setPreferredSize(new java.awt.Dimension(45, 27));
        button_Cari.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button_CariMouseEntered(evt);
            }
        });
        button_Cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_CariActionPerformed(evt);
            }
        });
        SearchPanel.add(button_Cari);
        button_Cari.setBounds(195, 7, 59, 34);

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(TablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addContainerGap(50, Short.MAX_VALUE)
                                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(MainPanelLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(status1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(status2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(refresh))
                                    .addGroup(MainPanelLayout.createSequentialGroup()
                                        .addComponent(LJam, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(LTgl, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(logokoperasi))
                                .addGap(48, 48, 48))
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ControlPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(SearchPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MemberPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Panel_Pinjam_Bayar_Hutang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Panel_Simpan_Setor_Uang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addComponent(Panel_Simpan_Setor_Uang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Panel_Pinjam_Bayar_Hutang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addComponent(ControlPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LTgl)
                            .addComponent(LJam))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(status1)
                                .addComponent(status2))
                            .addComponent(refresh))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(logokoperasi, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SearchPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(MemberPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        LTgl.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setJam() {
        //Coding Menampilkan Jam
        new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date jamNow = new Date();
                SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss a");
                LJam.setFont(new Font("sanserif", Font.BOLD, 12));
                LJam.setText(s.format(jamNow));
            }
        }).start();
    }

    private void setTanggal() {
        //Coding Menampilkan Tanggal
        Date tanggalNow = new Date();
        SimpleDateFormat kal = new SimpleDateFormat("dd/MM/yyyy");
        LTgl.setText(kal.format(tanggalNow));
        LTgl.setFont(new Font("sanserif", Font.BOLD, 12));
    }

    public JSpinner makeDigitsOnlySpinnerUsingDocumentFilter() {
        //START - JSpinner hanya menerima numerik
        JSpinner.NumberEditor jsEditor = (JSpinner.NumberEditor) Spinner_Angsuran.getEditor();
        final Document jsDoc = jsEditor.getTextField().getDocument();
        if (jsDoc instanceof PlainDocument) {
            AbstractDocument doc = new PlainDocument() {
                private static final long serialVersionUID = 1L;

                @Override
                public void setDocumentFilter(DocumentFilter filter) {
                    if (filter instanceof MyDocumentFilter) {
                        super.setDocumentFilter(filter);
                    }
                }
            };
            doc.setDocumentFilter(new MyDocumentFilter());
            jsEditor.getTextField().setDocument(doc);
        }
        return Spinner_Angsuran;
    }

    public static class MyDocumentFilter extends DocumentFilter {

        @Override
        public void insertString(DocumentFilter.FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
            if (stringContainsOnlyDigits(string)) {
                super.insertString(fb, offset, string, attr);
            }
        }

        @Override
        public void remove(DocumentFilter.FilterBypass fb, int offset, int length) throws BadLocationException {
            super.remove(fb, offset, length);
        }

        @Override
        public void replace(DocumentFilter.FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
            if (stringContainsOnlyDigits(text)) {
                super.replace(fb, offset, length, text, attrs);
            }
        }

        private boolean stringContainsOnlyDigits(String text) {
            for (int i = 0; i < text.length(); i++) {
                if (!Character.isDigit(text.charAt(i))) {
                    return false;
                }
            }
            return true;
        }
    } //STOP - JSpinner hanya menerima numerik

    private void semuadata() {
        //Menampilkan record dari table ksp kedalam jTable
        DefaultTableModel data = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        table_KSP.getRowCount();
        table_KSP.setModel(data);
        data.addColumn("ID"); //Menampilkan judul dari kolom
        data.addColumn("Kartu Identitas");
        data.addColumn("Nama Lengkap");
        data.addColumn("Alamat");
        data.addColumn("Jenis Kelamin");
        data.addColumn("Pekerjaan");
        data.addColumn("Tanggal Registrasi");
        data.addColumn("Tanggal Lahir");
        data.addColumn("Kangeterangan");
        data.addColumn("Simpanan");
        data.addColumn("Angsuran");
        data.addColumn("Total Pinjaman");
        data.addColumn("Bayar Setiap Bulan");

        TableColumn column;
        table_KSP.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        column = table_KSP.getColumnModel().getColumn(0); //Menyesuaikan lebar kolom
        column.setPreferredWidth(50);
        column = table_KSP.getColumnModel().getColumn(1); //Menyesuaikan lebar kolom
        column.setPreferredWidth(110);
        column = table_KSP.getColumnModel().getColumn(2);
        column.setPreferredWidth(120);
        column = table_KSP.getColumnModel().getColumn(3);
        column.setPreferredWidth(90);
        column = table_KSP.getColumnModel().getColumn(4);
        column.setPreferredWidth(97);
        column = table_KSP.getColumnModel().getColumn(5);
        column.setPreferredWidth(80);
        column = table_KSP.getColumnModel().getColumn(6);
        column.setPreferredWidth(126);
        column = table_KSP.getColumnModel().getColumn(7);
        column.setPreferredWidth(98);
        column = table_KSP.getColumnModel().getColumn(8);
        column.setPreferredWidth(100);
        column = table_KSP.getColumnModel().getColumn(9);
        column.setPreferredWidth(78);
        column = table_KSP.getColumnModel().getColumn(10);
        column.setPreferredWidth(74);
        column = table_KSP.getColumnModel().getColumn(11);
        column.setPreferredWidth(105);
        column = table_KSP.getColumnModel().getColumn(12);
        column.setPreferredWidth(126);

        String sql = "SELECT * FROM ksp";
        try {
            st = koneksi.con.createStatement();
            rs = st.executeQuery(sql);

            while (rs.next()) {
                String kolom1 = rs.getString(2); //Kenapa 2?, karena mengambil data dari column ID
                String kolom2 = rs.getString(3); //Yang ada di column ke 2, check di database
                String kolom3 = rs.getString(4); //Fungsi column No, untuk mengurutkan saat data baru masuk
                String kolom4 = rs.getString(5); //rs.getString(5) bisa diubah ke rs.getString(JK)
                String kolom5 = rs.getString(6); //Dan seterusnya
                String kolom6 = rs.getString(7);
                String kolom7 = rs.getString(8);
                String kolom8 = rs.getString(9);
                String kolom9 = rs.getString(10);
                String kolom10 = rs.getString(11);
                String kolom11 = rs.getString(12);
                String kolom12 = rs.getString(13);
                String kolom13 = rs.getString(14);
                String kolom[] = {kolom1,
                    kolom2,
                    kolom3,
                    kolom4,
                    kolom5,
                    kolom6,
                    kolom7,
                    kolom8,
                    kolom9,
                    kolom10,
                    kolom11,
                    kolom12,
                    kolom13};
                data.addRow(kolom);
            }
        } catch (SQLException e) {
            //Jika Status "Terputus" dari database, akan menampilkan font color merah
            status1.setFont(new Font("sanserif", Font.BOLD, 11));
            status2.setFont(new Font("sanserif", Font.BOLD, 14));
            status2.setForeground(Color.RED);
            status2.setText(koneksi.labal.getText());
        }
    }


    private void button_BaruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_BaruActionPerformed
        //Tombol Baru        
        utilities.clickGo();
        Date currentDate = new Date();
        String currentdate = new SimpleDateFormat("yyyy-MM-dd").format(currentDate);
        textField_Tanggal_Registrasi.setText(currentdate);
        button_Hasilkan_ID.setEnabled(true);
        textField_ID_Anggota.setEnabled(true);
        textField_Nama_Lengkap.setEnabled(true);
        comboBox_Kartu_Identitas.setEnabled(true);
        textField_Nomor_Identitas.setEnabled(true);
        textArea_Alamat.setEnabled(true);
        radioButton_Pria.setEnabled(true);
        radioButton_Wanita.setEnabled(true);
        textField_Pekerjaan.setEnabled(true);
        textField_Tanggal_Registrasi.setEnabled(true);
        textField_Tanggal_Lahir.setEnabled(true);
        textField_Tanggal_Lahir.setDate(null);
        textField_Keterangan.setEnabled(true);
        button_Batal.setEnabled(true);

        button_Baru.setEnabled(false);
        button_Perbarui.setEnabled(false);
        textField_Cari.setText("Cari ID");
        button_Hasilkan_ID.requestFocusInWindow();
    }//GEN-LAST:event_button_BaruActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        status1.setFont(new Font("sanserif", Font.BOLD, 12));
        status2.setFont(new Font("sanserif", Font.BOLD, 14)); //Set Font status
        if (koneksi.labal.getText().equals("Terhubung")) {
            status2.setForeground(Color.GREEN);
            status2.setText(koneksi.labal.getText());
        } else {
            status2.setForeground(Color.RED);
            status2.setText(koneksi.labal.getText());
        }
        semuadata(); //Menampilkan Semua data dari table  ke jTable saat program dijalankan pertama kali           
        table_KSP.requestFocusInWindow();
    }//GEN-LAST:event_formWindowOpened

    private void button_Hasilkan_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_Hasilkan_IDActionPerformed
        //Tombol Hasilkan ID
        utilities.clickGo();
        JPanel panel = new JPanel(); //Membuat Panel
        JRadioButton smp = new JRadioButton(); //Membuat radio button simpan
        JRadioButton pnj = new JRadioButton(); //Membuat radio button pinjam
        ButtonGroup group = new ButtonGroup();

        smp.setText("Simpan");
        pnj.setText("Pinjam");
        group.add(smp);//[start] Menggabungkan radio button simpan dan pinjam
        group.add(pnj);//[end] Menggabungkan radio button simpan dan pinjam
        panel.add(smp);//Munculin radio button simpan ke panel
        panel.add(pnj);//Munculin radio button pinjam ke panel

        int OK = JOptionPane.showOptionDialog(null, panel,
                "Pilih Simpan Uang atau Pinjam Uang?", JOptionPane.YES_NO_OPTION,
                JOptionPane.PLAIN_MESSAGE, null, null, null);
        if (OK == JOptionPane.YES_OPTION) {
            if (smp.isSelected()) {//Jika radio button simpan dipilih, maka....
                utilities.clickGo();
                String uniqueIDS = UUID.randomUUID().toString(); //Generate ID
                textField_ID_Anggota.setText(uniqueIDS);
                String ambilkataS = uniqueIDS.substring(0, 4);
                textField_ID_Anggota.setText("S" + ambilkataS);
                textField_Total_Simpanan.setEnabled(true);
                button_Hitung_Simpan_Setor_Uang.setEnabled(true);
                button_Simpan_Simpan_Setor_Uang.setEnabled(true);
                Combobox10000.setEnabled(true);
                button_Bersih_Simpan_Setor_Uang.setEnabled(true);
                textField_Jumlah_Simpan_Setor_Uang.setEnabled(true);

                textField_Jumlah_Pinjam.setEnabled(false);
                Spinner_Angsuran.setEnabled(false);
                textField_Total_Pinjaman.setEnabled(false);
                textField_Bayar_Setiap_Bulan.setEnabled(false);
                textField_Bayar_Hutang.setEnabled(false);
                button_Bayar_Hutang.setEnabled(false);
                button_Simpan_Pinjam_Bayar_Hutang.setEnabled(false);
                button_Hitung_Pinjam_Bayar_Hutang.setEnabled(false);
                button_Bersih_Pinjam_Bayar_Hutang.setEnabled(false);
                textField_Total_Pinjaman.setText("");
                textField_Bayar_Setiap_Bulan.setText("");
            } else if (pnj.isSelected()) {//selain itu, jika radio button dipilih, maka...
                utilities.clickGo();
                String uniqueIDP = UUID.randomUUID().toString(); //Generate ID
                textField_ID_Anggota.setText(uniqueIDP);
                String ambilkataP = uniqueIDP.substring(0, 4);
                textField_ID_Anggota.setText("P" + ambilkataP);
                textField_Jumlah_Pinjam.setEnabled(true);
                textField_Total_Pinjaman.setEnabled(true);
                textField_Bayar_Setiap_Bulan.setEnabled(true);
                button_Hitung_Simpan_Setor_Uang.setEnabled(true);
                button_Hitung_Pinjam_Bayar_Hutang.setEnabled(true);
                button_Bersih_Pinjam_Bayar_Hutang.setEnabled(true);
                Spinner_Angsuran.setEnabled(true);
                button_Simpan_Pinjam_Bayar_Hutang.setEnabled(true);
                Spinner_Angsuran.setVisible(true);
                Spinner_Angsuran.setValue(1);

                Combobox10000.setEnabled(false);
                textField_Total_Simpanan.setEnabled(false);
                button_Hitung_Simpan_Setor_Uang.setEnabled(false);
                button_Simpan_Simpan_Setor_Uang.setEnabled(false);
                button_Bersih_Simpan_Setor_Uang.setEnabled(false);

                textField_Total_Simpanan.setText("");
                textField_Jumlah_Simpan_Setor_Uang.setText("");
            } else if (textField_ID_Anggota.getText().isEmpty()) {
                utilities.clickWarning();
                JOptionPane.showMessageDialog(null, "Harus pilih Simpan atau Pinjam",
                        "WARNING", JOptionPane.WARNING_MESSAGE);
                utilities.clickGo();
            }
        } else {
            utilities.clickCancel();
        }
    }//GEN-LAST:event_button_Hasilkan_IDActionPerformed

    private void button_Hitung_Simpan_Setor_UangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_Hitung_Simpan_Setor_UangActionPerformed
        //Tombol Hitung pada Panel Simpan/Setor Uang        
        if (textField_Total_Simpanan.getText().isEmpty()) {
            textField_Total_Simpanan.setText("0");
        }

        if (textField_Jumlah_Simpan_Setor_Uang.getText().isEmpty()) {
            utilities.clickWarning();
            String messageFieldEmptySaveMoney = "<html><div width='120px' align='center'>Field Jumlah tidak boleh kosong!</div></html>";
            JOptionPane.showMessageDialog(null, messageFieldEmptySaveMoney,
                    "WARNING", JOptionPane.WARNING_MESSAGE);
        } else if (Combobox10000.isSelected() == true) {
            int a = Integer.parseInt(textField_Jumlah_Simpan_Setor_Uang.getText());
            int b = Integer.parseInt(textField_Total_Simpanan.getText());
            int c = 10000;
            int d = a + b - c;
            textField_Total_Simpanan.setText(String.valueOf(d));
        } else {
            int a = Integer.parseInt(textField_Jumlah_Simpan_Setor_Uang.getText());
            int b = Integer.parseInt(textField_Total_Simpanan.getText());
            int d = a + b;
            textField_Total_Simpanan.setText(String.valueOf(d));
        }
        utilities.clickGo();
    }//GEN-LAST:event_button_Hitung_Simpan_Setor_UangActionPerformed

    private void button_Simpan_Simpan_Setor_UangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_Simpan_Simpan_Setor_UangActionPerformed
        //Simpan data kedalam database pada semua field di panel Simpan/Setor Uang       
        utilities.clickGo();
        table_KSP.requestFocusInWindow();
        Spinner_Angsuran.setValue(0);
        textField_Total_Pinjaman.setText("0");
        textField_Bayar_Setiap_Bulan.setText("0");
        textField_Jumlah_Pinjam.setText("0");
        textField_Bayar_Hutang.setText("0");

        String getID = textField_ID_Anggota.getText();
        String getKartuIdentitas = "";
        String getNomorIdentitas = textField_Nomor_Identitas.getText();
        String getNama = textField_Nama_Lengkap.getText();
        String getAlamat = textArea_Alamat.getText();
        String getJenisKelamin = "";
        String getPekerjaan = textField_Pekerjaan.getText();
        String getTanggalRegistrasi = textField_Tanggal_Registrasi.getText();
        String getTanggalLahir = ((JTextField) textField_Tanggal_Lahir.getDateEditor().getUiComponent()).getText();
        String getKeterangan = textField_Keterangan.getText();
        String getTotalSimpanan = textField_Total_Simpanan.getText();
        String getTotalPinjaman = textField_Total_Pinjaman.getText();
        String getBayarSetiapBulan = textField_Bayar_Setiap_Bulan.getText();
        int getAngsuran = (int) Spinner_Angsuran.getValue();

        if (comboBox_Kartu_Identitas.getSelectedItem().equals("Pilih")) {
            getKartuIdentitas = "";
        } else if (comboBox_Kartu_Identitas.getSelectedItem().equals("KTP")) {
            getKartuIdentitas = "KTP | " + getNomorIdentitas;
        } else if (comboBox_Kartu_Identitas.getSelectedItem().equals("SIM")) {
            getKartuIdentitas = "SIM | " + getNomorIdentitas;
        } else if (comboBox_Kartu_Identitas.getSelectedItem().equals("PASSPORT")) {
            getKartuIdentitas = "PASSPORT | " + getNomorIdentitas;
        } else if (comboBox_Kartu_Identitas.getSelectedItem().equals("KARTU KELUARGA")) {
            getKartuIdentitas = "KARTU KELUARGA | " + getNomorIdentitas;
        }

        if (radioButton_Pria.isSelected()) {
            getJenisKelamin = "Pria";
        } else {
            getJenisKelamin = "Wanita";
        }
        try {
            if (getID.isEmpty()
                    || getKartuIdentitas.isEmpty()
                    || getNomorIdentitas.isEmpty()
                    || getNama.isEmpty()
                    || getAlamat.isEmpty()
                    || getJenisKelamin.isEmpty()
                    || getPekerjaan.isEmpty()
                    || getTanggalRegistrasi.isEmpty()
                    || getTanggalLahir.isEmpty()
                    || getKeterangan.isEmpty()
                    || getTotalSimpanan.isEmpty()) {
                utilities.clickWarning();
                String messageEmptySaveMoney = "<html><div width='120px' align='center'>Tidak boleh kosong!</div></html>";
                JOptionPane.showMessageDialog(null, messageEmptySaveMoney, "WARNING",
                        JOptionPane.WARNING_MESSAGE);
                utilities.clickGo();
            } else {
                String messageConfirmSaveMoney = "<html><div width='113px' align='center'>Apa Anda yakin ingin menyimpan data ini?</div></html>";
                int ok = JOptionPane.showConfirmDialog(null, messageConfirmSaveMoney,
                        "CONFIRMATION", JOptionPane.YES_NO_OPTION);
                if (ok == JOptionPane.YES_OPTION) {
                    st = koneksi.con.createStatement();
                    String sql = "INSERT INTO ksp(ID,"
                            + "KarTas,"
                            + "Na_Kap,"
                            + "Alamat,"
                            + "Jk,"
                            + "Pekerjaan,"
                            + "Tgl_Reg,"
                            + "Tgl_Lahir,"
                            + "Keterangan,"
                            + "Simpanan,"
                            + "Angsuran,"
                            + "Ttl_Pnj,"
                            + "ByrSetBln)"
                            + "VALUES ('" + getID
                            + "','" + getKartuIdentitas
                            + "','" + getNama
                            + "','" + getAlamat
                            + "','" + getJenisKelamin
                            + "','" + getPekerjaan
                            + "','" + getTanggalRegistrasi
                            + "','" + getTanggalLahir
                            + "','" + getKeterangan
                            + "','" + getTotalSimpanan
                            + "','" + getAngsuran
                            + "','" + getTotalPinjaman
                            + "','" + getBayarSetiapBulan + "')";
                    st.executeUpdate(sql);
                    semuadata();
                    utilities.clickSuccess();
                    String messageSuccessSaveMoney = "<html><div width='110px' align='center'>Data berhasil tersimpan!</div></html>";
                    JOptionPane.showMessageDialog(null, messageSuccessSaveMoney,
                            "SUCCESS", JOptionPane.INFORMATION_MESSAGE);
                    utilities.clickGo();
                    button_BatalActionPerformed(evt); //Memanggil event dari tombol Batal                
                } else if (ok == JOptionPane.NO_OPTION) {
                    utilities.clickCancel();
                    button_BatalActionPerformed(evt);
                }
            }
        } catch (SQLException ex) {
            utilities.clickWarning();
            String messageErrorSaveMoney = "<html><div width='110px' align='center'>Data gagal tersimpan!</div></html>";
            JOptionPane.showMessageDialog(null, messageErrorSaveMoney + "\n" + ex,
                    "ERROR", JOptionPane.ERROR_MESSAGE);
            utilities.clickGo();
            button_BatalActionPerformed(evt);
        }
    }//GEN-LAST:event_button_Simpan_Simpan_Setor_UangActionPerformed

    private void button_BatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_BatalActionPerformed
        //Tombol Batal
        textField_ID_Anggota.setText("");
        textField_Nama_Lengkap.setText("");
        comboBox_Kartu_Identitas.setSelectedItem("Pilih");
        textField_Nomor_Identitas.setText("");
        textArea_Alamat.setText("");
        textField_Pekerjaan.setText("");
        textField_Tanggal_Registrasi.setText("");
        textField_Tanggal_Lahir.setDate(null);
        textField_Keterangan.setText("");

        textField_Jumlah_Simpan_Setor_Uang.setText("");
        textField_Total_Simpanan.setText("");

        textField_Jumlah_Pinjam.setText("");
        Spinner_Angsuran.setValue(0);
        textField_Total_Pinjaman.setText("");
        textField_Bayar_Setiap_Bulan.setText("");
        textField_Bayar_Hutang.setText("");

        textField_Cari.setText("Cari ID");

        button_Baru.setEnabled(true);

        button_Perbarui.setEnabled(false);
        button_Batal.setEnabled(false);
        button_Hapus.setEnabled(false);
        button_Hasilkan_ID.setEnabled(false);
        button_Cetak.setEnabled(false);
        textField_ID_Anggota.setEnabled(false);
        comboBox_Kartu_Identitas.setEnabled(false);
        textField_Nomor_Identitas.setEnabled(false);
        textField_Nama_Lengkap.setEnabled(false);
        textArea_Alamat.setEnabled(false);
        ButtonGroup.clearSelection();
        radioButton_Pria.setEnabled(false);
        radioButton_Wanita.setEnabled(false);
        textField_Pekerjaan.setEnabled(false);
        textField_Tanggal_Registrasi.setEnabled(false);
        textField_Tanggal_Lahir.setEnabled(false);
        textField_Keterangan.setEnabled(false);

        textField_Total_Simpanan.setEnabled(false);
        textField_Total_Simpanan.setEnabled(false);
        button_Simpan_Simpan_Setor_Uang.setEnabled(false);
        Combobox10000.setSelected(false);
        Combobox10000.setEnabled(false);
        button_Bersih_Simpan_Setor_Uang.setEnabled(false);

        textField_Jumlah_Pinjam.setEnabled(false);
        Spinner_Angsuran.setEnabled(false);
        textField_Total_Pinjaman.setEnabled(false);
        textField_Bayar_Setiap_Bulan.setEnabled(false);
        textField_Bayar_Hutang.setEnabled(false);
        button_Hitung_Simpan_Setor_Uang.setEnabled(false);
        button_Bayar_Hutang.setEnabled(false);
        button_Bersih_Pinjam_Bayar_Hutang.setEnabled(false);
        button_Hitung_Pinjam_Bayar_Hutang.setEnabled(false);
        button_Simpan_Pinjam_Bayar_Hutang.setEnabled(false);
        table_KSP.getSelectionModel().clearSelection();
        MainPanel.requestFocusInWindow();
    }//GEN-LAST:event_button_BatalActionPerformed

    private void button_Bersih_Simpan_Setor_UangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_Bersih_Simpan_Setor_UangActionPerformed
        //Membersihkan semua field di panel Simpan/Setor Uang
        textField_Jumlah_Simpan_Setor_Uang.setText("");
        textField_Total_Simpanan.setText("");
        Combobox10000.setSelected(false);
        utilities.clickGo();
    }//GEN-LAST:event_button_Bersih_Simpan_Setor_UangActionPerformed

    private void button_Simpan_Pinjam_Bayar_HutangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_Simpan_Pinjam_Bayar_HutangActionPerformed
        //Simpan data kedalam database pada semua field di panel Simpan/Setor Uang        
        table_KSP.requestFocusInWindow();
        textField_Total_Simpanan.setText("0");

        String getID = textField_ID_Anggota.getText();
        String getKartuIdentitas = "";
        String getNomorIdentitas = textField_Nomor_Identitas.getText();
        String getNama = textField_Nama_Lengkap.getText();
        String getAlamat = textArea_Alamat.getText();
        String getJenisKelamin = "";
        String getPekerjaan = textField_Pekerjaan.getText();
        String getTanggalRegistrasi = textField_Tanggal_Registrasi.getText();
        String getTanggalLahir = ((JTextField) textField_Tanggal_Lahir.getDateEditor().getUiComponent()).getText();
        String getKeterangan = textField_Keterangan.getText();
        String getTotalSimpanan = textField_Total_Simpanan.getText();
        String getTotalPinjaman = textField_Total_Pinjaman.getText();
        String getBayarSetiapBulan = textField_Bayar_Setiap_Bulan.getText();
        String getJumlahPinjam = textField_Jumlah_Pinjam.getText();
        int getAngsuran = (int) Spinner_Angsuran.getValue();

        if (comboBox_Kartu_Identitas.getSelectedItem().equals("Pilih")) {
            getKartuIdentitas = "";
        } else if (comboBox_Kartu_Identitas.getSelectedItem().equals("KTP")) {
            getKartuIdentitas = "KTP | " + getNomorIdentitas;
        } else if (comboBox_Kartu_Identitas.getSelectedItem().equals("SIM")) {
            getKartuIdentitas = "SIM | " + getNomorIdentitas;
        } else if (comboBox_Kartu_Identitas.getSelectedItem().equals("PASSPORT")) {
            getKartuIdentitas = "PASSPORT | " + getNomorIdentitas;
        } else if (comboBox_Kartu_Identitas.getSelectedItem().equals("KARTU KELUARGA")) {
            getKartuIdentitas = "KARTU KELUARGA | " + getNomorIdentitas;
        }

        if (radioButton_Pria.isSelected()) {
            getJenisKelamin = "Pria";
        } else if (radioButton_Wanita.isSelected()) {
            getJenisKelamin = "Wanita";
        }

        try {
            if (getID.isEmpty()
                    || getKartuIdentitas.isEmpty()
                    || getNomorIdentitas.isEmpty()
                    || getNama.isEmpty()
                    || getAlamat.isEmpty()
                    || getJenisKelamin.isEmpty()
                    || getPekerjaan.isEmpty()
                    || getTanggalRegistrasi.isEmpty()
                    || getTanggalLahir.isEmpty()
                    || getKeterangan.isEmpty()
                    || getJumlahPinjam.isEmpty()
                    || getTotalPinjaman.isEmpty()
                    || getBayarSetiapBulan.isEmpty()) {
                utilities.clickWarning();
                String messageEmptyLoanMoney = "<html><div width='110px' align='center'>Tidak boleh kosong!</div></html>";
                JOptionPane.showMessageDialog(null, messageEmptyLoanMoney,
                        "WARNING", JOptionPane.WARNING_MESSAGE);
                utilities.clickGo();
            } else {
                utilities.clickGo();
                String messageConfirmLoanMoney = "<html><div width='113px' align='center'>Apa Anda yakin ingin menyimpan data ini?</div></html>";
                int ok = JOptionPane.showConfirmDialog(null, messageConfirmLoanMoney,
                        "CONFIRMATION", JOptionPane.YES_NO_OPTION);
                if (ok == JOptionPane.YES_OPTION) {
                    st = koneksi.con.createStatement();
                    String sql = "INSERT INTO ksp(ID,"
                            + "Na_Kap,"
                            + "KarTas,"
                            + "Alamat,"
                            + "JK,"
                            + "Pekerjaan,"
                            + "Tgl_Reg,"
                            + "Tgl_Lahir,"
                            + "Keterangan,"
                            + "Simpanan,"
                            + "Angsuran,"
                            + "Ttl_Pnj,"
                            + "ByrSetBln)"
                            + "VALUES ('" + getID
                            + "','" + getNama
                            + "','" + getKartuIdentitas
                            + "','" + getAlamat
                            + "','" + getJenisKelamin
                            + "','" + getPekerjaan
                            + "','" + getTanggalRegistrasi
                            + "','" + getTanggalLahir
                            + "','" + getKeterangan
                            + "','" + getTotalSimpanan
                            + "','" + getAngsuran
                            + "','" + getTotalPinjaman
                            + "','" + getBayarSetiapBulan + "')";
                    st.executeUpdate(sql);
                    semuadata();
                    textField_Total_Simpanan.setText("");
                    utilities.clickSuccess();
                    String messageSuccessLoanMoney = "<html><div width='110px' align='center'>Data berhasil tersimpan!</div></html>";
                    JOptionPane.showMessageDialog(null, messageSuccessLoanMoney,
                            "SUCCESS", JOptionPane.INFORMATION_MESSAGE);
                    utilities.clickGo();
                    button_BatalActionPerformed(evt); //Clear All Field
                } else if (ok == JOptionPane.NO_OPTION) {
                    utilities.clickGo();
                    button_BatalActionPerformed(evt);
                }
            }
        } catch (SQLException e) {
            utilities.clickFailure();
            String messageErrorLoanMoney = "<html><div width='110px' align='center'>Data gagal tersimpan!</div></html>";
            JOptionPane.showMessageDialog(null, messageErrorLoanMoney + "\n" + e,
                    "ERROR", JOptionPane.ERROR_MESSAGE);
            utilities.clickGo();
            button_BatalActionPerformed(evt);
        }
    }//GEN-LAST:event_button_Simpan_Pinjam_Bayar_HutangActionPerformed

    private void button_Bersih_Pinjam_Bayar_HutangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_Bersih_Pinjam_Bayar_HutangActionPerformed
        //Membersihkan semua field di panel Pinjam/BayarHutang
        textField_Jumlah_Pinjam.setText("");
        Spinner_Angsuran.setValue(1);
        textField_Total_Pinjaman.setText("");
        textField_Bayar_Setiap_Bulan.setText("");
        textField_Bayar_Hutang.setText("");
        utilities.clickGo();
    }//GEN-LAST:event_button_Bersih_Pinjam_Bayar_HutangActionPerformed

    private void button_Hitung_Pinjam_Bayar_HutangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_Hitung_Pinjam_Bayar_HutangActionPerformed
        //Tombol Hitung di Panel Pinjam/Bayar Hutang
        if (textField_Jumlah_Pinjam.getText().isEmpty()) {
            utilities.clickWarning();
            String messageFieldEmptyLoanMoney = "<html><div width='120px' align='center'>Field Jumlah tidak boleh kosong!</div></html>";
            JOptionPane.showMessageDialog(null, messageFieldEmptyLoanMoney,
                    "WARNING", JOptionPane.WARNING_MESSAGE);
            utilities.clickGo();
        } else {
            utilities.clickGo();
            int a = Integer.parseInt(textField_Jumlah_Pinjam.getText());
            double b = 0.05;
            int c = (int) Spinner_Angsuran.getValue();
            int d = (int) (a * b);
            int e = d + a;
            textField_Total_Pinjaman.setText(String.valueOf(e));
            int f = e / c;
            textField_Bayar_Setiap_Bulan.setText(String.valueOf(f));
        }
    }//GEN-LAST:event_button_Hitung_Pinjam_Bayar_HutangActionPerformed

    private void button_PerbaruiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_PerbaruiActionPerformed
        //Tombol Perbarui
        utilities.clickGo();
        String getID = textField_ID_Anggota.getText();
        String getKartuIdentitas = "";
        String getNama = textField_Nama_Lengkap.getText();
        String getAlamat = textArea_Alamat.getText();
        String getJenisKelamin = "";
        String getPekerjaan = textField_Pekerjaan.getText();
        String getTanggalRegistrasi = textField_Tanggal_Registrasi.getText();
        String getTanggalLahir = ((JTextField) textField_Tanggal_Lahir.getDateEditor().getUiComponent()).getText();
        String getKeterangan = textField_Keterangan.getText();
        String getTotalSimpanan = textField_Total_Simpanan.getText();
        String getTotalPinjaman = textField_Total_Pinjaman.getText();
        String getBayarSetiapBulan = textField_Bayar_Setiap_Bulan.getText();
        int getAngsuran = (int) Spinner_Angsuran.getValue();

        if (comboBox_Kartu_Identitas.getSelectedItem().equals("Pilih")) {
            getKartuIdentitas = "";
        }
        if (comboBox_Kartu_Identitas.getSelectedItem().equals("KTP")) {
            getKartuIdentitas = "KTP | " + textField_Nomor_Identitas.getText();
        }

        if (comboBox_Kartu_Identitas.getSelectedItem().equals("SIM")) {
            getKartuIdentitas = "SIM | " + textField_Nomor_Identitas.getText();
        }

        if (comboBox_Kartu_Identitas.getSelectedItem().equals("PASSPORT")) {
            getKartuIdentitas = "PASSPORT | " + textField_Nomor_Identitas.getText();
        }

        if (comboBox_Kartu_Identitas.getSelectedItem().equals("KARTU KELUARGA")) {
            getKartuIdentitas = "KARTU KELUARGA | " + textField_Nomor_Identitas.getText();
        }

        if (radioButton_Pria.isSelected()) {
            getJenisKelamin = "Pria";
        } else if (radioButton_Wanita.isSelected()) {
            getJenisKelamin = "Wanita";
        }
        String messageConfirmUpdate = "<html><div width='110px' align='center'>Apa Anda yakin ingin memperbarui data ini?</div></html>";
        int ok = JOptionPane.showConfirmDialog(null, messageConfirmUpdate,
                "CONFIRMATION", JOptionPane.YES_NO_OPTION);
        if (getTotalSimpanan.isEmpty()) {
            textField_Total_Simpanan.setText("0");
        }
        if (getTotalPinjaman.isEmpty() || getBayarSetiapBulan.isEmpty()) {
            textField_Total_Pinjaman.setText("0");
            textField_Bayar_Setiap_Bulan.setText("0");
        }
        try { //Perbarui data
            if (ok == JOptionPane.YES_OPTION) {
                st = koneksi.con.createStatement();
                String sql = "update ksp set KarTas='" + getKartuIdentitas
                        + "' ,Na_Kap='" + getNama
                        + "' ,Alamat='" + getAlamat
                        + "' ,JK='" + getJenisKelamin
                        + "' ,Pekerjaan='" + getPekerjaan
                        + "' ,Tgl_Reg='" + getTanggalRegistrasi
                        + "' ,Tgl_Lahir='" + getTanggalLahir
                        + "' ,Keterangan='" + getKeterangan
                        + "' ,Simpanan='" + getTotalSimpanan
                        + "' ,Angsuran='" + getAngsuran
                        + "' ,Ttl_Pnj='" + getTotalPinjaman
                        + "' ,ByrSetBln='" + getBayarSetiapBulan
                        + "' where ID='" + getID + "'";
                st.executeUpdate(sql);
                semuadata();
                utilities.clickSuccess();
                String messageSuccessUpdate = "<html><div width='110px' align='center'>Data berhasil diperbarui!</div></html>";
                JOptionPane.showMessageDialog(null, messageSuccessUpdate,
                        "SUCCESS", JOptionPane.INFORMATION_MESSAGE);
                utilities.clickGo();
                button_BatalActionPerformed(evt);
            } else if (ok == JOptionPane.NO_OPTION) {
                button_BatalActionPerformed(evt);
                utilities.clickCancel();
            }
        } catch (SQLException e) {
            utilities.clickFailure();
            String messageErrorUpdate = "<html><div width='110px' align='center'>Data gagal diperbarui!</div></html>";
            JOptionPane.showMessageDialog(null, messageErrorUpdate + "\n" + e,
                    "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_button_PerbaruiActionPerformed

    private void button_CariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_CariActionPerformed
        if (textField_Cari.getText().equals("Cari ID") || textField_Cari.getText().isEmpty()) {
            utilities.clickWarning();
            String messageEmptySearch = "<html><div width='110px' align='center'>Field tidak boleh kosong!</div></html>";
            JOptionPane.showMessageDialog(null, messageEmptySearch,
                    "WARNING", JOptionPane.WARNING_MESSAGE);
            utilities.clickGo();
            textField_Cari.setText("Cari ID");
        } else {
            table_KSP.getSelectionModel().clearSelection();
            try { //Tombol Cari
                String sql = "select * from ksp where ID='" + textField_Cari.getText() + "'";
                st = koneksi.con.createStatement();
                rs = st.executeQuery(sql);

                if (rs.next()) {
                    textField_ID_Anggota.setText(rs.getString("ID"));
                    String a = rs.getString("KarTas");
                    if (a.substring(0, 3).equals("KTP")) {
                        comboBox_Kartu_Identitas.setSelectedIndex(1);
                        textField_Nomor_Identitas.setText(rs.getString("KarTas").substring(6, 22));
                    } else if (a.substring(0, 3).equals("SIM")) {
                        comboBox_Kartu_Identitas.setSelectedIndex(2);
                        textField_Nomor_Identitas.setText(rs.getString("KarTas").substring(6, 18));
                    } else if (a.substring(0, 8).equals("PASSPORT")) {
                        comboBox_Kartu_Identitas.setSelectedIndex(3);
                        textField_Nomor_Identitas.setText(rs.getString("KarTas").substring(11, 25));
                    } else if (a.substring(0, 14).equals("KARTU KELUARGA")) {
                        comboBox_Kartu_Identitas.setSelectedIndex(4);
                        textField_Nomor_Identitas.setText(rs.getString("KarTas").substring(17, 31));
                    }
                    textField_Nama_Lengkap.setText(rs.getString("Na_Kap"));
                    textArea_Alamat.setText(rs.getString("Alamat"));
                    String gender = rs.getString("JK");
                    if (gender.equals("Pria")) {
                        radioButton_Pria.setSelected(true);
                    } else if (gender.equals("Wanita")) {
                        radioButton_Wanita.setSelected(true);
                    }
                    textField_Pekerjaan.setText(rs.getString("Pekerjaan"));
                    textField_Tanggal_Registrasi.setText(rs.getString("Tgl_Reg"));
                    textField_Tanggal_Lahir.setDate(rs.getDate("Tgl_Lahir"));
                    textField_Keterangan.setText(rs.getString("Keterangan"));
                    textField_Total_Simpanan.setText(rs.getString("Simpanan"));
                    Spinner_Angsuran.setValue(rs.getInt("Angsuran"));
                    textField_Total_Pinjaman.setText(rs.getString("Ttl_Pnj"));
                    textField_Bayar_Setiap_Bulan.setText(rs.getString("ByrSetBln"));
                    textField_Tanggal_Lahir.getDateEditor().getUiComponent().setForeground(Color.LIGHT_GRAY);

                    String kata = textField_ID_Anggota.getText();
                    String sub = kata.substring(1, 5);
                    if (textField_ID_Anggota.getText().equals("S" + sub)) {
                        button_Hitung_Simpan_Setor_Uang.setEnabled(true);
                        button_Simpan_Simpan_Setor_Uang.setEnabled(false);
                        Combobox10000.setEnabled(true);
                        button_Bersih_Simpan_Setor_Uang.setEnabled(true);
                        textField_Jumlah_Simpan_Setor_Uang.setEnabled(true);
                        textField_Total_Simpanan.setEnabled(true);
                        textField_Jumlah_Pinjam.setEnabled(false);
                        Spinner_Angsuran.setEnabled(false);
                        textField_Total_Pinjaman.setEnabled(false);
                        textField_Bayar_Setiap_Bulan.setEnabled(false);
                        textField_Bayar_Hutang.setEnabled(false);
                        button_Bayar_Hutang.setEnabled(false);
                        button_Simpan_Pinjam_Bayar_Hutang.setEnabled(false);
                        button_Hitung_Pinjam_Bayar_Hutang.setEnabled(false);
                        button_Bersih_Pinjam_Bayar_Hutang.setEnabled(false);
                        textField_Total_Pinjaman.setText("");
                        textField_Bayar_Setiap_Bulan.setText("");
                        Spinner_Angsuran.setValue(0);
                    } else if (textField_ID_Anggota.getText().equals("P" + sub)) {
                        button_Hitung_Simpan_Setor_Uang.setEnabled(false);
                        button_Simpan_Simpan_Setor_Uang.setEnabled(false);
                        Combobox10000.setEnabled(false);
                        button_Bersih_Simpan_Setor_Uang.setEnabled(false);
                        textField_Jumlah_Simpan_Setor_Uang.setText("");
                        textField_Jumlah_Simpan_Setor_Uang.setEnabled(false);
                        Combobox10000.setSelected(false);
                        Combobox10000.setEnabled(false);
                        textField_Total_Simpanan.setEnabled(false);
                        textField_Jumlah_Pinjam.setEnabled(true);
                        Spinner_Angsuran.setEnabled(true);
                        textField_Total_Pinjaman.setEnabled(true);
                        textField_Bayar_Setiap_Bulan.setEnabled(true);
                        textField_Bayar_Hutang.setEnabled(true);
                        button_Bayar_Hutang.setEnabled(true);
                        button_Simpan_Pinjam_Bayar_Hutang.setEnabled(false);
                        button_Hitung_Pinjam_Bayar_Hutang.setEnabled(true);
                        button_Bersih_Pinjam_Bayar_Hutang.setEnabled(true);
                    }
                    utilities.clickSuccess();
                    String messageSuccessSearch = "<html><div width='110px' align='center'>Data ditemukan!</div></html>";
                    JOptionPane.showMessageDialog(null, messageSuccessSearch,
                            "SUCCESS", JOptionPane.INFORMATION_MESSAGE);
                    utilities.clickGo();
                    textField_Cari.setText("Cari ID");
                    MainPanel.requestFocusInWindow();
                    button_Hasilkan_ID.setEnabled(false);
                    textField_ID_Anggota.setEditable(false);

                    textField_ID_Anggota.setEnabled(true);
                    comboBox_Kartu_Identitas.setEnabled(true);
                    textField_Nomor_Identitas.setEnabled(true);
                    button_Hapus.setEnabled(true);
                    button_Cetak.setEnabled(true);
                    button_Batal.setEnabled(true);
                    button_Perbarui.setEnabled(true);
                    textField_Nama_Lengkap.setEnabled(true);
                    textArea_Alamat.setEnabled(true);
                    radioButton_Pria.setEnabled(true);
                    radioButton_Wanita.setEnabled(true);
                    textField_Pekerjaan.setEnabled(true);
                    textField_Tanggal_Registrasi.setEnabled(true);
                    textField_Tanggal_Lahir.setEnabled(true);
                    textField_Keterangan.setEnabled(true);
                    button_Baru.setEnabled(false);
                } else {
                    utilities.clickWarning();
                    String messageNotFoundSearch = "<html><div width='110px' align='center'>Data tidak ditemukan!</div></html>";
                    JOptionPane.showMessageDialog(null, messageNotFoundSearch,
                            "WARNING", JOptionPane.WARNING_MESSAGE);
                    utilities.clickGo();
                    textField_Cari.setText("Cari ID");
                    table_KSP.requestFocusInWindow();
                }
            } catch (SQLException e) {
                utilities.clickFailure();
                String messageErrorSearch = "<html><div width='110px' align='center'>Tidak terhubung ke database!</div></html>";
                JOptionPane.showMessageDialog(null, messageErrorSearch + "\n" + e,
                        "ERROR", JOptionPane.ERROR_MESSAGE);
                utilities.clickGo();
            }
        }

    }//GEN-LAST:event_button_CariActionPerformed

    private void refreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshMouseClicked
        utilities.clickGo();
        this.dispose(); //Refresh Koneksi
        new Main().setVisible(true);
    }//GEN-LAST:event_refreshMouseClicked

    private void textField_CariFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textField_CariFocusGained
        textField_Cari.setText("");
    }//GEN-LAST:event_textField_CariFocusGained

    private void button_HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_HapusActionPerformed
        utilities.clickGo();
        String messageConfirmDelete = "<html><div width='110px' align='center'>Apa Anda yakin ingin menghapus data ini?</div></html>";
        int ok = JOptionPane.showConfirmDialog(null, messageConfirmDelete,
                "CONFIRMATION", JOptionPane.YES_NO_OPTION);
        try { //Menghapus data
            if (ok == JOptionPane.YES_OPTION) {
                String sql = "delete from ksp where ID =?";
                pst = koneksi.con.prepareStatement(sql);
                pst.setString(1, textField_ID_Anggota.getText());
                pst.execute();
                semuadata();
                button_BatalActionPerformed(evt);
                utilities.clickSuccess();
                String messageSuccessDelete = "<html><div width='110px' align='center'>Data berhasil terhapus!</div></html>";
                JOptionPane.showMessageDialog(null, messageSuccessDelete,
                        "SUCCESS", JOptionPane.INFORMATION_MESSAGE);
                utilities.clickGo();
            } else if (ok == JOptionPane.NO_OPTION) {
                utilities.clickCancel();
                button_BatalActionPerformed(evt);
            }
        } catch (SQLException e) {
            utilities.clickFailure();
            String messageFailDelete = "<html><div width='110px' align='center'>Data gagal terhapus!</div></html>";
            JOptionPane.showMessageDialog(null, messageFailDelete + "\n" + e,
                    "ERROR", JOptionPane.WARNING_MESSAGE);
            utilities.clickGo();
        }
    }//GEN-LAST:event_button_HapusActionPerformed

    private void textField_Jumlah_PinjamKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textField_Jumlah_PinjamKeyTyped
        char c = evt.getKeyChar();//Hanya menerima numerik di field Jumlah pada panel Pinjam/Bayar Hutang
        if (!(Character.isDigit(c)
                || c == KeyEvent.VK_BACKSPACE
                || c == KeyEvent.VK_DELETE)
                || textField_Jumlah_Pinjam.getText().length() == 10) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_textField_Jumlah_PinjamKeyTyped

    private void textField_Total_PinjamanKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textField_Total_PinjamanKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c)
                || c == KeyEvent.VK_BACKSPACE
                || c == KeyEvent.VK_DELETE)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_textField_Total_PinjamanKeyTyped

    private void textField_Bayar_HutangKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textField_Bayar_HutangKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c)
                || c == KeyEvent.VK_BACKSPACE
                || c == KeyEvent.VK_DELETE)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_textField_Bayar_HutangKeyTyped

    private void button_Bayar_HutangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_Bayar_HutangActionPerformed
        if (textField_Total_Pinjaman.getText().equals("0")) { //Tombol Bayar Hutang
            utilities.clickWarning();
            String messageEmptyLoan = "<html><div width='110px' align='center'>Tidak mempunyai hutang!</div></html>";
            JOptionPane.showMessageDialog(null, messageEmptyLoan,
                    "WARNING", JOptionPane.WARNING_MESSAGE);
            utilities.clickGo();
        } else if (textField_Bayar_Hutang.getText().isEmpty()) {
            utilities.clickWarning();
            String messageEmptyLoan = "<html><div width='110px' align='center'>Isi field bayar hutang!</div></html>";
            JOptionPane.showMessageDialog(null, messageEmptyLoan,
                    "WARNING", JOptionPane.WARNING_MESSAGE);
            utilities.clickGo();
        } else {
            int a = Integer.parseInt(textField_Total_Pinjaman.getText());
            int b = Integer.parseInt(textField_Bayar_Hutang.getText());
            int c = a - b;
            textField_Total_Pinjaman.setText(String.valueOf(c));
            textField_Bayar_Hutang.setText("");

            int d = (int) Spinner_Angsuran.getValue();
            int e = 1;
            int f = d - e;
            Spinner_Angsuran.setValue(f);
            utilities.clickGo();
        }
    }//GEN-LAST:event_button_Bayar_HutangActionPerformed

    private void button_CetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_CetakActionPerformed
        if (textField_ID_Anggota.getText().isEmpty()) {
            utilities.clickWarning();
            String messageEmptyID = "<html><div width='110px' align='center'>Field ID Anggota tidak boleh kosong!</div></html>";
            JOptionPane.showMessageDialog(null, messageEmptyID,
                    "WARNING", JOptionPane.WARNING_MESSAGE);
            utilities.clickGo();
        } else {
            utilities.clickGo();
            textField_Cari.setText("Cari ID");

            JasperReport JasRep; //iReport dijadikan variable
            JasperPrint JasPrint;
            JasperDesign JasDes;
            HashMap<String, Object> param = new HashMap<String, Object>(); //membuat paramater untuk dipanggil di query sql iReport
            InputStream iReportSimpan = getClass().getResourceAsStream("/com/nabil/print/cetakbukusimpan.jrxml");
            InputStream iReportPinjam = getClass().getResourceAsStream("/com/nabil/print/cetakbukupinjam.jrxml");
            try {
                String kata = textField_ID_Anggota.getText();
                String sub = kata.substring(1, 5);//Dari Textfield diubah ke variable iReport
                if (textField_ID_Anggota.getText().equals("S" + sub)) {
                    param.put("ID", textField_ID_Anggota.getText());
                    JasDes = JRXmlLoader.load(iReportSimpan);
                    JasRep = JasperCompileManager.compileReport(JasDes);
                    JasPrint = JasperFillManager.fillReport(JasRep, param, koneksi.con);
                    JasperViewer jv = new JasperViewer(JasPrint, false);
                    jv.setTitle("Cetak Buku Anggota");
                    jv.setExtendedState(MAXIMIZED_BOTH);
                    jv.setVisible(true);
                    Thread.sleep(400);
                    utilities.clickSuccessLogin();
                } else {
                    param.put("ID", textField_ID_Anggota.getText());
                    JasDes = JRXmlLoader.load(iReportPinjam);
                    JasRep = JasperCompileManager.compileReport(JasDes);
                    JasPrint = JasperFillManager.fillReport(JasRep, param, koneksi.con);
                    JasperViewer jv = new JasperViewer(JasPrint, false);
                    jv.setTitle("Cetak Buku Anggota");
                    jv.setExtendedState(MAXIMIZED_BOTH);
                    jv.setVisible(true);
                    Thread.sleep(400);
                    utilities.clickSuccessLogin();
                }

            } catch (JRException | InterruptedException e) {
                System.out.print("ERROR: " + e);
            }
        }

    }//GEN-LAST:event_button_CetakActionPerformed

    private void textField_CariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField_CariActionPerformed
        MainPanel.requestFocusInWindow();
        button_CariActionPerformed(evt);
    }//GEN-LAST:event_textField_CariActionPerformed

    private void status2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_status2MouseEntered
        status2.setToolTipText("Status saat ini " + koneksi.labal.getText() + " ke database");
    }//GEN-LAST:event_status2MouseEntered

    private void button_TentangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_TentangActionPerformed
        utilities.clickGo();
        String message1 = "<html><div width='110px' align='center'>Created By</div></html>";
        String message2 = "<html><div width='110px' align='center'>NABIL FAWWAZ ELQAYYIM</div></html>";
        String message3 = "<html><div width='110px' align='center'>web : www.nabilfawwaz.com</div></html>";
        String message4 = "<html><div width='110px' align='center'>email: mail@nabilfawwaz.com</div></html>";
        JOptionPane.showMessageDialog(null, message1 + "\n" + message2 + "\n" + message3 + "\n" + message4);
        utilities.clickGo();
    }//GEN-LAST:event_button_TentangActionPerformed

    private void button_LaporanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_LaporanActionPerformed
        utilities.clickGo();
        new Laporan().setVisible(true);
    }//GEN-LAST:event_button_LaporanActionPerformed

    private void table_KSPMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_KSPMouseReleased
        utilities.clickGo();
        button_Cetak.setEnabled(true);
        textField_Cari.setText("Cari ID");
        textField_Total_Simpanan.setText("0");//Mengambil data dari jTable dengan kursor
        int baris = table_KSP.getSelectedRow();
        TableModel model = table_KSP.getModel();

        textField_ID_Anggota.setText(model.getValueAt(baris, 0).toString());
        String kata = textField_ID_Anggota.getText();
        String sub = kata.substring(1, 5);

        if (textField_ID_Anggota.getText().equals("S" + sub)) {
            button_Hitung_Simpan_Setor_Uang.setEnabled(true);
            Combobox10000.setEnabled(true);
            button_Bersih_Simpan_Setor_Uang.setEnabled(true);
            textField_Jumlah_Simpan_Setor_Uang.setEnabled(true);
            textField_Total_Simpanan.setEnabled(true);
            textField_Jumlah_Pinjam.setEnabled(false);
            Spinner_Angsuran.setEnabled(false);
            textField_Total_Pinjaman.setEnabled(false);
            textField_Bayar_Setiap_Bulan.setEnabled(false);
            textField_Bayar_Hutang.setEnabled(false);
            button_Bayar_Hutang.setEnabled(false);
            button_Simpan_Pinjam_Bayar_Hutang.setEnabled(false);
            button_Hitung_Pinjam_Bayar_Hutang.setEnabled(false);
            button_Bersih_Pinjam_Bayar_Hutang.setEnabled(false);
            textField_Total_Pinjaman.setText("");
            textField_Bayar_Setiap_Bulan.setText("");
            Spinner_Angsuran.setValue(0);
        } else if (textField_ID_Anggota.getText().equals("P" + sub)) {
            button_Hitung_Simpan_Setor_Uang.setEnabled(false);
            button_Simpan_Simpan_Setor_Uang.setEnabled(false);
            Combobox10000.setEnabled(false);
            button_Bersih_Simpan_Setor_Uang.setEnabled(false);
            textField_Jumlah_Simpan_Setor_Uang.setEnabled(false);
            Combobox10000.setSelected(false);
            Combobox10000.setEnabled(false);
            textField_Total_Simpanan.setEnabled(false);
            textField_Jumlah_Pinjam.setEnabled(true);
            Spinner_Angsuran.setEnabled(true);
            textField_Total_Pinjaman.setEnabled(true);
            textField_Bayar_Setiap_Bulan.setEnabled(true);
            textField_Bayar_Hutang.setEnabled(true);
            button_Bayar_Hutang.setEnabled(true);
            button_Hitung_Pinjam_Bayar_Hutang.setEnabled(true);
            button_Bersih_Pinjam_Bayar_Hutang.setEnabled(true);
        }

        button_Baru.setEnabled(false);
        button_Hasilkan_ID.setEnabled(false);
        textField_ID_Anggota.setEditable(false);
        textField_ID_Anggota.setEnabled(true);
        comboBox_Kartu_Identitas.setEnabled(true);
        textField_Nomor_Identitas.setEnabled(true);
        textField_Nama_Lengkap.setEnabled(true);
        textArea_Alamat.setEnabled(true);
        radioButton_Pria.setEnabled(true);
        radioButton_Wanita.setEnabled(true);
        textField_Pekerjaan.setEnabled(true);
        textField_Tanggal_Registrasi.setEnabled(true);
        textField_Tanggal_Lahir.setEnabled(true);
        textField_Keterangan.setEnabled(true);
        button_Hapus.setEnabled(true);
        button_Batal.setEnabled(true);
        button_Perbarui.setEnabled(true);

        String setKartuIdentitas = model.getValueAt(baris, 1).toString();

        if (setKartuIdentitas.substring(0, 3).equals("KTP")) {
            comboBox_Kartu_Identitas.setSelectedItem("KTP");
            String setKTP = model.getValueAt(baris, 1).toString();
            textField_Nomor_Identitas.setText(setKTP.substring(6, 22));
        } else if (setKartuIdentitas.substring(0, 3).equals("SIM")) {
            comboBox_Kartu_Identitas.setSelectedItem("SIM");
            String setSIM = model.getValueAt(baris, 1).toString();
            textField_Nomor_Identitas.setText(setSIM.substring(6, 18));
        } else if (setKartuIdentitas.substring(0, 8).equals("PASSPORT")) {
            comboBox_Kartu_Identitas.setSelectedItem("PASSPORT");
            String setPassPort = model.getValueAt(baris, 1).toString();
            textField_Nomor_Identitas.setText(setPassPort.substring(11, 25));
        } else if (setKartuIdentitas.substring(0, 14).equals("KARTU KELUARGA")) {
            comboBox_Kartu_Identitas.setSelectedItem("KARTU KELUARGA");
            String setKartuKeluarga = model.getValueAt(baris, 1).toString();
            textField_Nomor_Identitas.setText(setKartuKeluarga.substring(17, 33));
        }

        textField_Nama_Lengkap.setText(model.getValueAt(baris, 2).toString());
        textArea_Alamat.setText(model.getValueAt(baris, 3).toString());
        String setJenisKelamin = model.getValueAt(baris, 4).toString();

        if (setJenisKelamin.equals("Pria")) {
            radioButton_Pria.setSelected(true);
        } else {
            radioButton_Wanita.setSelected(true);
        }

        textField_Pekerjaan.setText(model.getValueAt(baris, 5).toString());
        textField_Tanggal_Registrasi.setText(model.getValueAt(baris, 6).toString());

        if (evt.getClickCount() == 1) {
            textField_Tanggal_Lahir.setDate(Utilities.getTanggalFromTable(table_KSP, 7));
        }

        textField_Tanggal_Lahir.getDateEditor().getUiComponent().setForeground(Color.LIGHT_GRAY);
        textField_Keterangan.setText(model.getValueAt(baris, 8).toString());
        textField_Total_Simpanan.setText(model.getValueAt(baris, 9).toString());
        Spinner_Angsuran.setValue(Integer.parseInt(model.getValueAt(baris, 10).toString()));
        textField_Total_Pinjaman.setText(model.getValueAt(baris, 11).toString());
        textField_Bayar_Setiap_Bulan.setText(model.getValueAt(baris, 12).toString());
    }//GEN-LAST:event_table_KSPMouseReleased

    private void textField_KeteranganFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textField_KeteranganFocusGained
        textField_Tanggal_Lahir.getDateEditor().getUiComponent().setForeground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_textField_KeteranganFocusGained

    private void textField_Jumlah_Simpan_Setor_UangKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textField_Jumlah_Simpan_Setor_UangKeyTyped
        if (textField_Jumlah_Simpan_Setor_Uang.getText().length() == 11) {//Tidak boleh lebih dari 11 char
            evt.consume();
            getToolkit().beep();
        }

        char c = evt.getKeyChar();//Hanya menerima numerik
        if (!(Character.isDigit(c)
                || c == KeyEvent.VK_BACKSPACE
                || c == KeyEvent.VK_DELETE)
                || textField_Jumlah_Simpan_Setor_Uang.getText().length() == 10) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_textField_Jumlah_Simpan_Setor_UangKeyTyped

    private void textField_Nama_LengkapKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textField_Nama_LengkapKeyTyped
        if (textField_Nama_Lengkap.getText().length() == 30) {
            evt.consume();
            getToolkit().beep();
        }
    }//GEN-LAST:event_textField_Nama_LengkapKeyTyped

    private void textField_PekerjaanKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textField_PekerjaanKeyTyped
        if (textField_Pekerjaan.getText().length() == 20) {
            evt.consume();
            getToolkit().beep();
        }
    }//GEN-LAST:event_textField_PekerjaanKeyTyped

    private void textField_KeteranganKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textField_KeteranganKeyTyped
        if (textField_Keterangan.getText().length() == 40) { //Maksimal Panjang Karakter field Keterangan = 40
            evt.consume();
            getToolkit().beep();
        }
    }//GEN-LAST:event_textField_KeteranganKeyTyped

    private void textField_Nomor_IdentitasFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textField_Nomor_IdentitasFocusLost
        //validasi nomor identitas
        int cekNomor = textField_Nomor_Identitas.getText().length();
        if (comboBox_Kartu_Identitas.getSelectedItem().equals("Pilih")) {
            utilities.clickWarning();
            JOptionPane.showMessageDialog(null, "Pilih jenis kartu identitas",
                    "WARNING", JOptionPane.WARNING_MESSAGE);
            utilities.clickGo();

        } else if (comboBox_Kartu_Identitas.getSelectedItem().equals("KTP")) {
            if (cekNomor != 16) {// Tanda != artinya tidak sama dengan
                utilities.clickWarning();
                JOptionPane.showMessageDialog(null, "Nomor identitas KTP harus tepat 16 karakter",
                        "WARNING", JOptionPane.WARNING_MESSAGE);
                comboBox_Kartu_Identitas.requestFocusInWindow();
                textField_Nomor_Identitas.setText("");
                utilities.clickGo();
            }
        } else if (comboBox_Kartu_Identitas.getSelectedItem().equals("SIM")) {
            if (cekNomor != 12) {//Jika Nomor Identitas tidak sama dengan 12, maka...
                utilities.clickWarning();
                JOptionPane.showMessageDialog(null, "Nomor identitas SIM harus tepat 12 karakter",
                        "WARNING", JOptionPane.WARNING_MESSAGE);
                comboBox_Kartu_Identitas.requestFocusInWindow();
                textField_Nomor_Identitas.setText("");
                utilities.clickGo();
            }
        } else if (comboBox_Kartu_Identitas.getSelectedItem().equals("PASSPORT")) {
            if (cekNomor != 14) {
                utilities.clickWarning();
                JOptionPane.showMessageDialog(null, "Nomor identitas PASSPORT harus tepat 14 karakter",
                        "WARNING", JOptionPane.WARNING_MESSAGE);
                comboBox_Kartu_Identitas.requestFocusInWindow();
                textField_Nomor_Identitas.setText("");
                utilities.clickGo();
            }
        } else if (comboBox_Kartu_Identitas.getSelectedItem().equals("KARTU KELUARGA")) {
            if (cekNomor != 16) {
                utilities.clickWarning();
                JOptionPane.showMessageDialog(null, "Nomor identitas KARTU KELUARGA harus tepat 16 karakter",
                        "WARNING", JOptionPane.WARNING_MESSAGE);
                comboBox_Kartu_Identitas.requestFocusInWindow();
                textField_Nomor_Identitas.setText("");
                utilities.clickGo();
            }
        }
    }//GEN-LAST:event_textField_Nomor_IdentitasFocusLost

    private void button_KeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_KeluarActionPerformed
        utilities.clickGo();
        int ok = JOptionPane.showConfirmDialog(null, "Apa Anda yakin ingin keluar aplikasi?",
                "CONFIRMATION", JOptionPane.YES_NO_OPTION);
        if (ok == JOptionPane.YES_OPTION) {
            utilities.clickSuccess();
            this.dispose();
            new Login().setVisible(true);
        } else {
            utilities.clickCancel();
        }
    }//GEN-LAST:event_button_KeluarActionPerformed

      private void table_KSPMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_KSPMouseEntered
          table_KSP.setDefaultRenderer(Object.class, new toolTipTextTable());//Supaya muncul tooltip
          table_KSP.requestFocusInWindow();
          utilities.clickHover();
    }//GEN-LAST:event_table_KSPMouseEntered

    private void button_HapusMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_HapusMouseEntered
        if (button_Hapus.isEnabled()) {
            utilities.clickHover();
        }
    }//GEN-LAST:event_button_HapusMouseEntered

    private void button_BaruMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_BaruMouseEntered
        if (button_Baru.isEnabled()) {
            utilities.clickHover();
        }
    }//GEN-LAST:event_button_BaruMouseEntered

    private void button_BatalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_BatalMouseEntered
        if (button_Batal.isEnabled()) {
            utilities.clickHover();
        }
    }//GEN-LAST:event_button_BatalMouseEntered

    private void button_PerbaruiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_PerbaruiMouseEntered
        if (button_Perbarui.isEnabled()) {
            utilities.clickHover();
        }
    }//GEN-LAST:event_button_PerbaruiMouseEntered

    private void button_LaporanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_LaporanMouseEntered
        if (button_Laporan.isEnabled()) {
            utilities.clickHover();
        }
    }//GEN-LAST:event_button_LaporanMouseEntered

    private void button_CetakMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_CetakMouseEntered
        if (button_Cetak.isEnabled()) {
            utilities.clickHover();
        }
    }//GEN-LAST:event_button_CetakMouseEntered

    private void button_TentangMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_TentangMouseEntered
        if (button_Tentang.isEnabled()) {
            utilities.clickHover();
        }
    }//GEN-LAST:event_button_TentangMouseEntered

    private void button_KeluarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_KeluarMouseEntered
        if (button_Keluar.isEnabled()) {
            utilities.clickHover();
        }
    }//GEN-LAST:event_button_KeluarMouseEntered

    private void refreshMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshMouseEntered
        refresh.setCursor(new Cursor(Cursor.HAND_CURSOR)); //Mengubah kursor icon ketika kursor mengunjungi gambar refresh       
        refresh.setToolTipText("Refresh Status");
        utilities.clickHover();
        refresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/nabil/images/refreshhover.png")));
    }//GEN-LAST:event_refreshMouseEntered

    private void refreshMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshMouseExited
        refresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/nabil/images/refresh.png")));
    }//GEN-LAST:event_refreshMouseExited

    private void button_CariMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_CariMouseEntered
        utilities.clickHover();
    }//GEN-LAST:event_button_CariMouseEntered

    private void button_Hasilkan_IDMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_Hasilkan_IDMouseEntered
        if (button_Hasilkan_ID.isEnabled()) {
            utilities.clickHover();
        }
    }//GEN-LAST:event_button_Hasilkan_IDMouseEntered

    private void button_Bersih_Simpan_Setor_UangMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_Bersih_Simpan_Setor_UangMouseEntered
        if (button_Bersih_Simpan_Setor_Uang.isEnabled()) {
            utilities.clickHover();
        }
    }//GEN-LAST:event_button_Bersih_Simpan_Setor_UangMouseEntered

    private void button_Hitung_Simpan_Setor_UangMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_Hitung_Simpan_Setor_UangMouseEntered
        if (button_Hitung_Simpan_Setor_Uang.isEnabled()) {
            utilities.clickHover();
        }
    }//GEN-LAST:event_button_Hitung_Simpan_Setor_UangMouseEntered

    private void button_Simpan_Simpan_Setor_UangMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_Simpan_Simpan_Setor_UangMouseEntered
        if (button_Simpan_Simpan_Setor_Uang.isEnabled()) {
            utilities.clickHover();
        }
    }//GEN-LAST:event_button_Simpan_Simpan_Setor_UangMouseEntered

    private void button_Bersih_Pinjam_Bayar_HutangMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_Bersih_Pinjam_Bayar_HutangMouseEntered
        if (button_Bersih_Pinjam_Bayar_Hutang.isEnabled()) {
            utilities.clickHover();
        }
    }//GEN-LAST:event_button_Bersih_Pinjam_Bayar_HutangMouseEntered

    private void button_Hitung_Pinjam_Bayar_HutangMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_Hitung_Pinjam_Bayar_HutangMouseEntered
        if (button_Hitung_Pinjam_Bayar_Hutang.isEnabled()) {
            utilities.clickHover();
        }
    }//GEN-LAST:event_button_Hitung_Pinjam_Bayar_HutangMouseEntered

    private void button_Simpan_Pinjam_Bayar_HutangMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_Simpan_Pinjam_Bayar_HutangMouseEntered
        if (button_Simpan_Pinjam_Bayar_Hutang.isEnabled()) {
            utilities.clickHover();
        }
    }//GEN-LAST:event_button_Simpan_Pinjam_Bayar_HutangMouseEntered

    private void button_Bayar_HutangMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_Bayar_HutangMouseEntered
        if (button_Bayar_Hutang.isEnabled()) {
            utilities.clickHover();
        }
    }//GEN-LAST:event_button_Bayar_HutangMouseEntered

    private void button_BatalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_BatalMouseClicked
        utilities.clickGo();
    }//GEN-LAST:event_button_BatalMouseClicked

    private void textArea_AlamatKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textArea_AlamatKeyTyped
        //Menghitung sisa jumlah karakter yang ada di field alamat
        String text = textArea_Alamat.getText();
        int a = 90;
        int counter = text.length();
        int b = a - counter;
        Karakter.setText(String.valueOf(b) + " karakter tersisa");
        if (textArea_Alamat.getText().length() == 90) {
            evt.consume();
        }
    }//GEN-LAST:event_textArea_AlamatKeyTyped

    /**
     * @param args the command line arguments
     * @throws java.text.ParseException
     */
    public static void main(String args[]) throws ParseException {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                /*if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }*/
                UIManager.setLookAndFeel(new SyntheticaBlackEyeLookAndFeel());

            }
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Main().setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Alamat;
    private javax.swing.ButtonGroup ButtonGroup;
    private javax.swing.JCheckBox Combobox10000;
    private javax.swing.JPanel ControlPanel;
    private javax.swing.JLabel Karakter;
    private javax.swing.JLabel LAngsuran;
    private javax.swing.JLabel LBayar_Hutang;
    private javax.swing.JLabel LBayar_Setiap_Bulan;
    private javax.swing.JLabel LBulan;
    private javax.swing.JLabel LBunga5;
    private javax.swing.JLabel LID_Anggota;
    public javax.swing.JLabel LJam;
    private javax.swing.JLabel LJenis_Kelamin;
    private javax.swing.JLabel LJumlah_Simpan_Setor_Uang;
    private javax.swing.JLabel LKeterangan;
    private javax.swing.JLabel LTanggal_Lahir;
    private javax.swing.JLabel LTanggal_Registrasi;
    public javax.swing.JLabel LTgl;
    private javax.swing.JLabel LTotal_Pinjam;
    private javax.swing.JLabel LTotal_Simpanan;
    private javax.swing.JLabel L_Jumlah_Pinjam;
    private javax.swing.JLabel L_Pinjam_Bayar_Hutang;
    private javax.swing.JLabel L_Simpan_Setor_Uang;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JPanel MemberPanel;
    private javax.swing.JLabel Nama_Lengkap;
    private javax.swing.JPanel Panel_Pinjam_Bayar_Hutang;
    private javax.swing.JPanel Panel_Simpan;
    private javax.swing.JPanel Panel_Simpan1;
    private javax.swing.JPanel Panel_Simpan_Setor_Uang;
    private javax.swing.JLabel Pekerjaan;
    private javax.swing.JPanel SearchPanel;
    private javax.swing.JSpinner Spinner_Angsuran;
    private javax.swing.JPanel TablePanel;
    private javax.swing.JButton button_Baru;
    private javax.swing.JButton button_Batal;
    private javax.swing.JButton button_Bayar_Hutang;
    private javax.swing.JButton button_Bersih_Pinjam_Bayar_Hutang;
    private javax.swing.JButton button_Bersih_Simpan_Setor_Uang;
    private javax.swing.JButton button_Cari;
    private javax.swing.JButton button_Cetak;
    private javax.swing.JButton button_Hapus;
    private javax.swing.JButton button_Hasilkan_ID;
    private javax.swing.JButton button_Hitung_Pinjam_Bayar_Hutang;
    private javax.swing.JButton button_Hitung_Simpan_Setor_Uang;
    private javax.swing.JButton button_Keluar;
    private javax.swing.JButton button_Laporan;
    private javax.swing.JButton button_Perbarui;
    private javax.swing.JButton button_Simpan_Pinjam_Bayar_Hutang;
    private javax.swing.JButton button_Simpan_Simpan_Setor_Uang;
    private javax.swing.JButton button_Tentang;
    private javax.swing.JComboBox<String> comboBox_Kartu_Identitas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel logokoperasi;
    private javax.swing.JRadioButton radioButton_Pria;
    private javax.swing.JRadioButton radioButton_Wanita;
    private javax.swing.JLabel refresh;
    private javax.swing.JLabel status1;
    private javax.swing.JLabel status2;
    private javax.swing.JTable table_KSP;
    private javax.swing.JTextArea textArea_Alamat;
    private javax.swing.JTextField textField_Bayar_Hutang;
    private javax.swing.JTextField textField_Bayar_Setiap_Bulan;
    private javax.swing.JTextField textField_Cari;
    private javax.swing.JTextField textField_ID_Anggota;
    private javax.swing.JTextField textField_Jumlah_Pinjam;
    private javax.swing.JTextField textField_Jumlah_Simpan_Setor_Uang;
    private javax.swing.JTextField textField_Keterangan;
    private javax.swing.JTextField textField_Nama_Lengkap;
    private javax.swing.JTextField textField_Nomor_Identitas;
    private javax.swing.JTextField textField_Pekerjaan;
    private com.toedter.calendar.JDateChooser textField_Tanggal_Lahir;
    private javax.swing.JTextField textField_Tanggal_Registrasi;
    private javax.swing.JTextField textField_Total_Pinjaman;
    private javax.swing.JTextField textField_Total_Simpanan;
    // End of variables declaration//GEN-END:variables
}

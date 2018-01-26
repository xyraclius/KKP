/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nabil.form;

import com.nabil.database.KonekDatabase;
import com.nabil.images.BackgroundImage;
import de.javasoft.plaf.synthetica.SyntheticaBlackEyeLookAndFeel;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.UIManager;
import com.nabil.utilities.Utilities;

//Get Source Code: Contact mail@nabilfawwaz.com
/**
 *
 * @author Nabil Fawwaz Elqayyim
 */
public class Login extends javax.swing.JFrame {

    KonekDatabase koneksi; //KonekDatabase.java dijadikan variabel
    ResultSet rs; //Resultset dijadikan variabel
    PreparedStatement ps;
    Utilities utilities; //Memanggil soundEffect.class dan dijadikan variabel
    public Timer time;
    int loading;
    public final static int FOUR_SECONDS = 40; //Waktu progress bar 40(4 detik)

    /**
     * Creates new form NewJFrame
     */
    public Login() {
        initComponents();
        koneksi = new KonekDatabase();//terhubung ke database saat program dijalankan pertama kali       
        utilities = new Utilities();
        setLocationRelativeTo(null);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/com/nabil/images/iconlogin.png"))); //Memuat Icon
        pb.setVisible(false);
    }

    String file = "/com/nabil/images/bg.png"; //Menampilkan background di jPanel
    String file2 = "/com/nabil/images/bg2.png";//check: klik kanan jPanelnya > Properties > Code > Custom Creation Code
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new BackgroundImage(file);
        logoadmin = new javax.swing.JLabel();
        upanel = new BackgroundImage(file2);
        textField_Username = new javax.swing.JTextField();
        enter = new javax.swing.JButton();
        ppanel = new BackgroundImage(file2);
        textField_Password = new javax.swing.JPasswordField();
        picuser = new javax.swing.JLabel();
        picpass = new javax.swing.JLabel();
        pb = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login Panel");
        setResizable(false);

        MainPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.darkGray, java.awt.Color.gray));

        logoadmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoadmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/nabil/images/al.gif"))); // NOI18N

        upanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Username", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14), new java.awt.Color(0, 255, 255)), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N
        upanel.setPreferredSize(new java.awt.Dimension(32, 50));

        textField_Username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField_UsernameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout upanelLayout = new javax.swing.GroupLayout(upanel);
        upanel.setLayout(upanelLayout);
        upanelLayout.setHorizontalGroup(
            upanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, upanelLayout.createSequentialGroup()
                .addComponent(textField_Username)
                .addContainerGap())
        );
        upanelLayout.setVerticalGroup(
            upanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textField_Username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        enter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/nabil/images/lock.png"))); // NOI18N
        enter.setText("Login");
        enter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                enterMouseEntered(evt);
            }
        });
        enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterActionPerformed(evt);
            }
        });

        ppanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14), new java.awt.Color(0, 255, 255)))); // NOI18N

        textField_Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField_PasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ppanelLayout = new javax.swing.GroupLayout(ppanel);
        ppanel.setLayout(ppanelLayout);
        ppanelLayout.setHorizontalGroup(
            ppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textField_Password)
        );
        ppanelLayout.setVerticalGroup(
            ppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textField_Password, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        picuser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/nabil/images/user.png"))); // NOI18N

        picpass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/nabil/images/password.png"))); // NOI18N

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(enter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logoadmin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(picpass))
                            .addComponent(picuser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(upanel, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                            .addComponent(ppanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addComponent(pb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoadmin, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(upanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(picuser))
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(picpass, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(ppanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(enter, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    class TimerListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            loading++; //Mulai Progress Bar
            enter.requestFocusInWindow();
            pb.setValue(loading);
            pb.setString("Logging In");
            if (loading == 1) {
                utilities.clickLogin();
            }
            if (loading >= 37) {
                if (loading == 37) {
                    utilities.clickAuthenticating();
                }
                pb.setForeground(Color.YELLOW);
                pb.setString("Authenticating");
            }
            if (loading >= 75) {
                if (loading == 75) {
                    utilities.clickSuccessLogin();
                }
                pb.setForeground(Color.GREEN);
                pb.setString("Login Successful");
                ImageIcon Unlock = new ImageIcon(getClass().getResource("/com/nabil/images/unlock.png"));
                enter.setIcon(Unlock);
            }
            if (loading == 131) {
                time.stop();        //Berhenti Progress Bar
                new Main().setVisible(true); //Pergi ke Main.java                     
                dispose();          //Close Login.java    
            }
        }
    }

    private void enterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterActionPerformed
        try {
            ps = koneksi.con.prepareStatement("SELECT username, password FROM karyawan WHERE username =? AND password = ?");
            ps.setString(1, textField_Username.getText());
            ps.setString(2, String.valueOf(textField_Password.getPassword()));
            rs = ps.executeQuery();
            if (rs.next()) {
                pb.setVisible(true);
                pb.setStringPainted(true);
                pb.setFont(new Font("sanserif", Font.BOLD, 16));
                loading = -1;
                time = new Timer(FOUR_SECONDS, new TimerListener());
                time.start();
            } else {
                utilities.clickFailure();
                JOptionPane.showMessageDialog(null, "Username atau Password salah",
                        "WARNING", JOptionPane.WARNING_MESSAGE);
            }
        } catch (SQLException e) {
            utilities.clickError();
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan\n" + e,
                    "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_enterActionPerformed

    private void textField_PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField_PasswordActionPerformed
        enterActionPerformed(evt);
        textField_Password.requestFocusInWindow();
    }//GEN-LAST:event_textField_PasswordActionPerformed

    private void textField_UsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField_UsernameActionPerformed
        enterActionPerformed(evt);
        textField_Username.requestFocusInWindow();
    }//GEN-LAST:event_textField_UsernameActionPerformed

    private void enterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enterMouseEntered
        utilities.clickHover();
    }//GEN-LAST:event_enterMouseEntered

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
                UIManager.setLookAndFeel(new SyntheticaBlackEyeLookAndFeel()); //Black Eye Theme
                /*if ("Nimbus".equals(info.getName())) { //Default theme yang ini, terus dijadikan komentar
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }*/
            }
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainPanel;
    public javax.swing.JButton enter;
    private javax.swing.JLabel logoadmin;
    public javax.swing.JProgressBar pb;
    private javax.swing.JLabel picpass;
    private javax.swing.JLabel picuser;
    private javax.swing.JPanel ppanel;
    private javax.swing.JPasswordField textField_Password;
    private javax.swing.JTextField textField_Username;
    private javax.swing.JPanel upanel;
    // End of variables declaration//GEN-END:variables
}

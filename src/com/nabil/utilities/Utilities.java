/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nabil.utilities;

import java.awt.Component;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Xyraclius
 */
public class Utilities {   

    public void welcome() {
        try {
            String soundFile = "/com/nabil/sounds/welcome.wav";
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(getClass().getResource(soundFile));
            Clip clip = AudioSystem.getClip();
            clip.open(audioIn);
            clip.start();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            System.out.print("Error: " + e);
        }
    }

    public void clickLogin() {
        try {
            String soundFile = "/com/nabil/sounds/logging-in.wav";
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(getClass().getResource(soundFile));
            Clip clip = AudioSystem.getClip();
            clip.open(audioIn);
            clip.start();
        } catch (IOException | LineUnavailableException | UnsupportedAudioFileException e) {
            System.out.print("ERROR: " + e);
        }
    }

    public void clickAuthenticating() {
        try {
            String soundFile = "/com/nabil/sounds/authenticating.wav";
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(getClass().getResource(soundFile));
            Clip clip = AudioSystem.getClip();
            clip.open(audioIn);
            clip.start();
        } catch (IOException | LineUnavailableException | UnsupportedAudioFileException e) {
            System.out.print("ERROR: " + e);
        }
    }

    public void clickSuccessLogin() {
        try {
            String soundFile = "/com/nabil/sounds/successlogin.wav";
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(getClass().getResource(soundFile));
            Clip clip = AudioSystem.getClip();
            clip.open(audioIn);
            clip.start();
        } catch (IOException | LineUnavailableException | UnsupportedAudioFileException e) {
            System.out.print("ERROR: " + e);
        }
    }

    public void clickError() {
        try {
            String soundFile = "/com/nabil/sounds/error.wav";
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(getClass().getResource(soundFile));
            Clip clip = AudioSystem.getClip();
            clip.open(audioIn);
            clip.start();
        } catch (IOException | LineUnavailableException | UnsupportedAudioFileException e) {
            System.out.print("ERROR: " + e);
        }
    }

    public void clickGo() {
        try {
            String soundFile = "/com/nabil/sounds/go.wav";
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(getClass().getResource(soundFile));
            Clip clip = AudioSystem.getClip();
            clip.open(audioIn);
            clip.start();
        } catch (IOException | LineUnavailableException | UnsupportedAudioFileException e) {
            System.out.print("ERROR: " + e);
        }

    }

    public void clickCancel() {
        try {
            String soundFile = "/com/nabil/sounds/back.wav";
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(getClass().getResource(soundFile));
            Clip clip = AudioSystem.getClip();
            clip.open(audioIn);
            clip.start();
        } catch (IOException | LineUnavailableException | UnsupportedAudioFileException e) {
            System.out.print("ERROR: " + e);
        }
    }

    public void clickSuccess() {
        try {
            String soundFile = "/com/nabil/sounds/success.wav";
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(getClass().getResource(soundFile));
            Clip clip = AudioSystem.getClip();
            clip.open(audioIn);
            clip.start();
        } catch (IOException | LineUnavailableException | UnsupportedAudioFileException e) {
            System.out.print("ERROR: " + e);
        }
    }

    public void clickFailure() {
        try {
            String soundFile = "/com/nabil/sounds/fail.wav";
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(getClass().getResource(soundFile));
            Clip clip = AudioSystem.getClip();
            clip.open(audioIn);
            clip.start();
        } catch (IOException | LineUnavailableException | UnsupportedAudioFileException e) {
            System.out.print("ERROR: " + e);
        }
    }

    public void clickWarning() {
        try {
            String soundFile = "/com/nabil/sounds/warning.wav";
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(getClass().getResource(soundFile));
            Clip clip = AudioSystem.getClip();
            clip.open(audioIn);
            clip.start();
        } catch (IOException | LineUnavailableException | UnsupportedAudioFileException e) {
            System.out.print("ERROR: " + e);
        }
    }

    public void clickHover() {
        try {
            String soundFile = "/com/nabil/sounds/hover.wav";
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(getClass().getResource(soundFile));
            Clip clip = AudioSystem.getClip();
            clip.open(audioIn);
            clip.start();
        } catch (IOException | LineUnavailableException | UnsupportedAudioFileException e) {
            System.out.print("ERROR: " + e);
        }
    }

    public static class toolTipTextTable extends DefaultTableCellRenderer {

        //Supaya muncul tooltip text saat hover pada cell table
        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            setToolTipText(value.toString());
            return super.getTableCellRendererComponent(table,
                    value,
                    isSelected,
                    hasFocus,
                    row,
                    column);
        }
    }

    public static Date getTanggalFromTable(JTable table, int kolom) {
        JTable tabel = table; //dari jTable ke textfield jCalendar
        String str_tgl = String.valueOf(tabel.getValueAt(tabel.getSelectedRow(), kolom));
        Date tanggal = null;
        try {
            tanggal = new SimpleDateFormat("yyyy-MM-dd").parse(str_tgl);
        } catch (ParseException ex) {
            System.out.print(ex);
        }
        return tanggal;
    }
}
//Sebagian ada yang ga bisa ditaro disini, makanya ada yang ditaro didalam 1 class

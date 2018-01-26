/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nabil.images;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Nabil Fawwaz Elqayyim | mail@nabilfawwaz.com | www.nabilfawwaz.com
 * Java Class ini fungsinya untuk menambahkan background pada jPanel yang ada di
 * form Login Bisa dilihat di jPanelnya > Properties > Code > Custom Creation
 * Code
 */
public class BackgroundImage extends JPanel {

    private final Image image;

    public BackgroundImage(String file) {
        image = new ImageIcon(getClass().getResource(file)).getImage();
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        super.paintComponent(grphcs);
        Graphics2D gd = (Graphics2D) grphcs.create();
        gd.drawImage(image, 0, 0, getWidth(), getHeight(), null);
        gd.dispose();
    }
}

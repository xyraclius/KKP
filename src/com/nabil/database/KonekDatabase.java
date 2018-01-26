package com.nabil.database;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JLabel;

public class KonekDatabase {

    public Connection con;
    public JLabel labal = new JLabel();    

    public KonekDatabase() {
        String url, id, pass;
        id = "root";
        pass = "";
        url = "jdbc:mysql://localhost:3306/kkp";
        try {
            con = DriverManager.getConnection(url, id, pass);
            labal.setForeground(Color.green);
            labal.setText("Terhubung");
        } catch (SQLException e) {
            System.out.print("Message: " + e);
            labal.setText("Terputus");
        }                
    }   
}
//Get Source Code: Contact mail@nabilfawwaz.com

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author User
 */
public class ProductBDConnection {


    public static Connection getConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rnd", "root", "1234");
            System.out.println("JDBC Connected");
        } catch (SQLException ex) {
            Logger.getLogger(ProductBDConnection.class.getName()).log(Level.SEVERE, null, ex);
        }

        return conn;
    }

}

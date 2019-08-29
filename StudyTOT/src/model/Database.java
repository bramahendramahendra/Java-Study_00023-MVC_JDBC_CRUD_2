/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Brama Hendra Mahendra
 */
public class Database {
    private Connection conn = null;
    private Statement stat = null;
    private ResultSet rs = null;

    public Database() {
    }
    
    public void connect(){
        try {
            String url = "jdbc:mysql://localhost/project_java_00017";
            String user = "root";
            String pass = "";
            conn = DriverManager.getConnection(url, user, pass);
            stat = conn.createStatement();
        } catch (SQLException se) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, se);
        }
    }
    
    public void disconnect(){
        try {
            conn.close();
            stat.close();
        } catch (SQLException se) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, se);
        }
    }
    
    public boolean manipulate(String query) {
        boolean cek = false;
        try {
            int rows = stat.executeUpdate(query);
            if(rows>0) cek = true;
        } catch (SQLException se) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, se);
        }
        return cek;
    }
}

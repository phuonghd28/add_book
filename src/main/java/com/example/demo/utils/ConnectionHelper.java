package com.example.demo.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionHelper {
    static Connection conn = null;
    public static Connection getConn() {
        String dbUrl = "jdbc:mysql://localhost:3306/library";
        String dbClass = "com.mysql.jdbc.Driver";
        try {
            if (conn == null){
                Class.forName(dbClass);
                conn = DriverManager.getConnection(dbUrl, "root", "");
            }
            return conn;

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
}

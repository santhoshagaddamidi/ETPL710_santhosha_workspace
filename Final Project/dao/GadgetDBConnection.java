package com.evergent.corejava.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class GadgetDBConnection {
		
    public static Connection getConnection() throws Exception {
        // Load MySQL JDBC driver
        Class.forName("com.mysql.jdbc.Driver");

        // Establish the connection to the MySQL database
        Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/gadgetdb",  // Update the database name
                "root",                                  // Database username
                "admin"                                   // Database password
        );
        
        // Return the established connection
        return conn;
    }

}
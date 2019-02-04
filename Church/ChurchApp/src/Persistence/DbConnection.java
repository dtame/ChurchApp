/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author dtame
 */
public class DbConnection {
    private static final String connectionString = "jdbc:derby://localhost:1527/ChurchDB;user=su;password=key01";
    private static Connection dbConnection = null;
    public static Connection GetInstance(){
        try {
            if(dbConnection == null){
                dbConnection = DriverManager.getConnection(connectionString);
            }            
        } catch(SQLException ex){            
        }
        return dbConnection;
    }    
}


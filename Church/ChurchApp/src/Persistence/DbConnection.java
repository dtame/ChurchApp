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
    private static Connection dbConnection = null;
    public static Connection GetInstance(){
        try {
            if(dbConnection == null){
                dbConnection = DriverManager.getConnection("jdbc:derby://localhost:1527/ChurchDB", "su", "key01");
            }            
        } catch(SQLException ex){            
        }
        return dbConnection;
    }    
}


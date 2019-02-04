/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import Domain.Verse;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author dtame
 */
public class Repository {
    public Verse Search(Verse aVerse){
        try {
            String query = "SELECT * FROM BIBLEDB_KJVBOOK";
            PreparedStatement statement = DbConnection.GetInstance().prepareStatement(query);   
            ResultSet result = statement.executeQuery();
            return new Verse();
        } catch(SQLException ex){
            Verse averse = new Verse();
            averse.setChapter(-1);
            return averse;
        }                        
    }
}

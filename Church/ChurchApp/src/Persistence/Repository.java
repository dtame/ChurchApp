/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import Domain.Verse;
import Presentation.VerseViewModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dtame
 */
public class Repository {
    public List<Verse> Search(VerseViewModel aVerse){
        try {
            List<Verse> verses = new ArrayList<>();
            
            Boolean multipleVerseQuery = false;
            String query = "select book.\"NAME\", bible.CHAPTERNO, bible.VERSENO, bible.versetext from bibledb_kjv as bible"
                           + " join bibledb_kjv_book as book on bible.BOOKID = book.ID"
                           + " where book.\"NAME\" LIKE ? and bible.CHAPTERNO = ? and ";
            if(aVerse.getStartVerse() != 0 && aVerse.getEndVerse() == 0){
                query = query + "bible.VERSENO = ?";
            }            
            else if(aVerse.getStartVerse() != 0 && aVerse.getEndVerse() != 0) {
                query = query + "bible.VERSENO > ? and bible.VERSENO < ? ";
                multipleVerseQuery = true;
            }
            
            PreparedStatement statement = DbConnection.GetInstance().prepareStatement(query);   
            statement.setString(1, aVerse.getBook() + "%");
            statement.setInt(2, aVerse.getChapter());
            
            if (multipleVerseQuery == true){
                statement.setInt(3, aVerse.getStartVerse()-1);
                statement.setInt(4, aVerse.getEndVerse()+1);
            }else{
                statement.setInt(3, aVerse.getStartVerse());
            }            
            ResultSet result = statement.executeQuery();
            
            while(result.next()){
                Verse verse = new Verse();
                verse.setBook(result.getString("NAME"));
                verse.setVerseId(result.getInt("VERSENO"));
                verse.setChapter(result.getInt("CHAPTERNO"));
                verse.setText(result.getString("VERSETEXT"));
                verses.add(verse);
            }
            return verses;
        } catch(SQLException ex){           
            return null;
        }                        
    }
}

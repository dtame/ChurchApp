/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Domain.Verse;
import Presentation.VerseViewModel;
import java.util.List;
import javax.swing.ListModel;

/**
 *
 * @author dtame
 */
public class Helper {
 
    public static VerseViewModel ConvertToVerse(String text){
        VerseViewModel result = new VerseViewModel();
        int semicolonSeperation = text.indexOf(":");        
        
        String verse = text.substring(semicolonSeperation + 1);
        String bookchap = text.substring(0, semicolonSeperation);
        String[] verseToRead = verse.split("-");                
        int spaceSeperator = bookchap.lastIndexOf(" ");
                                        
        String book = bookchap.substring(0,spaceSeperator);
        String chap = bookchap.substring(spaceSeperator +1);        
        
        result.setBook(CapitalizeFirstChar(book));
        result.setChapter(Integer.parseInt(chap));
        result.setStartVerse(Integer.parseInt(verseToRead[0]));
        if(verse.contains("-")){
            result.setEndVerse(Integer.parseInt(verseToRead[1]));
        }        
        return result;
    }
     
    private static String CapitalizeFirstChar(String word){
        char[] chars = word.toCharArray();        
        for(char aChar : chars){
            if(!Character.isWhitespace(aChar) && !Character.isDigit(aChar)){
                word = Character.toUpperCase(chars[0]) + word.substring(1);
                break;
            }else if(Character.isDigit(aChar)){
                if(chars[1] != Character.SPACE_SEPARATOR){
                    word = aChar +" "+ CapitalizeFirstChar(word.substring(1));
                    break;
                }
                
            }else if(Character.isSpaceChar(aChar)){
                word = CapitalizeFirstChar(word.substring(1));
                break;
            }
        }
        return word;
    }
}

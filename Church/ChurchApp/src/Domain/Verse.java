/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

/**
 *
 * @author dtame
 */
public class Verse extends BaseContent{
    String Book;
    int Chapter;
    String Text;
    
    @Override
    public int GetContentType(){
        return ContentType.BIBLE;
    }
}

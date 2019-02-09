/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Presentation.VerseViewModel;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author dtame
 */
public class HelperNGTest {
    
    public HelperNGTest() {
    }

    /**
     * Test of ConvertToVerse method, of class Helper.
     */
    @Test
    public void testConvertToVerse() {
        System.out.println("ConvertToVerse");
        String text = "gen 1:3-5";
        VerseViewModel expResult = new VerseViewModel();
        expResult.setBook("gen");
        expResult.setChapter(1);
        expResult.setStartVerse(3);
        expResult.setEndVerse(5);
        VerseViewModel result = Helper.ConvertToVerse(text);
        assertEquals(result.getBook(), expResult.getBook());        
    }
    
    @Test
    public void testConvertToVerseSingle() {
        System.out.println("ConvertToVerse");
        String text = "gen 1:3";
        VerseViewModel expResult = new VerseViewModel();
        expResult.setBook("gen");
        expResult.setChapter(1);
        expResult.setStartVerse(3);
        expResult.setEndVerse(5);
        VerseViewModel result = Helper.ConvertToVerse(text);
        assertEquals(result.getBook(), expResult.getBook());        
    }
}

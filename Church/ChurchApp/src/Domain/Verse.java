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
public class Verse implements IBaseContent{
    String Book;
    int Chapter;
    String Text;
  
public class Verse extends BaseContent{

    /**
     * @return the Book
     */
    public String getBook() {
        return Book;
    }

    /**
     * @param Book the Book to set
     */
    public void setBook(String Book) {
        this.Book = Book;
    }

    /**
     * @return the Chapter
     */
    public int getChapter() {
        return Chapter;
    }

    /**
     * @param Chapter the Chapter to set
     */
    public void setChapter(int Chapter) {
        this.Chapter = Chapter;
    }

    /**
     * @return the Text
     */
    public String getText() {
        return Text;
    }

    /**
     * @param Text the Text to set
     */
    public void setText(String Text) {
        this.Text = Text;
    }
    private String Book;
    private int Chapter;
    private String Text;
    
    public int GetContentType(){
        return ContentType.BIBLE;
    }
}

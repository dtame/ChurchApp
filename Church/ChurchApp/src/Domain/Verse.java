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
       private int VerseId;

    /**
     * @return the Book
     */
    public String getBook() {
        return book;
    }

    /**
     * @param Book the Book to set
     */
    public void setBook(String Book) {
        this.book = Book;
    }

    /**
     * @return the Chapter
     */
    public int getChapter() {
        return chapter;
    }

    /**
     * @param Chapter the Chapter to set
     */
    public void setChapter(int Chapter) {
        this.chapter = Chapter;
    }

    /**
     * @return the Text
     */
    public String getText() {
        return text;
    }

    /**
     * @param Text the Text to set
     */
    public void setText(String Text) {
        this.text = Text;
    }
    private String book;
    private int chapter;
    private String text;
    
    @Override
    public int GetContentType(){
        return ContentType.BIBLE;
    }

    /**
     * @return the VerseId
     */
    public int getVerseId() {
        return VerseId;
    }

    /**
     * @param VerseId the VerseId to set
     */
    public void setVerseId(int VerseId) {
        this.VerseId = VerseId;
    }
}

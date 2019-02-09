/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

/**
 *
 * @author dtame
 */
public class VerseViewModel {
    private String book;
    private int chapter;
    private int startVerse;
    private int endVerse;

    /**
     * @return the book
     */
    public String getBook() {
        return book;
    }

    /**
     * @param book the book to set
     */
    public void setBook(String book) {
        this.book = book;
    }

    /**
     * @return the chapter
     */
    public int getChapter() {
        return chapter;
    }

    /**
     * @param chapter the chapter to set
     */
    public void setChapter(int chapter) {
        this.chapter = chapter;
    }

    /**
     * @return the startVerse
     */
    public int getStartVerse() {
        return startVerse;
    }

    /**
     * @param startVerse the startVerse to set
     */
    public void setStartVerse(int startVerse) {
        this.startVerse = startVerse;
    }

    /**
     * @return the endVerse
     */
    public int getEndVerse() {
        return endVerse;
    }

    /**
     * @param endVerse the endVerse to set
     */
    public void setEndVerse(int endVerse) {
        this.endVerse = endVerse;
    }
}

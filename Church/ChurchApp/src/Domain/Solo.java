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
public class Solo {

    /**
     * @return the SongId
     */
    public int getSongId() {
        return SongId;
    }

    /**
     * @param SongId the SongId to set
     */
    public void setSongId(int SongId) {
        this.SongId = SongId;
    }

    /**
     * @return the SoloPosition
     */
    public int getSoloPosition() {
        return SoloPosition;
    }

    /**
     * @param SoloPosition the SoloPosition to set
     */
    public void setSoloPosition(int SoloPosition) {
        this.SoloPosition = SoloPosition;
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

    /**
     * @return the SoloType
     */
    public int getSoloType() {
        return SoloType;
    }

    /**
     * @param SoloType the SoloType to set
     */
    public void setSoloType(int SoloType) {
        this.SoloType = SoloType;
    }
    private int SongId;
    private int SoloPosition;
    private String Text;
    private int SoloType;
}

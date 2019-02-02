/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import java.util.List;

/**
 *
 * @author dtame
 */
public class Song extends BaseContent{

    /**
     * @return the Id
     */
    public int getId() {
        return Id;
    }

    /**
     * @param Id the Id to set
     */
    public void setId(int Id) {
        this.Id = Id;
    }

    /**
     * @return the Title
     */
    public String getTitle() {
        return Title;
    }

    /**
     * @param Title the Title to set
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * @return the Solos
     */
    public List<Solo> getSolos() {
        return Solos;
    }

    /**
     * @param Solos the Solos to set
     */
    public void setSolos(List<Solo> Solos) {
        this.Solos = Solos;
    }
    private int Id;
    private String Title;
    private List<Solo> Solos;
    
    public void AddSolo(Solo aSolo){
        if( ( (aSolo.getSoloType() == SoloType.REFRAIN) && !Solos.stream().anyMatch(x -> x.getSoloType() == SoloType.REFRAIN)) || (aSolo.getSoloType() == SoloType.SOLO)){
            getSolos().add(aSolo);
        }
    }
    
    @Override
    public int GetContentType(){
        return ContentType.SONG;
    }
}

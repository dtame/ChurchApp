/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Application;

import Domain.Announcement;
import Domain.Song;
import Domain.Verse;
import Persistence.Repository;
import Presentation.VerseViewModel;
import java.util.List;

/**
 *
 * @author dtame
 */
public class ApplicationLogic implements IApplicationLogic{
    Repository repo = new Repository();
    
    @Override
    public List<Verse> VerseSearch(VerseViewModel model) {
        return repo.Search(model);                
    }

    @Override
    public Song SingleSongSerach(String key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Announcement SaveAnnouncement(Announcement announce) {
        return repo.SaveAnnouncement(announce);
    }

    @Override
    public Boolean DeleteAnnouncement(Announcement announce) {
        return repo.DeleteAnnouncement(announce);
    }

    @Override
    public List<Announcement> AnnouncementSearch(String key) {
        return repo.AnnouncementSearch(key);
    }
    
}

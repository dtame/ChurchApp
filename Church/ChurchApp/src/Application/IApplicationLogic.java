/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Application;

import Domain.Announcement;
import Domain.Song;
import Domain.Verse;
import Presentation.VerseViewModel;
import java.util.List;

/**
 *
 * @author dtame
 */
public interface IApplicationLogic {
    List<Verse> VerseSearch(VerseViewModel model);    
    Song SingleSongSerach(String key);
    List<Announcement> AnnouncementSearch(String key);
    Announcement SaveAnnouncement(Announcement announce);
    Boolean DeleteAnnouncement(Announcement announce);
}

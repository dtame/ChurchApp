/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Application;

import Domain.Song;
import Domain.Verse;
import java.util.List;

/**
 *
 * @author dtame
 */
public interface IApplicationLogic {
    Verse SingleVerseSearch(String key);
    List<Verse> MultipleVerseSearch(List<String> keys);
    Song SingleSongSerach(String key);
}

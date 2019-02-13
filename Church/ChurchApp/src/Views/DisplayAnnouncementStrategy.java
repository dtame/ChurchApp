/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Domain.IBaseContent;
import Views.Contract.DisplayContentStrategy;
import java.util.List;
import javax.swing.JFrame;

/**
 *
 * @author dtame
 */
public class DisplayAnnouncementStrategy implements DisplayContentStrategy{

    @Override
    public void Display(JFrame frame, IBaseContent content) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Display(JFrame frame, List<? extends IBaseContent> content) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

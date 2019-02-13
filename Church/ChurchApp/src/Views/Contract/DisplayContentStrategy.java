/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views.Contract;

import Domain.IBaseContent;
import java.util.List;
import javax.swing.JFrame;

/**
 *
 * @author dtame
 */
public interface DisplayContentStrategy {
    void Display(JFrame frame, IBaseContent content);
    void Display(JFrame frame, List<? extends IBaseContent> content);
}

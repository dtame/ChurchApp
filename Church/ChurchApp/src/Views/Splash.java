/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JWindow;
import javax.swing.SwingConstants;

/**
 *
 * @author tame
 */
public class Splash {
    JWindow window ;
    public Splash(){
        window = new JWindow();
    }
    
    public void InitSplash(){
        JLabel spLabel = new JLabel("", SwingConstants.CENTER);
        spLabel.setIcon(new ImageIcon(getClass().getResource("/Presentation/images/splash.jpg")));
        
        window.getContentPane().add(spLabel);
        window.setBounds(400, 150, 500, 380);
        window.setVisible(true);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }
        window.setVisible(false);
    }
    
    public void CloseSplash(){
        window.dispose();
    }
}

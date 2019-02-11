/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Domain.IBaseContent;
import Domain.Verse;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 *
 * @author dtame
 */
public class DisplayPanel extends javax.swing.JFrame{
    private static DisplayPanel instance;
    
    private DisplayPanel(){}
    
    public static DisplayPanel Get(){
        if(instance == null){
            instance = new DisplayPanel();
            instance.setLayout(null);
            instance.setUndecorated(true);
            //instance.getRootPane().setWindowDecorationStyle(JRootPane.NONE);
        }        
        return instance;
    }
    
    public void Close(){
        instance.setExtendedState(JFrame.NORMAL);
        instance.setVisible((false));
    }
    
    public void Display(IBaseContent content){
        if(content instanceof Verse){
            JLabel background = new JLabel(new ImageIcon(getClass().getResource("/Presentation/images/default.jpg")));
            background.setText(((Verse) content).getBook() +" "+((Verse) content).getChapter()+": "+((Verse) content).getVerseId());
            background.setOpaque(false);
            instance.setContentPane(background);
            //Container cont = instance.getContentPane();
            instance.setExtendedState(JFrame.MAXIMIZED_BOTH);
            //JLabel title = new JLabel(((Verse) content).getBook() +" "+((Verse) content).getChapter()+": "+((Verse) content).getVerseId());
            //JLabel text = new JLabel(((Verse) content).getText(), SwingConstants.CENTER);
            
            //instance.getContentPane().add(title, BorderLayout.NORTH);
            //instance.getContentPane().add(text, BorderLayout.CENTER);
            //instance.add(text);
            instance.setVisible(true);
        }
    }
}

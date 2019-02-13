/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Domain.IBaseContent;
import Domain.Verse;
import Views.Contract.DisplayContentStrategy;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 *
 * @author dtame
 */
public class DisplayVerseStrategy implements DisplayContentStrategy {

    @Override
    public void Display(JFrame frame, IBaseContent content) {
            JLabel background = new JLabel(new ImageIcon(getClass().getResource("/Presentation/images/default.jpg")));
            background.setLayout(new BorderLayout());
            frame.add(background);
            
            frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
            String titleStr = ((Verse) content).getBook() +" "+((Verse) content).getChapter()+": "+((Verse) content).getVerseId();
            JLabel title = new JLabel("<html><font size = 10>"+titleStr+"</font></html>");
            title.setFont(title.getFont().deriveFont(Font.BOLD, 48));
            title.setForeground(Color.BLACK);
            title.setHorizontalAlignment(JLabel.NORTH);
            
            JLabel text = new JLabel(((Verse) content).getText(), SwingConstants.CENTER);
            text.setFont(title.getFont().deriveFont(Font.BOLD, 48));
            text.setForeground(Color.BLACK);
            text.setHorizontalAlignment(JLabel.CENTER);
            
            background.add(title);
            background.add(text);
            frame.pack();
            frame.setVisible(true);
    }

    @Override
    public void Display(JFrame frame, List<? extends IBaseContent> content) {
        
        List<Verse> ctn = (List<Verse>)content;
        
            JLabel background = new JLabel(new ImageIcon(getClass().getResource("/Presentation/images/default.jpg")));
            background.setLayout(new BorderLayout());
            frame.add(background);            
            frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
            Verse firstVerse = ctn.stream().findFirst().get();
            
            String titleStr = firstVerse.getBook() +" "+firstVerse.getChapter()+": "+firstVerse.getVerseId();
            JLabel title = new JLabel(titleStr);
            title.setFont(title.getFont().deriveFont(Font.BOLD, 48));
            title.setForeground(Color.BLACK);
            //title.setHorizontalAlignment(JLabel.NORTH);
            
            String textStr = "<html>";
            textStr = textStr + "<p>"+titleStr+"</p>";
            for(IBaseContent vrs : content){
                textStr = textStr 
                        +" "+((Verse)vrs).getVerseId()+"-"
                        +((Verse)vrs).getText();
            }            
            textStr = textStr + "</html>";
            
            JLabel text = new JLabel(textStr, SwingConstants.CENTER);
            text.setFont(title.getFont().deriveFont(Font.BOLD, 24));
            text.setForeground(Color.BLACK);
            text.setHorizontalAlignment(JLabel.CENTER);
            
            background.add(title);
            background.add(text);
            frame.pack();
            frame.setVisible(true);
    }
    
}

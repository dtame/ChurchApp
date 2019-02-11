/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Domain.Verse;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Insets;
import javax.swing.BoxLayout;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListCellRenderer;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

/**
 *
 * @author dtame
 */
public class VerseRenderer extends JPanel implements ListCellRenderer<Verse> {
    
    public VerseRenderer(){
        super();        
    }
        
    @Override
    public Component getListCellRendererComponent(JList<? extends Verse> list
                                                , Verse value
                                                , int index
                                                , boolean isSelected
                                                , boolean cellHasFocus) {       
        this.removeAll();
        String txt = Integer.toString(value.getVerseId());
        JLabel verseNo = new JLabel(txt);
        verseNo.setBackground(Color.WHITE);
        verseNo.setFont(new Font(this.getFont().getName(), Font.BOLD, 18));
        verseNo.setBorder(new EmptyBorder(0, 0, 0, 5));
        
        JLabel verseText = new JLabel(value.getText());
        verseText.setBackground(Color.WHITE);
        verseText.setFont(new Font(this.getFont().getName(), Font.PLAIN, 14));
        
        this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        this.setBackground(Color.WHITE);
        
        this.add(verseNo);
        this.add(verseText);
        
        if(isSelected){
            this.setBackground(Color.LIGHT_GRAY);
        }else{
            this.setBackground(Color.WHITE);
        }
        return this;
    }  
}

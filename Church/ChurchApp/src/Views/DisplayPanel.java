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
import java.awt.Container;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.util.List;
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
    private static DisplayContentStrategy displayStragegy;
    
    private DisplayPanel(){}
    
    public static DisplayPanel Get(){
        if(instance == null){
            instance = new DisplayPanel();
            instance.setLayout(new GridBagLayout());        
        }        
        return instance;
    }
    
    public void Close(){
        instance.setExtendedState(JFrame.NORMAL);
        instance.setVisible((false));
    }
    
    public void SetDisplayStrategy(DisplayContentStrategy strategy){
        displayStragegy = strategy;
    }
    public void Display(IBaseContent content){
        displayStragegy.Display(this, content);                
    }
    
    public void Display(List<? extends IBaseContent> content){
        displayStragegy.Display(this, (List<IBaseContent>) content);
    }
}

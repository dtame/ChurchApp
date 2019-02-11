/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Domain.IBaseContent;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dtame
 */
public class DisplayContainer {
    private static final List<IBaseContent> DataPipeline = new ArrayList<>();
    
    public static void AddContent(IBaseContent content){
        DataPipeline.add(content);
    }
    
    public static void remove(IBaseContent content){
        DataPipeline.remove(content);
    }
}

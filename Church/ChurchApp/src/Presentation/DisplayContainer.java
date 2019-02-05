/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Domain.IBaseContent;
import java.util.List;

/**
 *
 * @author dtame
 */
public class DisplayContainer {
    private List<IBaseContent> DataPipeline ;
    
    public void AddContent(IBaseContent content){
        DataPipeline.add(content);
    }
    
    public void remove(IBaseContent content){
        DataPipeline.remove(content);
    }
}

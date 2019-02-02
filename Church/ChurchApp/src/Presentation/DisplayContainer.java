/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Domain.BaseContent;
import java.util.List;

/**
 *
 * @author dtame
 */
public class DisplayContainer {
    private List<BaseContent> DataPipeline ;
    
    public void AddContent(BaseContent content){
        DataPipeline.add(content);
    }
    
    public void remove(BaseContent content){
        DataPipeline.remove(content);
    }
}

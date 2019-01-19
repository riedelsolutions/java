/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.logic;
import java.util.ArrayList;
import java.util.List;
import moving.domain.Box;
import moving.domain.Thing;

/**
 *
 * @author cam
 */
public class Packer{
    private int boxesVolume;
    
    public Packer (int boxesVolume){
        this.boxesVolume = boxesVolume;
    }
     public List<Box> packThings(List<Thing> things){
         
           List<Box> thingsInsideBox = new ArrayList<Box>();
        
        Box box = new Box(this.boxesVolume);
        
        for (Thing i : things){
            
            while(box.addThing(i)){
                System.out.println("Adding things");
            }
            
            
            
            if(!box.addThing(i)){
                thingsInsideBox.add(box);
                box = new Box(this.boxesVolume);
            }
        }
        
        return thingsInsideBox;
         
     }
  
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.domain;

/**
 *
 * @author cam
 */

import java.util.*;

public class Box implements Thing {
    
    private int maxCapacity;
    private List<Thing> things;
    
    public Box(int maximumCapacity){
        this.maxCapacity = maximumCapacity;
        this.things = new ArrayList<Thing>();
    }
    
      public boolean addThing(Thing thing){
        if(this.maxCapacity - this.getVolume() >= thing.getVolume()){
            this.things.add(thing);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int getVolume() {
        int vol = 0;
        
        for(Thing i : this.things){
            vol += i.getVolume();
        }
        
        return vol;
    }
    
}

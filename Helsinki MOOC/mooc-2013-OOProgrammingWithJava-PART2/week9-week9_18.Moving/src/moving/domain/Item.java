/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.domain;

/**
 * @author cam
 */

public class Item implements Thing, Comparable<Item> {

    private String name;
    private int getVolume;
    
    public Item (String name, int getVolume){
        this.name = name;
        this.getVolume = getVolume;
    }
    
    public String getName(){
        return this.name;
    }
    
    @Override
    public int getVolume() {
        return this.getVolume;
    }
    
    
    @Override
    public String toString(){
        return (this.name + " (" + this.getVolume + " dm^3)");
    }
    
    @Override
    public int compareTo(Item t) {
         if(this.getVolume == t.getVolume) {
            return 0;
        } else if (this.getVolume > t.getVolume) {
            return 1;
        } else {
            return -1;
        }
    }
    
}

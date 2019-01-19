/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cam
 */
import java.util.ArrayList;

public class Suitcase {

    private int maxWeight;
    private int totalWeight;
    private ArrayList<Thing> things = new ArrayList<Thing>();

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.things = new ArrayList<Thing>();
        this.totalWeight = 0;
    }

    public void addThing(Thing thing) {
        if (maxWeight >= (thing.getWeight() + totalWeight)) {
            things.add(thing);
            totalWeight = totalWeight + thing.getWeight();
        }
    }

    public void printThings() {
        for (Thing a : things) {
            System.out.println(a.toString());
        }
    }
    
    public int totalWeight(){
        return totalWeight;
    }
    
    public Thing heaviestThing(){
        Thing weightComparer = new Thing ("Comparer", 0);
       for (Thing a : things){
           if (a.getWeight() > weightComparer.getWeight()){
               weightComparer = a;
           }
       }
       
        if(things.isEmpty()){
            return null;
        }else{
        System.out.print("The heaviest thing: ");
       return (weightComparer); }
    }

    @Override
    public String toString() {
        if (things.isEmpty()) {
            return ("empty (0 kg)");
        } else if (things.size() == 1) {
            return (things.size() + " thing (" + totalWeight + " kg)");
        } else {
            return (things.size() + " things (" + totalWeight + " kg)");
        }
    }
}

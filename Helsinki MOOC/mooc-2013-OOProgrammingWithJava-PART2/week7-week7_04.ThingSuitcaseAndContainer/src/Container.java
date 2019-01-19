/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author camil
 */
import java.util.ArrayList;

public class Container {

    private int maxWeight;
    private ArrayList<Suitcase> cases = new ArrayList<Suitcase>();
    private int totalWeight;

    public Container(int maxWeight) {
        this.maxWeight = maxWeight;
        this.cases = new ArrayList<Suitcase>();
        this.totalWeight = 0;
    }

    public void addSuitcase(Suitcase suitcase) {
        
        if (maxWeight >= (suitcase.totalWeight() + totalWeight)){
        cases.add(suitcase);
        totalWeight = totalWeight + suitcase.totalWeight();
        }else{
            
        }
    }

    public void printThings(){
        System.out.println("There are the following things in the container suitcases: ");
        for (Suitcase a : cases){
           a.printThings();
        }
    }
    
    
    @Override
    public String toString() {
        return (cases.size() + " suitcases (" + totalWeight + " kg)");
    }
}

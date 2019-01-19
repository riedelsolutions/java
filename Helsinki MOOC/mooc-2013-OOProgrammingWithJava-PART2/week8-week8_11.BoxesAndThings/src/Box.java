/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cam
 */
import java.util.*;

public class Box implements ToBeStored {

    // private double currentWeight;
    private double maxWeight;
    private ArrayList<ToBeStored> things = new ArrayList<ToBeStored>();

    public Box(double maxWeight) {

        this.maxWeight = maxWeight;
        this.things = new ArrayList<ToBeStored>();
        //this.currentWeight = 0;

    }

    public void add(ToBeStored t) {
        if (weight() + t.weight() < maxWeight) {
            things.add(t);
        }
    }

    public double weight() {
        double weight = 0;
        for (ToBeStored a : things) {
            weight = weight + a.weight();
        }
        return weight;
    }

    @Override
    public String toString() {
        return ("Box: " + things.size() + " things, total weight " + weight() + " kg");
    }
}

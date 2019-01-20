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
public class BirdDatabase {
 
    private ArrayList<Bird> birds;
 
    public BirdDatabase() {
        birds = new ArrayList<Bird>();
    }
 
    public void add(Bird bird) {
        birds.add(bird);
    }
 
    public String toString(Bird bird) {
        return bird.toString();
    }
 
    public void statistics() {
        for (Bird bird : birds) {
            System.out.println(bird);
        }
    }
 
    public void show(String chosenBird) {
        for (Bird bird : birds) {
            if (bird.getName().contains(chosenBird)) {
                System.out.println(bird);
            }
        }
    }
 
    public void observed(String observedBird) {
        boolean hasBeenObserved = false;
        for (Bird bird : birds) {
            if (bird.getName().contains(observedBird)) {
                bird.observe();
                hasBeenObserved = true;
            }
        }
        if (!hasBeenObserved) {
            System.out.println("Is not a bird!");
        }
    }
}
    

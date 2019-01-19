/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author camil
 */
import java.util.HashMap;

public class Airplane {

    private HashMap<String, Integer> planes;
    private Flights flight;

    public Airplane() {
        this.planes = new HashMap<String, Integer>();
        this.flight = new Flights();
    }

    public void addAirplane(String id, int capacity) {
        
        planes.put(id, capacity);
    
    }
    
    public void assignRoute(String takeoff, String destination){
       
}

}

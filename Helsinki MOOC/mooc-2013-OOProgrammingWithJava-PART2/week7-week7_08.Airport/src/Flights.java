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
public class Flights {
    
    private HashMap<String,String> routes;
    
    public Flights(){
        this.routes = new HashMap<String,String>();
    }
    
    public void addFlight(String takeoff, String destination){
        routes.put(takeoff,destination);
    }
    
    public void getRoute(String takeoff, String destination){
        routes.getOrDefault(takeoff, destination);
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author camil
 */
public class Thermometer implements Sensor {
    
    private boolean state;
    
    
    
    public Thermometer (){
        this.state = false;
    }
    
    @Override
    public void on(){
        this.state = true;
    }
    
    @Override
    public void off(){
        this.state = false;
    }
    
    @Override
    public boolean isOn(){
        if(this.state){
            return true;
        }else{
        return false;
        }
    }
    
    @Override
    public int measure(){
        if(this.state){
            if(Math.random() > 0.5f){
                return (int) ((-1) * Math.random() * 30); 
            } else {
                return (int) (Math.random() * 30);
            }
        } else {
            throw new IllegalStateException();
        }
        }
    
    
    }


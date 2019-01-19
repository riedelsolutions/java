/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author camil
 */
public class Book implements ToBeStored {
    
    private String writer;
    private String name;
    private double weight;
    
    public Book(String name, String writer, double weight){
        this.writer = writer;
        this.name = name;
        this.weight = weight;
    }   

    @Override
    public double weight(){
        return weight;
    }
    
    @Override
    public String toString(){
        
        return (name + ": " + writer );
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cam
 */

import java.util.Scanner;

public class Reader {
    
    private Scanner reader = new Scanner(System.in);
    
    public Reader(){
        this.reader = new Scanner(System.in);
    }
    
    public String readString(){
        
        String string = reader.nextLine();
        
        return string;
    }
    
    public int readInteger(){
        
        int integer = Integer.parseInt(reader.nextLine());
        
        return integer;
    }
    
}

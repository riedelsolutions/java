/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cam
 */
public class Change {
    private char fromCharacter;
    private char toCharacter;
   // private String word;
    
    public Change(char fromCharacter, char toCharacter){
        this.fromCharacter = fromCharacter;
        this.toCharacter = toCharacter;
        
    }
    
    public String change(String characterString){
        
        
        
        for ( int i = 0; i < characterString.length(); i++){
            
            if (characterString.charAt(i) == fromCharacter){
              characterString =  characterString.replace(characterString.charAt(i), toCharacter);
            }else{
                
            }
        }
        
        return characterString;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cam
 */
public class StringUtils {

    public static boolean included(String word, String searched) {

        /*String caselessSearched1 = searched.toLowerCase().trim();
        String caselessWord1 = searched.toLowerCase().trim();
        String caselessSearched = caselessSearched1.trim();
        String caselessWord = caselessWord1.trim();
        
        
        if(caselessWord1.contains(caselessSearched1)) {
            return true;
        } 
        
        return false;*/
        if (word == null || searched == null || word.isEmpty() || searched.isEmpty()) {
            return false;
        }

        word = word.trim();
        word = word.toUpperCase();
        searched = searched.trim();
        searched = searched.toUpperCase();

        if (word.contains(searched)) {
            return true;
        } else {
            return false;
        }

    }

}

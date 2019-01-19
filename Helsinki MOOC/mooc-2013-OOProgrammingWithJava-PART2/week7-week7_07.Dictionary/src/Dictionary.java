/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cam
 */
import java.util.HashMap;
import java.util.ArrayList;

public class Dictionary {

    private HashMap<String, String> listOfTranslations;

    public Dictionary() {

        this.listOfTranslations = new HashMap<String, String>();

    }

    public String translate(String word) {

        if (listOfTranslations.containsKey(word)) {
            return listOfTranslations.get(word);
        } else {
            return null;
        }

    }

    public void add(String word, String translation) {
        listOfTranslations.put(word, translation);
    }

    public int amountOfWords() {
        return listOfTranslations.size();
    }

    public ArrayList<String> translationList() {
        
        ArrayList<String> translationList = new ArrayList<String>();
        
        for (String key : this.listOfTranslations.keySet()) {
            String val = listOfTranslations.get(key);
            String keyValue = key + " = " + val;
            translationList.add(keyValue);
        }
        return translationList;
    }
    
    }

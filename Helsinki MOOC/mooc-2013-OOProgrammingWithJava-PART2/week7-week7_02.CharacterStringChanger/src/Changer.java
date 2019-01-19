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

public class Changer {

    private ArrayList<Change> changes = new ArrayList<Change>();

    public Changer() {
        this.changes = new ArrayList<Change>();
    }

    public void addChange(Change change) {
        changes.add(change);
    }

    public String change(String characterString) {

       /* for (Change one : changes) {

           one.change(characterString);
        }

        return characterString;
        
       */
    for (Change Change : changes) {
        characterString = Change.change(characterString);
    }

        return characterString;
    }
}

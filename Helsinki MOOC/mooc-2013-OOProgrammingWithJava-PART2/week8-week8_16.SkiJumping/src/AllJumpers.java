/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author camil
 */
import java.util.*;

public class AllJumpers {

    private List<Jumper> allJumpers;

    public AllJumpers() {
        this.allJumpers = new ArrayList<Jumper>();
    }

    public void addJumperToList(Jumper jumper) {
        allJumpers.add(jumper);
    }

    public void allJumpersJump() {
        for (Jumper i : allJumpers) {
            i.Jump();
            i.finalScore();
        }
        sortPlayersByPoints(allJumpers);
    }

    public String getNameAt(int index) {

        return allJumpers.get(index).getName();
    }
    
    public int getFinalPointsAt(int index){
        return allJumpers.get(index).finalScore();
    }

    public void sortPlayersByPoints(List<Jumper> list) {
        Collections.sort(list);
    }

    public String roundResults() {
        for (Jumper a : allJumpers) {
            System.out.println("  " + a.getName() + "\n"
                    + "    length: " + a.lengthOfJump()
                    + "    judge votes: " + a.judges() + "\n");
        }
        return "";
    }

    public int length() {
        return allJumpers.size();

    }
     public String printAllJumps(){
        for(Jumper a: allJumpers){
            for (int i = 0; i<allJumpers.size()-1; i++){
            System.out.println(" " + a.allJumps(i)+ "m,");
            }
        }
        
        return"";
    }
     
     public void cleanGhost(){
         int lastIndex = this.allJumpers.size()-1;
         this.allJumpers.remove(lastIndex);
     }

    public void uiResults() {
        for (int i = 1; i < allJumpers.size() - 1; i++) {
            for (Jumper a : allJumpers) {
                System.out.println(i + "           " + a.getName() + " (" + a.finalScore() + " points)\n"
                        + "            jump lengths: "+/*95 m, 96 m, 63 m make method that prints them as a string*/"\n"
                );
            }
        }

    }

    @Override
    public String toString() {
        int i = 1;
        for (Jumper a : allJumpers) {
            System.out.println("  " + i + ". " + a.toString());
            i++;
        }
        return "";
    }

}

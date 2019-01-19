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

public class Jumper implements Comparable<Jumper> {

    private String jumperName;
    private int lengthOfJump;
    private int judgePoints;
    private ArrayList<Integer> judgesScore;
    private ArrayList <Integer> allJumps;

    public Jumper(String jumperName) {
        this.jumperName = jumperName;
        this.lengthOfJump = 0;
        this.judgePoints = 0;
        this.judgesScore = new ArrayList<Integer>();
        this.allJumps = new ArrayList<Integer>();
        
    }

    public void Jump() {
        Random r = new Random();
        int low = 60;
        int high = 121;
        this.lengthOfJump = r.nextInt(high - low) + low;
        this.allJumps.add(lengthOfJump);

    }

    public int lengthOfJump() {
        return this.lengthOfJump;
    }

    public void resetLength() {
        this.lengthOfJump = 0;
    }
    
    public int allJumps(int index){
        return this.allJumps.get(index);
    }
    
   
    //Judge scores for each player
    public ArrayList<Integer> judges() {
        while (true) {

            Random r = new Random();
            int low = 10;
            int high = 20;

            int a = 0;
            while (a <= 4) {
                judgesScore.add(r.nextInt(high - low) + low);
                a++;
            }
            return judgesScore;

        }
      //  return judgesScore;
    }

    public void trimScore() {
        int lowest = 1000;
        int highest = 0;

        for (int i = 0; i < 4; i++) {

            if (judgesScore.get(i) < lowest) {
                lowest = judgesScore.get(i);
            }

            if (judgesScore.get(i) > highest) {
                highest = judgesScore.get(i);
            }
        }
        
        //removes the lowest and highest scores
        for (int i = 0; i < 3; i++) {
            if (lowest == judgesScore.get(i) || highest == judgesScore.get(i)) {
                judgesScore.remove(i);
            }
        }
        //Adds the judge points to the existing ones
        for (int i = 0; i <= 1; i++) {
            this.judgePoints = this.judgePoints + judgesScore.get(i);
        }
        this.judgesScore.clear();
        
    }
    
    public int finalScore(){
        judges();
        trimScore();
        return this.judgePoints;
    }

    public String getName() {
        return jumperName;
    }

    @Override  // change to judges' points
    public String toString() {
        return (this.jumperName + " (" + this.judgePoints + " points)");
    }

    @Override //change to judges' points
    public int compareTo(Jumper jumper) {
        if (this.judgePoints == jumper.judgePoints) {
            return 0;
        } else if (this.judgePoints > jumper.judgePoints) {
            return 1;

        } else {
            return -1;
        }
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author camil
 */
import java.util.Random;

public class NightSky {

    private double density;
    private int height;
    private int width;
    private int amountOfStars;
   // private int starsInLastPrint;

    public NightSky(double density) {
        this.density = density;
        this.width = 20;
        this.height = 10;
    }

    public NightSky(int width, int height) {
        this.density = 0.1;
        this.width = width;
        this.height = height;
    }

    public NightSky(double density, int width, int height) {
        this.density = density;
        this.width = width;
        this.height = height;
    }

    public void printLine() {
        for (int i = 0; i < this.width; i++) {
            double r = new Random().nextDouble();
            if (r > this.density) {
                System.out.print(" ");
            } else {
                System.out.print("*");
                amountOfStars = amountOfStars + 1;
            }
            // amountOfStars = 0;
              
            }
            System.out.println("");
        }
    
    public void print() {
       
        for (int i = 1; i <= this.height; i++){
            printLine();
        }
    }
        public int starsInLastPrint() {

        int howMany = amountOfStars;
        amountOfStars = 0;
        return howMany;
       
    }
}

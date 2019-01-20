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

public class Marks {
 

    private int[] gradeArray;

    public Marks(Scanner input) {
        this.gradeArray = new int[6];
        this.setToZero();
    }

    public void setToZero() {
        for (int count = 0; count <= 5; count++) {
            this.gradeArray[count] = 0;
        }
    }

    public void getGrades(Scanner input) {

        while (true) {
            int grade = Integer.parseInt(input.nextLine());

            if (grade == -1) {
                System.out.println("");   // go to next line before printing distribution
                break;
            } else if (grade<-1) {
                    // do nothing if less than -1
            } else if (grade < 30) {
                this.gradeArray[0] += 1;
            } else if (grade < 35 && grade >= 30) {
                this.gradeArray[1] += 1;
            } else if (grade < 40 && grade >= 35) {
                this.gradeArray[2] += 1;
            } else if (grade < 45 && grade >= 40) {
                this.gradeArray[3] += 1;
            } else if (grade < 50 && grade >= 45) {
                this.gradeArray[4] += 1;
            } else if (grade <= 60 && grade >= 50) {
                this.gradeArray[5] += 1;
            }
        }
    }

    public void printGrades() {
        System.out.println("Grade distribution: ");
        System.out.print("5: ");
        this.printStars(5);
        System.out.print("4: ");
        this.printStars(4);
        System.out.print("3: ");
        this.printStars(3);
        System.out.print("2: ");
        this.printStars(2);
        System.out.print("1: ");
        this.printStars(1);
        System.out.print("0: ");
        this.printStars(0);
        System.out.print("Acceptance percentage: ");
        System.out.print(String.format( "%.1f", this.acceptance()));
        // ((can put this after)) ("Acceptance Percentage: "  + String.format( "%.1f", this.acceptance())
    }

    public void printStars(int gradeLevel) {
        int numberOfStars = this.gradeArray[gradeLevel];   // numberOfStars equals number in gradeArray at index gradeLevel

        for (int count = 0; count < numberOfStars; count++) {   // while count less than gradeLevel, print a star
            System.out.print("*");   // print star
        }
        System.out.println("");   // go to next line after printing stars
    }

    public double acceptance() {
        int accept = this.gradeArray[1]+this.gradeArray[2]+this.gradeArray[3]+this.gradeArray[4]+this.gradeArray[5];
        int fail = this.gradeArray[0];

        /*
        for (int count = 1; count <= 5; count++) {
            int thisNum = this.gradeArray[count];
            accept+=thisNum;

        } */

        int total = accept + fail;

        if (accept==0) {
            return 0.0;
        } else if (fail==0) {
            return 100.0;
        } else {
                double acceptance = (((double) accept) / ((double) total)) *100.0;
                return acceptance;         //With Input: 44, 12, 58, 29, 60, -1  -- THIS IS NOT WORKING!!! It rounds wrong somehow
        }
    }

}

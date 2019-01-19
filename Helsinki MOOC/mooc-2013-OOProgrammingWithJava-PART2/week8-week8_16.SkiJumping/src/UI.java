/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;

public class UI {

    Scanner reader = new Scanner(System.in);
    AllJumpers listOfJumpers = new AllJumpers();

    public void signup() {

        System.out.println("Kumpula ski jumping week\n"
                + "\n"
                + "Write the names of the participants one at a time; an empty string brings you to the jumping phase.");

        String name = ".";
        while (!name.isEmpty() || !name.contains("  ") || !name.contains(" ")) {
            System.out.println("  Participant name: ");
            name = reader.nextLine();
            Jumper jumper = new Jumper(name);
            listOfJumpers.addJumperToList(jumper);
            if (name.isEmpty()) {
                listOfJumpers.cleanGhost();
                break;
            }
        }

        jumpingPhase();

    }

    public void jumpingPhase() {
        System.out.println("The tournament begins!\n");
        // System.out.println("Write \"jump\" to jump; otherwise you quit: ");
        String userInput = "jump";
        int round = 1;
        int indexOfName = 0;
        while (userInput.equals("jump")) {
            System.out.println("Write \"jump\" to jump; otherwise you quit: ");
            userInput = reader.nextLine();
            System.out.println("\n"
                    + "Round " + round + "\n"
                    + "\n"
                    + "Jumping order:");

            listOfJumpers.toString();
            listOfJumpers.allJumpersJump();

            System.out.println("Results of round " + round + "\n");
            round++;
            listOfJumpers.roundResults();

            if (!userInput.equals("jump")) {
                System.out.println("\n"
                        + "Thanks!\n"
                        + "\n"
                        + "Tournament results:\n"
                        + "Position    Name");
                for (int i = 0; i < listOfJumpers.length(); i++) {
                    int  position = 1;
                    System.out.println(position + "           "+listOfJumpers.getNameAt(i)+ " (" + listOfJumpers.getFinalPointsAt(i) +" points)\n"
                            + "            jump lengths:" + listOfJumpers.printAllJumps()+ "\n"
                    );
                    position++;
                }
                

                break;
            }
        }

    }
}
/*

Thanks!

Tournament results:
Position    Name
1           Mikael (388 points)
            jump lengths: 95 m, 96 m, 63 m
2           Mika (387 points)
            jump lengths: 112 m, 61 m, 88 m
 */

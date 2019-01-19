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

public class TextUserInterface {

    private Dictionary dictionary;
    private Scanner reader = new Scanner(System.in);

    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader = reader;
        this.dictionary = dictionary;
    }

    public void start() {
        System.out.println("Statements:\n" + " add - adds a word pair to the dictionary\n" + " translate - asks a word and prints its translation\n" + " quit - quit the text user interface");
        System.out.println("Statement: ");
        String userInput = reader.nextLine();
        while (true) {

            if (userInput.equals("quit")) {

                System.out.println("Cheers!");
                break;

            } else if (userInput.equals("add")) {

                System.out.println("In Finnish: ");
                String finWord = reader.nextLine();

                System.out.println("Translation: ");
                String enWord = reader.nextLine();

                dictionary.add(finWord, enWord);

            } else if (userInput.equals("translate")) {
                
                System.out.println("Give a word: ");
                String lookFor = reader.nextLine();
                
                System.out.println("Translation: " + dictionary.translate(lookFor));
                
                
            } else {
                System.out.println("Unknown statement");
                

            }
            System.out.println("Statement: ");
                userInput = reader.nextLine();
        }
    }
}

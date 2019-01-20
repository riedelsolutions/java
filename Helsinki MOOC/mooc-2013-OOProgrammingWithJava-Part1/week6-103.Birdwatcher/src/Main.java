import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
 
        BirdDatabase myBirds = new BirdDatabase();
        Scanner reader = new Scanner(System.in);
        String input = "";
 
        while (!input.contains("Quit")) {
            System.out.print("? ");
 
            input = reader.nextLine();
 
            if (input.contains("Add")) {
                System.out.print("Name: ");
                String name = reader.nextLine();
                System.out.print("Latin Name: ");
                String latinName = reader.nextLine();
 
                Bird bird = new Bird(name, latinName);
                myBirds.add(bird);
            }
 
            if (input.contains("Statistics")) {
                myBirds.statistics();
            }
 
            if (input.contains("Show")) {
                System.out.print("What? ");
                input = reader.nextLine();
                myBirds.show(input);
            }
 
            if (input.contains("Observation")) {
                System.out.print("What was observed? ");
                input = reader.nextLine();
                myBirds.observed(input);
            }
        }
    }
}

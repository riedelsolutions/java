import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Marks classGrades = new Marks(input);

        System.out.println("Type exam scores, -1 completes:");

        classGrades.getGrades(input);
        classGrades.printGrades();
    }
}
import java.util.Scanner;

public class GuessingGame {

    private Scanner reader;

    public GuessingGame() {
        // use only this scanner, othervise the tests do not work
        this.reader = new Scanner(System.in);
    }

   /* public void play(int lowerLimit, int upperLimit) {
        instructions(lowerLimit, upperLimit);
        
        while(average(lowerLimit,upperLimit) != lowerLimit || (lowerLimit == 1 && upperLimit == 1)){
        System.out.println("Is your number greater than " + average(lowerLimit,upperLimit) + "? (y/n)");
        String answer = reader.nextLine();
        if (answer.equals("y")){
            lowerLimit = average(lowerLimit,upperLimit);
        } else if (answer.equals("n")){
            upperLimit = average(lowerLimit,upperLimit);
        }
       
        }
       
   
        System.out.println("The number you're thinking of is " + upperLimit +".");
        // write the guessing logic here

    }*/
    
     public void play(int lowerLimit, int upperLimit) {   // 105.3
        int average;
        boolean greater;

        instructions(upperLimit,lowerLimit);

        while (true) {
            if (lowerLimit==upperLimit) {
                System.out.println("The number you're thinking of is " + upperLimit + ".");
                break;
            }

            average = this.average(lowerLimit, upperLimit);   // get average of lower and upper
            greater = this.isGreaterThan(average);    // is searchedFor larger than average?

            if (greater) {
                lowerLimit = average+1;
            } else {
                upperLimit = average;
            }
        }
    }

    // implement here the methods isGreaterThan and average

    public void instructions(int lowerLimit, int upperLimit) {
        int maxQuestions = howManyTimesHalvable(upperLimit - lowerLimit);

        System.out.println("Think of a number between " + lowerLimit + "..." + upperLimit + ".");

        System.out.println("I promise you that I can guess the number you are thinking with " + maxQuestions + " questions.");
        System.out.println("");
        System.out.println("Next I'll present you a series of questions. Answer them honestly.");
        System.out.println("");
    }

    // a helper method:
    public static int howManyTimesHalvable(int number) {
        // we create a base two logarithm  of the given value

        // Below we swap the base number to base two logarithms!
        return (int) (Math.log(number) / Math.log(2)) + 1;
    }
    
    public boolean isGreaterThan(int value){
        System.out.println("Is your number greater than " + value + "? (y/n)");
        String bol = reader.nextLine();
        if (bol.equals("y")){
            return true;
        } else {
            return false;
        }
    }
     public int average(int firstNumber, int secondNumber){
         return (firstNumber + secondNumber)/2;
     }
}

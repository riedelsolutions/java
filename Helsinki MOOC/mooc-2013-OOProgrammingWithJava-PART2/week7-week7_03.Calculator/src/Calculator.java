/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cam
 */
public class Calculator {

    private Reader reader;
    
    private int amountOfOperations;
    
    public Calculator(){
        this.reader = new Reader();
        this.amountOfOperations = 0;
    }

    public void start() {
        while (true) {
            System.out.print("command: ");
            String command = reader.readString();
            if (command.equals("end")) {
                break;
            }

            if (command.equals("sum")) {
                sum();
            } else if (command.equals("difference")) {
                difference();
            } else if (command.equals("product")) {
                product();
            }
        }
//m<enter>1<enter>2<enter>product<enter>2<enter>3<enter>difference<enter>4<enter>2<enter>end<enter> new Calculator.start(); should print line  "product"
        statistics();
    }

    private void sum() {
        System.out.println("value1: ");

        int value1 = reader.readInteger();

        System.out.println("value2: ");

        int value2 = reader.readInteger();

        int sum = value1 + value2;

        System.out.println("sum of the values " + sum);
        this.amountOfOperations++;
    }

    private void difference() {
        System.out.println("value1: ");

        int value1 = reader.readInteger();

        System.out.println("value2: ");

        int value2 = reader.readInteger();

        int difference = value1 - value2;

        System.out.println("difference of the values " + difference);
        this.amountOfOperations++;
    }

    private void product() {
        
        System.out.println("value 1: ");
        int value1 = reader.readInteger();

        System.out.println("value2: ");

        int value2 = reader.readInteger();

        int product = value1 * value2;

        System.out.println("product of the values " + product);
        this.amountOfOperations++;

    }

    private void statistics() {
        System.out.println("Calculations done " + amountOfOperations);
    }

}

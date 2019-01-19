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

public class Airport {

    private Scanner reader = new Scanner(System.in);
    private Airplane airplane;

    public Airport() {
        this.reader = new Scanner(System.in);
        this.airplane = new Airplane();
    }

    public void airportPanel() {
            System.out.println("Airport panel\n" +
"--------------------\n" +
"\n" +
"Choose operation:\n" +
"[1] Add airplane\n" +
"[2] Add flight\n" +
"[x] Exit\n" +
"> ");
        while (true) {
            String userInput = reader.nextLine();

            if (userInput.equals("1")) {
                System.out.println("Give plane ID: ");
                String id = reader.nextLine();
                System.out.println("Give plane capacity: ");
                int capacity = Integer.parseInt(reader.nextLine());
                airplane.addAirplane(id, capacity);
            } else if (userInput.equals("2")) {
                //airplane.addflight
            } else if (userInput.equals("x")){
                break;
            }

        }
    }

    public void flightService() {
        System.out.println("\nFlight service\n"
                + "------------\n"
                + "\n"
                + "Choose operation:\n"
                + "[1] Print planes\n"
                + "[2] Print flights\n"
                + "[3] Print plane info\n"
                + "[x] Quit\n"
                + ">");
        while (true) {
            String userInput = reader.nextLine();
            if (userInput.equals("1")) {
                //call printAirplanes method
            } else if (userInput.equals("2")) {
                //call printFlights method
            } else if (userInput.equals("3")) {
                // call airplaneInfo method
            } else if (userInput.equals("x")) {
                break;
            }
        }
    }

}

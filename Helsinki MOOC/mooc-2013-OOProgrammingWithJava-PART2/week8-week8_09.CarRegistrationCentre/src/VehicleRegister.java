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

public class VehicleRegister {

    private HashMap<RegistrationPlate, String> owners = new HashMap<RegistrationPlate, String>();

    public boolean add(RegistrationPlate plate, String owner) {

        if (owners.containsKey(plate)) {
            if (owners.get(plate).equals(owner)) {
                return false;
            }

        }
        owners.put(plate, owner);
        return true;
    }

    public String get(RegistrationPlate plate) {
        if (owners.containsKey(plate)) {
            return owners.get(plate);
        }
        return null;

    }

    public boolean delete(RegistrationPlate plate) {
        if (owners.containsKey(plate)) {
            owners.remove(plate);
            return true;
        } else {
            return false;
        }
    }

    public void printRegistrationPlates() {
        for (RegistrationPlate a : owners.keySet()) {
            System.out.println(a + ";");
        }
    }

    public void printOwners() {

        ArrayList<String> ownersList = new ArrayList<String>();

        for (RegistrationPlate a : owners.keySet()) {
            String currentOwner = owners.get(a);
            if (ownersList.contains(currentOwner)) {

            } else {
                ownersList.add(owners.get(a));
                System.out.println(owners.get(a));
            }

        }
    }
}

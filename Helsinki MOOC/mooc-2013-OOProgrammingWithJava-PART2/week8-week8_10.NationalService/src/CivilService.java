/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author camil
 */
public class CivilService implements NationalService {

    private int daysLeft;

    public CivilService() {
        this.daysLeft = 362;
    }

    @Override
    public int getDaysLeft() {
        return daysLeft;
    }

    @Override
    public void work() {
        if(daysLeft>0){
        daysLeft = daysLeft - 1;}
    }

}

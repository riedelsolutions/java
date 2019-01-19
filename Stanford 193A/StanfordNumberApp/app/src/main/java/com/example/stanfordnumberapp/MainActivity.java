package com.example.stanfordnumberapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    //field variables / fields
    private int randomOne;
    private int randomTwo;
    private int points;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        points = 0;
        pickRandom();
    }

    private void pickRandom(){
        //pick random number
        Random randomNum = new Random();

        //Create two random number on app start
        randomOne = randomNum.nextInt(11);

        //Choose a second number that isn't the same as the first one
        while(true){
        randomTwo = randomNum.nextInt(11);
        if (randomOne != randomTwo){
            break;
        }
        }

        //Create a java button object that turns the xml button into a real widget
        Button leftBttn = (Button) findViewById(R.id.leftBttn);
        //Assign the first random number to the first button
        leftBttn.setText(Integer.toString(randomOne));

        //Same thing, different button
        Button rightBttn = (Button) findViewById(R.id.rightBttn);
        rightBttn.setText(Integer.toString(randomTwo));

    }

    public void updatePointTally(){
        //Update display of points
        TextView pointTally = (TextView) findViewById(R.id.pointsField);
        pointTally.setText("Points: " + points);

        pickRandom();
    }

    public void leftBttnClick(View view) {
        if(randomOne > randomTwo){
            //Correct
            points++;
        }else{
            //Incorrect
            points--;
        }

        updatePointTally();
        if(points == 0){
            toastShowUp();
        }
    }

    public void rightBttnClick(View view) {
        //todo
        if(randomOne > randomTwo){
            //Correct
            points--;
        }else{
            //Incorrect
            points++;
        }
        updatePointTally();
        if(points == 0){
            toastShowUp();
        }
    }

    public void toastShowUp(){
        Toast.makeText(this, "You've reached 0 points", Toast.LENGTH_LONG).show();
    }
}

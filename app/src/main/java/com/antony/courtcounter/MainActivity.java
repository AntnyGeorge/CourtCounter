package com.antony.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*
    * Add 3 points to Team A
    */

    public void addThreePointsA(View v){
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }

    /*
     * Add 2 points to Team A
     */
    public void addTwoPointsA(View v){
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }

    /*
     * Add 1 points to Team A
     */
    public void addOnePointA(View v){
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    /*
     * Add 3 points to Team B
     */
    public void addThreePointsB(View v){
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }

    /*
     * Add 2 points to Team B
     */
    public void addTwoPointsB(View v){
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }

    /*
     * Add 1 points to Team B
     */
    public void addOnePointB(View v){
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }


    /*
     * Reset the game
     */
    public void reset(View v){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    /*
     * Display Team A Score
     */
    private void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.score_a);
        scoreView.setText(String.valueOf(score));
    }

    /*
     * Display Team A Score
     */
    private void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.score_b);
        scoreView.setText(String.valueOf(score));
    }
}
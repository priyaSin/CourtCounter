package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA=0;
    int scoreTeamB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    /*For updating the score for TeamA according to which button is pressed*/
    public void buttonA1(View view){
        scoreTeamA=scoreTeamA+2;
        displayForTeamA(scoreTeamA);
    }
    public void buttonA2(View view){
        scoreTeamA+=3;
        displayForTeamA(scoreTeamA);
    }
    public void buttonA3(View view){
        scoreTeamA+=1;
        displayForTeamA(scoreTeamA);
    }
    /*For updating the score for TeamA according to which button is pressed*/
    public void buttonB1(View view){
        scoreTeamB=scoreTeamB+2;
        displayForTeamB(scoreTeamB);
    }
    public void buttonB2(View view){
        scoreTeamB+=3;
        displayForTeamB(scoreTeamB);
    }
    public void buttonB3(View view){
        scoreTeamB+=1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Displays the given score for Team A.
     */

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Team B.
     */

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void reset(View view){
        scoreTeamA=scoreTeamB=0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}

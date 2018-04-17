package com.example.android.cricketscoretracker;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */

    int scoreA = 0;

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }


    public void addOneRunA(View view) {
        scoreA = scoreA + 1;
        displayForTeamA(scoreA);

    }


    public void addFourRunsA(View view) {
        scoreA = scoreA + 4;
        displayForTeamA(scoreA);

    }


    public void addSixRunsA(View view) {
        scoreA = scoreA + 6;
        displayForTeamA(scoreA);

    }


    public void addExtrasA(View view) {
        scoreA = scoreA + 1;
        displayForTeamA(scoreA);

    }


    public void decreaseIneRunA(View view) {
        if (scoreA != 0) {
            scoreA = scoreA - 1;
        }
        displayForTeamA(scoreA);

    }


    int scoreB = 0;

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }


    public void addOneRunB(View view) {
        scoreB = scoreB + 1;
        displayForTeamB(scoreB);

    }


    public void addFourRunsB(View view) {
        scoreB = scoreB + 4;
        displayForTeamB(scoreB);

    }


    public void addSixRunsB(View view) {
        scoreB = scoreB + 6;
        displayForTeamB(scoreB);

    }


    public void addExtrasB(View view) {
        scoreB = scoreB + 1;
        displayForTeamB(scoreB);

    }


    public void decreaseIneRunB(View view) {
        if (scoreB != 0) {
            scoreB = scoreB - 1;
        }
        displayForTeamB(scoreB);

    }


    public void scoreReset(View view) {
        scoreB = 0;
        scoreA = 0;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);

    }

}

package com.example.android.gaa;

import android.content.pm.ActivityInfo;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.gaa.R;

public class MainActivity extends AppCompatActivity {

    int goalsTeamA = 0;
    int pointsTeamA = 0;
    int goalsTeamB = 0;
    int pointsTeamB = 0;
    int totalTeamA = 0;
    int totalTeamB = 0;

    static final String GOALSTEAMA = "TeamAgoals";
    static final String GOALSTEAMB = "TeamBgoals";
    static final String POINTSTEAMA = "TeamApoints";
    static final String POINTSTEAMB = "TeamBpoints";
    static final String TOTALTEAMA = "TeamAtotal";
    static final String TOTALTEAMB = "TeamBtotal";


    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);

        savedInstanceState.putInt("GOALSTEAMA", goalsTeamA);
        savedInstanceState.putInt("POINTSTEAMA", pointsTeamA);
        savedInstanceState.putInt("GOALSTEAMB", goalsTeamB);
        savedInstanceState.putInt("POINTSTEAMB", pointsTeamB);
        savedInstanceState.putInt("TOTALTEAMA", totalTeamA);
        savedInstanceState.putInt("TOTALTEAMB", totalTeamB);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        // Always call the superclass so it can restore the view hierarchy
        super.onRestoreInstanceState(savedInstanceState);
        // Restore state members from saved instance
        goalsTeamA = savedInstanceState.getInt(GOALSTEAMA);
        goalsTeamB = savedInstanceState.getInt(GOALSTEAMB);
        pointsTeamA = savedInstanceState.getInt(POINTSTEAMA);
        pointsTeamA = savedInstanceState.getInt(POINTSTEAMB);
        totalTeamA = savedInstanceState.getInt(TOTALTEAMA);
        totalTeamA = savedInstanceState.getInt(TOTALTEAMB);

        displayGoalTeamA(goalsTeamA);
        displayGoalTeamB(goalsTeamB);
        displayPointTeamA(pointsTeamA);
        displayPointTeamB(pointsTeamB);
        displayTotalTeamA(totalTeamA);
        displayTotalTeamB(totalTeamB);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayGoalTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_goal);
        scoreView.setText(String.valueOf(score));
    }

    public void displayPointTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_point);
        scoreView.setText(String.valueOf(score));
    }

    public void displayTotalTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_total);
        scoreView.setText(String.valueOf(score));
    }

    public void addGoalTeamA(View v) {
        goalsTeamA = goalsTeamA + 1;
        totalTeamA = totalTeamA + 3;
        displayGoalTeamA(goalsTeamA);
        displayTotalTeamA(totalTeamA);
    }

    public void addPointTeamA(View v) {
        pointsTeamA = pointsTeamA + 1;
        totalTeamA = totalTeamA + 1;
        displayPointTeamA(pointsTeamA);
        displayTotalTeamA(totalTeamA);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayGoalTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_goal);
        scoreView.setText(String.valueOf(score));
    }

    public void displayPointTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_point);
        scoreView.setText(String.valueOf(score));
    }

    public void displayTotalTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_total);
        scoreView.setText(String.valueOf(score));
    }

    public void addGoalTeamB(View v) {
        goalsTeamB = goalsTeamB + 1;
        totalTeamB = totalTeamB + 3;
        displayGoalTeamB(goalsTeamB);
        displayTotalTeamB(totalTeamB);
    }

    public void addPointTeamB(View v) {
        pointsTeamB = pointsTeamB + 1;
        totalTeamB = totalTeamB + 1;
        displayPointTeamB(pointsTeamB);
        displayTotalTeamB(totalTeamB);
    }

    public void resetScores(View v) {
        goalsTeamA = 0;
        pointsTeamA = 0;
        goalsTeamB = 0;
        pointsTeamB = 0;
        totalTeamA = 0;
        totalTeamB = 0;
        displayGoalTeamA(goalsTeamA);
        displayGoalTeamB(goalsTeamB);
        displayPointTeamA(pointsTeamA);
        displayPointTeamB(pointsTeamB);
        displayTotalTeamA(totalTeamA);
        displayTotalTeamB(totalTeamB);
    }
}

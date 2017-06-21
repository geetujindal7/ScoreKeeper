package com.example.hi.cricket;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int scoreA = 0;
    int scoreB = 0;

    public void get1scoreTeamA(View View)
    {
        scoreA = scoreA + 1;
        displayForTeamA(scoreA);
    }
    public void get2scoreTeamA(View View)
    {
        scoreA = scoreA + 2;
        displayForTeamA(scoreA);
    }

    public void get4scoreTeamA(View View)
    {
        scoreA = scoreA + 4;
        displayForTeamA(scoreA);
    }
    public void get6scoreTeamA(View View)
    {
        scoreA = scoreA + 6;
        displayForTeamA(scoreA);
    }

    public void get1scoreTeamB(View View)
    {
        scoreB = scoreB + 1;
        displayForTeamB(scoreB);
    }
    public void get2scoreTeamB(View View)
    {
        scoreB = scoreB + 2;
        displayForTeamB(scoreB);
    }
    public void get4scoreTeamB(View View)
    {
        scoreB = scoreB + 4;
        displayForTeamB(scoreB);
    }
    public void get6scoreTeamB(View View)
    {
        scoreB = scoreB + 6;
        displayForTeamB(scoreB);
    }

    public void resetScore(View View)
    {
        int scoreA = 0;
        int scoreB = 0;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_B_score);
        scoreView.setText(String.valueOf(score));
    }
    /**de
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_A_score);
        scoreView.setText(String.valueOf(score));
    }
}

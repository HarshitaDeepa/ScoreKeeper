package com.example.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA = 0, scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addTwoForTeamA(View view)
    {
        scoreA = scoreA + 2;
        displayForTeamA(scoreA);
    }

    public void addOneForTeamA(View view)
    {
        scoreA = scoreA + 1;
        displayForTeamA(scoreA);
    }

    public void addFourForTeamA(View view)
    {
        scoreA = scoreA + 4;
        displayForTeamA(scoreA);
    }

    public void addSixForTeamA(View view)
    {
        scoreA = scoreA + 6;
        displayForTeamA(scoreA);
    }

    public void addFourForTeamB(View view)
    {
        scoreB = scoreB + 4;
        displayForTeamB(scoreB);
    }

    public void addSixForTeamB(View view)
    {
        scoreB = scoreB + 6;
        displayForTeamB(scoreB);
    }

    public void addTwoForTeamB(View view)
    {
        scoreB = scoreB + 2;
        displayForTeamB(scoreB);
    }

    public void addOneForTeamB(View view)
    {
        scoreB = scoreB + 1;
        displayForTeamB(scoreB);
    }

    public void displayForTeamA(int score)
    {
        TextView scoreView = (TextView)findViewById(R.id.team1score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score)
    {
        TextView scoreView = (TextView)findViewById(R.id.team2score);
        scoreView.setText(String.valueOf(score));
    }

    public void resetButton(View view)
    {
        displayForTeamA(0);
        displayForTeamB(0);
        scoreA = 0;
        scoreB = 0;
    }
}

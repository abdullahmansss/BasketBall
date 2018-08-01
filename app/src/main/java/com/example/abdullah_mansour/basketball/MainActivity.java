package com.example.abdullah_mansour.basketball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView teamA,teamB;
    Button teamA3,teamA2,teamAFT,teamB3,teamB2,teamBFT,reset;

    int A = 0;
    int B = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeViews();

        A3();
        A2();
        AFT();

        B3();
        B2();
        BFT();

        reset();
    }

    public void initializeViews ()
    {
        teamA = (TextView) findViewById(R.id.teamA);
        teamB = (TextView) findViewById(R.id.teamB);

        teamA3 = (Button) findViewById(R.id.teamA3);
        teamA2 = (Button) findViewById(R.id.teamA2);
        teamAFT = (Button) findViewById(R.id.teamAFT);
        teamB3 = (Button) findViewById(R.id.teamB3);
        teamB2 = (Button) findViewById(R.id.teamB2);
        teamBFT = (Button) findViewById(R.id.teamBFT);
        reset = (Button) findViewById(R.id.reset);
    }

    public void A3 ()
    {
        teamA3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                A = A + 3;
                teamA.setText("" + A);
            }
        });
    }

    public void A2 ()
    {
        teamA2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                A = A + 2;
                teamA.setText("" + A);
            }
        });
    }

    public void AFT ()
    {
        teamAFT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                A = A + 1;
                teamA.setText("" + A);
            }
        });
    }

    public void B3 ()
    {
        teamB3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B = B + 3;
                teamB.setText("" + B);
            }
        });
    }

    public void B2 ()
    {
        teamB2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B = B + 2;
                teamB.setText("" + B);
            }
        });
    }

    public void BFT ()
    {
        teamBFT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B = B + 1;
                teamB.setText("" + B);
            }
        });
    }

    public void reset ()
    {
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                A = 0;
                teamA.setText("" + A);

                B = 0;
                teamB.setText("" + B);
            }
        });
    }
}

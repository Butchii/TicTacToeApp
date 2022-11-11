package com.example.tictactoe;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import java.io.File;

public class MainActivity extends AppCompatActivity {
    Button close, start, plus, minus, mute, option, impr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        close = (Button) findViewById(R.id.close);
        start = (Button) findViewById(R.id.start);
        plus = (Button) findViewById(R.id.plus);
        minus = (Button) findViewById(R.id.minus);
        mute = (Button) findViewById(R.id.mute);
        option = (Button) findViewById(R.id.option);
        impr = (Button) findViewById(R.id.impr);

        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finishAffinity();
                System.exit(0);
            }
        });

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeToGame();
            }
        });
    }

    protected void changeToGame() {
        Intent intent = new Intent(this, game.class);
        startActivity(intent);
    }
}
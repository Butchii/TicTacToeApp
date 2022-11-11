package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ButtonBarLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class game extends AppCompatActivity {

    Button main, close,field1, field2, field3, field4, field5, field6, field7, field8, field9, newgame,
            reset;
    String current_player = "Player1";
    int placed = 0;
    TextView player, score1, score2;

    protected void restart(){
        placed = 0;
        current_player = "Player1";
        field1.setText("");
        field2.setText("");
        field3.setText("");
        field4.setText("");
        field5.setText("");
        field6.setText("");
        field7.setText("");
        field8.setText("");
        field9.setText("");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        main = (Button) findViewById(R.id.main);
        close = (Button) findViewById(R.id.close);
        field1 = (Button) findViewById(R.id.field1);
        field2 = (Button) findViewById(R.id.field2);
        field3 = (Button) findViewById(R.id.field3);
        field4 = (Button) findViewById(R.id.field4);
        field5 = (Button) findViewById(R.id.field5);
        field6 = (Button) findViewById(R.id.field6);
        field7 = (Button) findViewById(R.id.field7);
        field8 = (Button) findViewById(R.id.field8);
        field9 = (Button) findViewById(R.id.field9);
        newgame = (Button) findViewById(R.id.newgame);
        player = (TextView) findViewById(R.id.player);
        score1 = (TextView) findViewById(R.id.score1);
        score2 = (TextView) findViewById(R.id.score2);
        reset = (Button) findViewById(R.id.reset);
        player.setText(current_player + " its your turn!");

        reset.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                resetScore();
            }
        });

        newgame.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                restart();
            }
        });

        main.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                changeToMainMenu();
            }
        });

        close.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                finishAffinity();
                System.exit(0);
            }
        });

        field1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view) {
                if (field1.getText() == "") {
                    if (current_player == "Player1") {
                        field1.setText("X");
                        current_player = "Player2";
                        placed += 1;
                    } else if (current_player == "Player2") {
                        field1.setText("O");
                        current_player = "Player1";
                        placed += 1;
                    }
                }

                if (placed >= 5){
                    if((field1.getText() == "X" && field2.getText() == "X" && field3.getText() == "X")
                            || (field1.getText() == "X" && field5.getText() == "X" && field9.getText() == "X")
                            || (field1.getText() == "X" && field4.getText() == "X" && field7.getText() == "X")){
                        Toast.makeText(getApplicationContext(), "Player1 wins", 50).show();
                        String score = String.valueOf(score1.getText());
                        int scoore = Integer.parseInt(score);
                        scoore += 1;
                        score1.setText(Integer.toString(scoore));
                        restart();
                    }
                    else if((field1.getText() == "O" && field2.getText() == "O" && field3.getText() == "O")
                            || (field1.getText() == "O" && field5.getText() == "O" && field9.getText() == "O")
                            || (field1.getText() == "O" && field4.getText() == "O" && field7.getText() == "O")){
                        Toast.makeText(getApplicationContext(), "Player2 wins", 50).show();
                        String score = String.valueOf(score2.getText());
                        int scoore = Integer.parseInt(score);
                        scoore += 1;
                        score2.setText(Integer.toString(scoore));
                        restart();
                    }
                }
                player.setText(current_player + " its your turn!");
            }
        });

        field2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view) {
                if (field2.getText() == "") {
                    if (current_player == "Player1") {
                        field2.setText("X");
                        current_player = "Player2";
                        placed += 1;
                    } else if (current_player == "Player2") {
                        field2.setText("O");
                        current_player = "Player1";
                        placed += 1;
                    }
                }
                if (placed >= 5){
                    if((field1.getText() == "X" && field2.getText() == "X" && field3.getText() == "X")
                            || (field2.getText() == "X" && field5.getText() == "X" && field8.getText() == "X")){
                        Toast.makeText(getApplicationContext(), "Player1 wins", 50).show();
                        String score = String.valueOf(score1.getText());
                        int scoore = Integer.parseInt(score);
                        scoore += 1;
                        score1.setText(Integer.toString(scoore));
                        restart();
                    }
                    else if((field1.getText() == "O" && field2.getText() == "O" && field3.getText() == "O")
                            || (field2.getText() == "O" && field5.getText() == "O" && field8.getText() == "O")){
                        Toast.makeText(getApplicationContext(), "Player2 wins", 50).show();
                        String score = String.valueOf(score2.getText());
                        int scoore = Integer.parseInt(score);
                        scoore += 1;
                        score2.setText(Integer.toString(scoore));
                        restart();
                    }
                }
                player.setText(current_player + " its your turn!");
            }
        });

        field3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view) {
                if (field3.getText() == "") {
                    if (current_player == "Player1") {
                        field3.setText("X");
                        current_player = "Player2";
                        placed += 1;
                    } else if (current_player == "Player2") {
                        field3.setText("O");
                        current_player = "Player1";
                        placed += 1;
                    }
                }

                if (placed >= 5){
                    if((field1.getText() == "X" && field2.getText() == "X" && field3.getText() == "X")
                            || (field3.getText() == "X" && field6.getText() == "X" && field9.getText() == "X")
                            || (field3.getText() == "X" && field5.getText() == "X" && field7.getText() == "X")){
                        Toast.makeText(getApplicationContext(), "Player1 wins", 50).show();
                        String score = String.valueOf(score1.getText());
                        int scoore = Integer.parseInt(score);
                        scoore += 1;
                        score1.setText(Integer.toString(scoore));
                        restart();
                    }
                    else if((field1.getText() == "O" && field2.getText() == "O" && field3.getText() == "O")
                            || (field3.getText() == "O" && field6.getText() == "O" && field9.getText() == "O")
                            || (field3.getText() == "O" && field5.getText() == "O" && field7.getText() == "O")){
                        Toast.makeText(getApplicationContext(), "Player2 wins", 50).show();
                        String score = String.valueOf(score2.getText());
                        int scoore = Integer.parseInt(score);
                        scoore += 1;
                        score2.setText(Integer.toString(scoore));
                        restart();
                    }
                }
                player.setText(current_player + " its your turn!");
            }
        });
        field4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view) {
                if (field4.getText() == "") {
                    if (current_player == "Player1") {
                        field4.setText("X");
                        current_player = "Player2";
                        placed += 1;
                    } else if (current_player == "Player2") {
                        field4.setText("O");
                        current_player = "Player1";
                        placed += 1;
                    }
                }

                if (placed >= 5){
                    if((field1.getText() == "X" && field4.getText() == "X" && field7.getText() == "X")
                            || (field4.getText() == "X" && field5.getText() == "X" && field6.getText() == "X")){
                        Toast.makeText(getApplicationContext(), "Player1 wins", 50).show();
                        String score = String.valueOf(score1.getText());
                        int scoore = Integer.parseInt(score);
                        scoore += 1;
                        score1.setText(Integer.toString(scoore));
                        restart();
                    }
                    else if((field1.getText() == "O" && field4.getText() == "O" && field7.getText() == "O")
                            || (field4.getText() == "O" && field5.getText() == "O" && field6.getText() == "O")){
                        Toast.makeText(getApplicationContext(), "Player2 wins", 50).show();
                        String score = String.valueOf(score2.getText());
                        int scoore = Integer.parseInt(score);
                        scoore += 1;
                        score2.setText(Integer.toString(scoore));
                        restart();
                    }
                }
                player.setText(current_player + " its your turn!");
            }
        });

        field5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view) {
                if (field5.getText() == "") {
                    if (current_player == "Player1") {
                        field5.setText("X");
                        current_player = "Player2";
                        placed += 1;
                    } else if (current_player == "Player2") {
                        field5.setText("O");
                        current_player = "Player1";
                        placed += 1;
                    }
                }
                if (placed >= 5){
                    if((field1.getText() == "X" && field5.getText() == "X" && field9.getText() == "X")
                            || (field2.getText() == "X" && field5.getText() == "X" && field8.getText() == "X")
                            || (field3.getText() == "X" && field5.getText() == "X" && field7.getText() == "X")
                            || (field4.getText() == "X" && field5.getText() == "X" && field6.getText() == "X")){
                        Toast.makeText(getApplicationContext(), "Player1 wins", 50).show();
                        String score = String.valueOf(score1.getText());
                        int scoore = Integer.parseInt(score);
                        scoore += 1;
                        score1.setText(Integer.toString(scoore));
                        restart();
                    }
                    else if((field1.getText() == "O" && field5.getText() == "O" && field9.getText() == "O")
                            || (field2.getText() == "O" && field5.getText() == "O" && field8.getText() == "O")
                            || (field3.getText() == "O" && field5.getText() == "O" && field7.getText() == "O")
                            || (field4.getText() == "O" && field5.getText() == "O" && field6.getText() == "O")){
                        Toast.makeText(getApplicationContext(), "Player2 wins", 50).show();
                        String score = String.valueOf(score2.getText());
                        int scoore = Integer.parseInt(score);
                        scoore += 1;
                        score2.setText(Integer.toString(scoore));
                        restart();
                    }
                }
                player.setText(current_player + " its your turn!");
            }
        });

        field6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view) {
                if (field6.getText() == "") {
                    if (current_player == "Player1") {
                        field6.setText("X");
                        current_player = "Player2";
                        placed += 1;
                    } else if (current_player == "Player2") {
                        field6.setText("O");
                        current_player = "Player1";
                        placed += 1;
                    }
                }

                if (placed >= 5){
                    if((field3.getText() == "X" && field6.getText() == "X" && field9.getText() == "X")
                            || (field4.getText() == "X" && field5.getText() == "X" && field6.getText() == "X")){
                        Toast.makeText(getApplicationContext(), "Player1 wins", 50).show();
                        String score = String.valueOf(score1.getText());
                        int scoore = Integer.parseInt(score);
                        scoore += 1;
                        score1.setText(Integer.toString(scoore));
                        restart();
                    }
                    else if((field3.getText() == "O" && field6.getText() == "O" && field9.getText() == "O")
                            || (field4.getText() == "O" && field5.getText() == "O" && field6.getText() == "O")){
                        Toast.makeText(getApplicationContext(), "Player2 wins", 50).show();
                        String score = String.valueOf(score2.getText());
                        int scoore = Integer.parseInt(score);
                        scoore += 1;
                        score2.setText(Integer.toString(scoore));
                        restart();
                    }
                }
                player.setText(current_player + " its your turn!");
            }
        });
        field7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view) {
                if (field7.getText() == "") {
                    if (current_player == "Player1") {
                        field7.setText("X");
                        current_player = "Player2";
                        placed += 1;
                    } else if (current_player == "Player2") {
                        field7.setText("O");
                        current_player = "Player1";
                        placed += 1;
                    }
                }
                if (placed >= 5){
                    if((field1.getText() == "X" && field4.getText() == "X" && field7.getText() == "X")
                            || (field3.getText() == "X" && field5.getText() == "X" && field7.getText() == "X")
                            || (field7.getText() == "X" && field8.getText() == "X" && field9.getText() == "X")){
                        Toast.makeText(getApplicationContext(), "Player1 wins", 50).show();
                        String score = String.valueOf(score1.getText());
                        int scoore = Integer.parseInt(score);
                        scoore += 1;
                        score1.setText(Integer.toString(scoore));
                        restart();
                    }
                    else if((field1.getText() == "O" && field4.getText() == "O" && field7.getText() == "O")
                            || (field3.getText() == "O" && field5.getText() == "O" && field7.getText() == "O")
                            || (field7.getText() == "O" && field8.getText() == "O" && field9.getText() == "O")){
                        Toast.makeText(getApplicationContext(), "Player2 wins", 50).show();
                        String score = String.valueOf(score2.getText());
                        int scoore = Integer.parseInt(score);
                        scoore += 1;
                        score2.setText(Integer.toString(scoore));
                        restart();
                    }
                }
                player.setText(current_player + " its your turn!");
            }
        });
        field8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view) {
                if (field8.getText() == "") {
                    if (current_player == "Player1") {
                        field8.setText("X");
                        current_player = "Player2";
                        placed += 1;
                    } else if (current_player == "Player2") {
                        field8.setText("O");
                        current_player = "Player1";
                        placed += 1;
                    }
                }
                if (placed >= 5){
                    if((field2.getText() == "X" && field5.getText() == "X" && field8.getText() == "X")
                            || (field7.getText() == "X" && field8.getText() == "X" && field9.getText() == "X")){
                        Toast.makeText(getApplicationContext(), "Player1 wins", 50).show();
                        String score = String.valueOf(score1.getText());
                        int scoore = Integer.parseInt(score);
                        scoore += 1;
                        score1.setText(Integer.toString(scoore));
                        restart();
                    }
                    else if((field2.getText() == "O" && field5.getText() == "O" && field8.getText() == "O")
                            || (field7.getText() == "O" && field8.getText() == "O" && field9.getText() == "O")){
                        Toast.makeText(getApplicationContext(), "Player2 wins", 50).show();
                        String score = String.valueOf(score2.getText());
                        int scoore = Integer.parseInt(score);
                        scoore += 1;
                        score2.setText(Integer.toString(scoore));
                        restart();
                    }
                }
                player.setText(current_player + " its your turn!");
            }
        });

        field9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view) {
                if (field9.getText() == "") {
                    if (current_player == "Player1") {
                        field9.setText("X");
                        current_player = "Player2";
                        placed += 1;
                    } else if (current_player == "Player2") {
                        field9.setText("O");
                        current_player = "Player1";
                        placed += 1;
                    }
                }
                if (placed >= 5){
                    if((field3.getText() == "X" && field6.getText() == "X" && field9.getText() == "X")
                            || (field1.getText() == "X" && field5.getText() == "X" && field9.getText() == "X")
                            || (field7.getText() == "X" && field8.getText() == "X" && field9.getText() == "X")){
                        Toast.makeText(getApplicationContext(), "Player1 wins", 50).show();
                        String score = String.valueOf(score1.getText());
                        int scoore = Integer.parseInt(score);
                        scoore += 1;
                        score1.setText(Integer.toString(scoore));
                        restart();
                    }
                    else if((field3.getText() == "O" && field6.getText() == "O" && field9.getText() == "O")
                            || (field1.getText() == "O" && field5.getText() == "O" && field9.getText() == "O")
                            || (field7.getText() == "O" && field8.getText() == "O" && field9.getText() == "O")){
                        Toast.makeText(getApplicationContext(), "Player2 wins", 50).show();
                        String score = String.valueOf(score2.getText());
                        int scoore = Integer.parseInt(score);
                        scoore += 1;
                        score2.setText(Integer.toString(scoore));
                        restart();

                    }
                }
                player.setText(current_player + " its your turn!");
            }
        });
    }

    protected void changeToMainMenu(){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

    protected void resetScore(){
        score1.setText("0");
        score2.setText("0");
    }
}
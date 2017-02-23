package com.example.android.battleshipmitko;

import android.animation.ObjectAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Random;

public class GameActivity extends AppCompatActivity {

    ImageButton grid00;
    ImageButton grid01;
    ImageButton grid02;
    ImageButton grid03;
    ImageButton grid04;
    ImageButton grid05;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);


        grid00 = (ImageButton) findViewById(R.id.b00);
        grid01 = (ImageButton) findViewById(R.id.b02);
        grid02 = (ImageButton) findViewById(R.id.b02);
        grid03 = (ImageButton) findViewById(R.id.b03);
        grid04 = (ImageButton) findViewById(R.id.b04);
        grid05 = (ImageButton) findViewById(R.id.b05);

        grid00.setOnClickListener(onClick);
        grid01.setOnClickListener(onClick);
        grid02.setOnClickListener(onClick);
        grid03.setOnClickListener(onClick);
        grid04.setOnClickListener(onClick);
        grid05.setOnClickListener(onClick);

    }

    HashMap<Integer,Integer[]> map = new HashMap<>();
    HashMap<Integer,Integer> mapShip = new HashMap<>();
    Object[] rand;

    private View.OnClickListener onClick = new View.OnClickListener() {

        @Override
        public void onClick(View view) {
            Random r = new Random();

            int shipPosition = (int) rand[r.nextInt(rand.length - 1)];
            int playerChoice = view.getId();


        }
    };



}

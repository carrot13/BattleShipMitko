package com.example.android.battleshipmitko;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static android.R.attr.onClick;

public class MainActivity extends AppCompatActivity {

    Button playButton;
    Button settingsBtn;
    Button statisticsBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playButton = (Button) findViewById(R.id.playButton);
        settingsBtn = (Button) findViewById(R.id.settingsButton);
        statisticsBtn = (Button) findViewById(R.id.statisticsButton);


        playButton.setOnClickListener(onClick);
        settingsBtn.setOnClickListener(onClick);
        statisticsBtn.setOnClickListener(onClick);


    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    View.OnClickListener onClick = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            Intent intent;

            switch (view.getId()){
                case R.id.playButton:
                    intent = new Intent(MainActivity.this,
                            GameActivity.class);
                    break;

                case R.id.settingsButton:
                    intent = new Intent(MainActivity.this,
                            SettingsActivity.class);
                    break;

                case R.id.statisticsButton:
                    intent = new Intent(MainActivity.this,
                            StatisticsActivity.class);
                    break;



                default:
                    intent = new Intent();

            }

            startActivity(intent);
        }
    };
}

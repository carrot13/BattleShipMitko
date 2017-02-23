package com.example.android.battleshipmitko;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SettingsActivity extends AppCompatActivity {

    int shipsNumber= 1;
    int ship1Size = 1;
    int ship2Size = 0;
    int ship3Size = 0;
    int ship4Size = 0;
    int ship5Size = 0;
    Button cancelButton;
    Button saveButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        cancelButton = (Button) findViewById(R.id.cancelButton);
        saveButton = (Button) findViewById(R.id.saveButton);

        cancelButton.setOnClickListener(onClick);
        saveButton.setOnClickListener(onClick);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    View.OnClickListener onClick = new View.OnClickListener() {

        public void onClick(View view) {

            Intent intent;
            switch (view.getId()){
                case R.id.cancelButton:
                    intent = new Intent(SettingsActivity.this,
                            MainActivity.class);
                    break;

                default:
                    intent = new Intent();
            }

            startActivity(intent);
        }
    };
    /**
     * This method is called when the + button is clicked.
     */
    public void increment(View view) {
        if (shipsNumber<5) {
            shipsNumber = shipsNumber + 1;
        }
        display(shipsNumber);
    }

    /**
     * This method is called when the - button is clicked.
     */
    public void decrement(View view) {
        if (shipsNumber>1) {
            shipsNumber = shipsNumber - 1;
        }
        display(shipsNumber);
    }

    private void display(int number) {
        TextView shipTextView = (TextView) findViewById(R.id.ships_text_view);
        shipTextView.setText("" + number);
    }

    /**
     * SHIP 1 size
     */

    public void incrementship1SizeTextView(View view) {
        if (ship1Size<5) {
            ship1Size = ship1Size + 1;
        }
        displayship1SizeTextView(ship1Size);
    }

    public void decrementship1SizeTextView(View view) {
        if (ship1Size>1) {
            ship1Size = ship1Size - 1;
        }
        displayship1SizeTextView(ship1Size);
    }

    private void displayship1SizeTextView(int number) {
        TextView ship1SizeTextView = (TextView) findViewById(R.id.Ship1Size);
        ship1SizeTextView.setText("" + number);
    }


   /*
    * SHIP 2 size
    */

    public void incrementship2SizeTextView(View view) {
        if (ship2Size<5) {
            ship2Size = ship2Size + 1;
        }
        displayship2SizeTextView(ship2Size);
    }

    public void decrementship2SizeTextView(View view) {
        if (ship2Size>0) {
            ship2Size = ship2Size - 1;
        }
        displayship2SizeTextView(ship2Size);
    }

    private void displayship2SizeTextView(int number) {
        TextView ship2SizeTextView = (TextView) findViewById(R.id.Ship2Size);
        ship2SizeTextView.setText("" + number);
    }

    /*
    * SHIP 3 size
    */

    public void incrementship3SizeTextView(View view) {
        if (ship3Size<5) {
            ship3Size = ship3Size + 1;
        }
        displayship3SizeTextView(ship3Size);
    }

    public void decrementship3SizeTextView(View view) {
        if (ship3Size>0) {
            ship3Size = ship3Size - 1;
        }
        displayship3SizeTextView(ship3Size);
    }

    private void displayship3SizeTextView(int number) {
        TextView ship3SizeTextView = (TextView) findViewById(R.id.Ship3Size);
        ship3SizeTextView.setText("" + number);
    }

    /*
    * SHIP 4 size
    */

    public void incrementship4SizeTextView(View view) {
        if (ship4Size<5) {
            ship4Size = ship4Size + 1;
        }
        displayship4SizeTextView(ship4Size);
    }

    public void decrementship4SizeTextView(View view) {
        if (ship4Size>0) {
            ship4Size = ship4Size - 1;
        }
        displayship4SizeTextView(ship4Size);
    }

    private void displayship4SizeTextView(int number) {
        TextView ship4SizeTextView = (TextView) findViewById(R.id.Ship4Size);
        ship4SizeTextView.setText("" + number);
    }

    /*
    * SHIP 5 size
    */

    public void incrementship5SizeTextView(View view) {
        if (ship5Size<5) {
            ship5Size = ship5Size + 1;
        }
        displayship5SizeTextView(ship5Size);
    }

    public void decrementship5SizeTextView(View view) {
        if (ship5Size>0) {
            ship5Size = ship5Size - 1;
        }
        displayship5SizeTextView(ship5Size);
    }

    private void displayship5SizeTextView(int number) {
        TextView ship5SizeTextView = (TextView) findViewById(R.id.Ship5Size);
        ship5SizeTextView.setText("" + number);
    }
}

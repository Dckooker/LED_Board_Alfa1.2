package com.led_board.led_board_alfa1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {

    private Spinner spinner ;



    //DEFINE TEXT VIEW

    TextView PresetTextView ;

    //make string Arrary

    String ColorsPresets[] = {"Click_Here", "Tic_Tac_Toe","Another_Game"};



    //defins array adapter of string type

    ArrayAdapter<String> adapter;

    //define string variable for record

    String record= "";

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        spinner = (Spinner)findViewById(R.id.spinner1);

        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,ColorsPresets);

        PresetTextView = (TextView)findViewById(R.id.PresetTextView);

        //set adapter to spinner

        spinner.setAdapter(adapter);

        //set spinner method

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override

            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {


                Toast.makeText(getBaseContext(), parent.getItemAtPosition(position) + " selected", Toast.LENGTH_LONG).show();

                switch (position) {
                    case 0:
                        record = "Click_Here";
                        break;
                    case 1:
                        record = "Tic_Tac_Toe";
                        break;

                    case 2:
                        record = "Another_Game";
                        break;
                }

                PresetTextView.setTextSize(5);
                PresetTextView.setText(record);




                String s=((TextView)PresetTextView).getText().toString();

                if(s.equals("Tic_Tac_Toe"))
                    startActivity(new Intent(view.getContext(), Tic_Tac_Toe.class));

                if(s.equals("Another_Game"))
                    startActivity(new Intent(view.getContext(), Another_Game.class));

                if(s.equals("Click Here"))
                    startActivity(new Intent(view.getContext(), MainActivity.class));
            }


            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }

        });
    }







}



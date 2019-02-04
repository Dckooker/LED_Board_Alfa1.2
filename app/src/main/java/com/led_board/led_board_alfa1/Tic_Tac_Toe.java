package com.led_board.led_board_alfa1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.TintableCompoundButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Tic_Tac_Toe extends AppCompatActivity {

    String TicTacRecord= "";
    TextView PresetTicTac ;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;




    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_tic_tac_toe);


        PresetTicTac = (TextView)findViewById(R.id.PresetTicTac);

         Button button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                TicTacRecord = "1";
                //throwData();
                DataSender dataSender = new DataSender();
                dataSender.execute("1");
                Toast.makeText(getBaseContext(),"1",Toast.LENGTH_SHORT).show();
            }
        });

         Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                TicTacRecord = "2";
                throwData();
            }
        });

         Button button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                TicTacRecord = "3";
                throwData();
            }
        });

         Button button4 = findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                TicTacRecord = "4";
                throwData();
            }
        });

         Button button5 = findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                TicTacRecord = "5";
                throwData();
            }
        });

         Button button6 = findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                TicTacRecord = "6";
                throwData();
            }
        });

         Button button7 = findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                TicTacRecord = "7";
                throwData();
            }
        });

         Button button8 = findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                TicTacRecord = "8";
                throwData();
            }
        });

         Button button9 = findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                TicTacRecord = "9";
                throwData();


            }
        });


         Button BackButton = findViewById(R.id.BackButton);
        BackButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){



                startActivity(new Intent(v.getContext(),MainActivity.class));


            }
        });


    }






    public void throwData ()
    {
        PresetTicTac.setTextSize(5);
        PresetTicTac.setText(TicTacRecord);

        DataSender dataSender = new DataSender();
        dataSender.execute(PresetTicTac.getText().toString());


    }

}

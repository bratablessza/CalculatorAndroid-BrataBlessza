package com.example.ujianbrata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Brata10Desember extends AppCompatActivity {
    Button button1,button2,button3,button4,button5,button6,button7,button8,button9,button0,buttonkali,buttonbagi,buttontambah,buttonkurang,buttonequals,buttonreset;
    TextView displayInput,displayOutput,displayHistory;

    Integer bilSatu,bilDua;
    boolean opTambah, opKurang, opKali, opBagi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brata10_desember);

        button0 = findViewById(R.id.button0);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        buttonkali = findViewById(R.id.buttonkali);
        buttonbagi = findViewById(R.id.buttonbagi);
        buttontambah = findViewById(R.id.buttontambah);
        buttonkurang = findViewById(R.id.buttonkurang);
        buttonreset = findViewById(R.id.buttonreset);
        buttonequals = findViewById(R.id.buttonequals);

        displayInput = findViewById(R.id.displayInput);
        displayOutput = findViewById(R.id.displayOutput);
        displayHistory = findViewById(R.id.displayHistory);


        buttonreset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayOutput.setText("");
                displayInput.setText(null);
                displayHistory.setText("");
            }
        });


        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayHistory.setText(displayInput.getText()+"0");
                displayInput.setText(displayInput.getText()+"0");

            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayHistory.setText(displayInput.getText()+"1");
                displayInput.setText(displayInput.getText()+"1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayHistory.setText(displayInput.getText()+"2");
                displayInput.setText(displayInput.getText()+"2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayHistory.setText(displayInput.getText()+"3");
                displayInput.setText(displayInput.getText()+"3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayHistory.setText(displayInput.getText()+"4");
                displayInput.setText(displayInput.getText()+"4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayHistory.setText(displayInput.getText()+"5");
                displayInput.setText(displayInput.getText()+"5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayHistory.setText(displayInput.getText()+"6");
                displayInput.setText(displayInput.getText()+"6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayHistory.setText(displayInput.getText()+"7");
                displayInput.setText(displayInput.getText()+"7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayHistory.setText(displayInput.getText()+"8");
                displayInput.setText(displayInput.getText()+"8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayHistory.setText(displayInput.getText()+"9");
                displayInput.setText(displayInput.getText()+"9");
            }
        });

        buttonkali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayHistory.setText(displayInput.getText()+"x");

                bilSatu = Integer.parseInt(displayInput.getText() + "");
                opKali = true;
                displayInput.setText(null);

            }
        });

        buttonbagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayHistory.setText(displayInput.getText()+":");
//                if (bilSatu == null){
//                    bilSatu = Integer.parseInt(displayInput.getText().toString());
//                } else {
//                    bilDua = Integer.parseInt(displayInput.getText().toString());
//                }
//                displayInput.setText(displayInput.getText()+":");


                bilSatu = Integer.parseInt(displayInput.getText() + "");
                opBagi = true;
                displayInput.setText(null);


            }
        });

        buttontambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayHistory.setText(displayInput.getText()+"+");

                if (displayInput == null) {
                    displayInput.setText("");
                } else {
                    bilSatu = Integer.parseInt(displayInput.getText() + "");
                    opTambah = true;
                    displayInput.setText(null);
                }


            }

        });

        buttonkurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayHistory.setText(displayInput.getText()+"-");

                bilSatu = Integer.parseInt(displayInput.getText() + "");
                opKurang = true;
                displayInput.setText(null);


            }
        });

        buttonequals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                displayOutput.setText(String.valueOf(Integer.parseInt(displayInput.getText().toString())+1));

                bilDua = Integer.parseInt(displayInput.getText() + "");

                if (opKali == true){
                    displayHistory.setText(bilSatu.toString() + "*" +bilDua.toString());
                    displayOutput.setText(bilSatu * bilDua + "");
                    opKali = false;
                }
                if (opBagi == true){
                    displayHistory.setText(bilSatu.toString() + ":" +bilDua.toString());
                    displayOutput.setText(bilSatu / bilDua + "");
                    opBagi = false;
                }
                if (opTambah == true){
                    displayHistory.setText(bilSatu.toString() + "+" +bilDua.toString());
                    displayOutput.setText((bilSatu + bilDua) + "");
                    opTambah = false;
                }
                if (opKurang == true){
                    displayHistory.setText(bilSatu.toString() + "-" +bilDua.toString());
                    displayOutput.setText(bilSatu - bilDua + "");
                    opKurang = false;
                }

            }
        });

    }
}
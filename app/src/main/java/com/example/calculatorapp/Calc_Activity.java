package com.example.calculatorapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Calc_Activity extends AppCompatActivity {
    TextView calcScreen;
    Button nZero, nOne, nTwo, nThree, nFour, nFive, nSix,nSeven,nEight, nNine, nDot, nDel, nDiv, nProd, nSub, nAdd, nEqual;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calc_sceen);

        calcScreen = findViewById(R.id.text_screen);
        nZero= findViewById(R.id.n_0);
        nOne= findViewById(R.id.n_1);
        nTwo= findViewById(R.id.n_2);
        nThree= findViewById(R.id.n_3);
        nFour= findViewById(R.id.n_4);
        nFive= findViewById(R.id.n_5);
        nSix= findViewById(R.id.n_6);
        nSeven= findViewById(R.id.n_7);
        nEight= findViewById(R.id.n_8);
        nNine= findViewById(R.id.n_9);
        nDot= findViewById(R.id.n_Dot);
        nDel= findViewById(R.id.n_DEL);
        nDiv= findViewById(R.id.n_Div);
        nProd= findViewById(R.id.n_Prod);
        nSub= findViewById(R.id.n_Min);
        nAdd= findViewById(R.id.n_Add);
        nEqual= findViewById(R.id.n_Equal);



        nZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Calc_Activity.this,"Zero", Toast.LENGTH_SHORT).show();
            }
            });
        nOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Calc_Activity.this,"One", Toast.LENGTH_LONG).show();
            }
        });
        nTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Calc_Activity.this,"Two", Toast.LENGTH_LONG).show();
            }
        });
        nThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Calc_Activity.this,"Three", Toast.LENGTH_LONG).show();
            }
        });
        nFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Calc_Activity.this,"Four", Toast.LENGTH_LONG).show();
            }
        });
        nFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Calc_Activity.this,"Five", Toast.LENGTH_LONG).show();
            }
        });
        nSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Calc_Activity.this,"Six", Toast.LENGTH_LONG).show();
            }
        });
        nSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Calc_Activity.this,"Seven", Toast.LENGTH_LONG).show();
            }
        });
        nEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Calc_Activity.this,"Eight", Toast.LENGTH_LONG).show();
            }
        });
        nNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Calc_Activity.this,"Nine", Toast.LENGTH_LONG).show();
            }
        });
         nDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Calc_Activity.this,".", Toast.LENGTH_LONG).show();
            }
        });
         nDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Calc_Activity.this,"DELETEDELETEDELETE", Toast.LENGTH_LONG).show();
            }
        });
         nDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Calc_Activity.this,"/", Toast.LENGTH_LONG).show();
            }
        });
         nProd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Calc_Activity.this,"X", Toast.LENGTH_LONG).show();
            }
        });
         nSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Calc_Activity.this,"-", Toast.LENGTH_LONG).show();
            }
        });
         nAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Calc_Activity.this,"+", Toast.LENGTH_LONG).show();
            }
        });
         nEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Calc_Activity.this,"=", Toast.LENGTH_LONG).show();
            }
        });


    }
}

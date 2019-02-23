package com.saad.hajar.mathapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonAddition = (Button) findViewById(R.id.buttonAddition);
        Button buttonSubtraction = (Button) findViewById(R.id.buttonSubtraction);
        Button buttonMultiplication = (Button) findViewById(R.id.buttonMultiplication);
        Button buttonDivision = (Button) findViewById(R.id.buttonDivision);


        buttonAddition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sumIntent = new Intent(MainActivity.this,Addition.class);
                startActivity(sumIntent);
            }
        });

        buttonSubtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent subIntent = new Intent(MainActivity.this,Subtraction.class);
                startActivity(subIntent);
            }
        });

        buttonMultiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent multIntent = new Intent(MainActivity.this,Multiplication.class);
                startActivity(multIntent);
            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent divideIntent = new Intent(MainActivity.this,Division.class);
                startActivity(divideIntent);
            }
        });

    }
}

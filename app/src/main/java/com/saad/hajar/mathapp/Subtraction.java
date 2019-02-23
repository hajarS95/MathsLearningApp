package com.saad.hajar.mathapp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Subtraction extends AppCompatActivity {

    TextView titleTextView;
    TextView calculateText;
    EditText num1;
    EditText num2;
    TextView textMark;
    TextView total;
    Button button;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_item);

        titleTextView = (TextView) findViewById(R.id.textViewTitle);
        calculateText = (TextView) findViewById(R.id.textViewCalculate);
        textMark = (TextView) findViewById(R.id.textViewSign);
        button = (Button) findViewById(R.id.buttonResult);
        listView = (ListView) findViewById(R.id.listViewExamples);

        titleTextView.setText(getString(R.string.titleSubtraction));
        calculateText.setText(getString(R.string.Subtraction1));

        textMark.setText(R.string.SubtractionMark);

        button.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                num1 = (EditText) findViewById(R.id.Num1);
                num2 = (EditText) findViewById(R.id.Num2);
                total = (TextView) findViewById(R.id.textViewTotal);

                int Num1 = Integer.parseInt(num1.getText().toString());
                int Num2 = Integer.parseInt(num2.getText().toString());
                int val = Num1 - Num2;

                total.setText(Integer.toString(val));
            }
        });


        ArrayList<Examples> arrayList = new ArrayList<Examples>();

        arrayList.add(new Examples("6 - 0 = 6", R.drawable.subtraction1));
        arrayList.add(new Examples("8 - 8 = 0", R.drawable.subtraction2));
        arrayList.add(new Examples("5 - 3 = 2", R.drawable.subtraction3));
        arrayList.add(new Examples("8 - 5 = 3", R.drawable.subtraction4));
        arrayList.add(new Examples("10 - 3 = 7", R.drawable.subtraction5));
        arrayList.add(new Examples("14 - 2 = 12", R.drawable.subtraction6));
        arrayList.add(new Examples("9 - 4 = 5", R.drawable.subtraction7));
        arrayList.add(new Examples("12 - 4 = 8", R.drawable.subtraction8));

        ExampleAdapter adapter = new ExampleAdapter(this,arrayList,R.color.colorSubtraction);
        listView.setAdapter(adapter);

        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.list_item_back);
        linearLayout.setBackgroundResource(R.color.colorSubtraction);

    }
}

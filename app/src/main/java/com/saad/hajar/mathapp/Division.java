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

public class Division extends AppCompatActivity {


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

        titleTextView.setText(getString(R.string.titleDivision));
        calculateText.setText(getString(R.string.Division1));

        textMark.setText(R.string.DivisionMark);

        button.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                num1 = (EditText) findViewById(R.id.Num1);
                num2 = (EditText) findViewById(R.id.Num2);
                total = (TextView) findViewById(R.id.textViewTotal);

                int Num1 = Integer.parseInt(num1.getText().toString());
                int Num2 = Integer.parseInt(num2.getText().toString());
                int val = Num1 / Num2;

                total.setText(Integer.toString(val));
            }
        });


        ArrayList<Examples> arrayList = new ArrayList<Examples>();

        arrayList.add(new Examples("5 ÷ 1 = 5", R.drawable.divition1));
        arrayList.add(new Examples("4 ÷ 2 = 2", R.drawable.divition2));
        arrayList.add(new Examples("6 ÷ 3 = 2", R.drawable.divition3));
        arrayList.add(new Examples("8 ÷ 4 = 2", R.drawable.divition4));
        arrayList.add(new Examples("9 ÷ 3 = 3", R.drawable.divition5));
        arrayList.add(new Examples("11 ÷ 0 = 0", R.drawable.divition6));
        arrayList.add(new Examples("10 ÷ 5 = 2", R.drawable.divition7));
        arrayList.add(new Examples("12 ÷ 4 = 3", R.drawable.divition8));

        ExampleAdapter adapter = new ExampleAdapter(this,arrayList,R.color.colorDivision);
        listView.setAdapter(adapter);

        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.list_item_back);
        linearLayout.setBackgroundResource(R.color.colorDivision);

    }
}

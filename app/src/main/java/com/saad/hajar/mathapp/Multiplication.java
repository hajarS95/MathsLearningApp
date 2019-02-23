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

public class Multiplication extends AppCompatActivity {
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

        titleTextView.setText(getString(R.string.titleMultiplication));
        calculateText.setText(getString(R.string.Multiplication1));

        textMark.setText(R.string.MultiplicationMark);

        button.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                num1 = (EditText) findViewById(R.id.Num1);
                num2 = (EditText) findViewById(R.id.Num2);
                total = (TextView) findViewById(R.id.textViewTotal);

                int Num1 = Integer.parseInt(num1.getText().toString());
                int Num2 = Integer.parseInt(num2.getText().toString());
                int val = Num1 * Num2;

                total.setText(Integer.toString(val));
            }
        });


        ArrayList<Examples> arrayList = new ArrayList<Examples>();

        arrayList.add(new Examples("3 × 1 = 3", R.drawable.multiplication1));
        arrayList.add(new Examples("2 × 5 = 10", R.drawable.multiplication2));
        arrayList.add(new Examples("4 × 4 = 16", R.drawable.multiplication3));
        arrayList.add(new Examples("3 × 5 = 15", R.drawable.multiplication4));
        arrayList.add(new Examples("2 × 2 = 4", R.drawable.multiplication5));
        arrayList.add(new Examples("2 × 6 = 12", R.drawable.multiplication6));
        arrayList.add(new Examples("3 × 7 = 21", R.drawable.multiplication7));
        arrayList.add(new Examples("5 × 0 = 0", R.drawable.multiplication8));

        ExampleAdapter adapter = new ExampleAdapter(this,arrayList,R.color.colorMultiplication);
        listView.setAdapter(adapter);

        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.list_item_back);
        linearLayout.setBackgroundResource(R.color.colorMultiplication);

    }
}

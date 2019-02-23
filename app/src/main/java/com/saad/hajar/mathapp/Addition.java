package com.saad.hajar.mathapp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.style.BackgroundColorSpan;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class Addition extends AppCompatActivity {

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

        titleTextView.setText(getString(R.string.titleAddition));
        calculateText.setText(getString(R.string.Addition1));

        textMark.setText(R.string.AdditionMark);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = (EditText) findViewById(R.id.Num1);
                num2 = (EditText) findViewById(R.id.Num2);
                total = (TextView) findViewById(R.id.textViewTotal);

                int Num1 = Integer.parseInt(num1.getText().toString());
                int Num2 = Integer.parseInt(num2.getText().toString());
                int val = Num1 + Num2;

                total.setText(Integer.toString(val));
            }
        });

        final ArrayList<Examples> arrayList = new ArrayList<Examples>();

        arrayList.add(new Examples("5 + 0 = 5", R.drawable.additionone));
        arrayList.add(new Examples("1 + 1 = 2", R.drawable.additiontwo));
        arrayList.add(new Examples("3 + 3 = 6", R.drawable.additionthree));
        arrayList.add(new Examples("2 + 7 = 9", R.drawable.additionfour));
        arrayList.add(new Examples("5 + 3 = 8", R.drawable.additionfive));
        arrayList.add(new Examples("6 + 7 = 13", R.drawable.additionsixe));
        arrayList.add(new Examples("9 + 2 = 11", R.drawable.additionsaven));
        arrayList.add(new Examples("8 + 2 = 10", R.drawable.additioneight));

        ExampleAdapter adapter = new ExampleAdapter (this,arrayList,R.color.colorAddition);
        listView.setAdapter(adapter);


        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.list_item_back);
        linearLayout.setBackgroundResource(R.color.colorAddition);

    }
}

package com.saad.hajar.mathapp;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ExampleAdapter extends BaseAdapter {

    ArrayList<Examples> examplesArrayList;
    Context context;
    int mColorResourceId;

    public ExampleAdapter(Context context,ArrayList<Examples> examplesArrayList,int mColorResourceId) {
        this.examplesArrayList = examplesArrayList;
        this.context = context;
        this.mColorResourceId = mColorResourceId;
    }

    @Override
    public int getCount() {
        return examplesArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return examplesArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View listItemView = inflater.inflate(R.layout.exampl_activity, parent, false);
        TextView textView = (TextView) listItemView.findViewById(R.id.textViewQualty);
        textView.setText(examplesArrayList.get(position).getTextQuality());
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.imageViewQuality);
        imageView.setImageResource(examplesArrayList.get(position).getImageResource());
        View textContainer = listItemView.findViewById(R.id.qualityColor);
        int color = ContextCompat.getColor(context, mColorResourceId);
        textContainer.setBackgroundColor(color);


        return listItemView;
    }


//    private ArrayList<Examples>list;
//    private int mColorResourceId;
//
//    ExampleAdapter(@NonNull Activity context, ArrayList<Examples> examples, int mColorResourceId) {
//        super(context,0, mColorResourceId);
//        this.list = examples;
//        this.mColorResourceId = mColorResourceId;
//    }
//
//    @NonNull
//    @Override
//    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
//
//        View listItemView = convertView;
//        if (listItemView == null) {
//            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.exampl_activity, parent, false);
//        }
//
//        Examples currentExample = this.list.get(position);
//
//        TextView textView = (TextView) listItemView.findViewById(R.id.textViewQualty);
//        textView.setText(currentExample.getTextQuality());
//
//        ImageView imageView = (ImageView) listItemView.findViewById(R.id.imageViewQuality);
//        imageView.setImageResource(currentExample.getImageResource());
//
//        View textContainer = listItemView.findViewById(R.id.qualityColor);
//        // Find the color that the resource ID maps to
//        int color = ContextCompat.getColor(getContext(), mColorResourceId);
//        // Set the background color of the text container View
//        textContainer.setBackgroundColor(color);
//
//        return listItemView;
//
//    }
}

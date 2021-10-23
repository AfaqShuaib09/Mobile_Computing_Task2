package com.example.mycounterapp;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    TextView counter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        counter=(TextView) findViewById(R.id.editTextTextPersonName);
    }

    public void buttonClick(View v)
    {
        int temp = Integer.parseInt(counter.getText().toString());
        temp = temp+1;
        counter.setText(Integer.toString(temp));
    }
    public void buttonClick2(View v)
    {
        int temp = Integer.parseInt(counter.getText().toString());
        temp=temp -1;
        counter.setText(Integer.toString(temp));
    }

    public void resetCounter(View v) {
        counter.setText("0");
    }




}
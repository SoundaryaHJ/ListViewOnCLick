package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity
{

    TextView inputTextView;
    String inputSrr;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        inputTextView = findViewById(R.id.input);
        inputSrr = getIntent().getExtras().getString("input");

        inputTextView.setText(inputSrr);
    }
}
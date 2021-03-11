package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView operand1 = (TextView) findViewById(R.id.operand1);
    TextView operand2 = (TextView) findViewById(R.id.operand2);
    TextView operator = (TextView) findViewById(R.id.operator);
    TextView output = (TextView) findViewById(R.id.output);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


}
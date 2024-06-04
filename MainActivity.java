package com.example.unitconvertorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView t1,tv;
    EditText et1;
    Button b1,b2,b3,b4,b5,b6,b7,b8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=findViewById(R.id.tv);
        t1=findViewById(R.id.t1);
        et1=findViewById(R.id.et1);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        b5=findViewById(R.id.b5);
        b6=findViewById(R.id.b6);
        b7=findViewById(R.id.b7);
        b8=findViewById(R.id.b8);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Float a;
                Float p1=Float.parseFloat(et1.getText().toString());
                a=p1*1000;
                tv.setText("Result = " +a+" M");




            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Float a;
                Float p1=Float.parseFloat(et1.getText().toString());
                a=p1/1000;
                tv.setText("Result = " +a+" KM");




            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Float a;
                Float p1=Float.parseFloat(et1.getText().toString());
                a=p1*1000;
                tv.setText("Result = " +a+" ML");




            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Float a;
                Float p1=Float.parseFloat(et1.getText().toString());
                a=p1/1000;
                tv.setText("Result = " +a+" L");




            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Float a;
                Float p1=Float.parseFloat(et1.getText().toString());
                a=p1*100;
                tv.setText("Result = " +a+" CM");




            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Float a;
                Float p1=Float.parseFloat(et1.getText().toString());
                a=p1*1000;
                tv.setText("Result = " +a+" G");




            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Float a;
                Float p1=Float.parseFloat(et1.getText().toString());
                a=p1/1000;
                tv.setText("Result = " +a+" KG");




            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Float a;
                Float p1=Float.parseFloat(et1.getText().toString());
                a=p1/100;
                tv.setText("Result = " +a+" M");




            }
        });


    }
}
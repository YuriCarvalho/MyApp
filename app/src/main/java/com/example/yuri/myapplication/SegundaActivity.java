package com.example.yuri.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SegundaActivity extends AppCompatActivity {

     private Button btnD14;
     private Button btnD18;
     private Button btnD22;
     private Button btnD26;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btnD14 = (Button) findViewById(R.id.buttonD14);
        btnD18 = (Button) findViewById(R.id.buttonD18);
        btnD22 = (Button) findViewById(R.id.buttonD22);
        btnD26 = (Button) findViewById(R.id.buttonD26);

            }
    }


package com.example.yuri.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnD;
    private Button btnM;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnD = (Button) findViewById(R.id.buttonD);
        btnM = (Button) findViewById(R.id.buttonM);

        btnM.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent ot = new Intent(MainActivity.this, TerceiraActivity.class);
                startActivity(ot);
            }

    });

        btnD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, SegundaActivity.class);
                startActivity(it);
            }
        });

    }
}

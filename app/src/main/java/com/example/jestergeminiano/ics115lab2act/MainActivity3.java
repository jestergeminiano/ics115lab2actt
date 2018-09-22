package com.example.jestergeminiano.ics115lab2act;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.relative_layout);
    }

    public void backButtonOnClick(View v) {
        Button button2 =(Button) v;
        Intent myIntent = new Intent(MainActivity3.this,
                MainActivity2.class);
        startActivity(myIntent);
    }


}

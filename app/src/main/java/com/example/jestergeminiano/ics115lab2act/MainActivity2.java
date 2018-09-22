package com.example.jestergeminiano.ics115lab2act;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.linear_layout);
    }

    public void buttonOnClick(View v) {
        Button button3 = (Button) findViewById(R.id.button3);
        Intent next = new Intent(MainActivity2.this,
                MainActivity3.class);
        startActivity(next);
    }
}


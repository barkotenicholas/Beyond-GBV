package com.example.nicholas.beyondgbv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void victim(View view) {
        startActivity(new Intent(MainActivity.this,Victim.class));

    }

    public void agencies(View view) {
        startActivity(new Intent(MainActivity.this,Agenciew.class));


    }
}

package com.example.hackswipe;

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

    public void onClickLogin(View view) {
        Intent intent = new Intent(this, hacker_search.class);
        startActivity(intent);
    }

    public void onClickRegister(View view) {
        Intent intent = new Intent(this, Registration.class);
        startActivity(intent);
    }
}




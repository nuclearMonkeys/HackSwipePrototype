package com.example.hackswipe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class homePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
    }

    void OnClick(View view)
    {
        Intent searchIntent = new Intent(this, hacker_search.class);
        startActivity(searchIntent);
    }
}

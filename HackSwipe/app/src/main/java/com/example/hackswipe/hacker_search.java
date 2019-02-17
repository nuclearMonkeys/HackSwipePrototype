package com.example.hackswipe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class hacker_search extends AppCompatActivity {
    private Spinner spinner;
    public  static String selectedSkill;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hacker_search);
        addItemsonSpinner();
    }

    public void onClickSearch(View view) {
        Intent intent = new Intent(this, hacker_results.class);
        selectedSkill = spinner.getSelectedItem().toString();
        System.out.println(selectedSkill);
        intent.putExtra("Extra_selectedSkill", selectedSkill);
        startActivity(intent);

    }

    public String getSelectedSkill(){
        return selectedSkill;
    }

    public void addItemsonSpinner(){
        spinner = (Spinner) findViewById(R.id.skillspinner); // copies refrence to xml value by id
        List<String> skillList = new ArrayList<String>();
        skillList.add("C++");
        skillList.add("Java");
        skillList.add("JavaScript");
        skillList.add("Python");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>
                // links skill list with spinner
                (this,android.R.layout.simple_spinner_item, skillList);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(dataAdapter);






    }
}

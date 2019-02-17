package com.example.hackswipe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class hacker_results extends AppCompatActivity {


    //@Override
    List<Cards> CardsLIST;
    RecyclerView recyclerView;
    CardsAdapter adapter;
    TextView skillstring;

    String selectedSkill2 = hacker_search.selectedSkill.toString();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //String selectedSkill = getIntent().getStringExtra("Extra_selectedSkill");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hacker_results);
        //setContentView(R.layout.activity_hacker_results);
        skillstring = (TextView) findViewById(R.id.textView5);
        skillstring.append(":\n"+selectedSkill2);

        CardsLIST = new ArrayList<>();
        recyclerView =(RecyclerView) findViewById(R.id.recyclerView);
        //recyclerView.setHasFixedSize(true); // MAY NOT NEED THIS!!!!!!!!!!

        //IMPORTANT
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        // HERE WE ADD THE ITEMS
        CardsLIST.add(
                new Cards(
                        "John",
                        "3rd year CS major",
                        "Python",
                        R.drawable.john));

        CardsLIST.add(
                new Cards(
                        "Lisa",
                        "1st year CS major",
                        "Java",
                        R.drawable.hotlisa));

        CardsLIST.add(
                new Cards(
                        "Alexis",
                        "4th year CSE major",
                        "C++",
                        R.drawable.alexis));
        CardsLIST.add(
                new Cards(
                        "Marcus",
                        "2nd year EECS major",
                        "C++",
                        R.drawable.marcus));
        CardsLIST.add(
                new Cards(
                        "Bridget",
                        "3rd year EECS major",
                        "Java",
                        R.drawable.bridget));

        CardsLIST.add(
                new Cards(
                        "Lindon",
                        "1st year CSE major",
                        "Java",
                        R.drawable.lindon));


        CardsLIST.add(
                new Cards(
                        "Britt",
                        "4th year EECS major",
                        "Python",
                        R.drawable.britt));

        List<Cards> copyCardLIST = new ArrayList<Cards>();

        adapter = new CardsAdapter(this, (ArrayList<Cards>) copyCardLIST);
        for(int i = 0; i < CardsLIST.size(); i++){
            if (CardsLIST.get(i).getcardSkill() == selectedSkill2){
                copyCardLIST.add(CardsLIST.get(i));
            }
        }

        recyclerView.setAdapter(adapter);


        //super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_hacker_results);
    }
/*
    public void OnClick_BackToResults(View view)
    {
        Intent resultIntent = new Intent(this, hacker_search.class);
        startActivity(resultIntent);
    }
    */

/****
 * code for selecting Hackers
 */
}

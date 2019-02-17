/*package com.example.hackswipe;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Cards> CardsLIST;
    RecyclerView recyclerView;
    CardsAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CardsLIST = new ArrayList<>();
        recyclerView =(RecyclerView) findViewById(R.id.recyclerView);
        //recyclerView.setHasFixedSize(true); // MAY NOT NEED THIS!!!!!!!!!!

        //IMPORTANT
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        // HERE WE ADD THE ITEMS
        CardsLIST.add(
                new Cards(
                        "JOHN",
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
                        "JOHN",
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
                        "JOHN",
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
                        "JOHN",
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
                        "JOHN",
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
                        "JOHN",
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
                        "JOHN",
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
                        "JOHN",
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
                        "JOHN",
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
                        "JOHN",
                        "3rd year CS major",
                        "Python",
                        R.drawable.john));

        CardsLIST.add(
                new Cards(
                        "Lisa",
                        "1st year CS major",
                        "Java",
                        R.drawable.hotlisa));


        
        adapter = new CardsAdapter(this, (ArrayList<Cards>) CardsLIST);

        recyclerView.setAdapter(adapter);

    }


}
*/
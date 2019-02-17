package com.example.hackswipe;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


/**RecyclervView.Adapter (Attaches the data to the view)
 * -for the adapter we need to define the view holder class
 *
 * RecyclerView.ViewHolder (HOLDS THE VIEW)
 */
public class CardsAdapter extends RecyclerView.Adapter<CardsAdapter.CardsViewHolder> {
    // need the context to inflate the layout
    private Context context;
    private ArrayList<Cards> cardsArrayList; //list instead Because we may need list layout (9:18)

    public CardsAdapter(Context context, ArrayList<Cards> cardsArrayList) {
        this.context = context;
        this.cardsArrayList = cardsArrayList;
    }

    @NonNull
    @Override
    // creates view holder instance to hold the view and returns it
    public CardsViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int index) {
        // we need this to create the view obj
        LayoutInflater inflater = LayoutInflater.from(context);
        View view  =inflater.inflate(R.layout.list_layout,null);
        return new CardsViewHolder(view);
    }

    @Override
    // this will attach the data to the view holder
    public void onBindViewHolder(@NonNull CardsViewHolder cardsViewHolder, int index) {
        // where the ui elements will be binded
        Cards card = cardsArrayList.get(index);
        cardsViewHolder.textViewName.setText(card.getcardName());
        cardsViewHolder.textViewSkills.setText(card.getcardSkill());
        cardsViewHolder.textViewDecrip.setText(card.getcardDescription());
        cardsViewHolder.imageView.
                setImageDrawable(context.getResources().getDrawable(card.getcardImage()));

    }

    @Override
    // returns the size of the list
    public int getItemCount() {
        return cardsArrayList.size();
    }
// this class takes a view and we need to pass the layout xml to it

    //!**********************THIS MAY NEED TO BE ADJUSTED*****************************!\\
    class CardsViewHolder extends RecyclerView.ViewHolder{
        //create the ui elments
    ImageView imageView;
    TextView textViewName, textViewDecrip, textViewSkills;

        public CardsViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView);
            textViewName = itemView.findViewById(R.id.textViewName);
            textViewDecrip = itemView.findViewById(R.id.textViewDecrip);
            textViewSkills = itemView.findViewById(R.id.textViewSkills);
        }

        /// to create the view object using the layout file we need to inflate it and we need
        // the context object to inflate it
    }
}

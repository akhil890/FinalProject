package com.example.finalproject;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.navigation.NavController;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class PlantRecyclerView extends RecyclerView.ViewHolder {
    TextView name;
    TextView habit;
    TextView lifespan;
    TextView exposure;
    TextView water;
    TextView species;
    TextView features;
    ImageView image;

    CardView cardView;
    public PlantRecyclerView(@NonNull View itemView) {
        super(itemView);
         image=itemView.findViewById(R.id.image);
         name=itemView.findViewById(R.id.name);
         habit=itemView.findViewById(R.id.habit);
         lifespan=itemView.findViewById(R.id.lifespan);
         exposure=itemView.findViewById(R.id.exposure);
         water=itemView.findViewById(R.id.water);
         species=itemView.findViewById(R.id.species);
         cardView=itemView.findViewById(R.id.cardview);
        features=itemView.findViewById(R.id.features);
    }
    public void bind(Context context, Plant plant, NavController navController) {
        name.setText(plant.getName());
        habit.setText(plant.getHabit());
        lifespan.setText(plant.getLifespan());
        exposure.setText(plant.getExposure());
        water.setText(plant.getWater());
        species.setText(plant.getSpecies().get(0).getName());
        features.setText(plant.getFeatures());




        Picasso.get().load(plant.getImage()).into(image);



        cardView.setOnClickListener(v->{

            RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder)v.getTag();



            Bundle b = new Bundle();
            b.putParcelable("data", (Parcelable) plant);
            navController.navigate(R.id.secondFragment,b);

        });
    }
}

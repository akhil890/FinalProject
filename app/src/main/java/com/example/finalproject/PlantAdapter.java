package com.example.finalproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.navigation.NavController;
import androidx.recyclerview.widget.RecyclerView;

import java.io.IOException;
import java.util.ArrayList;

public class PlantAdapter extends RecyclerView.Adapter<PlantRecyclerView> {
    Context context;
    ArrayList<Plant> data;
    private View.OnClickListener itemlistener;
    NavController navController;


    public PlantAdapter( ArrayList<Plant> data,Context context,NavController navController){
            this.data=data;
            this.context=context;
            this.navController=navController;
    }

    public void setClickListener(View.OnClickListener itemlistener)
    {
        this.itemlistener = itemlistener;
    }


    @NonNull
    @Override
    public PlantRecyclerView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.plant_sample,parent,false);
        PlantRecyclerView customviewholder=new PlantRecyclerView(view);
        return customviewholder;
    }

    @Override
    public void onBindViewHolder(@NonNull PlantRecyclerView holder, int position) {

            holder.bind(context,data.get(position),navController);

    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}

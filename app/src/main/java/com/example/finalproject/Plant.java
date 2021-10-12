package com.example.finalproject;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Plant implements Parcelable {
    @SerializedName("plant")
    @Expose
    private String name;
    private String image;
    private String habit;
    private String lifespan;
    private String exposure;
    private String water;
    private String flowers;
    private String features;

    protected Plant(Parcel in) {
        name = in.readString();
        image = in.readString();
        habit = in.readString();
        lifespan = in.readString();
        exposure = in.readString();
        water = in.readString();
        flowers = in.readString();
        features = in.readString();
    }

    public static final Creator<Plant> CREATOR = new Creator<Plant>() {
        @Override
        public Plant createFromParcel(Parcel in) {
            return new Plant(in);
        }

        @Override
        public Plant[] newArray(int size) {
            return new Plant[size];
        }
    };

    public String getFeatures() {
        return features;
    }

    public void setFeatures(String features) {
        this.features = features;
    }

    private List<SpeciesName> species;

    public List<SpeciesName> getSpecies() {
        return species;
    }

    public void setSpecies(List<SpeciesName> species) {
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getHabit() {
        return habit;
    }

    public void setHabit(String habit) {
        this.habit = habit;
    }

    public String getLifespan() {
        return lifespan;
    }

    public void setLifespan(String lifespan) {
        this.lifespan = lifespan;
    }

    public String getExposure() {
        return exposure;
    }

    public void setExposure(String exposure) {
        this.exposure = exposure;
    }

    public String getWater() {
        return water;
    }

    public void setWater(String water) {
        this.water = water;
    }

    public String getFlowers() {
        return flowers;
    }

    public void setFlowers(String flowers) {
        this.flowers = flowers;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int i) {
        dest.writeString(name);
        dest.writeString(image);
        dest.writeString(water);
        dest.writeString(flowers);
        dest.writeString(exposure);
        dest.writeString(lifespan);
        dest.writeString(habit);

    }
}

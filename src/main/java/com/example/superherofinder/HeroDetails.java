package com.example.superherofinder;

import com.google.gson.annotations.SerializedName;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.ImageView;


public class HeroDetails {
    private HeroImage image;

    private HeroPowerStats powerstats;

    private HeroBiography biography;

    public HeroPowerStats getPowerStats() {
        return powerstats;
    }

    public HeroImage getImage() {
        return image;
    }

    public HeroBiography getBiography(){
        return biography;
    }
}

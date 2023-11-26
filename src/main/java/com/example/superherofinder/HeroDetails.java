package com.example.superherofinder;

import com.google.gson.annotations.SerializedName;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.ImageView;


public class HeroDetails {
    private String intelligence;
    private String strength;
    private String speed;
    private String durability;
    private String power;
    private String combat;

    private HeroImage image;

    public String getIntelligence() {
        return intelligence;
    }

    public String getStrength() {
        return strength;
    }

    public String getSpeed() {
        return speed;
    }

    public String getDurability() {
        return durability;
    }

    public String getPower() {
        return power;
    }

    public String getCombat() {
        return combat;
    }

    public HeroImage getImage() {
        return image;
    }
}

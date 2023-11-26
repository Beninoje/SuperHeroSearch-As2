package com.example.superherofinder;

public class Hero {
    private String id;
    private String name;
    private HeroPowerStats powerstats;
    private HeroImage image;

    public String getName() {
        return name;
    }

    public HeroPowerStats getPowerStats() {
        return powerstats;
    }

    public HeroImage getImage() {
        return image;
    }

    public String getId() {
        return id;
    }


    @Override
    public String toString(){
        return String.format(name);
    }
}

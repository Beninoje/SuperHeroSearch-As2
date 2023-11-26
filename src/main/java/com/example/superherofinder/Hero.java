package com.example.superherofinder;

public class Hero {
    private String id;
    private String name;
    private HeroPowerStats powerstats;
    private HeroImage image;

    private HeroBiography biography;

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

    public HeroBiography getBiography() {
        return biography;
    }

    @Override
    public String toString(){
        return String.format(name);
    }
}

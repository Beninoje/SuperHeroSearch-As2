package com.example.superherofinder;

public class Hero {
    private String name;
    private HeroPowerStats powerstats;
    private HeroImage image;

    public String getName() {
        return name;
    }

    public HeroPowerStats getPowerstats() {
        return powerstats;
    }

    public HeroImage getImage() {
        return image;
    }
    @Override
    public String toString(){
        return String.format(name);
    }
}

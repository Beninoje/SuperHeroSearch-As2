package com.example.superherofinder;

import com.google.gson.annotations.SerializedName;

public class HeroBiography {
    @SerializedName("place-of-birth")
    private String birthPlace;

    @SerializedName("full-name")
    private String fullName;

    public String getBirthPlace() {
        return birthPlace;
    }

    public String getFullName() {
        return fullName;
    }
}

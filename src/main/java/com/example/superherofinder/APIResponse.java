package com.example.superherofinder;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class APIResponse {
    private String response;

    @SerializedName("results-for")
    private String name;

    private List<Hero> results;

    public String getResponse() {
        return response;
    }

    public String getName() {
        return name;
    }

    public List<Hero> getResults() {
        return results;
    }
}

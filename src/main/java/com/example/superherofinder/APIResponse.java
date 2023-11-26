package com.example.superherofinder;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class APIResponse {
    private String response;

    @SerializedName("results-for")
    private String resultsFor;

    private List<Hero> results;

    public String getResponse() {
        return response;
    }

    public String getResultsFor() {
        return resultsFor;
    }

    public List<Hero> getResults() {
        return results;
    }
}

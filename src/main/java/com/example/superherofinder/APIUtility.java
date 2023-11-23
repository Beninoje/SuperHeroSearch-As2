package com.example.superherofinder;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.lang.reflect.Type;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

public class APIUtility {
    public static List<Hero> callAPI(String heroName) throws IOException, InterruptedException {
        heroName = heroName.replaceAll(" ", "%20");

        // This is the search String that we used in the browser
        String uri = "https://www.superheroapi.com/api.php/945222833380656/search/" + heroName;

        // Configure the environment to make an HTTP request
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest httpRequest = HttpRequest.newBuilder().uri(URI.create(uri)).build();
        HttpResponse<String> response = client.send(httpRequest, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
        Gson gson = new Gson();
//        Type heroListType = new TypeToken<List<Hero>>(){}.getType();
         APIResponse apiResponse = gson.fromJson(response.body(), APIResponse.class);
         return apiResponse.getResults();
    }

}

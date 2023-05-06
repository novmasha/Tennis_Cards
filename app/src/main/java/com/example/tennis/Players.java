package com.example.tennis;

public class Players {

    private String name;
    private String playerDescription;
    private String rating;
    private int playerResource;

    public Players(String name, String playerDescription, int playerResource, String rating) {
        this.name = name;
        this.playerDescription = playerDescription;
        this.playerResource  = playerResource;
        this.rating = rating;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlayerDescription() {
        return playerDescription;
    }

    public void setPlayerDescription(String playerDescription) {
        this.playerDescription = playerDescription;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public int getPlayerResource() {
        return playerResource;
    }

    public void setPlayerResource(int playerResource) {
        this.playerResource = playerResource;
    }
}

package com.example.shubhamgulati.confluence;

public class Prof {
    String name,bio;
    int image;

    public Prof(String name, String bio, int image) {
        this.name = name;
        this.bio = bio;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getBio() {
        return bio;
    }

    public int getImage() {
        return image;
    }
}

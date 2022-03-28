package com.company;

public class VideoCard {
    private String name;
    private String model;
    private int videoMemorySize;

    public VideoCard(String a, String c, int b){
        name = a;
        model = c;
        videoMemorySize = b;
    }

    public String getName(){
        return name;
    }

    public String getModel(){
        return name;
    }

    public int getVideoMemorySize(){
        return videoMemorySize;
    }
}

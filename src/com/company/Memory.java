package com.company;

public class Memory {
    private String type;
    private int volume;

    public Memory(String a, int b){
        type = a;
        volume = b;
    }

    public String getType(){
        return type;
    }

    public int getVolume(){
        return volume;
    }
}

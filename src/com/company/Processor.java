package com.company;

public class Processor {
    private String name;
    private int baseFrequency;

    public Processor(String a, int b){
        name = a;
        baseFrequency = b;
    }

    public String getName(){
        return name;
    }

    public int getBaseFrequency(){
        return baseFrequency;
    }
}

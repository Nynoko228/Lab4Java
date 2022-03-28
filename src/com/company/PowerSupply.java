package com.company;

public class PowerSupply {
    private String model;
    private  int power;

    public PowerSupply(String a, int b){
        model = a;
        power = b;
    }

    public String getModel(){
        return model;
    }

    public int getPower(){
        return power;
    }
}

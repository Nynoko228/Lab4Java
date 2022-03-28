package com.company;

import com.company.*;

public class Computer {
    private Processor processor;
    private VideoCard videoCard;
    private Memory memory;
    private PowerSupply powerSupply;

    public Computer(Processor a, VideoCard b, Memory c, PowerSupply d){
        processor = a;
        videoCard = b;
        memory = c;
        powerSupply = d;
    }

    public Processor getProcessor(){
        return processor;
    }

    public VideoCard getVideoCard(){
        return videoCard;
    }

    public Memory getMemory(){
        return memory;
    }

    public PowerSupply getPowerSupply(){
        return powerSupply;
    }
}

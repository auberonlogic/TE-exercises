package com.techelevator.farm;

public class Tractor implements Singable{

    private String name;
    private String sound;

    public Tractor() {
        this.name = "Tractor";
        this.sound = "Vroom";
    }



    public String getName() {
        return name;
    }

    public String getSound() {
        return sound;
    }
}

package com.techelevator.farm;

public class Cat extends FarmAnimal {

    private boolean sleeping = true; // Eager instantiation. happens first.

    public Cat() {
        super("Cat", "meow!");
        // this.sleeping = false; // default value at creation of object. this happens second.
    }

    @Override
    public void eat() {
        System.out.println("idk, whatever cats eat. birds maybe? MICE!");
    }

//    @Override
//    public String getSound() {
//        if (sleeping) {
//            return "Zzz...";
//        } else {
//            return getSound();
//        }
//    }


}

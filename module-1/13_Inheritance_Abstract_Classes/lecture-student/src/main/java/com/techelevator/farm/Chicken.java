package com.techelevator.farm;

public class Chicken extends FarmAnimal {

	public Chicken() {
		super("Chicken", "cluck!");
	}

	@Override
	public void eat() {
		System.out.println("Chicken Feed!");
	}

	public void layEgg() {
		System.out.println("Chicken laid an egg!");
	}

}
package com.techelevator.farm;

public class FarmAnimal implements Singable{
	private String name;
	private String sound;

	public FarmAnimal(String name, String sound) {
		this.name = name;
		this.sound = sound;
	}

//	public FarmAnimal() {} // will keep you from having to create an explicit constructor in subclasses

	public void eat() {

	}

	public String getName() {
		return name;
	}

	public String getSound() {
		return sound;
	}

}
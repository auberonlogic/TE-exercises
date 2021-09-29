package com.techelevator.farm;

public abstract class FarmAnimal implements Singable {
	private String name;
	private String sound;
	protected int x;

	public FarmAnimal(String name, String sound) {
		this.name = name;
		this.sound = sound;
	}

	public abstract void eat();

	public final String getName( ) {
		return name;
	}

	public final String getSound( ) {
		return sound;
	}

	protected String family() {
		return "I am a farm animal!";
	}

}
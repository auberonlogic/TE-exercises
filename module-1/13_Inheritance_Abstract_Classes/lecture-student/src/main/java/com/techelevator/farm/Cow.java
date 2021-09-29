package com.techelevator.farm;

import java.math.BigDecimal;

public abstract class Cow extends FarmAnimal implements Sellable {
	private BigDecimal price;

	public Cow() {
		super("Cow", "moo!");
		price = new BigDecimal("1500.00");
	}

	@Override
	public void eat() {
		System.out.println("Grass");
		x = 15;
	}

	public BigDecimal getPrice() {
		return price;
	}
}

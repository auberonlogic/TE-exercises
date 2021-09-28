package com.techelevator.farm;

import java.util.*;

public class OldMacdonald {
	public static void main(String[] args) {

		Map<String, String> zipToCity = new HashMap<String, String>();
		zipToCity = new LinkedHashMap<>();
		zipToCity = new TreeMap<>();

		zipToCity.size();

		List<String> names = new ArrayList<>();
		names = new LinkedList<>();

		names.size();



		// Object context
		// the methods available to you from the class of object you are will vary
		// depending on which context you're in.
		// As a String, you get String methods.
		// As an Object, you get Object methods, but not String methods.

//		Object lang2 = "CSharp";
//		lang2.equals();
//		lang2.toString();

		String lang = "JavaScript";
		lang.substring(0,4);
		lang.toUpperCase();
		lang.toLowerCase();
		lang.length();

//		FarmAnimal[] farmAnimals = new FarmAnimal[] { new Cow(), new Chicken(), new Tractor()};
		Singable[] farmAnimals = new Singable[] { new Cow(), new Chicken(), new Tractor()};

		for (Singable singable : farmAnimals) {
			String name = singable.getName();
			String sound = singable.getSound();
			System.out.println("Old MacDonald had a farm, ee, ay, ee, ay, oh!");
			System.out.println("And on his farm he had a " + name + ", ee, ay, ee, ay, oh!");
			System.out.println("With a " + sound + " " + sound + " here");
			System.out.println("And a " + sound + " " + sound + " there");
			System.out.println("Here a " + sound + " there a " + sound + " everywhere a " + sound + " " + sound);
			System.out.println();
		}
	}
}
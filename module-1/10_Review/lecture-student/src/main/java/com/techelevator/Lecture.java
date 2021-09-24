package com.techelevator;

import java.util.HashSet;
import java.util.Set;

public class Lecture {

	public static void main(String[] args) {

		// Sets are Collections
		// no duplicates allowed
		// no order preserved
		// no index
		Set<Integer> uniqueNumbers = new HashSet<>();

		Set<String> names = new HashSet<>();

		uniqueNumbers.add(1);
		uniqueNumbers.add(10);
		uniqueNumbers.add(10);
		uniqueNumbers.add(100);

		names.add("Walt");
		names.add("Tom");
		names.add("Tom");

		// {1, 10, 100}
		// {"Walt", "Tom"}

		// Benefits
		// Searching Sets is fast. Lists are slow.

		// {"Walt", "Tom", "Tom", "Nick", "Howie", "Zach"}

		// {"Walt", "Tom", "Nick", "Howie", "Zach"}


		// static variables

		Person walt = new Person ("Walt", "Impellicceiri");
		Person tom = new Person("Tom", "Medvitz");

		walt.print();
		tom.print();

		printHelloWorld();

	}

	public static void printHelloWorld() {
		System.out.println("Hello World");
	}

}

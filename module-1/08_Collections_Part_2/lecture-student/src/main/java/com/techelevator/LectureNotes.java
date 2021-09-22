package com.techelevator;

import java.util.*;

public class LectureNotes {

	public static void main(String[] args) {

		System.out.println("####################");
		System.out.println("        SETS");
		System.out.println("####################");
		System.out.println();

		// SET: unordered list -> NO DUPLICATES ALLOWED
		Set<String> instructors = new HashSet<String>();

		// size: 0
		instructors.add("Tom");
		// size: 1

		instructors.add("Tom");
		// size: 1

		instructors.add("Walt");
		// size: 2

		for (String instructor : instructors) {
			System.out.println(instructor + " works at TE PGH");
		}

		Map<String, String> example = new HashMap<>();
		example.put("Boot Camp", "Tech Elevator");
		String value = example.get("bootcamp"); // case sensitive. will return null if String doesn't match
		System.out.println(example);
		System.out.println(value);

		System.exit(0);

		instructors.remove("Tom");
		// size: 1

		instructors.contains("Tom"); // false



		System.out.println("####################");
		System.out.println("        MAPS");
		System.out.println("####################");
		System.out.println();

		// Create a new / empty map
		//  key      value
		Map<Integer, String> zipToCity = new HashMap<Integer, String>(); // can also = new HashMap(); or = new HashMap<>(); after Java 11
		// start with the most generic map (Map) so you can move to more
		// specific maps (HashMap, Treemap

		// keeps the keys sorted
		Map<Integer, String> treeMap = new TreeMap<Integer, String>();

		// retains order of insertion
		Map<Integer, String> linkedHashMap = new LinkedHashMap<>();


		// stores key/value pairs in fastest way possible (Java hashing)
		zipToCity.put(15222, "Downtown");
		zipToCity.put(15203, "Southside");
		zipToCity.put(15201, "Hipsters");
		zipToCity.put(15233, "Northside");

		System.out.println(zipToCity.size());

		// get takes in a key and returns a value
		String area = zipToCity.get(15222);
		System.out.println(area);

		// retrieve all
		// iterate through all of the keys
		// can change values in a for each loop, but can't modify keys

		// keys can't be duplicates. they are stored in a set. hence, .keySet()
		for (Integer zip : zipToCity.keySet()) {

//			zipToCity.put(zip, "Beverly Hills");



			// use the KEY to get the VALUE
			String neighborhood = zipToCity.get(zip);

			// print the KEY and its corresponding VALUE
			System.out.println(zip + " is the zip code for " + neighborhood);
		}

		// .put() can create data that did not exist before (as above)
		// can also update existing data. Assign a new value to key
		System.out.println("\n\nUPDATED");
		zipToCity.put(15201, "Lawrenceville");
		for (Integer zip : zipToCity.keySet()) {
			System.out.println(zip + " is the zip code for " + zipToCity.get(zip));
		}

		// remove key and value pair
		System.out.println("Size: " + zipToCity.size());
		zipToCity.put(15222, null);
		System.out.println("Size: " + zipToCity.size());
		zipToCity.remove(15222);
		System.out.println("Size: " + zipToCity.size());

		System.out.println("============================");
		System.out.println("============================");



		// if you try to get a key that doesn't exist in the map, you'll get back null
//		String example = zipToCity.get(90210);
//		if (example == null) {
//			System.out.println("Beverly Hills does not exist!");
//		}
//		System.out.println(example);

		if (zipToCity.containsKey(90210)) {
			System.out.println(zipToCity.get(90210) + " rolling like a celebrity");
		} else {
			System.out.println("Beverly Hills does not exist!");
		}




		System.out.println("####################");
		System.out.println("        QUEUE");
		System.out.println("####################");
		System.out.println();

		Queue<String> todos = new LinkedList<String>();
		todos.offer("Wash the dishes");
		todos.offer("Sweep the leg");
		todos.offer("Sweep the floor");
		todos.offer("Wake up");
		todos.offer("Grab a brush");

		System.out.println("Current size: " + todos.size());
		System.out.println(todos);


		String nextTodo = "";
		// todos.peek(); will just look at the element
		System.out.println(nextTodo);
		System.out.println("Current size: " + todos.size());
		System.out.println(todos);

		while(todos.size() > 0) {
			System.out.println("Current size: " + todos.size());
			nextTodo = todos.poll();
			System.out.println("Completed: " + nextTodo);
			System.out.println("Current size: " + todos.size());

		}



		System.out.println("####################");
		System.out.println("        STACK");
		System.out.println("####################");
		System.out.println();

		Stack<String> browserHistory = new Stack<String>();
		browserHistory.push("www.techelevator.com");
		browserHistory.push("www.techelevator.com/pittsburgh");
		browserHistory.push("www.google.com");
		browserHistory.push("www.reddit.com");

		String previousPage = "";

		while(browserHistory.size() > 0) {
			System.out.println("Number of pages visited: " + browserHistory.size());
			previousPage = browserHistory.pop();
			System.out.println(previousPage);
		}

	}

}

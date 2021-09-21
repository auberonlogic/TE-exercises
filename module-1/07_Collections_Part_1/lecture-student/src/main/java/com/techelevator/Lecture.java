package com.techelevator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lecture {

	public static void main(String[] args) {
		System.out.println("####################");
		System.out.println("       LISTS");
		System.out.println("####################");

		// Array
		String[] insts = new String[3];
		insts[0] = "Tom";
		insts[1] = "Tom";
		insts[2] = "Walt"; // if we want to add element "Beth", we need a whole new array

		// List
		List<String> instructors = new ArrayList<String>();

		// cannot make lists of primitive data types
		// Wrapper classes

		int v = 5; // on stack, no heap, no reference

		Integer x = new Integer(5); // puts a 5 on the heap and a reference to it on the stack

		// Boxing: int -> Integer		stack to heap
		// Unboxing: Integer -> int		heap to stack
		// Autoboxing / Autounboxing
		Integer.toString(x);

		List<Integer> fibList = new ArrayList<Integer>();

		int limit = 17;

		int lagA = 0;
		int lagB = 1;
		for (int current = lagA + lagB; current < limit; current = lagA + lagB) {
			fibList.add(current);
			lagA = lagB;
			lagB = current;
		}

		// CAN ONLY HAVE COLLECTIONS OF OBJECTS


		instructors.add("Tom");
		instructors.add("Tom");
		instructors.add("Walt");
		instructors.add("Beth"); // with a list we can just add elements without creating a new list
		System.out.println(instructors);	// cannot print an array like this (would need for loop).
											// can print lists though

		System.out.println();
		System.out.println("####################");
		System.out.println("Lists are ordered");
		System.out.println("####################");

		// Array
		System.out.print("Array for loop output: ");
		for (int i = 0; i < insts.length; i++) {
			System.out.print(insts[i] + " ");
		}
		System.out.println();

		// List
		System.out.print("List for loop output: ");
		for (int i = 0; i < instructors.size(); i++) {
			System.out.print(instructors.get(i) + " "); // can't index into i instructors[i]. instead use method .get(i)
		}



		System.out.println();
		System.out.println();
		System.out.println("####################");
		System.out.println("Lists allow duplicates");
		System.out.println("####################");

		System.out.println();
		System.out.println("####################");
		System.out.println("Lists allow elements to be inserted in the middle");
		System.out.println("####################");

		// 0   1   2    3
		// Tom Tom Walt Beth
		// we want to add Andrew
		instructors.add(1, "Andrew");
		System.out.println("List for loop output: ");
		for (int i = 0; i < instructors.size(); i++) {
			System.out.print("Index " + i + ": ");
			System.out.println(instructors.get(i) + " "); // can't index into i instructors[i]. instead use method .get(i)
		}
		System.out.println();


		System.out.println();
		System.out.println("####################");
		System.out.println("Lists allow elements to be removed by index");
		System.out.println("####################");

//		instructors.remove("Beth");
		instructors.remove(2);
		for (int i = 0; i < instructors.size(); i++) {
			System.out.print("Index " + i + ": ");
			System.out.println(instructors.get(i));
		}

		System.out.println();
		System.out.println("####################");
		System.out.println("Find out if something is already in the List");
		System.out.println("####################");

//		// Array
//		boolean foundBeth = false;
//		for (int i = 0; i < insts.length; i++) {
//			if (insts[i].equals("Beth")) {
//				foundBeth = true;
//				break;
//			}
//		}
//		if (foundBeth) {
//			System.out.println("She's here!");
//		} else {
//			System.out.println("She's gone!");
//		}

		// List
		boolean foundBeth2 = instructors.contains("Beth");
		if (foundBeth2) {
			System.out.println("She's here!");
		} else {
			System.out.println("She's gone!");
		}
		System.out.println(foundBeth2);


		System.out.println();
		System.out.println("####################");
		System.out.println("Find index of item in List");
		System.out.println("####################");

		String lang = "JavaScript";
		lang.indexOf("SCRIPT"); // returns -1 (which can never be an index)

		int andyIndex = instructors.indexOf("Andrew"); // takes in elements, searches list for first occurrence, return leading index position
		System.out.println(andyIndex);


		System.out.println();
		System.out.println("####################");
		System.out.println("Lists can be turned into an array");
		System.out.println("####################");

		String[] instructorsAsArray = instructors.toArray(new String[0]); // when converting list to array, need to tell it what datatype as parameter
		instructorsAsArray[2] = "Jennifer";



		System.out.println();
		System.out.println("####################");
		System.out.println("Lists can be sorted");
		System.out.println("####################");

		Collections.sort(instructors);
		for (int i = 0; i < instructors.size(); i++) {
			System.out.print("Index " + i + ": ");
			System.out.println(instructors.get(i));
		}


		System.out.println();
		System.out.println("####################");
		System.out.println("Lists can be reversed too");
		System.out.println("####################");

		Collections.reverse(instructors);
		for (int i = 0; i < instructors.size(); i++) {
			System.out.print("Index " + i + ": ");
			System.out.println(instructors.get(i));
		}


		System.out.println();
		System.out.println("####################");
		System.out.println("       FOREACH");
		System.out.println("####################");
		System.out.println();

		// for each loops do not concern themselves with indexes
		// "for each instructor in instructors, do this
		// it's common to name Collections as plurals, and when running for eaches naming the elements singulars
		for (String instructor : instructors) { // for (iterator variable : Collection)
			System.out.println(instructor);
		}
	}
}

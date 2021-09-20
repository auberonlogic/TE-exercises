package com.techelevator;

import java.util.Scanner;

public class Lecture {

	public static void main(String[] args) {

		System.out.println("************************************");
		System.out.println("****** MAKING A STRING OBJECT ******");
		System.out.println("************************************");

		/* The String class gets special treatment in the Java language.  One
		 * example of this is that there is a literal representation of a
		 * String (i.e. characters appearing between two double quotes.  This
		 * is not the case for most classes */

		/* create an new instance of String using a literal */

		String name = "Ryan";
		// String name = new String("Ryan"); is the same as the shortcut above.

		
		System.out.println();
		System.out.println("******************************");
		System.out.println("****** MEMBER METHODS ******");
		System.out.println("******************************");
		System.out.println();

		String obligatory = "Hello World. You're World awesome World and I love you";
		char d = obligatory.charAt(10);	// passes index value referenced to the char h
										// primitive data type. can use ==
		String hString = obligatory.substring(10, 11);

		char[] charArray = obligatory.toCharArray();

		boolean haveValidInput = false;

		Scanner kb = new Scanner(System.in);

		// while loop will run until condition returns true
/*		while(!haveValidInput) {
			System.out.println("Enter (C)elsius or (F)ahrenheit >>> ");
			String userChoice = kb.nextLine();
			if (userChoice.startsWith("C")) {
				haveValidInput = true;
			}
			break;
		}*/

		while(true) {
			System.out.println("Enter (C)elsius or (F)ahrenheit >>> ");
			String userChoice = kb.nextLine();
			if (userChoice.toLowerCase().trim().startsWith("c")) { // converts input to lower case, trim cuts off white space, starts with returns a boolean
				haveValidInput = true;
				break;
			} else {
				System.out.println("Try Again!");
				System.out.println(userChoice + " is not valid input.");
			}
		}

		boolean flag = true;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++)
				if (j == i) {
					flag = false;
					break;
				}
		}




/*		if (userChoice.charAt(0) == 'C' || userChoice.charAt(0) == 'c') {

		}*/

		// IMMUTABILITY
		obligatory = obligatory.toLowerCase();
		obligatory.startsWith("hello"); // this will be true because obligatory has been made lower case

		obligatory.indexOf("World");

		// "Hello World, You're World awesome World and I love you"
		int firstWorld = obligatory.indexOf("World"); // 6
		obligatory = obligatory.substring(firstWorld + 1);
		// "orld, You're World awesome World and I love you."
		int secondWorld = obligatory.indexOf("World"); //13
		int lastWorld = obligatory.lastIndexOf("world");

		// trim
		String garbage = "                 Hello there Ryan this a long       sentence              ";
		String slightlyLessGarbage = garbage.trim();
		// output >>> "Hello there Ryan this a long       sentence"

		/* Other commonly used methods:
		 *
		 * endsWith		returns a boolean
		 * startsWith	returns a boolean
		 * indexOf		looks for a match in the String and returns the index position where the match begins
		 * lastIndexOf	same as above from other end
		 * length
		 * substring
		 * toLowerCase
		 * toUpperCase
		 * trim
		 */

		System.out.println();
		System.out.println("**********************");
		System.out.println("****** EQUALITY ******");
		System.out.println("**********************");
		System.out.println();



		/* Double equals will compare to see if the two variables, hello1 and
		 * hello2 point to the same object in memory. Are they the same object? */

		String hello1 = new String("Hello"); // 0xFACE
		String hello2 = new String("Hello");	// 0xFADE

		if (hello1 == hello2) {
			System.out.println("They are equal!");
		} else {
			System.out.println(hello1 + " is not equal to " + hello2);
		}

		String hello3 = hello1; // 0xFACE
		if (hello1 == hello3) {
			System.out.println("hello1 is the same reference as hello3");
		}

		/* So, to compare the values of two objects, we need to use the equals method.
		 * Every object type has an equals method */
		if (hello1.equals(hello2)) {
			System.out.println("They are equal!");
		} else {
			System.out.println(hello1 + " is not equal to " + hello2);
		}

		String language = "JavaScript";
		for (int i = 0; i < language.length(); i++) {
			String thisLetter = language.substring(i, i+1);

			System.out.println(thisLetter);
		}

		String example; // example is null
		// example.length(); // Null Pointer Exception (technically called Null Reference Exception.
							 // Never say "Pointer"

		String example2 = "";
		example2.length(); // 0



	}
}

package com.techelevator;

import java.util.HashSet;
import java.util.Set;

public class Lecture {

    public static void main(String[] args) {

        Set<Integer> uniqueNumbers = new HashSet<>();

        Set<String> names = new HashSet<>();

        uniqueNumbers.add(1);
        uniqueNumbers.add(10);
        uniqueNumbers.add(10);
        uniqueNumbers.add(100);

        names.add("Walt");
        names.add("Tom");
        names.add("Tom");

        // { 1, 10, 100 }
        // { "Walt", "Tom" }

        // { "public", "import", "class", "void" }

        // [ "Walt", "Tom", "Tom", "Nick", "Howie", "Zack" ]


        // Keyword static
        Person walt = new Person("Walt", "A");
        Person tom = new Person("Tom", "A");

        walt.print();
        tom.print();

        // I don't need to create an instance of the Math class because all the methods and variables in math are static
        // Math does not change.
        Math.abs(10);

        // With Person, I don't have any public static variables or methods.
        // The only static variable I have is private, so I can't see it from here.
        // Could make it public, then Person.-> will pull up the static variable.
        int howManyPersons = Person.howManyPersons;



    }

}

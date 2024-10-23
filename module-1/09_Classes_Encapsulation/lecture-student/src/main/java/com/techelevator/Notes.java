package com.techelevator;

import java.util.Scanner;

class Notes {

    // CLASSES

    // What is a class?
    // Let's talk about Objects first
    // pretty much everything in java is an object
    // they live in the heap
    // objects have data (what an object IS)...
    // ... and behaviors (what an object DOES)

    // We don't write Objects
    // We write classes

    // When we run our program, it's a whole bunch of classes being loaded into the JVM
    // the JVM starts following the instructions we put into our classes

    // when we write 'String lang = new String("Java");
    // the JVM knows it's going to need the String class
    // JVM loads in the String class, and when the JVM executes the code to instantiate the String, the JVM reads the instruction in the String class to know how to do that.
    // The JVM creates an object from a class

    // We write classes from which we build objects

    // Classes are the blueprint
    // Objects are the house

    // Why do we need objects?
    // there are procedural languages, functional languages...
    // The way java works is creating a bunch of objects, then using them together to solve a problem

    // When creating a class, think just about that class. Do not think about the greater problem I am trying to solve. Think about the responsibility of that class.

    // Single Responsibility Principle
    // every class does one thing and only one thing
    // if you have an overcomplicated class, it will come back to haunt you
    // there is no limit on the number of classes you can create

    // Tom's advice...
    // Think of coding as split into two parts...
    // the builder and the user
    // the user runs executable classes
    // even the coder using existing classes falls more on the user side

    // on the builder side, one builds classes that are meant to be used by a user

    // on the user side, you are using classes that have been built in order to solve problems

    // Tom's distinction between user and builder refers to the user and builder of the tools of the language or program

    // A user uses existing classes in writing their executable class

    // A builder builds the classes that are used in executables

    // Java comes with approx 4000 classes that we can use to build apps as users

    // these classes are not executable, they are classes waiting to be instantiated into objects

    // When you create a class, you need to specify that the class is part of a larger group.
    // in java this is called a package
    // in some other languages this is called a namespace
    // whatever the term, it means a grouping

    // standard in java is...
    // 'package com.techelevator'
    // 'package com.nike'

    // in java there is a package called java.lang
    // java.lang is a grouping of all the classes that are built into java. You get them automatically at every JVM execution. You need some amount of code to even get started, for java to be a language

    // for example, String
    // String belongs to the java.lang package.
    // java.lang.String is the fully qualified name of String in Java.

    // If I wanted to create another class called String, it would need to be under a different package.

    // There is another package that java makes for us and is available to us called java.util (short for utilities)

    // java.util has a bunch of stuff in it, but it doesn't come automatically with every JVM execution.
    // java.util.Scanner
    // java.util.ArrayList;
    // java.util.HashMap;
    // java.util.Map; (this is an interface. We'll get to interfaces later, but know that interfaces also exist in packages.

    public static void main(String[] args) {

        // String does not need to be imported
        String word = "word";

        // but if we want to use anything in the java.util class, we need to import the package, or, more specifically, the classes from the package.
        Scanner scanner = new Scanner(System.in);

        // there are more packages than just java.lang and java.util
        // there is also java.io, and more

        // you can have two packages with the same name so long as they are in different packages

        // when we create a class we use the following syntax

        /**
         *  // PACKAGE DECLARATION GOES HERE
         *  package com.techelevator
         *
         *  // IMPORTS GO HERE
         *  import java.util.Scanner;
         *
         *  public class ClassName {
         *
         *      // CLASS CODE GOES HERE
         *
         *      // DATA
         *
         *      // BEHAVIORS
         *
         *  }
         *
         */



    }


    // there are total 3, maybe 4 fundamental principles of oop.
    // 1. encapsulation
    // 2. inheritance
    // 3. polymorphism
    // 4? abstraction



    // ENCAPSULATION
    // one of the fundamental principles of object oriented programming.
    // we don't want data from one class spilling into another
    // neither do we want data in a class to be changed by just anybody

    // encapsulation bundles data together
    // abstraction is the concept of hiding implementation
        // hiding doesn't mean secret
        // it means preventing people from having to care
        // Scanner class for instance.
        // we don't need to know or care how Scanner works, so long as we can use it.

    // example of abstraction:
        // a car
        // I don't know how a car works per se. I know it has an engine and fuel pump and steering system and brakes, but I don't need to know how any of those components or systems work in order to effectively use them.


}

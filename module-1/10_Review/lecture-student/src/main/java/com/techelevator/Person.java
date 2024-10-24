package com.techelevator;

public class Person {

    // not static means belonging to the INSTANCE of the class
    // each instance has its own instance of these data members
    private String firstName;
    private String lastName;

    // static means belonging to the class
    // so there is only one copy of this variable across all instances
    // this is a global variables among this classes objects
    public static int howManyPersons = 0;

    public Person(String firstName, String lastName) {

        // fully qualified name of howManyPersons is Person.howManyPersons. It belongs to the CLASS.
        Person.howManyPersons++;

        // fully qualified name of firstName is this.firstName. It associates the variable with the instance.
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void print() {
        System.out.println(firstName + " " + lastName + " How many " + howManyPersons);
    }
}

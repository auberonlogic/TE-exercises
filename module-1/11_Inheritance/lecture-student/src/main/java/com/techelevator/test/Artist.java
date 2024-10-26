package com.techelevator.test;

import com.techelevator.Person;

public class Artist extends Person {

    private String medium;

    public Artist(String firstName, String lastName, int age, String medium) {
        super(firstName, lastName, age);
        this.medium = medium;

        // with String firstName set to protected in Person, can also access that field from classes in sub packages of package where Person lives.
//        this.firstName = firstName;
    }

}

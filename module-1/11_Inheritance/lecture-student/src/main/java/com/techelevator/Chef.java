package com.techelevator;

public class Chef extends Person { // extends Person is syntax for letting Java know you want to inherit from a class

    private int yearsExperience;
    private String specialty;

    public Chef (String firstName, String lastName, int age, int yearsExperience, String specialty) {
        // super keyword calls from parent. must come first in constructor
        super(firstName, lastName, age);
        this.yearsExperience = yearsExperience;
        this.specialty = specialty;
    }

    // overriding
    @Override
    public String getFirstName() {
        String firstName = super.getFirstName(); // super. calls method from immediate parent class
        return "Chef " + firstName;
    }

}

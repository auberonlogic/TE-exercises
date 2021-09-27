package com.techelevator;

import java.util.Objects;

public class Person {

    // all classes automatically inherit from Object class

    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person() {
        this.firstName = "Ryan";
        this.lastName = "Theerman";
        this.age = 33;
    }

    public String getFirstName() {
        return firstName;
    }

    // overriding method from Object
/*
    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        o.getClass();
        Person p = (Person) o;
        return this.firstName.equals(p.firstName) && this.lastName.equals(p.lastName) && this.age == p.age;
    }
*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age);
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " " + age;

    }
}

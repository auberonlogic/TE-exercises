package com.techelevator;

import java.util.Objects;

// If I make a class final, that's telling java that NO ONE is allowed to inherit from it.
public class Person {

    // protected allows you to access
    String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person() {
        this.firstName = "";
        this.lastName = "";
        this.age = 10;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }


    // REDEFINING EQUALS
//    @Override
//    public boolean equals(Object o) {
//        Person p = (Person) o;
//
//        return this.firstName.equals(p.firstName) && this.lastName.equals(p.lastName) && this.age == p.age;
//    }


    @Override
    public boolean equals(Object o) {
        // if this and the object share the same location on the stack, return true
        if (this == o) return true;

        // is this comparison possible? is o null, or of a different type? If so, return false.
        if (o == null || getClass() != o.getClass()) return false;

        // cast o as Person
        Person person = (Person) o;

        // return true if specified elements of both objects are the same
        return age == person.age && Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName);
    }

    // hashing is more or less compressing the object down into an integer of sorts, which can be used to identify the item (and store it in a hashmap, say).
    // hashing improves searchability (search time)
    // if we want the same object to appear in the same location of a hashset or hashmap, or we want to look up a subsequent object that we would consider equal in the hashset or hashmap, we want those hashes to be equal so that we can rely on the hash as identifying an object we regard as equal.
    // if we don't override hashing but we do override equals, while .equals might return true, putting them in a hashmap might put them in two separate locations in a hashmap or hashset.
    // So looking through a hashmap or hashset to see if we already have the object might return false because the hashes may not match.
    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age);
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " " + age;
    }
}

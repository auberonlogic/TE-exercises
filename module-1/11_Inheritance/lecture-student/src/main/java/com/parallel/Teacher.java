package com.parallel;

import com.techelevator.Person;

public class Teacher extends Person {

    private String subject;
    private int classSize;

    public Teacher(String firstName, String lastName, int age, String subject, int classSize) {
        super();
        this.subject = subject;
        this.classSize = classSize;

        // with String firstName access set to protected, can even still access it in packages at the same level in the directory tree as the package containing Person.
//        this.firstName = firstName;
    }
}

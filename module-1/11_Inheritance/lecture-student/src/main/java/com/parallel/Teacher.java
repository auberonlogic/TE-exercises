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
        // this was wrong.
        // protected does not allow access to variables no matter which package they are in.
        // protected allows access to members either in the same package OR within a subclass of the super in which the protected member is declared.
        // I was thinking protected allowed access across the project no matter where in the package hierarchy you are.
        // That's not the case. I was misinterpreting. All the classes I created to test the scope of a protected data member of person where subclasses of person, meaning they have access to the protected member.
        // but if they are not subclasses of Person, they do not inherit in other packages.
        // and if the given data member in Person is default, not protected, subclasses do not inherit.
        // the default modifier grants access within the class and same package, not beyond.
//        this.firstName = firstName;
    }
}

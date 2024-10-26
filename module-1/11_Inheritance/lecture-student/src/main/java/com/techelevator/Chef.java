package com.techelevator;

public class Chef extends Person {

    // anytime you inherit from a class, you must call the superclass instructor.
    // we don't want to hide the way Person is initialized when we create a chef. We want to use it. We must be explicit in this.
    // we need to include the stuff that makes a chef a chef (it's own data members and methods), but also we need to include the stuff that makes a chef a person.

    // Chef native data members
    private int yearsExperience;
    private String specialty;

    // Chef constructor
    public Chef(String firstName, String lastName, int age, int yearsExperience, String specialty) {
        // super() calls the parents constructor
        // Person constructor has params (String firstName, String lastName, int age)
        // Where will those come from?
        // can plug in the values directly in the call to superclass constructor
        // but if the values might differ, we need to ask for them in the subclass constructor and pass them into the superclass constructor
//        super("oberon", "fae", 3000);
        // java requires call to super to come before assignment of incoming values to instance variables.

        // what if there are multiple constructors?
        super(firstName, lastName, age);

        // can use whichever. You simply need to pass in the variables expected by the constructor params in its signature.
//        super();

        // with an empty constructor in the superclass, if I don't mention super() in the constructor of the subclass, the subclass constructor will still work. The call to super() will be called automatically.

        this.yearsExperience = yearsExperience;
        this.specialty = specialty;

        // can now access getFirstName() from the inheriting class and any objects instantiated from the inheriting class
        this.getFirstName();
        super.getFirstName();
        getFirstName();

        // in Person, with the access modifier for String firstName set to protected, I can access the field from any class that resides in the same package.
//        this.firstName = firstName;


    }

    // OVERRIDING
    // to override an inherited method, create a method with the exact same name in the subclass
    // If we create a class that inherits from chef, it will inherit the methods from one class above the subclass.
    // basically, if looking for an inherited method in chained inheritance, java will go up one class at a time until it finds the method.
    // marking a method as final means it cannot be overridden
    @Override
    public final String getFirstName() {
        return "Chef " + super.getFirstName();
    }

}

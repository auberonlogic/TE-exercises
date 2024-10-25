public class Notes {

    // INHERITANCE

    // one of the pillars of object oriented programming

    // allows us to INHERIT functionality from some other class.

    // In Java, everything inherits from some a single object

    // In package java.lang, there is a root object called Object

    // every class no matter if you create it yourself or its provided to you, they all eventually inherit from Object.
    // that's important, because object has some functionality built in that we get for free, no matter which object we're working with.
    // we also have the option of overriding what we inherit, changing it a little bit.

    // inheritance can be done in a few different ways when designing a programming language.
    // 2 major differences
        // single inheritance -> inherit from one class
        // multiple inheritance -> inherit from multiple classes

    // can chain inheritance, so Employee can inherit from Person, and Person can inherit from Organism, meaning Employee is inheriting from Organism because Person has already inherited those from it.

    // Inheritance
        // enables a class to take on the properties and methods defined in another class
        // saves us from code duplication. We don't need to write the same methods over and over to get the same functionality across classes
        // SUBCLASS (child class) will inherit the properties and methods from the superclass, while adding members of its own.
        // subclass defined methods are scoped to subclass and below. Parent cannot see/access them.
        // SUPERCLASS (parent class) is the base class whose data and behaviors are being passed down.

    /*
        Person (superclass) { String firstName, String lastName, int age }
           |
           |---Chef (subclass) { String specialty, int yearsOfExperience }
           |
           |---Teacher (subclass) { String subject, int studentCount }
           |
           |---Musician (subclass) { String instrument, boolean isInBand }

        Person defines 2 Strings and an int. All subclasses inherit these properties
        Chef, Teacher, and Musician each have their own distinct data members which the Person superclass does not share (inheritance is passed down, not up)
        Because of inheritance, we do not need to define String firstName, String lastName, and int age for each subclass. We do it once, and all classes that inherit from the super have access to those superclass members.

        We also inherit behaviors (methods)

        Say Person has a method called sleep();
        Chef, Teacher, and Musician all can sleep().

        We can also override behavior.

        Say Person provides sleeping, and sleeping by default means the Person sleeps for 8 hours.
        Chef can override the behavior of the superclass and define sleep() to suit its own needs.
        Maybe Chef only sleeps 4 hours per night... we can define that behavior to override the superclass behavior.
        When we call chef.sleep(), java will execute Chef's version of sleep(), rather than Person's version of sleep.
        Say we create a Teacher object, but do not override sleep(). Calling teacher.sleep() will use Person's version of sleep.

        EVERYTHING inherits from object
        So in the above scenario, person is inheriting from Object.
        When we define inheritance, we need to specify that in the subclass (with the syntax 'extends <superclass> in the class definition)
        But we don't ever need to specify that we inherit from Object. That is a given.





     */


}

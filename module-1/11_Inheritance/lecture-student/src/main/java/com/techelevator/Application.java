package com.techelevator;

public class Application {

    public static void main(String[] args) {

        // Create a new general auction
        System.out.println("Starting a general auction");
        System.out.println("-----------------");

        Auction generalAuction = new Auction("Tech Elevator t-shirt");

        generalAuction.placeBid(new Bid("Josh", 1));
        generalAuction.placeBid(new Bid("Fonz", 23));
        generalAuction.placeBid(new Bid("Rick Astley", 13));
        //....
        //....
        // This might go on until the auction runs out of time or hits a max # of bids


        Chef boyardee = new Chef("Bob", "Boyardee", 150, 1000, "Spaghetti Os");

        // can't access properties inherited from superclass, because there are not yet any getters (or setters)
        // after adding a public String getFirstName() {return firstName;} method to Person, I can access it via Chef when calling it on the instantiated object.
        System.out.println(boyardee.getFirstName());


        BuyoutAuction buyoutAuction = new BuyoutAuction("Tech Elevator Backpack", 35);
        buyoutAuction.placeBid(new Bid("Josh", 20));
        buyoutAuction.placeBid(new Bid("Fonz", 25));
        buyoutAuction.placeBid(new Bid("Rick Astley", 50));


        ReserveAuction reserveAuction = new ReserveAuction("Laptop", 1250);
        reserveAuction.placeBid(new Bid("Josh", 400));
        reserveAuction.placeBid(new Bid("Fonz", 2000));




        /*
            ALL objects inherit from Object
            Every class eventually inherits from Object
                - String
                - Person
                - BuyoutAuction inherits from Auction, which inherits from Object

            Object has some built in functionality that we get for free
            Objects can...
                - be turned into a String
                - can be checked for equality against another object
                - can be turned into an integer hashcode

            These functionalities don't always work the way we want them to.


         */

        Person testerson1 = new Person("Test", "Testerson", 40);
        Person testerson2 = new Person("Test", "Testerson", 40);
        Person testerson3 = testerson1;

        if (testerson1.equals(testerson2)) {
            System.out.println("Testerson 1 and 2 are equal!");
        }

        // default behavior for .equals is to check if the objects share the same location, the same reference.
        // reference type data is stored in the heap. the references themselves are stored as memory location on the stack
        if (testerson1.equals(testerson3)) {
            System.out.println("Testerson 1 and 3 are equal!");
        }

        if (testerson2.equals(testerson3)) {
            System.out.println("Testerson 2 and 3 are equal!");
        }

        /*
                Stack       Heap
            t1  0xe5   -->  { "Test", "Testerson", 40 }
            t2  0xf6   -->  { "Test", "Testerson", 40 }
            t3  0xe5

            checking if t1 is equal to t3 returns true because the memory addresses of the object on the stack is the same

            t1 and t2 are not equal because their memory addresses are not equal

            What if we want them to return true when checking if they are equal?
            We can use inheritance...
            We can override the default behavior of equals inherited from Object

            We can specify what equality means. see the Person class...
         */


        // Printing out objects
        Person bobby = new Person("Bobby", "Tables", 14);

        // as is, just printing out what the variable bobby stores will print out the class and the stack reference to the memory location in the heap where the object's data is stored.
        System.out.println(bobby);

        // we could use Person's getters to get the data we want and print it
        System.out.println(bobby.getFirstName() + " " + bobby.getLastName() + " " + bobby.getAge());

        // but that's more effort every time we want to print some object's data
        // we can instead format the object's data as a String in the Person class itself using the toString method, which we'll override from Object.

        // now the example above prints out the data formatted in the way the Person class specifies

        // NOTE: we didn't call the bobby.toString() method explicitly
        // we simply passed bobby into the println method
        // there's some inference going on there
        // System.out.println will try to convert whatever is passed in to a String

        // Java can ONLY print Strings, so when printing is called, everything eventually gets converted to a String.



    }
}

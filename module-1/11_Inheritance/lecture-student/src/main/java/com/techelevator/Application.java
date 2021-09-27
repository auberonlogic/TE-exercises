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

        BuyoutAuction buyoutAuction = new BuyoutAuction("Tech Elevator Backpack", 35);
        buyoutAuction.placeBid(new Bid("Josh", 20));
        buyoutAuction.placeBid(new Bid("Fonz", 25));
        buyoutAuction.placeBid(new Bid("Rick Astley", 50));

        ReserveAuction reserveAuction = new ReserveAuction("Tech Elevator Laptop", 1250);
        reserveAuction.placeBid(new Bid("Josh", 400));
        reserveAuction.placeBid(new Bid("Fonz", 2000));


/*        Chef boyardee = new Chef("Bob", "Boyardee", 150, 1000, "Spaghetti O's");

        // boyardee. can't access class data when variables are private --- implement getters and setters
        System.out.println(boyardee.getFirstName()); // getter allows us to access firstName*/

        Person testerson1 = new Person("Test", "Testerson", 40);
        Person testerson2 = new Person("Test", "Testerson", 40);
        Person testerson3 = testerson1;

        if (testerson1.equals(testerson2)) {
            System.out.println("Testerson 1 and 2 are equal!");
        }

        if (testerson1.equals(testerson3)) {
            System.out.println("Testerson 1 and 3 are equal!");
        }

        if (testerson2.equals(testerson3)) {
            System.out.println("Testerson 2 and 3 are equal!");
        }

        /* Stack      Heap
        *  0xe5   ->  {"Test", "Testerson", 40}
        *  0xf6   ->  {"Test", "Testerson", 40}
        *  0xe5   ->  Same location in heap as testerson1
        * */

        Person bobby = new Person("Bobby", "Tables", 14);
        System.out.println(bobby);



    }
}


/*

    Object     Object
      -equals    -equals
       |          |
     Person     String
       -equals    -equals






*/

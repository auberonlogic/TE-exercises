package com.techelevator;

public class BookStore {


    public void getBooks() {

//        "Andre";
//        "Sepkowski";
        Person andreS = new Person("Andrzej", "Sapkowski");
        Book theLastWish = new Book("The Last Wish", andreS);
        Book bloodOfElves = new Book("Blood of Elves", andreS);

        bloodOfElves.leaveAReview("It's great", andreS);
    }








    /*
    *
    *
    * Sections for books
    * Book
    *  - Title
    *  - Author
    *  - Genre
    *  - Price
    *  - NeworUsed
    *  - Signed
    *  - LocationOnShelf
    * leaveAReview()
    *
    * Person
    *  - First Name
    *  - Last Name
    *  - Occupation
    *  - RewardsCard?
    *
    * BookStore
    *  - Inventory
    *  - CoffeeShop
    *  - Cash
    *  - Staff
    *  - Customers
    * leaveAReview()
    * checkOut()
    *
    *
    *
    * book inventory (is new or used, us signed)
    * Book titles
    * Prices
    * Genres
    * Authors
    * Customers
    * Staff
    *
    * arrangeBooks()
    * orderBook()
    * checkOut()
    * leaveAReview()
    *
    * CoffeeShop*/
}

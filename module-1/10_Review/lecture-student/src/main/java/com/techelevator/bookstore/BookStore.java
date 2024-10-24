package com.techelevator.bookstore;

public class BookStore {

    /*
        What does a book store need?
        What ways might a bookstore operate?
        What might we need to store in data?
        What behaviors might a bookstore execute?

        Books
        Customers
        Staff

        orderBooks()
        sellBook()
        buyBook()
        arrangeBooks()
        leaveAReview()


        Nouns and Verbs is what it comes down to
        What are the properties of the thing, and what can it do? What are its behaviors?
     */

    public void getBooks() {

        Person andreS = new Person("Andre", "Sepkowsky");

        Book blood = new Book("Blood of Elves", andreS);

        blood.leaveReview("It's great!");
        blood.leaveReview("It's terrible :(");


    }

}

package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class Book {

    private String title; // use final keyword so value can never be changed
    private String genre;
    private Person author;
    private double price;
    private boolean inNew = true;
    private boolean signed;
    private String location;

    private List<String> reviews;

    // Constructor
    public Book(String title, Person author) {
        this.title = title;
        this.author = author;
        this.reviews = new ArrayList<>();
    }

    public void leaveAReview(String review, Person author) {
        this.reviews.add(review);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
/*
    - Title
    *  - Author
    *  - Genre
    *  - Price
    *  - NeworUsed
    *  - Signed
    *  - LocationOnShelf
    * leaveAReview()*/
}

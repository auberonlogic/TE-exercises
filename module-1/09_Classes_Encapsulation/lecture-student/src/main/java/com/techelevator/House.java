package com.techelevator;

public class House {

    // Instance Variables
    private int bedrooms;
    private double bathrooms;
    private String address;
    private int length;
    private int width;
//    private int sqFootage; dependant variable. don't need it. leads to errors
    private boolean occupied;


    // Constructor (can generate)

    public House(int bedrooms, double bathrooms, String address, int length, int width, boolean occupied) {
        this.bedrooms = bedrooms;
        this.bathrooms = bathrooms;
        this.address = address;
        this.length = length;
        this.width = width;
        this.occupied = occupied;
    }


    public House(int bed, double bath, String beyond) {
        this.bedrooms = bed;
        this.bathrooms = bath;
        this.address = beyond;
    }


    //     default constructor... if you don't add it, it will still be there. Does nothing
//    public House() {
//
//    }

    // Behaviours
    private void myMethod() {
        System.out.println("HEY! THIS IS PRIVATE!");
    }

    public void renovate() {
        this.bedrooms++;
        this.bathrooms++;
    }

    // can generate
    public String toString() {
        String output = "This house is located at " + this.address + ".";
        output+= " It has " + this.bedrooms + " bedrooms and " + this.bathrooms + " bathrooms.";
        return output;
    }


    // Derived Property
    public int getSqFootage() {
        myMethod();
        return width * length;
    }


    // Setters and Getters (can generate)
    public int getBedrooms() {
        return bedrooms;
    }

//    public void setBedrooms(int bedrooms) {
//        if (bedrooms < 0) {
//            this.bedrooms = 0;
//        } else {
//            this.bedrooms = bedrooms;
//        }
//
//    }

    public double getBathrooms() {
        return bathrooms;
    }

//    public void setBathrooms(double bathrooms) {
//        if (bathrooms < 0) {
//            this.bathrooms = 0;
//        } else {
//            this.bathrooms = bathrooms;
//        }
//
//    }

    public String getAddress() {
        return address;
    }

//    public void setAddress(String address) {
//        this.address = address;
//    }



    public int getLength() {
        return length;
    }

//    public void setLength(int length) {
//        this.length = length;
//    }

    public int getWidth() {
        return width;
    }

//    public void setWidth(int width) {
//        this.width = width;
//    }




    public boolean isOccupied() {
        return occupied;
    }

//    public void setOccupied(boolean occupied) {
//        this.occupied = occupied;
//    }
}

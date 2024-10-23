package com.techelevator;

public class App {
    public static void main(String[] args) {

        // creating a house object
        // currently there is no data or behavior specified by the House class
        // we need to add instance variables
        // btw, this is the constructor
        // when we instantiate a new object it uses the constructor
        House myPlace = new House();

        House neighbor = new House(3,2.5,"999 Court Lane");

        myPlace.setAddress("123 Main Street");

        System.out.println("My house has " + myPlace.getBedrooms() + " bedrooms.");

        myPlace.setBedrooms(30);

        System.out.println("My house has " + myPlace.getBedrooms() + " bedrooms.");

        myPlace.setOccupied(true);

        System.out.println("is my place occupied? " + myPlace.isOccupied());

        myPlace.setLength(100);
        myPlace.setWidth(100);

        System.out.println("Width: " + myPlace.getWidth());
        System.out.println("Length:" + myPlace.getLength());

        // with square footage, we don't need to write this down
        // it can be derived. it's better practice derive it. setting derivable values is error prone.
        System.out.println("My house is " + myPlace.getSqFootage() + " square feet.");

        System.out.println(neighbor);
    }
}
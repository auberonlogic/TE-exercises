package com.techelevator;

public class House {

    // instance variables
    // these make up the blueprint for a house.
    // we make the access modifier private. this is best practice.
    // the class is public, so some application can use the class...
    // but the instance variables of that class are private, so by default whoever creates the object cannot modify the data inside that object.
    // it is bad practice to allow the application to modify the object data with no restriction.
    // 
    private int bedrooms;
    private double bathrooms;
    private String address;
    private int length;
    private int width;
    private boolean occupied;

    // classes can contain classes themselves

    // Methods go here
    // we can make publicly available methods that can be accessed from outside the class

    // the reason we set instance variables to private and only allow users to change object data via public methods is because that allows us to define how the object data can be changed, and to restrict users from changing it in any way they see fit


    // CONSTRUCTOR
    // basically tells the JVM how to build an object from your class
    // always make constructor public
    // do not need to put a return type (not even void)
    // name of constructor MUST MATCH the name of the class
    // with no input and nothing in the code block, this is called the default constructor.
    // this works just fine, even if the constructor is not explicitly defined in the class.
    // if I leave it out, java provides the default constructor for me
    public House() {

    }

    // can define as many constructors as I want
    // can overload the constructor with parameters
    // this means for these values we don't need setters
    // can pass the values in at initialization
    public House(int bedrooms, double bathrooms, String address) {
        this.bedrooms = bedrooms;
        this.bathrooms = bathrooms;
        this.address = address;
    }

    // if I don't explicitly include the default constructor but I do provide an overloaded constructor, java also will not provide the default constructor.
    // if I provide a constructor and want someone to be able to create an empty object, I need to manually add in the default constructor.





    // GETTERS AND SETTERS


    // DERIVED PROPERTY
    // we don't need an instance variable for values that can be derived from existing values
    // it only ever needs to be derived, so we can create a getter using the values from our instance variables.
    public int getSqFootage() {
        return length * width;
    }




    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    // the convention for getters for booleans is not to call the method getOccupied.
    // rather, we use isOccupied. it reads more like english.
    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }


    // if we are following convention, all our classes instance variables will be private
    // but we still need to access those variables to set and get the values
    // therefore, we include getters and setters.
    // getters simply return the value.
    // setters take an incoming value and assign it to this.<instance_variable>
    // we can auto generate these in intellij by right clicking, selecting 'generate', and choosing 'getter and setter'

    public int getBedrooms() {
        return bedrooms;
    }

    // we can apply control in the setters.
    // because the user can only access the instance variables via the set method, we can set rules that are enforced.
    public void setBedrooms(int bedrooms) {
        if (bedrooms < 0) {
            this.bedrooms = 0;
        } else {
            this.bedrooms = bedrooms;
        }
    }

    public double getBathrooms() {
        return bathrooms;
    }

    public void setBathrooms(double bathrooms) {
        if (bathrooms < 0) {
            this.bathrooms = 0;
        } else {
            this.bathrooms = bathrooms;
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "House{" +
                "bedrooms=" + bedrooms +
                ", bathrooms=" + bathrooms +
                ", address='" + address + '\'' +
                ", length=" + length +
                ", width=" + width +
                ", occupied=" + occupied +
                '}';
    }
}
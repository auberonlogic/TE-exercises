package com.techelevator;

public class Elevator {

    // instance variables
    private int currentFloor;
    private int numberOfFloors;
    private boolean doorOpen;

    // Constructor
    public Elevator(int numberOfLevels) {
        this.numberOfFloors = numberOfLevels;
        currentFloor = 1;
    }

    // Methods
    public void openDoor() {
        doorOpen = true;
    }

    public void closeDoor() {
        doorOpen = false;
    }

    public void goUp(int desiredFloor) {
        if (currentFloor < desiredFloor) {
            if (!doorOpen) {
                if (desiredFloor <= numberOfFloors) {
                    currentFloor = desiredFloor;
                }
            }
        }
    }

    public void goDown(int desiredFloor) {
        if (currentFloor > desiredFloor) {
            if (!doorOpen) {
                if (desiredFloor > 0) {
                    currentFloor = desiredFloor;
                }
            }
        }
    }

    // Getters
    public int getCurrentFloor() {
        return currentFloor;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public boolean isDoorOpen() {
        return doorOpen;
    }
}

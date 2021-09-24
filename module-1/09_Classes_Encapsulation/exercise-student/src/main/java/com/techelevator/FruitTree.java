package com.techelevator;

public class FruitTree {

    // Instance variables
    private String typeOfFruit;
    private int piecesOfFruitLeft;

    // Constructor
    public FruitTree(String typeOfFruit, int startingPiecesOfFruit) {
        this.typeOfFruit = typeOfFruit;
        this.piecesOfFruitLeft = startingPiecesOfFruit;
    }

    // pickFruit method
    public boolean pickFruit(int numberOfPiecesToRemove) {
        if (piecesOfFruitLeft >= numberOfPiecesToRemove) {
            piecesOfFruitLeft -= numberOfPiecesToRemove;
            return true;
        } else {
            return false;
        }
    }

    // Getters
    public String getTypeOfFruit() {
        return typeOfFruit;
    }

    public int getPiecesOfFruitLeft() {
        return piecesOfFruitLeft;
    }

}

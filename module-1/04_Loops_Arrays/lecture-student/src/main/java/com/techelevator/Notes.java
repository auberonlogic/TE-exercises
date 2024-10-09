package com.techelevator;

import java.util.Arrays;

public class Notes {

    public static void main(String[] args) {

        /**
         * Arrays:
         *
         *  - collection of similar items, called elements
         *  - all same datatype!
         *  - fixed length. Cannot add or remove elements from the array.
         *
         *   - hold data at indexes (locations in the array)
         *   - Say we have an array called scores with 4 int elements.
         *   - If we want to get a specific score from the array, we reference its index (its offset, so 0 indexed), like so...
         *   - scores[2] retrieves the score at the 2nd index, so the 3rd element in the array.
         *
         *   - arrays are useful because they contain COLLECTIONS of data. If we have 1000 pieces of data, we don't want to treat with 1000 separate elements.
         *   - We want one variable to reference from which we can access whichever element we want by type.
         *
         * - index is an int, so the max number of elements in an array == the max int, which is about 2.1 billion
         * - likely we will not need a collection of 2.1 billion elements, so likely okay.
         *
         *
         *
         *
         *
         *
         *
         *
         */

        // example:
        // creates an int array of size 4 called scores
        int[] scores = new int[4];

        // the array has a name and a size, but no data elements
        // to add elements...
        scores[0] = 3;
        scores[1] = 2;

        System.out.println("Score at index 1: " + scores[1]); // prints score value at index 1 (a 2)

        scores[2] = scores[0] / scores[1];
        scores[3] = 2;

        // if we tried to add an element at index 4 (beyond the size of the array), we'd throw on arrayIndexOutOfBounds exception.

        // C and C++ allow you to enter the space beyond the array, but it is not reserved memory and could contain anything.

        String[] inst = new String[3];
        inst[0] = "Tom";
        inst[1] = inst[0];
        inst[2] = "Walt";



        // shortcut
        String[] inst2 = {"Tom", "Tom", "Walt"};

        // also works
        String[] inst3 = new String[]{"Tom", "Tom", "Walt"};

        System.out.println("Length of array (number of element):" + inst3.length);

        // you can't change the SIZE of an array, but you can overwrite the values of a given element


        /**
         * Loops
         *
         *  - programs usually execute sequentially
         *  - loops allow you to literally go back up the lines of code and repeat the code in the loop.
         *  - 3 loops:
         *      - for
         *      - while
         *      - do/while
         *
         * FOR LOOPS:
         *  - init
         *  - condition
         *      - if true -> execute code block -> change -> back to condition
         *      - if false -> skip code block
         *
         */

        // for(init; condition; change) { CODE BLOCK }

        for(int i = 0; i < 5; i++) {
            System.out.println("i is "+ i);
        }

        // print all even number 0-100 inclusive
        for (int i = 0; i <= 100; i+=2) {
            System.out.println(i);
        }

        for(int i = 0; i <= 100; i++) {
            System.out.print(i);
            System.out.print(" is: ");
            if(i%2==0) {
                System.out.println(" even!");
            } else {
                System.out.println(" odd!");
            }
        }


        //
        int[] scores2 = new int[]{3, 3, 2, 3, 0};

        System.out.println(calcAvg(scores2));

    }

    // for loop with array input to calculate averages
    public static double calcAvg(int[] scores) {

//        int sum = 0;
//        for(int i = 0; i < scores.length; i++) {
//            sum += scores[i];
//        }

        return (double) Arrays.stream(scores).sum() / scores.length;

//        return (double)sum/scores.length;

    }
}
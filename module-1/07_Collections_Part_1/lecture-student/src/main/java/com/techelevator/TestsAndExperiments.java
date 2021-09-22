package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class TestsAndExperiments {

    public static void main(String[] args) {

        // create list and add elements
        List<String> strings = new ArrayList<String>();

        strings.add("A");
        strings.add("B");
        strings.add("C");
        strings.add("D");
        strings.add("E");
        strings.add("F");
        strings.add("G");

        System.out.println("Oringal List: ");
        System.out.println(strings);
        System.out.println("List size is: " + strings.size() + "\n");

        // add an elements to the end of the list
        strings.add("0"); // if index is not specified, element will be appended to the end of the list
        System.out.println("Add \"0\" to end of list: ");
        System.out.println(strings);
        System.out.println("List size is: " + strings.size() + "\n");

        // insert an element at a given index
        strings.add(3, "777"); // should insert "777" at the 3rd index, as the 4th element
        System.out.println("Insert \"777\" at 3rd index: ");
        System.out.println(strings);
        System.out.println("List size is: " + strings.size() + "\n");

        // remove and element at a given index
        strings.remove(7); // should remove "G" and reduce size by 1
        System.out.println("Remove \"G\" from 7th index: ");
        System.out.println(strings);
        System.out.println("List size is: " + strings.size() + "\n");

        // replace an element at a given index
        strings.remove(0);
        strings.add(0, "999");
        System.out.println("Remove \"A\" from 0th index and replace it with \"999\": ");
        System.out.println(strings);
        System.out.println("List size is: " + strings.size() + "\n");
    }
}

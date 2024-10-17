package com.techelevator;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Notes2024 {

    // COLLECTIONS

    // collections framework has defined java over the years.
    // original java 1 collections class was not great
    // java 1.2 reworked the collections class

    // java 8 introduced some functional programming with collections class

    // with java, you get all these libraries, all these packages of code, that we can use as we need

    // Collections are essentially different ways of grouping together objects

    // objects are all reference types that live on the heap. collections group these objects together.

    // 5 Collections
        // Linear data structures
            // List
            // Stack
            // Queues
        // non linear data structures
            //
            //

    // Arrays are fixed length, length must be declared when initialized, data in array must all be same type

    // Lists
    // are 0 indexed like an array. They go up to, but not including, the size of the array.
    // allow duplicates
    // can grow and shrink. NOT fixed length.
    // MUST store the same data type.
    // Lists are objects
        // so they have behaviors, methods we can use.

    public static void main(String[] args) {
        System.out.println("#####################");
        System.out.println("        LISTS        ");
        System.out.println("#####################");

        // specify the datatype between the brackets
        // can't just use the List interface. Interfaces are not instantiable.
        // objects are instantiated from classes.
        // instead of using a list, we use an ArrayList
        List<String> namesList = new ArrayList<String>();

        // e stands for element in the list
        // names.add(String e)
        namesList.add("oberon");
        namesList.add("maeve");
        namesList.add("puck");
        namesList.add("fillywig");

        // if we wanted to do the same with an array, we'd need to set its length at creation.
        // we wouldn't be able to expand it if its size needed to change later
        String[] namesArray = new String[3];
        namesArray[0] = "oberon";
        namesArray[1] = "maeve";
        namesArray[2] = "puck";

        // trying to print an array prints the reference to the object from the stack, no the elements of the array themselves.
        System.out.println("Printing namesArray...");
        System.out.println(namesArray);

        // we can use the methods included with list by the java collections library to print the elements of the list
        System.out.println("Printing namesList...");
        System.out.println(namesList);


        System.out.println();
        System.out.println();
        System.out.println("#####################");
        System.out.println("  Lists are ordered  ");
        System.out.println("#####################");

        // order in which we inserted elements will be preserved

        // with array
        System.out.println("array - printing elements via for loop...");
        for (int i = 0; i < namesArray.length; i++) {
            System.out.println(namesArray[i]);
        }

        // with list
        System.out.println();
        System.out.println("list - printing elements via for loop...");
        for (int i = 0; i < namesList.size(); i++) {
            System.out.println(namesList.get(i));
        }


        System.out.println();
        System.out.println();
        System.out.println("#####################");
        System.out.println("  Lists allow dupes  ");
        System.out.println("#####################");

        System.out.println();
        System.out.println();
        System.out.println("#####################################################");
        System.out.println("  Lists allow elements to be inserted in the middle  ");
        System.out.println("#####################################################");

        namesList.add(1, "plunkett");

        System.out.println("added \"plunkett\" at index 1");
        System.out.println(namesList);




        System.out.println();
        System.out.println();
        System.out.println("###############################################");
        System.out.println("  Lists allow elements to be removed by index  ");
        System.out.println("################################################");


        namesList.remove(1);
        System.out.println();
        System.out.println(namesList);

        // removing an element from an index in the middle of the list does not result in an empty index. the following elements are shifted so all indices are full




        System.out.println();
        System.out.println();
        System.out.println("################################################");
        System.out.println("  Find out if something is already in the list  ");
        System.out.println("################################################");

       System.out.println(namesList.contains("fillywig"));





        System.out.println();
        System.out.println();
        System.out.println("##################################");
        System.out.println("  Find index of item in the list  ");
        System.out.println("##################################");

        System.out.println(namesList.indexOf("maeve"));


        System.out.println();
        System.out.println();
        System.out.println("#####################################");
        System.out.println("  Lists can be turned into an array  ");
        System.out.println("#####################################");

        System.out.println(Arrays.toString(namesList.toArray()));

        // this won't work, because the toArray method on the list doesn't know what datatype is held in the list. It defaults to object.
        // String[] namesAsArray = namesList.toArray();

        // to resolve, we specify the data type in the toArray method call, like so
        String[] namesAsArray = namesList.toArray(String[]::new);


        System.out.println();
        System.out.println();
        System.out.println("#######################");
        System.out.println("  Lists can be sorted  ");
        System.out.println("#######################");


        Collections.sort(namesList);
        System.out.println(namesList);



        System.out.println();
        System.out.println();
        System.out.println("#############################");
        System.out.println("  Lists can be reversed too  ");
        System.out.println("#############################");

        Collections.reverse(namesList);
        System.out.println(namesList);


        System.out.println();
        System.out.println();
        System.out.println("#####################");
        System.out.println("       FOREACH       ");
        System.out.println("#####################");


        // for each loops do not concern themselves with indexes
        // we go straight in and grab the elements
        for (String name : namesList) {
            System.out.println(name);

        }


        // int lists
        // may not put primitive data types in a list
        // can't make List<int>
        // but we can use a reference type Integer list
        // this is done using wrapper classes
        // wrapper classes take a value type and turn it into a reference type
        List<Integer> fibList = new ArrayList<Integer>();


        int v = 5;
        Integer i = 1;


        // Java will box up a primitive type as a reference type (and vice versa) for you
        // Boxing: int -> Integer
        // Unboxing: Integer -> int
        // called Autoboxing and Autounboxing
        

    }




}

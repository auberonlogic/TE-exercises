package com.techelevator;

import java.util.Scanner;

public class Notes {

    // Strings and Objects

    // There are 2 parts to memory
    // Stack and Heap

    // Computers are partitioned into different areas of memory

    // Stack is small and fast

    // Heap is vast and slow

    // When we assign values to primitive data types, we use the stack (small, fast memory)
        // char
        // short/byte
        // int
        // long
        // float
        // double

    // week 1 was all about primitive data types
    // week 2 is not.

    // with primitives, the actual value goes onto the stack
        // char = 'a'
            // the letter a goes onto the stack

    // primitives data types are called value types (they store the value on the stack)

    // Reference types are different
    // Strings are reference types
    // Reference types put the reference to the value on the stack, not the value itself.

    public static void main(String[] args) {

        // the letters "oberon" are not being put on the stack
        String name = "oberon";

        // the value here "oberon" is on the heap.
        // a reference to that value is stored on the stack
        // java goes out into the heap and finds some available memory (jvm takes care of this), claims some memory for the current need, and stores the hexadecimal memory address of that data on the stack
        // 0x123ABC <--- memory address
        // java takes care of all this memory allocation. Not all languages do so.

        // primitive data types do not store values in the heap. straight to the stack.

        // we've used some reference types already...
            // Strings
            // Scanner

        Scanner kb = new Scanner(System.in);
        // kb is variable name
        // 0xABC123 is the memory address stored on the stack
        // the Scanner is the actual object stored in the heap

        // Arrays are also reference types
        int[] scores = new int[4];

        // new is a keyword telling java to go into the heap and allocate some memory for an object

        int y;
        // this reserves enough space for an int on the stack. The default value is 0 until assigned.

        String x;
        // declares enough space in the stack to hold a reference (memory address)

        x = "Java";
        // data at address is allocated and address in stored in stack at x.
        // before a heap data is used, the reference on the stack is null.
        // null is reserved when there should a heap memory address on the stack referencing some object, but the object does not exist yet.

        // == is comparing stack values.
        // that's why we need to use .equals() method from the string class

        // Objects
        // a collection of data and methods
        // all objects live on the heap
        // all objects are reference types

        // Objects have DATA
        // Objects have BEHAVIORS (methods)

        // How do we create objects?
        // three step process

        // Declaration --- Instantiation --- Initialization
        String name2 = new String("oberon");
        // 'String name' is the declaration. I am declaring a variable name of type String.
        // '= new String()' is the instantiation. I am creating a new String object in the heap with a reference to it on the stack.
        // '"oberon"' is the initialization. I am actually assigning data to the variable.

        int[] array = new int[] {3,3,2,3};
        // 'int[] array'  ---> declaration
        // '= new int[]'  ---> instantiation
        // '{3, 3, 2, 3}' ---> initialization

        // in future we will make our own custom objects

        // we don't code objects. we code classes. Classes are templates for instances of the class (objects).

        // the behaviors, the methods, are what make objects so powerful

        String language = "Java"; // 0xBEEF

        // in the stack, we store a reference to a String object in the heap under the variable name language.
        // In the heap, our string object with value "Java" exists at the memory address referenced in the stack.
        // beyond the value "Java", we have all the string methods included in this object
            // equals()
            // equalsIgnoreCase()
            // split()
            // length()
            // toUpperCase()
            // toLowerCase()
            // contains()
            // ... and more

        System.out.println("language.toUpperCase() = " + language.toUpperCase());
        System.out.println("language.length() = " + language.length());
        System.out.println("language.contains(\"av\")" + language.contains("av"));

        // Strings in java are in fact immutable.
        // They cannot be changed.
        // If you run a method on the string to change the data, a new String object is created with the data changes.

        // running String methods that change the value creates a new String. The original String remains unchanged.

        System.out.println("the value of language is unchanged after running toUpperCase on it: " + language);

        // but if we want, we can store the new string under the same variable on the stack, just point it to the new reference

        language = language.toUpperCase();

        // now when I print language, the value "JAVA" will be printed, because that new object is mapped to the language variable on the stack

        System.out.println("reassigned the to output of the toUpperCase method to the original stack variable: " + language + " ... this is a different object than before.");

        // if we reassign the variable reference to a new object, what happens to the original object?
        // The JVM is checking if there are any objects which are inaccessible. It is checking if there are any objects for which the references on the stack have been removed (as in this case).
        // If there is an orphaned object, java will clean it up with Garbage Collection.
        // We don't need to release that memory ourselves.
        // C and C++, you need to manually clean up after yourself.
        // in C, if you are creating more objects than you're cleaning up, you have what's called a memory leak.
        // You will eventually run out of memory and fail.

        System.out.println();

        String someString = "Javascript";

        System.out.println("someString: " + someString);

        System.out.println("someString.length(): " + someString.length());

        // characters in a string are 0 indexed

        System.out.println("someString.charAt(0): " + someString.charAt(0));

        // substring truncates strings.
        // first param is starting index inclusive
        // second param is ending index EXCLUSIVE
        System.out.println("someString.substring(0,4): " + someString.substring(0,4));

        // substring has an overloaded method
        // can pass 1 int param, which means start index
        // substring then goes to the end of the string
        System.out.println("someString.substring(4): " + someString.substring(4));

        for (int i = 0; i < someString.length(); i++) {
            System.out.println("Character at index " + i + " is " + someString.charAt(i));
        }

        System.out.println();

        String obligatory = "Hello World! This is a World string and we are experimenting World with it";


        // can get a specific character as a character data type or a string data type.
        char h = obligatory.charAt(0);
        System.out.println(h);

        // string data type will have all the string methods if I want to further manipulate it.
        // char data type  will not have these.
        String hString = obligatory.substring(0,1);
        System.out.println(hString);

        char[] charArray = obligatory.toCharArray();

        System.out.println(obligatory.startsWith("Hello"));

        System.out.println(obligatory.indexOf("World"));

        // if you have more than one instance of the word "World" in the string, index of will only find the FIRST one. It stops looking after it finds one

        int firstWorld = obligatory.indexOf("World"); // 6
        System.out.println("first instance of \"World\" begins at index " + firstWorld);

        // if I truncate to not include the first instance of world, the next instance will be returned by indexOf
        obligatory = obligatory.substring(7);

        int secondWorld = obligatory.indexOf("World"); // 16
        System.out.println("second instance of \"World\" after substring cuts off the start of the string is at index " + secondWorld);

        // lastIndex starts at end of string and searches towards the beginning

        int lastWorld = obligatory.lastIndexOf("World");
        System.out.println("Last index of \"World\" is " + lastWorld);

        String garbage = "              Hello there this is a long        sentence            ";

        // trim removes starting and ending whitespaces, but not internal whitespaces
        String slightlyLessGarbage = garbage.trim();
        System.out.println(slightlyLessGarbage);

        String hello1 = "Hello";
        String hello2 = "Hello";

        if (hello1 == hello2) {
            System.out.println("they are equal");
        } else {
            System.out.println("they are NOT equal");
        }

    }

}





























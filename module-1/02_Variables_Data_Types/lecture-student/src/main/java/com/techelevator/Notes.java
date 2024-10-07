package com.techelevator;

public class Notes {

    /*
    * BACKGROUND:
        * 70s and 80s we used C and C++
        * Java was invented in the 90s to solve some of the problems with older languages
        * Older langs required you to use a separate compiler for each architecture you wanted your program to run on
        * Java introduced the JVM (java virtual machine)
        * The javac (java compiler) spits out bytecode (rather than machine code)
        * the byte code is read by the JVM for a given chipsets architecture
        * this allows code to be portable. Source code can be written and compiled once, then run on many machines.
    */

    // DATATYPES
    // boolean  ->  true / false
    boolean booleanExample = true;

    // byte     ->  8 bits / 1st bit is sign / 2^7 - 1 = -127 to 127
    byte byteExample = 127;

    // short    ->  16 bits
    short shortExample = 32000;

    // int      ->  32 bits / approx -2.1 billion to 2.1 billion
    int intExample = 2100000000;

    // long     ->  64 bits / -2^63 to 2^63
    long longExample = 2222222222100000000L;

    // float    ->  32 bits / basically decimal version of int
    float floatExample = 2.5F;

    // double   ->  64 bits / basically decimal version of long
    double doubleExample = 2.5;

    // char     -> character
    char character = 'b';


    // OPERATORS
    //  +   plus        2 + 5 = 7
    //  -   subtract    2 - 5 = -3
    //  *   multiply    5 * 2 = 10
    //  /   divide      5 / 2 = 2       java defaults to using ints, which do not have remainders
    //  %   modulus     5 % 2 = 1       the remainder from division

}

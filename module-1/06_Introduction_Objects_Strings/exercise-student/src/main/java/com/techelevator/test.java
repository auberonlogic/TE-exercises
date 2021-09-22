package com.techelevator;

public class test {
    public static void main(String[] args) {

        String str = "Hello";

        System.out.println(str.length()/2);

/*        char[] chars = str.toCharArray();
        char[] everyOtherChar = new char[str.length()/2];
        for (int i = 0; i < str.length() + 1; i++) {
            if (i % 2 == 0) {
                everyOtherChar[i] = str.charAt(i);
                System.out.print(everyOtherChar[i] + " ");
            }
        }
        String everyOtherString = new String(everyOtherChar);*/
    }
}

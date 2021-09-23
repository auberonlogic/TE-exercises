package com.techelevator;

public class App {

    public static void main(String[] args) {
        House h = new House(3, 2.5, "123 Main St");
//        House h2 = new House();
        House h2 = new House(3,2,"my house",100, 100, true);



//        System.out.println(h.getBedrooms());
//        h.setBedrooms(30);
        System.out.println(h.getBedrooms());

//        h.setBathrooms(-10);
        System.out.println(h.getBathrooms());

//        h.setLength(100);
//        h.setWidth(100);

        System.out.println("Width: " + h.getWidth());
        System.out.println("Length: " + h.getLength());



        System.out.println("My house is ");
        System.out.println(h.getSqFootage() + " square feet!");

        System.out.println(h.getAddress());

        System.out.println("Before renovations: ");
        System.out.println(h2.getBedrooms());

        h2.renovate();

        System.out.println("After renovations: ");
        System.out.println(h2.getBedrooms());

        System.out.println(h2);
        System.out.println(h);






    }
}

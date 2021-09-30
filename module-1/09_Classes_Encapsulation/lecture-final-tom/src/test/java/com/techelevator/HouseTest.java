package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Random;

public class HouseTest {
    // What is the responsibility of this class?
    // To test House class
    // How do I do that?

    // you can have instance variables
    private House houseToTest;

    @Before
    // makes a fresh object for each test
    public void build_house() {
        Random rando = new Random();
        rando.nextInt(6);
        House houseToTest = new House(3, 2.0, "Slaughter House 5");

    }
    @Test
    public void test_renovate_twice() {
        houseToTest.renovate();
        houseToTest.renovate();
        Assert.assertEquals(5, houseToTest.getBedrooms());
        Assert.assertEquals(4.0, houseToTest.getBathrooms(), 2);
    }

    @Test
    public void test_renovate() {
        // What is this test supposed to do?
        // ARRANGE 3 bed / 2 bath house
        //House houseToTest = new House(3, 2.0, "Test House 1");

        // ACT
        // renovate
        houseToTest.renovate();

        // ASSERT
        // check to make sure it's now 4 bed / 3 bath
        Assert.assertEquals("Bedrooms: ", 4, houseToTest.getBedrooms());
        Assert.assertEquals("Bathrooms: ", 3.0, houseToTest.getBathrooms(), 2);
    }
}

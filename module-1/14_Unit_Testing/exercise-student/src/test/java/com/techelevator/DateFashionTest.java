package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class DateFashionTest {

    @Test
    public void returns_0_when_someone_is_less_than_or_equal_to_2_1() {
        DateFashion df = new DateFashion();

        Assert.assertEquals(0, df.getATable(2, 10));
    }

    @Test
    public void returns_0_when_someone_is_less_than_or_equal_to_2_2() {
        DateFashion df = new DateFashion();

        Assert.assertEquals(0, df.getATable(3, 1));
    }

    @Test
    public void returns_1_when_both_are_greater_than_2_but_less_than_8() {
        DateFashion df = new DateFashion();

        Assert.assertEquals(1, df.getATable(3, 7));
    }

    @Test
    public void returns_2_when_both_are_greater_than_2_and_at_least_one_is_greater_than_or_equal_to_8() {
        DateFashion df = new DateFashion();

        Assert.assertEquals(2, df.getATable(9, 7));
    }

    @Test
    public void returns_0_when_one_is_less_than_or_equal_to_2_and_one_is_greater_than_or_equal_to_8() {
        DateFashion df = new DateFashion();

        Assert.assertEquals(0, df.getATable(8, 1));
    }

}

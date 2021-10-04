package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class SameFirstLastTest {

    @Test
    public void returns_false_if_array_is_empty() {
        SameFirstLast sfl = new SameFirstLast();
        int[] input = {};
        Assert.assertEquals(false, sfl.isItTheSame(input));
    }

    @Test
    public void returns_true_if_array_only_has_one_element() {
        SameFirstLast sfl = new SameFirstLast();
        int[] input = {5};
        Assert.assertEquals(true, sfl.isItTheSame(input));
    }

    @Test
    public void returns_true_if_array_is_length_2_and_both_elements_are_the_same() {
        SameFirstLast sfl = new SameFirstLast();
        int[] input = {8, 8};
        Assert.assertEquals(true, sfl.isItTheSame(input));
    }

    @Test
    public void returns_true_if_first_and_last_element_are_the_same() {
        SameFirstLast sfl = new SameFirstLast();
        int[] input = {3, 17, 3, 3};
        Assert.assertEquals(true, sfl.isItTheSame(input));
    }

    @Test
    public void returns_false_if_first_and_last_element_are_not_the_same() {
        SameFirstLast sfl = new SameFirstLast();
        int[] input = {1, 2, 3, 7, 9};
        Assert.assertEquals(false, sfl.isItTheSame(input));
    }

}

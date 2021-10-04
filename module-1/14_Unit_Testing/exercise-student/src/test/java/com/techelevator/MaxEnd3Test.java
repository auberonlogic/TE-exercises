package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;

public class MaxEnd3Test {

    @Test
    public void returns_correct_result_when_first_value_is_largest() {
        MaxEnd3 me3 = new MaxEnd3();
        int[] input = new int[] {11, 5, 7};
        int[] output = new int[] {11, 11, 11};
        Assert.assertArrayEquals(output, me3.makeArray(input));
    }

    @Test
    public void returns_correct_result_when_last_value_is_largest() {
        MaxEnd3 me3 = new MaxEnd3();
        int[] input = new int[] {11, 7, 75};
        int[] output = new int[] {75, 75, 75};
        Assert.assertArrayEquals(output, me3.makeArray(input));
    }

    @Test
    public void ignores_middle_element_even_if_it_is_largest() {
        MaxEnd3 me3 = new MaxEnd3();
        int[] input = new int[] {5, 1000, 7};
        int[] output = new int[] {7, 7, 7};
        Assert.assertArrayEquals(output, me3.makeArray(input));
    }

}

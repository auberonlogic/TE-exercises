package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class Lucky13Test {

    @Test
    public void returns_true_when_input_is_empty() {
        Lucky13 l13 = new Lucky13();
        int[] nums = {};
        Assert.assertEquals(true,l13.getLucky(nums));
    }

    @Test
    public void returns_true_when_input_contains_no_1s_or_3s() {
        Lucky13 l13 = new Lucky13();
        int[] nums = {2,4,5,6,7,8,9,0};
        Assert.assertEquals(true,l13.getLucky(nums));
    }

    @Test
    public void returns_false_when_input_contains_1() {
        Lucky13 l13 = new Lucky13();
        int[] nums = {2,4,5,6,7,8,1,0};
        Assert.assertEquals(false,l13.getLucky(nums));
    }

    @Test
    public void returns_false_when_input_contains_3() {
        Lucky13 l13 = new Lucky13();
        int[] nums = {2,4,5,6,7,8,3,0};
        Assert.assertEquals(false,l13.getLucky(nums));
    }

    @Test
    public void returns_false_when_input_contains_1_and_3() {
        Lucky13 l13 = new Lucky13();
        int[] nums = {3,1,5,6,1,8,3,0};
        Assert.assertEquals(false,l13.getLucky(nums));
    }
}

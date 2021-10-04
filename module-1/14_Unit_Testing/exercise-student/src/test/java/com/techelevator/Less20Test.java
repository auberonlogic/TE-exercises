package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class Less20Test {

    @Test
    public void returns_true_when_input_is_one_less_than_multiple_of_20() {
        Less20 l20 = new Less20();
        Assert.assertEquals(true, l20.isLessThanMultipleOf20(39));
    }

    @Test
    public void returns_true_when_input_is_two_less_than_multiple_of_20() {
        Less20 l20 = new Less20();
        Assert.assertEquals(true, l20.isLessThanMultipleOf20(78));
    }

    @Test
    public void returns_false_when_input_is_multiple_of_20() {
        Less20 l20 = new Less20();
        Assert.assertEquals(false, l20.isLessThanMultipleOf20(100));
    }

    @Test
    public void returns_false_when_input_is_greater_than_two_less_than_multiple_of_20() {
        Less20 l20 = new Less20();
        Assert.assertEquals(false, l20.isLessThanMultipleOf20(17));
    }
}

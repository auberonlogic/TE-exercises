package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class StringBitsTest {

    @Test
    public void returns_empty_String_when_input_is_null() {
        StringBits sb = new StringBits();
        String input = null;
        Assert.assertEquals("", sb.getBits(input));
    }

    @Test
    public void returns_correct_String_when_input_is_length_1() {
        StringBits sb = new StringBits();
        String input = "A";
        Assert.assertEquals("A", sb.getBits(input));
    }

    @Test
    public void returns_correct_String_when_input_length_greater_than_1() {
        StringBits sb = new StringBits();
        String input = "Alfalfa";
        Assert.assertEquals("Afla", sb.getBits(input));
    }

}

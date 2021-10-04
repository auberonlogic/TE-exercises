package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class NonStartTest {

    @Test
    public void returns_String_b_less_first_char_if_String_a_is_empty() {
        NonStart ns = new NonStart();
        Assert.assertEquals("estString", ns.getPartialString("", "TestString"));
    }

    @Test
    public void returns_String_a_less_first_char_if_String_b_is_empty() {
        NonStart ns = new NonStart();
        Assert.assertEquals("ello", ns.getPartialString("Hello", ""));
    }

    @Test
    public void returns_String_a_less_first_char_and_string_b_less_first_char() {
        NonStart ns = new NonStart();
        Assert.assertEquals("elcomeome", ns.getPartialString("Welcome", "home"));
    }

    @Test
    public void returns_empty_String_when_both_a_and_b_are_only_one_character() {
        NonStart ns = new NonStart();
        Assert.assertEquals("", ns.getPartialString("a", "TestString"));
    }

}

package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class FrontTimesTest {

    @Test
    public void checks_that_only_the_first_3_characters_are_being_grabbed_from_the_String_and_appended_to_output_String_correctly() {
        FrontTimes ft = new FrontTimes();
        Assert.assertEquals("ChoChoCho", ft.generateString("Chocolate", 3));
    }

    @Test
    public void checks_if_Strings_less_than_length_3_still_produce_correct_result() {
        FrontTimes ft = new FrontTimes();
        Assert.assertEquals("AbAb", ft.generateString("Ab", 2));
    }

    @Test
    public void returns_empty_String_if_input_String_is_empty() {
        FrontTimes ft = new FrontTimes();
        Assert.assertEquals("", ft.generateString("", 6));
    }

    @Test
    public void returns_empty_String_if_input_int_is_0() {
        FrontTimes ft = new FrontTimes();
        Assert.assertEquals("", ft.generateString("Java", 0));
    }
}

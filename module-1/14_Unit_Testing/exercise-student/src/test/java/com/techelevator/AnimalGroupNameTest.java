package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class AnimalGroupNameTest {

    // What can I test?
        // null input returns unknown
        // input is not case sensitive
        // invalid key returns unknown
        // user enters a String

    @Test
    public void test_getHerd_null_input_returns_unknown() {
        //  ARRANGE
        AnimalGroupName agn = new AnimalGroupName();
        String input = null;

        // ACT
        String output = agn.getHerd(input);

        // ASSERT
        Assert.assertEquals("unknown", output);
    }

    @Test
    public void test_getHerd_any_case() {
        //  ARRANGE
        AnimalGroupName agn = new AnimalGroupName();
        String input = "gIrAfFe";

        // ACT
        String output = agn.getHerd(input);

        // ASSERT
        Assert.assertEquals("Tower", output);
    }

    @Test
    public void test_getHerd_invalid_String_input_returns_unknown() {
        //  ARRANGE
        AnimalGroupName agn = new AnimalGroupName();
        String input = "Sea Horse";

        // ACT
        String output = agn.getHerd(input);

        // ASSERT
        Assert.assertEquals("unknown", output);
    }

}

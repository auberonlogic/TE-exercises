package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class CigarPartyTest {

    // ARRANGE ACT ASSERT
    @Test
    public void returns_true_when_cigars_are_in_range_regardless_of_boolean_input_1() {
        // Arrange
        CigarParty cg = new CigarParty();

        // Assert
        Assert.assertEquals(true, cg.haveParty(50, false));
    }

    @Test
    public void returns_true_when_cigars_are_in_range_regardless_of_boolean_input_2() {
        // Arrange
        CigarParty cg = new CigarParty();

        // Assert
        Assert.assertEquals(true, cg.haveParty(45, true));
    }

    @Test
    public void tests_that_upper_bound_is_inclusive() {
        // Arrange
        CigarParty cg = new CigarParty();

        // Assert
        Assert.assertEquals(true, cg.haveParty(60, false));
    }

    @Test
    public void tests_that_lower_bound_is_inclusive() {
        // Arrange
        CigarParty cg = new CigarParty();

        // Assert
        Assert.assertEquals(true, cg.haveParty(40, false));
    }

    @Test
    public void returns_true_when_cigars_are_larger_than_given_acceptable_range_when_boolean_is_true() {
        // Arrange
        CigarParty cg = new CigarParty();

        // Assert
        Assert.assertEquals(true, cg.haveParty(5000, true));
    }

    @Test
    public void returns_false_when_cigars_are_larger_than_given_acceptable_range_when_boolean_is_false() {
        // Arrange
        CigarParty cg = new CigarParty();

        // Assert
        Assert.assertEquals(false, cg.haveParty(5000, false));
    }

    @Test
    public void returns_false_when_cigars_are_smaller_than_given_acceptable_range_regardless_of_boolean_1() {
        // Arrange
        CigarParty cg = new CigarParty();

        // Assert
        Assert.assertEquals(false, cg.haveParty(10, false));
    }

    @Test
    public void returns_false_when_cigars_are_smaller_than_given_acceptable_range_regardless_of_boolean_2() {
        // Arrange
        CigarParty cg = new CigarParty();

        // Assert
        Assert.assertEquals(false, cg.haveParty(10, true));
    }

}

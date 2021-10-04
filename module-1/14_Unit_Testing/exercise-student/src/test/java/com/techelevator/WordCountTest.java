package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class WordCountTest {

    @Test
    public void please_work() {
        // Arrange
        WordCount wc = new WordCount();
        String[] input = "ba ba black sheep".split(" ");
        String rejoined = String.join(",", input);

        System.out.println("Rejoined: " + rejoined);
        Map<String, Integer> expected = new HashMap<>();
        expected.put("ba", 2);
        expected.put("black", 1);
        expected.put("sheep", 1);

        // Act
        Map<String, Integer> output = wc.getCount(input);

        // Assert
        // expected keys == output keys
        // expected values == output values
        Assert.assertNotNull(output);
        Assert.assertEquals(expected, output);
    }

    @Test
    public void null_input() {
        WordCount wc = new WordCount();
        Map<String, Integer> output = wc.getCount(null);
        Map<String, Integer> expected = new HashMap<>();

        Assert.assertNotNull(output);
        Assert.assertEquals(expected, output);
    }

    @Test
    public void empty_array_input() {
        WordCount wc = new WordCount();
        String[] input = new String[0];
        Map<String, Integer> expected = new HashMap<>();

        Map<String, Integer> output = wc.getCount(input);

        Assert.assertNotNull(output);
        Assert.assertEquals(expected, output);
    }

    @Test
    public void input_array_with_one_element() {
        WordCount wc = new WordCount();
        String[] input = new String[] {"Hello"};
        Map<String, Integer> expected = new HashMap<>();
        expected.put("Hello", 1);

        Map<String, Integer> output = wc.getCount(input);

        Assert.assertNotNull(output);
        Assert.assertEquals(expected, output);
    }
}

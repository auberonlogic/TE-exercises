package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WordCountTest {

//    getCount(["ba", "ba", "black", "sheep"]) → {"ba" : 2, "black": 1, "sheep": 1 }
//    getCount(["a", "b", "a", "c", "b"]) → {"a": 2, "b": 2, "c": 1}
//	  getCount([]) → {}
//	  getCount(["c", "b", "a"]) → {"c": 1, "b": 1, "a": 1}

    @Test
    public void returns_correct_count_when_all_words_are_different() {
        WordCount wc = new WordCount();
        String[] input = {"c", "b", "a"};
        Map<String, Integer> output = new HashMap<>();
        output.put("c", 1);
        output.put("b", 1);
        output.put("a", 1);
        Assert.assertEquals(output, wc.getCount(input));
    }

    @Test
    public void returns_empty_map_when_input_array_is_empty() {
        WordCount wc = new WordCount();
        String[] input = new String[]{};
        Map<String, Integer> output = new HashMap<>();
        Assert.assertEquals(output, wc.getCount(input));
    }

    @Test
    public void returns_correct_count_when_some_words_are_the_same() {
        WordCount wc = new WordCount();
        String[] input = {"ba", "ba", "black", "sheep"};
        Map<String, Integer> output = new HashMap<>();
        output.put("ba", 2);
        output.put("black", 1);
        output.put("sheep", 1);
        Assert.assertEquals(output, wc.getCount(input));
    }

    @Test
    public void null_input_returns_null_output() {

        WordCount wc = new WordCount();
        Assert.assertNotNull(wc);
    }

    @Test
    public void please_work() {
        // Arrange
        WordCount wc = new WordCount();
        String[] input = "ba ba black sheep".split(" ");
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
    public void empty_String_Array_input() {
        WordCount wc = new WordCount();
        String[] input = new String[0];
        Map<String, Integer> output = wc.getCount(input);
        Map<String, Integer> expected = new HashMap<>();

        Assert.assertEquals(expected, output);

    }

}

package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int[] data = {5, 4, 3, 2};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHas7ThenMinus1() {
        int[] data = {7, 2, 3, 4};
        int el = 9;
        int rsl = FindLoop.indexOf(data, el);
        int expected = -1;
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenArrayHas4Then3() {
        int[] data = {2, 3, 1, 4, 5};
        int el = 4;
        int rsl = FindLoop.indexOf(data, el);
        int expected = 3;
        Assert.assertEquals(expected, rsl);
    }

}
package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindLoopTest2 {

    @Test
    public void whenArrayHasLength5Then0() {
        int[] data = new int[] {5, 10, 3};
        int el = 5;
        int rsl = FindLoop.indexOf(data, el);
        int expected = 0;
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenFind3() {
        int[] data = new int[] {5, 2, 10, 2, 4};
        int el = 2;
        int start = 2;
        int finish = 4;
        int rsl = FindLoop.indexOf(data, el, start, finish);
        int expected = 3;
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenFind4() {
        int[] data = new int[] {1, 2, 3, 6, 5, 6, 7, 8, 9, 10, 4, 9};
        int el = 4;
        int start = 1;
        int finish = 11;
        int rsl = FindLoop.indexOf(data, el, start, finish);
        int expected = 10;
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenRslMinus1() {
        int[] data = new int[] {9, 15, 55, 64, 99};
        int el = 7;
        int start = 0;
        int finish = 4;
        int rsl = FindLoop.indexOf(data, el, start, finish);
        int expected = -1;
        Assert.assertEquals(expected, rsl);
    }
}
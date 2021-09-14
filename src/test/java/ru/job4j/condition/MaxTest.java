package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
       int left = 1;
       int right = 2;
       int result = Max.max(left, right);
       int expected = 2;
       Assert.assertEquals(expected, result);
    }

    @Test
    public void whenLeft6Right4Then6() {
       int left = 6;
       int right = 4;
       int expected = 6;
       int out = Max.max(left, right);
       Assert.assertEquals(expected, out);
    }

    @Test
    public void whenLeft10Right7Then7() {
        int left = 10;
        int right = 7;
        int expected = 10;
        int out = Max.max(left, right);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenLeft6Right6Then6() {
        int left = 6;
        int right = 6;
        int expected = 6;
        int out = Max.max(left, right);
        Assert.assertEquals(expected, out);
    }
}
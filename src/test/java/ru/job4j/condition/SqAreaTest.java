package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void whenp6k2s2then2() {
        double p = 6;
        double k = 2;
        double expected = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void whenp9k5then281() {
        double p = 9;
        double k = 5;
        double expected = 2.81;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void whenp2k2then022() {
        double p = 2;
        double k = 2;
        double expected = 0.22;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}
package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void whenx10y10x22y20then2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double expected = 2;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void whenx12y11x20y20then223() {
        int x1 = 2;
        int y1 = 1;
        int x2 = 0;
        int y2 = 0;
        double expected = 2.23;
        double out = Point.distance(x1, y1,x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void whenx15y13x22y21then360() {
        int x1 = 5;
        int y1 = 3;
        int x2 = 2;
        int y2 = 1;
        double expected = 3.60;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void whenx11y11x21y21then0() {
        int x1 = 1;
        int y1 = 1;
        int x2 = 1;
        int y2 = 1;
        double expected = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}
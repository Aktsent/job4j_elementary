package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CounterTest {

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int expected = 30;
        int result = Counter.sumByEven(start, finish);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumEvenNumbers() {
        int start = 2;
        int finish = 14;
        int expected = 56;
        int result = Counter.sumByEven(start, finish);
        Assert.assertEquals(expected, result);
    }
}
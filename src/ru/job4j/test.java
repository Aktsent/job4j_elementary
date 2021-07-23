package ru.job4j;

public class test {

    public static void plus(int first, int second) {
        int result = first + second;
        System.out.println(result);
        test.plus(1, 2);
        test.plus(10, 11);
    }

}
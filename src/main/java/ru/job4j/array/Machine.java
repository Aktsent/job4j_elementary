package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int change = money - price;
        for (int i = 0; i < coins.length; i++) {
            while (change >= 10) {
                change = change - 10;
                rsl = coins;
                size++;
            }
            while (change >= 5) {
                change = change - 5;
                rsl = coins;
                size++;
            }
            while (change >= 2) {
                change = change - 2;
                rsl = coins;
                size++;
            }
            while (change >= 1) {
                change = change - 1;
                rsl = coins;
                size++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}

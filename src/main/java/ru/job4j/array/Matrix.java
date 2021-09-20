package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] array = {{1}, {2}, {3}, {4}, {5}, {6}, {7}, {8}, {9}};
        for (int i = size; i < array.length; i++) {
            for (int j = size; j < array[i].length; j++) {
                array[i][j] = i * j;
            }
        }
        return array;
    }
}

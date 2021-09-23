package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == null && array[j] != null) {
                    Defragment.swap(array, i, j);
                }
            }
        }
        return array;
    }

    public static String[] swap(String[] array, int point, int notnull) {
        String temp = array[point];
        array[point] = array[notnull];
        array[notnull] = temp;
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int i = 0; i < compressed.length; i++) {
            System.out.print(compressed[i] + " ");
        }
    }
}

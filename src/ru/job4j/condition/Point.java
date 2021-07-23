package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = x2-x1;
        double rsl2 = y2-y1;
        rsl = Math.pow(rsl, 2);
        rsl2 = Math.pow(rsl2, 2);
        double rsl3 = rsl + rsl2;
        rsl3 = Math.sqrt(rsl3);
        return rsl3;
    }
    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
    }
}

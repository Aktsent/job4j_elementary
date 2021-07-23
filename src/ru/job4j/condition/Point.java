package ru.job4j.condition;

public class Point {
    public static double distance1(int x1, int x2,) {
        double rsl1 = x2-x1;
        rsl1 = Math.pow(rsl1, 2);
        return rsl1;
    }
    public static double distance2(int y1, int y2){
        double rsl2 = y2-y1;
        rsl2 = Math.pow(rsl2, 2);
        return rsl2;
    }
    public static void main(String[] args) {
        Point.distance1(0, 2);
        Point.distance2(0, 0);
        double result = Math.sqrt(rsl1+rsl2);
        System.out.println("result (0, 0) to (2, 0) " + result);
    }
}

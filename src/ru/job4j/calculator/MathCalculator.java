package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
        + multiply(first, second);
    }
    public static double divAnddif(double first, double second) {
        return div(first, second) + dif(first, second);
    }
    public static double allsum(double first, double second) {
        return sum(first, second) + multiply(first, second) + div(first, second) + dif(first, second);
    }
    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + divAnddif(36, 6));
        System.out.println("Результат расчета равен: " + allsum(10, 20));
    }
}

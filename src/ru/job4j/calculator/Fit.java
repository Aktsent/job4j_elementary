package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short height){
        return (height - 100) * 1.15;
    }
    public static double womanWeight(short height){
        return (height - 110) * 1.15;
    }
    public static void main(String [] args){
        double man = Fit.manWeight( 187);
        double woman = Fit.womanWeight(170);
        System.out.println("Man 187 is " + man);
        System.out.println("Woman 170 is " + woman);
    }
}

package ru.kolomytsev.test;

import java.util.Scanner;

public class Flor2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        switch (sc.next().toUpperCase()) {
            case "TRIANGLE":
                double a = sc.nextDouble();
                double b = sc.nextDouble();
                double c = sc.nextDouble();
                double p = (a + b + c) / 2;
                double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
                System.out.printf("%.1f", s);
                break;
            case "RECTANGLE":
                double as = sc.nextDouble();
                double bs = sc.nextDouble();
                double ss = (as * bs);
                System.out.printf("%.1f", ss);
                break;
            case "CIRCLE":
                double r = sc.nextDouble();
                double pi = 3.14;
                double si = pi * r * r;
                System.out.printf("%.1f", si);
                break;
        }
    }
}

package ru.kolomytsev.test;

import java.util.Scanner;

public class Test13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        switch (sc.next()) {
            case "triangle" -> {
                double At = sc.nextDouble(),
                        Bt = sc.nextDouble(),
                        Ct = sc.nextDouble(),
                        p = ((At + Bt + Ct) / 2),
                        S = Math.sqrt(p * (p - At) * (p - Bt) * (p - Ct));
                System.out.println(S);
            }
            case "rectangle" -> {
                double Ar = sc.nextDouble(),
                        Br = sc.nextDouble();
                System.out.println(Ar * Br);
            }
            case "circle" -> {
                double Range = sc.nextDouble();
                System.out.println(3.14 * Range * Range);
            }
            default -> {
            }
        }

    }
}

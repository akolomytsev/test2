package ru.kolomytsev.test;

import java.util.Scanner;

public class Snail2 {
    public static void main(String[] args) {
        int a = userInput("Ведите H:");
        int b = userInput("Ведите A:");
        int c = userInput("Ведите B:");
        //...

    }

    private static int userInput(String message) {
        Scanner sc = new Scanner(System.in);
        int i;
        while (true) {
            System.out.print(message);
            try {
                i = Integer.parseInt(sc.next());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Неверный ввод!");
            }
        }
        return i;
    }
}

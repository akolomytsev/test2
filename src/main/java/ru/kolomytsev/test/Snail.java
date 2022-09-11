package ru.kolomytsev.test;

import java.util.Scanner;

public class Snail {
    public static void main(String[] args) {
        byte H;
        byte A;
        byte B;
        byte count = 1;
        Scanner scanner = new Scanner(System.in);

        while (!scanner.hasNextByte() ||
                (H = scanner.nextByte())>100 ||
                H <= 0){
            System.out.println("не то что надо");
            scanner.next();
        }

        while (!scanner.hasNextByte() ||
                (A = scanner.nextByte())>H ||
                A <= 0){
            System.out.println("не то что надо");
            scanner.next();
        }

        while (!scanner.hasNextByte() ||
                (B = scanner.nextByte())>=A ||
                B <= 0){
            System.out.println("не то что надо");
            scanner.next();
        }
        scanner.close();

        for (int i = 0; true; i++){
            if ((H-A)<=0){
                break;
            }
            H= (byte) (H-A+B);
            count++;
        }
        System.out.println(count);
    }
}

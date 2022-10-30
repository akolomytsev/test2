package ru.kolomytsev.test;

import java.util.Scanner;
//Улитка ползет вверх по вертикальному столбу высотой H футов. За день он поднимается на A футов,
// а за ночь опускается на B футов. В какой день улитка достигнет вершины шеста?
//Формат входных данных
//На вход программа получает неотрицательные целые числа H, A, B, где H > B и A > B. Каждое целое число не превосходит 100.
public class Snail { // долгий вариант, много ненужных проверок
    public static void main(String[] args) {
        byte H;
        byte A;
        byte B;
        byte count = 1;
        Scanner scanner = new Scanner(System.in);

        while (!scanner.hasNextByte() || (H = scanner.nextByte())>100 || H <= 0){
            System.out.println("не то что надо");
        }

        while (!scanner.hasNextByte() ||
                (A = scanner.nextByte())>=H ||
                A <= 0){
            System.out.println("не то что надо");
        }

        while (!scanner.hasNextByte() ||
                (B = scanner.nextByte())>=A ||
                B <= 0){
            System.out.println("не то что надо");
        }
        scanner.close();
        long m = System.currentTimeMillis();
        for (int i = 0; true; i++){
            if ((H-A)<=0){
                break;
            }
            H= (byte) (H-A+B);
            count++;
        }

        System.out.println(count + "\n");
        System.out.println(System.currentTimeMillis()- m);

    }
}

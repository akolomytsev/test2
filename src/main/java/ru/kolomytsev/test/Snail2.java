package ru.kolomytsev.test;

import java.util.Scanner;
//Улитка ползет вверх по вертикальному столбу высотой H футов. За день он поднимается на A футов,
// а за ночь опускается на B футов. В какой день улитка достигнет вершины шеста?
//Формат входных данных
//На вход программа получает неотрицательные целые числа H, A, B, где H > B и A > B. Каждое целое число не превосходит 100.

public class Snail2 {
    public static void main(String[] args) { // быстрый вариант
        int H;
        int A;
        int B;
        Scanner scanner = new Scanner(System.in);

        H = scanner.nextInt();
        A = scanner.nextInt();
        B = scanner.nextInt();

        for (int i = 1; true; i++){
            H= H-A+B;
            if (H<=B){
                System.out.println(i);
                break;
            }
        }
    }
}

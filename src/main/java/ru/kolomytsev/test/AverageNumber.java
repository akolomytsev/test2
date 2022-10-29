package ru.kolomytsev.test;

import java.util.ArrayList;
import java.util.Scanner;
//Дана последовательность целых чисел, заканчивающаяся цифрой 0. Найдите среднее значение всех элементов этой последовательности.
//Само число 0 не входит в последовательность и служит лишь знаком прекращения.
//
public class AverageNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> subArray2 = new ArrayList<>();
             while (true) {
                 try {
                     int i = Integer.parseInt(scanner.next());
                     if (i !=0){
                         subArray2.add(i);
//                     System.out.print(subArray2);
//                     System.out.println(subArray2.size());
                     } else {
                         int sum = 0;
                         for (int m : subArray2) {
                             sum += m;
                         }
                         System.out.println((double) sum/subArray2.size());
                         break;
                     }
                 }catch (NumberFormatException e){
                     System.out.println("Неверный ввод!");
                 }
             }
        }
}
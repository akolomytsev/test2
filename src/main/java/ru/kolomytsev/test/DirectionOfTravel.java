package ru.kolomytsev.test;

import java.util.Scanner;

//Напишите программу, которая считывает номер направления (1 — вверх, 2 — вниз, 3 — влево, 4 — вправо, 0 — оставаться)
// и выводит текст «вверх» (или «вниз», или «влево»). », или «двигаться вправо», или «не двигаться» в зависимости от введенного числа).
// Если это число, не принадлежащее ни к одному из перечисленных направлений, программа должна выдать: «ошибка!»
//Примечание: выводимый текст должен точно соответствовать образцу! Включая регистр букв и расположение пробелов.
//Пример ввода:
//1
//Пример вывода:
//двигаться вверх
public class DirectionOfTravel {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        //System.out.println("введите направление");
       // try {
            switch (scanner.nextInt()) {
                case 1:
                    System.out.println("move up");
                    break;
                case 2:
                    System.out.println("move down");
                    break;
                case 3:
                    System.out.println("move left");
                    break;
                case 4:
                    System.out.println("move right");
                    break;
                case 0:
                    System.out.println("do not move");
                    break;
                default:
                    System.out.println("error!");
                    break;
            }
//        } catch (NumberFormatException e) {
//            System.out.println("error!");
//        }
    }
    private static int userInput() {
        int i;
        label:
        while (true) {
            try {
                i = Integer.parseInt(scanner.nextLine());
                    switch (i) {
                        case 1:
                            break label;
                        case 2:
                            break label;
                        case 3:
                            break label;
                        case 4:
                            break label;
                        case 0:
                            break label;
                        default:
                            System.out.println("error!");
                            break;
                    }
                 }catch (NumberFormatException e) {
                System.out.println("error!");
                }
             }
        return i;
    }
}

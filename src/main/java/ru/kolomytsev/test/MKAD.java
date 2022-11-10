package ru.kolomytsev.test;

//МКАД
//Протяженность МКАД (МКАД) составляет 109 километров.
// Байкер Вася стартует с нулевого километра МКАД и едет со скоростью V километров в час.
// На какой отметке он остановится через T часов?
//Формат входных данных
//Программа получает на вход целые числа V и T.
// Если V > 0, то Вася движется в положительном направлении по МКАД,
// если значение V < 0 – в отрицательном. 0 ≤ T ≤ 1000, -1000 ≤ V ≤ 1000.
//Формат выходных данных
//Программа должна вывести целое число от 0 до 108 — отметка, на которой Вася остановится.
//Пример ввода 1:
//60
//2
//Пример вывода 1:
//11
//Пример ввода 2:
//-1
//1
//Пример вывода 2:
//108


import java.util.Scanner;
public class MKAD {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        int V = userInput();
        int T = userInput2();
        int s = ((V * T) % 109 + 109) % 109;
//        if (V >= 0 && V <= 1000) {
//            int x = (V * T) % 109;
//            System.out.println(x);
//        } else {
//            int x = 109 + (V * T) % 109;
           System.out.println(s);
//        }
    }

//        Scanner scanner = new Scanner(System.in);
////        int a = scanner.nextInt();int x = userInput();
//        int V;
//        int T;
//        while (true) {
//            try {
//                V = Integer.parseInt(scanner.nextLine());
//                if (V <-1000 || V > 1000){
//                    break;
//                }
//                    break;
//            } catch (NumberFormatException e) {
//                System.out.println("Неверный ввод!");
//            }
//        }
//        while (true) {
//            try {
//                T = Integer.parseInt(scanner.nextLine());
//                if (T <= 0 || T > 1000)
//                {
//                    break;
//                }
//                break;
//            } catch (NumberFormatException e) {
//                System.out.println("Неверный ввод!");
//            }
//        }
//        scanner.close();
////        if (V >= 0 && V < 1000){
//            if (V >= 0){
//            int x = (V*T) % 109;
//            System.out.println(x);
////        }else if (V < 0 && V > -1000){
//            }else{
//            int x = 109 + (V*T) % 109;
//            System.out.println(x);
//        }
        public static int userInput () {
            int i;
            while (true) {
                try {
                    i = Integer.parseInt(scanner.nextLine());
                    if (i >= -1000 && i <= 1000){
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Неверный ввод!");
                }
            }
            return i;
        }
    public static int userInput2 () {
        int i;
        while (true) {
            try {
                i = Integer.parseInt(scanner.nextLine());
                if (i >=0 && i <= 1000){
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Неверный ввод!");
            }
        }
        return i;
    }

}

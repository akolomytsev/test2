package ru.kolomytsev.test;

import java.util.Scanner;

//Площадь помещения
//Жители страны Малевия часто экспериментируют с планировкой своих комнат. Комнаты могут быть треугольными, прямоугольными и круглыми.
// Для быстрого расчета площади необходимо написать программу, которая получает на вход тип формы помещения и соответствующие параметры - программа
// должна выводить площадь полученного помещения.
//Значение 3,14 используется вместо числа π в Малевии.
//Формат ввода, используемый малевианцами:
//треугольник √p*(p-a)*(p-b)*(p-c)   где p = (a+b+c)/2
//а
//б
//с
//где a, b и c — длины сторон треугольника.
//прямоугольник a*b
//а
//б
//где a и b — длины сторон прямоугольника.
//круг π*r^2
//r
//где r — радиус окружности.
//Пример ввода 1:
//прямоугольник
//4
//10
//Пример вывода 1:
//40,0
//Пример ввода 2:
//круг
//5
//Пример вывода 2:
//78,5
//Пример ввода 3:
//треугольник
//3
//4
//5
//Пример вывода 3:
//6,0
public class FloorSpaceOfTheRoom {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите тип фигуры:");

        try {
            switch (userInput2()) {
                case "ТРЕУГОЛЬНИК":
                    double a = userInput();
                    double b = userInput();
                    double c = userInput();
                    double p = (a + b + c) / 2;
                    double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
                    System.out.println(s);
                    break;
                case "ПРЯМОУГОЛЬНИК":
                    double as = userInput();
                    double bs = userInput();
                    double ss = (as * bs);
                    System.out.println(ss);
                    break;
                case "КРУГ":
                    double r = userInput();
                    double pi = 3.14;
                    double si = pi * r * r;
                    System.out.println(si);
                    break;
            }
        } catch (NumberFormatException e) {
            System.out.println("Неверный ввод!");
        }
    }
    private static double userInput() {
        //Scanner sc = new Scanner(System.in);
        double i;
        while (true) {
            try {
                i = Double.parseDouble(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Неверный ввод!");
            }
        }
        return i;
    }

    private static String userInput2() {
        //Scanner sc = new Scanner(System.in);
        String z;
        label:
        while (true) {
            try {
                z = sc.nextLine().toUpperCase();
                switch (z) {
                    case "КРУГ":
                        break label;
                    case "ТРЕУГОЛЬНИК":
                        break label;
                    case "ПРЯМОУГОЛЬНИК":
                        break label;
                    default:
                        System.out.println("Неверный ввод!");
                        break;
                }

            } catch (NumberFormatException e) {
                System.out.println("Неверный ввод!");
            }
        }
        return z;
    }


}

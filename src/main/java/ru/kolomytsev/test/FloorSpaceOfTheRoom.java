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
    public static void main(String[] args) {
        System.out.println("Введите тип фигуры:");
        try {
            switch (userInput2()) {
                        case "ТРЕУГОЛЬНИК" -> {
                            double a = userInput();
                            double b = userInput();
                            double c = userInput();
                            double p = (a + b + c) / 2;
                            double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
                            String result = String.format("%.1f", s);
                            System.out.println(result);
                        }
                        case "ПРЯМОУГОЛЬНИК" -> {
                            double as = userInput();
                            double bs = userInput();
                            double ss = (as * bs);
                            String result = String.format("%.1f", ss);
                            System.out.println(result);
                        }
                        case "КРУГ" -> {
                            double r = userInput();
                            double pi = 3.14;
                            float si = (float) (pi * r * r);
                            String result = String.format("%.1f", si);
                            System.out.println(result);
                        }
                    }
            } catch (NumberFormatException e) {
                System.out.println("Неверный ввод!");
            }
    }
//    private static void triangle() {
//        double a= userInput();
//        double b= userInput();
//        double c= userInput();
//        double p = (a + b + c)/2;
//        float s = (float) Math.sqrt(p*(p-a)*(p-b)*(p-c));
//        String result = String.format("%.1f",s);
//        System.out.println(result);
//    }
//    private static void rectangle() {
//        double a= userInput();
//        double b= userInput();
//        float s = (float) (a * b);
//        String result = String.format("%.1f",s);
//        System.out.println(result);
//    }
//    private static void circle() {
//        double r = userInput();
//        double p = 3.14;
//        float s = (float) (p * r * r);
//        String result = String.format("%.1f",s);
//        System.out.println(result);
//    }

    private static double userInput() {
        Scanner sc = new Scanner(System.in);
        double i;
        while (true) {
            try {
                i = Double.parseDouble(sc.next());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Неверный ввод!");
            }
        }
        return i;
    }

    private static String userInput2() {
        Scanner sc = new Scanner(System.in);
        String z;
        while (true) {
            try {
                z = sc.next().toUpperCase();
                if (z.equals("КРУГ")){
                    break;
                }else {
                    System.out.println("Неверный ввод!");
                }

            } catch (NumberFormatException e) {
                System.out.println("Неверный ввод!");
            }
        }
        return z;
    }


}

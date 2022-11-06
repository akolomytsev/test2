package ru.kolomytsev.test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

//Цифровые часы
//Цифровые часы отображают время в формате ч:мм:сс (от 0:00:00 до 23:59:59),
// т.е. сначала идет количество часов, затем идет двузначное количество минут,
// затем двузначное число секунд. При необходимости количество минут и секунд дополняется нулями до двузначного числа.
//С начала дня прошло N секунд. Выведите то, что будут отображать часы.
//Формат входных данных
//Учитывая натуральное число N на входе, не превосходящее 10^7 (10000000).
//Пример ввода 1:
//3602
//Пример вывода 1:
//1:00:02
//Пример ввода 2:
//129700
//Пример вывода 2:
//12:01:40
public class DigitalWatches {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите количество секунд");
        int a = userInput();
        while (a > 0 || a <= 10000000){
            SimpleDateFormat formater = new SimpleDateFormat("H:mm:ss");
            //formater.setTimeZone(TimeZone.getTimeZone("GMT"));
            Date date = new Date(userInput()* 1000L);
            System.out.println(formater.format(date));
            break;
        }

    }
    private static int userInput() {
        int i;
        while (true) {
            try {
                //String input = scanner.nextLine();
                i = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Неверный ввод!");
            }
        }
        return i;
    }
}

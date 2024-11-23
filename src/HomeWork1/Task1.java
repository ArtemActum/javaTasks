package HomeWork1;

import java.util.Scanner;

public class Task1 {

    // Напишите программу, которая принимает два числа с консоли, складывает их и выводит разность.
    public static void numbers(Scanner scanner) {

        System.out.println("Введите первое число: ");

        int num1 = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int num2 = scanner.nextInt();

        System.out.println("Сумма:" + (num1 + num2));
        System.out.println("Разность:" + (num1 - num2));
    }

//    Напишите программу, которая вычисляет площадь прямоугольника, используя введённые с консоли ширину и длину.

    public static void areaRectangle(Scanner scanner) {
        System.out.println("Введите Ширину: ");
        double width = scanner.nextDouble();
        System.out.println("Введите Длину: ");
        double length = scanner.nextDouble();

        System.out.println("Площадь: " + (width * length));
    }

//    Задача 3: Операции с остатком от деления
//    Запросите у пользователя два числа и выведите результат их деления и остаток от деления.

    public static void divisionRemainder(Scanner scanner) {
        System.out.println("Введите первое число: ");
        int num1 = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int num2 = scanner.nextInt();

        System.out.println("Результат деления: " + (num1 / num2));
        System.out.println("Остаток: " + (num1 % num2));
    }

//    Задача 4: Перевод градусов Цельсия в Фаренгейты
//    Реализуйте программу, которая преобразует температуру из Цельсия в Фаренгейты:
//    Формула: F = C * 9/5 + 32.

    public static void fromCelsiumToFahrenheit(Scanner scanner) {
        System.out.println("Введите температуру в Цельсиях: ");
        double Celsium = scanner.nextDouble();
        System.out.println("Температура в Фаренгейтах: " + (Celsium * 9 / 5 + 32));
    }


//    Задача 5: Обмен значениями переменных
//    Поменяйте значения двух переменных местами без использования третьей переменной.
    // a = a + b;
    //        b = a - b;
    //        a = a - b;

    public static void changeValuesOfVariables(Scanner scanner) {
        System.out.println("Введите первое число:");
        int a = scanner.nextInt();
        System.out.println("Введите второе число:");
        int b = scanner.nextInt();
        System.out.println("До обмена: a = " + a + ",b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("После обмена: a = " + a + ",b = " + b);
    }

//    Задача 1: Проверка чётности числа
//    Напишите программу, которая проверяет, является ли число чётным или нечётным.

    public static void checkThatNumberEvenOrOdd(Scanner scanner) {
        System.out.println("Введите первое число:");
        int a = scanner.nextInt();
        switch (a % 2) {
            case 0:
                System.out.println("Четное");
                break;
            case 1:
                System.out.println("Нечетное");
                break;
            default:
                System.out.println("Ошибка");

        }
    }

//    Задача 1: Вывод чисел от 1 до 10
//    Напишите программу, которая выводит все числа от 1 до 10.

    public static void outputNumbers() {

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    //    Задача 1: Таблица умножения
//    Выведите таблицу умножения от 1 до 10 в формате
    public static void nestedLoops() {

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i +"x" + j + " = " +(i*j));
            }
        }
    }

}


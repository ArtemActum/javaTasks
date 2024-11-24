import java.util.Scanner;

public class HW1 {
    //    Задача 1: Сложение и вычитание чисел
    // Напишите программу, которая принимает два числа с консоли, складывает их и выводит разность.

    public static void numbers(Scanner scanner) {

        System.out.println("Введите первое число: ");

        int num1 = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int num2 = scanner.nextInt();

        System.out.println("Сумма:" + (num1 + num2));
        System.out.println("Разность:" + (num1 - num2));
    }

//    Задача 2: Площадь прямоугольника
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

    //    Switch
    public static void checkThatNumberEvenOrOddSwitch(Scanner scanner) {
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

    //if/else

    public static void checkThatNumberEvenOrOdd(Scanner scanner) {
        System.out.println("Введите первое число:");
        int a = scanner.nextInt();
        if (a % 2 == 0) {
            System.out.println("Четное");
        } else {
            System.out.println("Нечетное");
        }
    }


//    Задача 2: Калькулятор с использованием switch
//    Реализуйте простой калькулятор, который выполняет операции +, -, *, /, используя switch.

    public static void calculatorSwitch(Scanner scanner) {
        System.out.println("Введите первое число:");
        double a = scanner.nextDouble();
        System.out.print("Введите операцию (+, -, *, /): ");
        char operation = scanner.next().charAt(0);
        System.out.println("Введите второе число:");
        double b = scanner.nextDouble();


        double result;

        switch (operation) {
            case '+':
                result = a + b;
                System.out.println("Результат: " + result);
                break;
            case '-':
                result = a - b;
                System.out.println("Результат: " + result);
                break;
            case '/':
                if (b != 0) {
                    result = a / b;
                    System.out.println("Результат: " + result);
                } else {
                    System.out.println("Ошибка: деление на ноль!");
                }
                break;
            case '*':
                result = a * b;
                System.out.println("Результат: " + result);
                break;
            default:
                System.out.println("Ошибка");

        }
    }

//    Задача 3:  Определение времени года
//    Пользователь вводит номер месяца (1-12). Выведите название соответствующего времени года, используя switch.

    public static void timeOfTheYear(Scanner scanner) {
        System.out.println("Введите номер месяца (1-12): ");
        int month = scanner.nextInt();
        String season;
        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "Зима";
                break;
            case 3:
            case 4:
            case 5:
                season = "Весна";
                break;
            case 6:
            case 7:
            case 8:
                season = "Лето";
                break;
            case 9:
            case 10:
            case 11:
                season = "Осень";
                break;
            default:
                season = "Неверный номер месяца! Введите число от 1 до 12.";

        }

        System.out.println("Время года: " + season);
    }

//    Задача 4: Проверка возраста
//    Напишите программу, которая определяет категорию человека по возрасту:
//      0-12: Ребёнок
//      13-17: Подросток
//      18-64: Взрослый
//      65+: Пенсионер.
//      Используйте if-else.

    public static void checkAge(Scanner scanner) {
        System.out.print("Введите возраст: ");
        int age = scanner.nextInt();

        if (age >= 0 && age <= 12) {
            System.out.println("Ребёнок");
        } else if (age >= 13 && age <= 17) {
            System.out.println("Подросток");
        } else if (age >= 18 && age <= 64) {
            System.out.println("Взрослый");
        } else if (age >= 65) {
            System.out.println("Пенсионер");
        } else {
            System.out.println("Ошибка: Неверный возраст");
        }

    }

//    Задача 5: Проверка делимости
//    Напишите программу, которая проверяет, делится ли число на 3 и 5 одновременно.

    public static void checkDivisibility(Scanner scanner) {
        System.out.print("Введите число: ");
        int num = scanner.nextInt();

        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("Результат: Делится на 3 и 5");
        } else {
            System.out.println("Число не делится на 3 и 5 одновременно.");
        }

    }

//    Задача 1: Вывод чисел от 1 до 10
//    Напишите программу, которая выводит все числа от 1 до 10.

    public static void outputNumbers() {

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    //    Задача 2: Сумма чисел от 1 до N
//    Пользователь вводит число N. Вычислите сумму всех чисел от 1 до N.
    public static void sumOfNNumbers(Scanner scanner) {

        System.out.print("Введите число N: ");
        int N = scanner.nextInt();

        int sum = N * (N + 1) / 2;

        System.out.println("Сумма чисел от 1 до " + N + " равна: " + sum);
    }

    //    Задача 3: Таблица умножения для числа
//    Пользователь вводит число. Выведите таблицу умножения для этого числа от 1 до 10.
    public static void multiplicationTable(Scanner scanner) {

        System.out.print("Введите число: ");
        int num = scanner.nextInt();
        System.out.println("Таблица умножения для числа " + num + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }

//    Задача 4: Факториал числа
//    Напишите программу, которая вычисляет факториал числа N (N! = 1 * 2 * ... * N).

    public static void factorial(Scanner scanner) {

        System.out.print("Введите число: ");
        int num = scanner.nextInt();
        if (num < 0) {
            System.out.println("Ошибка");
        } else {
            int factorial = 1;

            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }

            System.out.println("Факториал числа " + num + " равен: " + factorial);
        }
    }

//    Задача 5: Чётные числа до N
//    Пользователь вводит число N. Выведите все чётные числа от 1 до N.

    public static void getEvenNumbersUntilN(Scanner scanner) {

        System.out.print("Введите число N: ");
        int N = scanner.nextInt();
        System.out.println("Чётные числа от 1 до " + N + ":");
        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " ");
            }
        }
    }

    //    Задача 1: Таблица умножения
//    Выведите таблицу умножения от 1 до 10 в формате
    public static void nestedLoops() {

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + "x" + j + " = " + (i * j));
            }
        }
    }

    //    Задача 2: Прямоугольник из звёздочек
//    Напишите программу, которая выводит прямоугольник из звёздочек размером M x N (пользователь вводит размеры).
    public static void rectangleOfStars(Scanner scanner) {
        System.out.print("Введите число M: ");
        int M = scanner.nextInt();
        System.out.print("Введите число N: ");
        int N = scanner.nextInt();

        for (int i = 1; i < M; i++) {
            for (int j = 1; j < N; j++) {
                System.out.println("*");
            }
            System.out.println("\n");
        }

    }

    //    Задача 3: Пирамида из звёздочек
//    Реализуйте программу, которая выводит пирамиду из звёздочек высотой N.
    public static void pyramidOfStars(Scanner scanner) {
        System.out.print("Введите число N: ");
        int N = scanner.nextInt();

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}






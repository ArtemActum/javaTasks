import Task5_OOP.Circle;
import Task5_OOP.Rectangle;
import Task5_OOP.Shape;

import java.awt.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        HW1.numbers(scanner);
//        HW1.areaRectangle(scanner);
//        HW1.divisionRemainder(scanner);
//        HW1.fromCelsiumToFahrenheit(scanner);
//        HW1.changeValuesOfVariables(scanner);
//        HW1.checkThatNumberEvenOrOddSwitch(scanner);
//        HW1.checkThatNumberEvenOrOdd(scanner);
//        HW1.calculatorSwitch(scanner);
//        HW1.timeOfTheYear(scanner);
//                HW1.checkAge(scanner);
//        HW1.checkDivisibility(scanner);
//        HW1.outputNumbers();
//        HW1.sumOfNNumbers(scanner);
//        HW1.multiplicationTable(scanner);
//        HW1.factorial(scanner);
//        HW1.getEvenNumbersUntilN(scanner);
//        HW1.nestedLoops();
//        HW1.rectangleOfStars(scanner);
//        HW1.pyramidOfStars(scanner);

//        Task1_OOP.Circle circle = new Task1_OOP.Circle(5);
//        System.out.println("Площадь: " + circle.getArea());
//        System.out.println("Длина окружности: " + circle.getCircumference());

//        Task2_OOP.Book book = new Task2_OOP.Book("Мастер и Маргарита", "М. Булгаков", 500);
//        book.printInfo();

//        Task3_OOP.Employee emp = new Task3_OOP.Employee("Иван", 30000);
//        Task3_OOP.Manager mgr = new Task3_OOP.Manager("Ольга", 50000, 10000);
//
//        emp.printInfo(); // Иван: зарплата 30000
//        mgr.printInfo(); // Ольга: зарплата 50000, бонус 10000

//        Task4_OOP.BankAccount account = new Task4_OOP.BankAccount("12345", 1000.0);
//        account.deposit(500);
//        account.withdraw(300);
//        System.out.println("balance: " + account.getBalance());

        Shape rectangle = new Rectangle(4, 5);
        Shape circle = new Circle(3);

        System.out.println("Площадь прямоугольника: " + rectangle.getArea());
        System.out.println("Периметр прямоугольника: " + rectangle.getPerimeter());
        System.out.println("Площадь круга: " + circle.getArea());
        System.out.println("Периметр круга: " + circle.getPerimeter());

    }
}
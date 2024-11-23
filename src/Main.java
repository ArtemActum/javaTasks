import HomeWork1.Task1;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Task1.numbers(scanner);
//        Task1.areaRectangle(scanner);
//        Task1.divisionRemainder(scanner);
//        Task1.fromCelsiumToFahrenheit(scanner);
//        Task1.changeValuesOfVariables(scanner);
//        Task1.checkThatNumberEvenOrOdd(scanner);
//        Task1.outputNumbers();
//        Task1.nestedLoops();
        Circle circle = new Circle(5);
        System.out.println("Площадь: " + circle.getArea());
        System.out.println("Длина окружности: " + circle.getCircumference());

    }
}
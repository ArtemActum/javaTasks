//import HomeWork1.Task5_OOP.Circle;
//import HomeWork1.Task5_OOP.Rectangle;
//import HomeWork1.Task5_OOP.Shape;

import HomeWork4.DiscountCalculator.CustomerType;
import HomeWork4.DiscountCalculator.DiscountStrategyHandler;
import HomeWork4.DiscountCalculator.IDiscountCalculator;
import HomeWork4.Sorter.SortType;
import HomeWork4.Sorter.Sorter;

import java.util.Scanner;

//import static HomeWork3.LinkedListNode.LinkedList.reverseCollection;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        HomeWork1.HW1.numbers(scanner);
//        HomeWork1.HW1.areaRectangle(scanner);
//        HomeWork1.HW1.divisionRemainder(scanner);
//        HomeWork1.HW1.fromCelsiumToFahrenheit(scanner);
//        HomeWork1.HW1.changeValuesOfVariables(scanner);
//        HomeWork1.HW1.checkThatNumberEvenOrOddSwitch(scanner);
//        HomeWork1.HW1.checkThatNumberEvenOrOdd(scanner);
//        HomeWork1.HW1.calculatorSwitch(scanner);
//        HomeWork1.HW1.timeOfTheYear(scanner);
//                HomeWork1.HW1.checkAge(scanner);
//        HomeWork1.HW1.checkDivisibility(scanner);
//        HomeWork1.HW1.outputNumbers();
//        HomeWork1.HW1.sumOfNNumbers(scanner);
//        HomeWork1.HW1.multiplicationTable(scanner);
//        HomeWork1.HW1.factorial(scanner);
//        HomeWork1.HW1.getEvenNumbersUntilN(scanner);
//        HomeWork1.HW1.nestedLoops();
//        HomeWork1.HW1.rectangleOfStars(scanner);
//        HomeWork1.HW1.pyramidOfStars(scanner);

//        HomeWork1.Task1_OOP.Circle circle = new HomeWork1.Task1_OOP.Circle(5);
//        System.out.println("Площадь: " + circle.getArea());
//        System.out.println("Длина окружности: " + circle.getCircumference());

//        HomeWork1.Task2_OOP.Book book = new HomeWork1.Task2_OOP.Book("Мастер и Маргарита", "М. Булгаков", 500);
//        book.printInfo();

//        HomeWork1.Task3_OOP.Employee emp = new HomeWork1.Task3_OOP.Employee("Иван", 30000);
//        HomeWork1.Task3_OOP.Manager mgr = new HomeWork1.Task3_OOP.Manager("Ольга", 50000, 10000);
//
//        emp.printInfo(); // Иван: зарплата 30000
//        mgr.printInfo(); // Ольга: зарплата 50000, бонус 10000

//        HomeWork2.Task2_OOP.BankAccount account = new HomeWork2.Task2_OOP.BankAccount("12345", 1000.0);
//        account.deposit(500);
//        account.withdraw(300);
//        System.out.println("balance: " + account.getBalance());

//        Shape rectangle = new Rectangle(4, 5);
//        Shape circle = new Circle(3);
//
//        System.out.println("Площадь прямоугольника: " + rectangle.getArea());
//        System.out.println("Периметр прямоугольника: " + rectangle.getPerimeter());
//        System.out.println("Площадь круга: " + circle.getArea());
//        System.out.println("Периметр круга: " + circle.getPerimeter());

////        HomeWork2
////        Task1
//        Rectangle_HW2 rectangle = new Rectangle_HW2(4, 5);
//        System.out.println("Площадь прямоугольника: " + rectangle.calculateArea());
//        System.out.println("Периметр прямоугольника: " + rectangle.calculatePerimeter());
//
////        Task2
//        HomeWork2.Task2_OOP.BankAccount account = new HomeWork2.Task2_OOP.BankAccount("12345", 1000.0);
//        account.deposit(500);
//        account.withdraw(300);
//        System.out.println("balance: " + account.getBalance());
//
////        Task3
//        Item item = new Item("Potato", 1200.50, 10);
//
//        System.out.println(item.getInfo());
//
//        item.sell(3);
//        System.out.println(item.getInfo());
//
//        item.restock(5);
//        System.out.println(item.getInfo());
//
////        Task4
//        Person person1 = new Person("Иван", 25, "мужчина", "Барселона");
//        Person person2 = new Person("Иван", 25, "мужчина", "Санкт-Петербург");
//        Person person3 = new Person("Иван", 26, "мужчина", "Рим");
//        Person person4 = new Person("Валентин", 27, "мужчина", "Париж");
//
//        person1.setCity("Прага");
//        person2.setCity("Астана");
//
//        System.out.println("Имя: " + person1.getName());
//        System.out.println("Возраст: " + person1.getAge());
//        System.out.println("Пол: " + person1.getGender());
//        System.out.println("Город: " + person1.getCity());
//
//        System.out.println("Люди равны: " + person1.equals(person2)); // Вывод: true
//        System.out.println("HashCode person1: " + person1.hashCode());
//        System.out.println("HashCode person2: " + person2.hashCode());
//
//        System.out.println("Люди равны: " + person2.equals(person3)); // Вывод: false
//        System.out.println("HashCode person2: " + person2.hashCode());
//        System.out.println("HashCode person3: " + person3.hashCode());
//
//        System.out.println("Люди равны: " + person3.equals(person4)); // Вывод: false
//        System.out.println("HashCode person3: " + person3.hashCode());
//        System.out.println("HashCode person4: " + person4.hashCode());

        //        HW3.LinkedListNode
//        LinkedList list = new LinkedList();
//        list.add(10);
//        list.add(20);
//        list.add(30);
//        list.add(40);
//
//        System.out.println("Исходный список:");
//        list.printList(); // Вывод: 10 -> 20 -> 30 -> 40 -> null
//
//        list.reverse();
//
//        System.out.println("Развёрнутый список:");
//        list.printList(); // Вывод: 40 -> 30 -> 20 -> 10 -> null

//        HW3.Task1
//        int[] numbers = {1, 2, 3, 4, 5};
//        int result = sumArray(numbers);
//        System.out.println("Сумма элементов массива: " + result);

        //        HW3.Task2
//        String input = "Hello, World!";
//        System.out.println("Обратный порядок: " + reverseString(input));

        //        HW3.Task3
//        List<Integer> numbers = new ArrayList<>();
//        numbers.add(1);
//        numbers.add(2);
//        numbers.add(3);
//        numbers.add(4);
//        numbers.add(5);
//        numbers.add(6);
//
//        System.out.println("До удаления: " + numbers);
//        removeEvenNumbers(numbers);
//        System.out.println("После удаления: " + numbers);
//
//        //        HW3.Task4
//        String s1 = "([]{})";
//        String s2 = "([)]";
//
//        System.out.println(s1 + " — " + isValid(s1));
//        System.out.println(s2 + " — " + isValid(s2));
//
//        //        HW3.Task5
//        int[] array = {1, 2, 3, 4, 5};
//        int n = 2;
//
//        int[] rotatedArray = rotateArray(array, n);
//
//
//        System.out.print("Ротация массива: ");
//        for (int num : rotatedArray) {
//            System.out.print(num + " ");
//        }

        IDiscountCalculator discountStrategy = new DiscountStrategyHandler().getStrategy(CustomerType.VIP);
        System.out.println(discountStrategy.calculate(500));

        Sorter sorter = new Sorter();
        int[] array = {5, 3, 8, 6, 2};
        sorter.sort(array, SortType.BUBBLE);
    }
}
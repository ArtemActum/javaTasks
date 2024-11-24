//Задача 1: Создание класса "Круг"
//Создайте класс Circle, который будет описывать круг с помощью следующих свойств и методов:
//Поле radius (радиус круга).
//Конструктор, который принимает радиус круга.
//Метод getArea(), возвращающий площадь круга (π * r^2).
//Метод getCircumference(), возвращающий длину окружности (2 * π * r).

public class Circle {
    public Circle(double radius) {
        this.radius = radius;
    }

    private double radius;

    public double getArea() {
        return Math.PI * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;

    }
}

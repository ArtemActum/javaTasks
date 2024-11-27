//Описание:
//Создайте класс Rectangle, который будет представлять прямоугольник.
//Класс должен содержать:
//Два поля: ширина (width) и высота (height).
//Конструктор для инициализации ширины и высоты.
//Методы:
//calculateArea(): возвращает площадь прямоугольника.
//calculatePerimeter(): возвращает периметр прямоугольника.

package HomeWork2.Task1_OOP;

public class Rectangle_HW2 {
    private double width;
    private double height;

    public Rectangle_HW2(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double calculateArea() {
        return width * height;
    }

    public double calculatePerimeter() {
        return 2 * (width + height);
    }
}

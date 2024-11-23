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

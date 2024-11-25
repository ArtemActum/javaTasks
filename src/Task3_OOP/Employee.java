package Task3_OOP;

public class Employee {

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    private String name;
    private double salary;

    public Employee(String name, double  salary) {
        this.name = name;
        this.salary = salary;
    }

    public void printInfo() {
        System.out.println("Имя: " + name + ", Зарплата: " + salary);
    }
}



package Task3_OOP;

class Manager extends Employee {


    private double bonus;

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    @Override
    public void printInfo() {
        System.out.println(getName() + ": зарплата " + getSalary() + ", бонус " + bonus);
    }

//    public String getName() {
//        return super.name;
//    }
//
//    public double getSalary() {
//        return super.salary;
//    }
}

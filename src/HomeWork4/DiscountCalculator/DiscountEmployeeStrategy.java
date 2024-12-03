package HomeWork4.DiscountCalculator;

public class DiscountEmployeeStrategy implements IDiscountCalculator{
    @Override
    public double calculate(double amount){
        return amount * 0.3;
    }
}

package calculator;

public class DiscountRegularStrategy implements IDiscountCalculator{
    @Override
    public double calculate(double amount){
        return amount * 0.05;
    }
}

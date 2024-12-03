package HomeWork4.DiscountCalculator;

public class DiscountVIPStrategy implements IDiscountCalculator {
        @Override
        public double calculate(double amount){
                return amount * 0.1;
        }
}

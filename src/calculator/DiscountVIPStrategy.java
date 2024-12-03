package calculator;

public abstract class DiscountVIPStrategy implements IDiscountCalculator {
        @Override
        public double calculate(double amount){
                return amount * 0.1;
        }
}

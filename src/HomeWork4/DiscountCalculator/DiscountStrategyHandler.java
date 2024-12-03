package HomeWork4.DiscountCalculator;

public class DiscountStrategyHandler {
    public IDiscountCalculator getStrategy(CustomerType customerType) throws IllegalArgumentException {
        switch (customerType) {
            case VIP -> {
                return new DiscountVIPStrategy();
            }
            case REGULAR -> {
                return new DiscountRegularStrategy();
            }
            case EMPLOYEE -> {
                return new DiscountEmployeeStrategy();
            }
            default -> {
                throw new IllegalArgumentException("Unknown customer type");
            }
        }
    }
}
public class PizzaPriceCalculator {
    public static double calculatePrice(PizzaType type, PizzaSize size) {
        double price = type.getBasePrice();

        switch (size) {
            case SMALL:
                price *= 0.8;
                break;
            case LARGE:
                price *= 1.5;
                break;
            default:
                break;
        }

        return price;
    }
}

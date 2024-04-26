enum PizzaType {
    CHEESE("Cheese", 8.0, "Classic cheese pizza with mozzarella"),
    MEAT("Meat", 10.0, "Hearty pizza loaded with meat toppings"),
    CHICKEN("Chicken", 9.0, "Savory pizza topped with grilled chicken");

    private final String name;
    private final double basePrice;
    private final String description;

    PizzaType(String name, double basePrice, String description) {
        this.name = name;
        this.basePrice = basePrice;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public String getDescription() {
        return description;
    }
}

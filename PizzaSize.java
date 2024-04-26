enum PizzaSize {
    SMALL("Small", 24),
    MEDIUM("Medium", 30),
    LARGE("Large", 34);

    private final String name;
    private final int diameter;

    PizzaSize(String name, int diameter) {
        this.name = name;
        this.diameter = diameter;
    }

    public String getName() {
        return name;
    }

    public int getDiameter() {
        return diameter;
    }
}

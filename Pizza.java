public class Pizza implements IPizza {
    private PizzaType type;
    private PizzaSize size;
    private DoughType doughType;

    public Pizza(PizzaType type, PizzaSize size, DoughType doughType) {
        this.type = type;
        this.size = size;
        this.doughType = doughType;
    }

    @Override
    public String getName() {
        return type.getName() + " Pizza";
    }

    @Override
    public double getPrice() {
        return PizzaPriceCalculator.calculatePrice(type, size);
    }

    @Override
    public String getDescription() {
        return type.getDescription();
    }

    @Override
    public PizzaSize getSize() {
        return size;
    }

    @Override
    public DoughType getDoughType() {
        return doughType;
    }

    @Override
    public void display() {
        System.out.println("Name: " + getName());
        System.out.println("Size: " + size.getName() + " (" + size.getDiameter() + " cm)");
        System.out.println("Dough Type: " + doughType.getName());
        System.out.println("Description: " + getDescription());
        System.out.println("Price: $" + getPrice());
    }
}
public interface IPizza {
    String getName();
    double getPrice();
    String getDescription();
    PizzaSize getSize();
    DoughType getDoughType();
    void display();
}

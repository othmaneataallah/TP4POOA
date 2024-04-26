enum DoughType {
    THIN("Thin", 7),
    NORMAL("Normal", 9),
    THICK("Thick", 11);

    private final String name;
    private final int cookingTime;

    DoughType(String name, int cookingTime) {
        this.name = name;
        this.cookingTime = cookingTime;
    }

    public String getName() {
        return name;
    }

    public int getCookingTime() {
        return cookingTime;
    }
}

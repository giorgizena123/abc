abstract class Toy {
    protected String name;
    protected double additionalCost;


    public Toy(String name, double additionalCost) {
        this.name = name;
        this.additionalCost = additionalCost;
    }


    public abstract double calculatePrice();
}

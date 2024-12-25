class Car extends Toy {
    private double cabinPrice;
    private double wheelPrice;
    private int wheelCount;


    public Car(String name, double cabinPrice, double wheelPrice, int wheelCount, double additionalCost) {
        super(name, additionalCost);
        this.cabinPrice = cabinPrice;
        this.wheelPrice = wheelPrice;
        this.wheelCount = wheelCount;
    }


    @Override
    public double calculatePrice() {
        return cabinPrice + (wheelPrice * wheelCount) + additionalCost;
    }
}

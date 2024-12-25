class Dolly extends Toy {
    private double hairMaterialCost;
    private double clothesPrice;


    public Dolly(String name, double hairMaterialCost, double clothesPrice, double additionalCost) {
        super(name, additionalCost);
        this.hairMaterialCost = hairMaterialCost;
        this.clothesPrice = clothesPrice;
    }


    @Override
    public double calculatePrice() {
        return hairMaterialCost + clothesPrice + additionalCost;
    }
}

class Vehicle implements Drivable, Steerable {

    @Override
    public void startEngine() {
        System.out.println("ძრავი დაიწყო.");
    }

    @Override
    public void stopEngine() {
        System.out.println("ძრავი გამორთულია.");
    }

    @Override
    public void turnLeft() {
        System.out.println("მანქანა მარცხნივ უბრუნდება.");
    }

    @Override
    public void turnRight() {
        System.out.println("მანქანა მარჯვნივ უბრუნდება.");
    }
}

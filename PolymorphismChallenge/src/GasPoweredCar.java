public class GasPoweredCar extends Car {
    private double avgKmPerLitre;
    private int cylinders = 6;

    public GasPoweredCar(String description, int cylinders, double avgKmPerLitre){
        super(description);
        this.cylinders = cylinders;
        this.avgKmPerLitre = avgKmPerLitre;
    }

    public GasPoweredCar(String description){
        super(description);
    }

    @Override
    public void startEngine() {
        System.out.printf("Gas -> All %d cylinders are fired up,  Ready!%n", this.cylinders);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Gas -> Usage exceeds the average: %.2f %n", this.avgKmPerLitre);
    }
}

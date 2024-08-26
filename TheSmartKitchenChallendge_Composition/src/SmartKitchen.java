public class SmartKitchen {
    private CoffeeMaker brewMaster;
    private DishWasher dishWasher;
    private Refrigerator iceBox;

    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }

    public SmartKitchen() {
        brewMaster = new CoffeeMaker();
        dishWasher = new DishWasher();
        iceBox = new Refrigerator();
    }

    public void addWater(){
        this.getBrewMaster().setHasWorkToDo(true);
    }

    public void pourMilk(){
        this.getIceBox().setHasWorkToDo(true);
    }

    public void loadDishWasher(){
        this.getDishWasher().setHasWorkToDo(true);
    }

    public void setKitchenState(boolean refrigerator, boolean coffeeMaker, boolean dishWasher){
        iceBox.setHasWorkToDo(refrigerator);
        iceBox.orderFood();

        brewMaster.setHasWorkToDo(coffeeMaker);
        brewMaster.brewCoffee();

        this.dishWasher.setHasWorkToDo(dishWasher);
        this.dishWasher.doDishes();
    }

    public void doKitchenWork(){
        brewMaster.brewCoffee();
        iceBox.orderFood();
        dishWasher.doDishes();
    }


}

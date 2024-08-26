public class Main {
    public static void main(String[] args) {
        SmartKitchen kitchen = new SmartKitchen();

        kitchen.getDishWasher().setHasWorkToDo(true);
        kitchen.getIceBox().setHasWorkToDo(true);
        kitchen.getBrewMaster().setHasWorkToDo(true);

        kitchen.getIceBox().orderFood();
        kitchen.getBrewMaster().brewCoffee();
        kitchen.getDishWasher().doDishes();

        System.out.println();

        SmartKitchen kitchen2 = new SmartKitchen();

        kitchen2.setKitchenState(true, false, true);
        kitchen2.doKitchenWork();

        System.out.println();

        SmartKitchen kitchen3 = new SmartKitchen();
        kitchen3.addWater();
        kitchen3.pourMilk();
        kitchen3.loadDishWasher();

        kitchen3.doKitchenWork();


    }
}

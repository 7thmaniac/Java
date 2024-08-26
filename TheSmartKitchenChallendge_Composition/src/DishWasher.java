public class DishWasher {
    private boolean hasWorkToDo;

    public void doDishes(){
        if(hasWorkToDo){
            System.out.println("Doing Dishes...");
            hasWorkToDo = false;
        }
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
}

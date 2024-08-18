public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(){
        this(0,0);
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

    public double distance() {
        return (double) (Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2)));
    }

    public double distance(int x, int y) {
        return (double) (Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2)));
    }

    public double distance(Point p) {
        return (double) (Math.sqrt(Math.pow(this.x -p.getX(),2) + Math.pow(this.y - p.getY(),2)));
    }
}

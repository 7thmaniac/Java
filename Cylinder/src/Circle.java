public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = (radius < 0)? 0: radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        double PI = Math.PI;
        return PI * Math.pow(this.radius, 2);
    }
}


public class Cerc extends Shape2D {
    private String color;
    private double radius;

    public Cerc(String color, double radius) {
        this.color = color;
        this.radius = radius;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

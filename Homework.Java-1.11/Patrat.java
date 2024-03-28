public class Patrat extends Shape2D {
    private String color;
    private double sideLength;

    public Patrat(String color, double sideLength) {
        this.color = color;
        this.sideLength = sideLength;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public double getPerimeter() {
        return 4 * sideLength;
    }

    @Override
    public double getArea() {
        return sideLength * sideLength;
    }
}

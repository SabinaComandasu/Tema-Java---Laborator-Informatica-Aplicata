
public class Cub extends Shape3D {
    private String color;
    private double sideLength;

    public Cub(String color, double sideLength) {
        this.color = color;
        this.sideLength = sideLength;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public double getPerimeter() {
        return -1; // Un cub nu are perimetru în 3D
    }

    @Override
    public double getVolume() {
        return Math.pow(sideLength, 3);
    }
}


public class Sfera extends Shape3D {
    private String color;
    private double radius;

    public Sfera(String color, double radius) {
        this.color = color;
        this.radius = radius;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public double getPerimeter() {
        return -1; // Un cerc nu are perimetru în 3D
    }

    @Override
    public double getVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
}

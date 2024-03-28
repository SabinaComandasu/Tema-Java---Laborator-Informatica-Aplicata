import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.##");

        SegmentDeDreapta segment = new SegmentDeDreapta("Rosu", 5);
        System.out.println("\nCuloare segment: " + segment.getColor());
        System.out.println("Perimetru segment: " + df.format(segment.getPerimeter()));

        Patrat patrat = new Patrat("Albastru", 4);
        System.out.println("\nCuloare patrat: " + patrat.getColor());
        System.out.println("Perimetru patrat: " + df.format(patrat.getPerimeter()));
        System.out.println("Aria patrat: " + df.format(patrat.getArea()));

        Cerc cerc = new Cerc("Verde", 3);
        System.out.println("\nCuloare cerc: " + cerc.getColor());
        System.out.println("Perimetru cerc: " + df.format(cerc.getPerimeter()));
        System.out.println("Aria cerc: " + df.format(cerc.getArea()));

        Sfera sfera = new Sfera("Galben", 2);
        System.out.println("\nCuloare sfera: " + sfera.getColor());
        System.out.println("Volum sfera: " + df.format(sfera.getVolume()));

        Cub cub = new Cub("Portocaliu", 3);
        System.out.println("\nCuloare cub: " + cub.getColor());
        System.out.println("Volum cub: " + df.format(cub.getVolume()));
    }
}

public class MyClass {
    private String attribute1;
    private int attribute2;

    public MyClass(String attribute1, int attribute2) {
        this.attribute1 = attribute1;
        this.attribute2 = attribute2;
    }

    @Override
    public String toString() {
        return "Clasa{" +
                "Atributul 1 = '" + attribute1 + '\'' +
                ", Atributul 2 = " + attribute2 +
                '}';
    }
}

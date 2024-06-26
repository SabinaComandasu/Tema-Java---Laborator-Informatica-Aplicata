public class Machine {
    private String name;
    private String year;

    public Machine(String name, String year) {
        this.name = name;
        this.year = year;
    }

    public void start() {
        System.out.println(name + " starting...");
    }

    public void stop() {
        System.out.println(name + " stopping...");
    }

    // Getters and setters (optional)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}

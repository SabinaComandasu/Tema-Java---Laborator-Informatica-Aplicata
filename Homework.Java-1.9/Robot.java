public class Robot extends Machine {
    public Robot(String nume, String an) {
        super(nume, an);
    }

    public void deplasareInainte() {
        System.out.println(getName() + " se deplasează înainte.");
    }

    public void deplasareInapoi() {
        System.out.println(getName() + " se deplasează înapoi.");
    }

    public void intoarcereDreapta() {
        System.out.println(getName() + " face o întoarcere la dreapta.");
    }

    public void intoarcereStanga() {
        System.out.println(getName() + " face o întoarcere la stânga.");
    }

    public void ridicareObiect() {
        System.out.println(getName() + " ridică un obiect.");
    }

    public void lasareObiect() {
        System.out.println(getName() + " lasă un obiect.");
    }
}

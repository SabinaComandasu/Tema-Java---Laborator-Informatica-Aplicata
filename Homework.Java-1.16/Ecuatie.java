public class Ecuatie {
    private double a, b;

    public Ecuatie(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double rezolva() throws EcuatieException {
        if (a == 0) {
            if (b == 0) {
                throw new EcuatieException("Ecuatia are o infinitate de solutii.");
            } else {
                throw new EcuatieException("Ecuatia nu are solutie.");
            }
        } else {
            return -b / a;
        }
    }

    public void afiseazaMesaj(String mesaj) {
        System.out.println("Mesaj: " + mesaj);
    }

    public void rezolvaSiAfiseaza() {
        try {
            double solutie = rezolva();
            System.out.println("Solutie: " + solutie);
        } catch (EcuatieException e) {
            afiseazaMesaj(e.getMessage());
        }
    }
}

public class Angajat extends Persoana {
    private Companie companie;
    private double salariu;

    public Angajat(String nume, String prenume, int varsta, Adresa adresa, Companie companie, double salariu) {
        super(nume, prenume, varsta, adresa);
        this.companie = companie;
        this.salariu = salariu;
    }

    public Companie getCompanie() {
        return companie;
    }

    public void setCompanie(Companie companie) {
        this.companie = companie;
    }

    public double getSalariu() {
        return salariu;
    }

    public void setSalariu(double salariu) {
        this.salariu = salariu;
    }

    public void schimbaCompanie(Companie nouaCompanie) {
        this.companie = nouaCompanie;
    }

}

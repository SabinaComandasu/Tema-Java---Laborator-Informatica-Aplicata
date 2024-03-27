public class Angajat {
    private Persoana persoana;
    private Companie companie;

    public Angajat(Persoana persoana, Companie companie) {
        this.persoana = persoana;
        this.companie = companie;
    }

    public Persoana getPersoana() {
        return persoana;
    }

    public Companie getCompanie() {
        return companie;
    }

    public void schimbaCompanie(Companie nouaCompanie) {
        this.companie = nouaCompanie;
    }
}

public class Persoana {
    private String nume;
    private int varsta;
    private Adresa adresa;

    public Persoana(String nume, int varsta, Adresa adresa) {
        this.nume = nume;
        this.varsta = varsta;
        this.adresa = adresa;
    }

    public String getNume() {
        return nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public Adresa getAdresa() {
        return adresa;
    }
}

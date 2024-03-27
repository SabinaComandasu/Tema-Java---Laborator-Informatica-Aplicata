import java.util.ArrayList;
import java.util.List;

public class Persoana {
    private String nume;
    private int varsta;
    private Adresa adresa;
    private List<Curs> cursuri;

    public Persoana(String nume, int varsta, Adresa adresa) {
        this.nume = nume;
        this.varsta = varsta;
        this.adresa = adresa;
        this.cursuri = new ArrayList<>();
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public Adresa getAdresa() {
        return adresa;
    }

    public void setAdresa(Adresa adresa) {
        this.adresa = adresa;
    }

    // Methods to manage courses
    public void addCurs(Curs curs) {
        cursuri.add(curs);
    }

    public void removeCurs(Curs curs) {
        cursuri.remove(curs);
    }

    public List<Curs> getCursuri() {
        return cursuri;
    }
}

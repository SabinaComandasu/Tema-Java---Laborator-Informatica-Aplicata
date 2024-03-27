import java.util.ArrayList;
import java.util.List;

public class Companie {
    private String nume;
    private Adresa adresa;
    private List<Angajat> angajati;

    public Companie(String nume, Adresa adresa) {
        this.nume = nume;
        this.adresa = adresa;
        this.angajati = new ArrayList<>();
    }

    public String getNume() {
        return nume;
    }

    public Adresa getAdresa() {
        return adresa;
    }

    public List<Angajat> getAngajati() {
        return angajati;
    }

    public void adaugaAngajat(Angajat angajat) {
        angajati.add(angajat);
    }

    public Angajat gasesteAngajat(String nume) {
        for (Angajat angajat : angajati) {
            if (angajat.getPersoana().getNume().equals(nume)) {
                return angajat;
            }
        }
        return null;
    }
}

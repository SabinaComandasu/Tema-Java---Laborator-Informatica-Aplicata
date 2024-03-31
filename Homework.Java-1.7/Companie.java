import java.util.ArrayList;
import java.util.List;

public class Companie {
    private String nume;
    private List<Angajat> angajati;

    public Companie(String nume) {
        this.nume = nume;
        this.angajati = new ArrayList<>();
    }

    public String getNume() {
        return nume;
    }

    public void adaugaAngajat(Angajat angajat) {
        angajati.add(angajat);
    }

    public void mutaAngajat(Angajat angajat, Companie nouaCompanie) {
        if (angajati.contains(angajat)) {
            angajat.schimbaCompanie(nouaCompanie);
            angajati.remove(angajat);
            nouaCompanie.adaugaAngajat(angajat);
        } else {
            System.out.println("Angajatul nu este în această companie.");
        }
    }

    public List<Angajat> getAngajati() {
        return angajati;
    }

    public List<Angajat> getAngajatiLaAdresa(Adresa adresa) {
        List<Angajat> angajatiLaAdresa = new ArrayList<>();
        for (Angajat angajat : angajati) {
            if (angajat.getAdresa().equals(adresa)) {
                angajatiLaAdresa.add(angajat);
            }
        }
        return angajatiLaAdresa;
    }

    public static Companie gasesteCompanieDupaNume(List<Companie> listaCompanii, String numeCompanie) {
        for (Companie companie : listaCompanii) {
            if (companie.getNume().equals(numeCompanie)) {
                return companie;
            }
        }
        return null;
    }

    public void afiseazaAngajati() {
        System.out.println("Angajatii companiei " + nume + ":");
        for (Angajat angajat : angajati) {
            System.out.println(angajat.getNume());
        }
    }
}

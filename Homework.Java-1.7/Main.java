import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Companie companie1 = new Companie("Companie1");
        Companie companie2 = new Companie("Companie2");

        Angajat angajat1 = new Angajat("John", "Doe", 30, new Adresa("Strada X", "Oras Y", "12345"), companie1, 5000);
        Angajat angajat2 = new Angajat("Jane", "Doe", 28, new Adresa("Strada Y", "Oras Z", "54321"), companie2, 6000);
        Angajat angajat3 = new Angajat("Alice", "Smith", 35, new Adresa("Strada Z", "Oras W", "67890"), companie1, 5500);

        companie1.adaugaAngajat(angajat1);
        companie2.adaugaAngajat(angajat2);
        companie1.adaugaAngajat(angajat3);

        System.out.println("Angajații companiei " + companie1.getNume() + ":");
        for (Angajat angajat : companie1.getAngajati()) {
            System.out.println(angajat.getNume() + " " + angajat.getPrenume());
        }

        System.out.println("\nAngajații companiei " + companie2.getNume() + ":");
        for (Angajat angajat : companie2.getAngajati()) {
            System.out.println(angajat.getNume() + " " + angajat.getPrenume());
        }

        companie1.mutaAngajat(angajat3, companie2);

        System.out.println("\nDupă mutare, angajații companiei " + companie1.getNume() + ":");
        for (Angajat angajat : companie1.getAngajati()) {
            System.out.println(angajat.getNume() + " " + angajat.getPrenume());
        }

        System.out.println("\nDupă mutare, angajații companiei " + companie2.getNume() + ":");
        for (Angajat angajat : companie2.getAngajati()) {
            System.out.println(angajat.getNume() + " " + angajat.getPrenume());
        }

        Adresa adresaCautata = new Adresa("Strada Z", "Oras W", "67890");
        List<Angajat> angajatiLaAdresa = companie1.getAngajatiLaAdresa(adresaCautata);
        System.out.println("\nAngajații companiei " + companie1.getNume() + " de la adresa " + adresaCautata.getStrada() + ", " + adresaCautata.getOras() + ":");
        for (Angajat angajat : angajatiLaAdresa) {
            System.out.println(angajat.getNume() + " " + angajat.getPrenume());
        }

        String numeCompanieCautata = "Companie2";
        Companie companieCautata = Companie.gasesteCompanieDupaNume(List.of(companie1, companie2), numeCompanieCautata);
        if (companieCautata != null) {
            System.out.println("\nCompania cu numele \"" + numeCompanieCautata + "\" a fost găsită.");
            System.out.println("Angajații companiei " + companieCautata.getNume() + ":");
            for (Angajat angajat : companieCautata.getAngajati()) {
                System.out.println(angajat.getNume() + " " + angajat.getPrenume());
            }
        } else {
            System.out.println("Compania cu numele \"" + numeCompanieCautata + "\" nu a fost găsită.");
        }
    }
}

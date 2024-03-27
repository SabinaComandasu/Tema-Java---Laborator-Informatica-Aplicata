public class Main {
    public static void main(String[] args) {
        Adresa adresa1 = new Adresa("Strada Fratii Golesti", "Craiova", "010101");
        Adresa adresa2 = new Adresa("Strada Stadionului", "Almaj", "200202");

        Persoana persoana1 = new Persoana("Sabina Comandasu", 20, adresa1);
        Persoana persoana2 = new Persoana("Vladut Florian", 20, adresa2);

        Companie companie1 = new Companie("Endava", adresa1);
        Companie companie2 = new Companie("Netrom", adresa2);

        Angajat angajat1 = new Angajat(persoana1, companie1);
        Angajat angajat2 = new Angajat(persoana2, companie2);

        companie1.adaugaAngajat(angajat1);
        companie2.adaugaAngajat(angajat2);

        System.out.println("\nAngajatii companiei " + companie1.getNume() + ":");
        for (Angajat angajat : companie1.getAngajati()) {
            System.out.println("- " + angajat.getPersoana().getNume());
        }

        System.out.println("Angajatii companiei " + companie2.getNume() + ":");
        for (Angajat angajat : companie2.getAngajati()) {
            System.out.println("- " + angajat.getPersoana().getNume());
        }

        Angajat angajat3 = new Angajat(new Persoana("Comandasu Andrei", 25, adresa1), companie2);
        companie1.adaugaAngajat(angajat3);
        System.out.println("Angajatii companiei " + companie1.getNume() + " după adăugarea lui Andrei Comandasu:");
        for (Angajat angajat : companie1.getAngajati()) {
            System.out.println("- " + angajat.getPersoana().getNume());
        }
    }
}

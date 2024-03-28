import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String numeFisier = "C:\\Users\\sabin\\Desktop\\Laborator IIA\\Homework.Java-1.24\\src\\numere.txt";

        try {
            int suma = SumaNumereIntregi.calculareSuma(numeFisier);
            System.out.println("Suma numerelor întregi din fișier: " + suma);
        } catch (IOException e) {
            System.out.println("Eroare la citirea din fișier.");
        }
    }
}

public class MessageDisplayer {
    public static void displayFileNotFoundError() {
        System.out.println("Fișierul nu a fost găsit. Utilizând valoarea implicită.");
    }

    public static void displayNumberFormatException() {
        System.out.println("Conținutul fișierului nu este un număr valid. Utilizând valoarea implicită.");
    }

    public static void displayResult(double result) {
        System.out.println("Valoarea dublului numărului este: " + result);
    }
}

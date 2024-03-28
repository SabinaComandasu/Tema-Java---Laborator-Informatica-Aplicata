import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    int readNumber() {
        Scanner in = new Scanner(System.in);
        while (true) {
            try {
                return in.nextInt();
            } catch (InputMismatchException ex) {
                System.err.println("Valoarea introdusă nu este un număr întreg. Introduceți din nou:");
                in.next();
            }
        }
    }

    int calculateSum(int num1, int num2) {
        return num1 + num2;
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Introduceți primul număr (lăsați gol pentru a introduce null): ");
            String input1 = scanner.nextLine();
            Integer num1 = input1.isEmpty() ? null : Integer.parseInt(input1);

            System.out.print("Introduceți al doilea număr (lăsați gol pentru a introduce null): ");
            String input2 = scanner.nextLine();
            Integer num2 = input2.isEmpty() ? null : Integer.parseInt(input2);

            int sum = Homework.calculateSum(num1, num2);
            System.out.println("Suma celor două numere este: " + sum);
        } catch (NumberFormatException e) {
            Homework.displayMessage("Introduceți un număr valid.");
        } catch (NullPointerException e) {
            Homework.displayMessage(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

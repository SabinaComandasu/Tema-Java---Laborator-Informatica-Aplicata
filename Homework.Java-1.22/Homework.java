import java.util.Scanner;

public class Homework {
    public static int calculateSum(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new NullPointerException("Unul dintre numere este null.");
        }
        return num1 + num2;
    }

    public static void displayMessage(String message) {
        System.out.println(message);
    }
}

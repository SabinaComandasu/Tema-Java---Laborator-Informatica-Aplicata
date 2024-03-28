import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Calculator {
    public static double readAndDouble(String fileName) throws FileNotFoundException, NumberFormatException {
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);
        double number = Double.parseDouble(scanner.nextLine());
        scanner.close();
        return doubleValue(number);
    }

    public static double doubleValue(double x) {
        return 2 * x;
    }
}

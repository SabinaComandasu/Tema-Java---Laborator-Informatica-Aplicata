import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        try {
            double result = Calculator.readAndDouble("C:\\Users\\sabin\\Desktop\\Laborator IIA\\Homework.Java-1.13\\src\\input.txt");
            MessageDisplayer.displayResult(result);
        } catch (FileNotFoundException e) {
            MessageDisplayer.displayFileNotFoundError();
            double result = Calculator.doubleValue(1);
            MessageDisplayer.displayResult(result);
        } catch (NumberFormatException e) {
            MessageDisplayer.displayNumberFormatException();
            double result = Calculator.doubleValue(1);
            MessageDisplayer.displayResult(result);
        }
    }
}

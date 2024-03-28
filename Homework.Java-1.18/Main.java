import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(8);
        numbers.add(3);
        numbers.add(12);

        Collections.sort(numbers);

        System.out.println("Lista ordonată de numere întregi:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}

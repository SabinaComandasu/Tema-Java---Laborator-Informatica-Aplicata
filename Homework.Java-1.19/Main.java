import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Sabina", 85));
        students.add(new Student("Florin", 90));
        students.add(new Student("Catalin", 75));
        students.add(new Student("Ana", 80));

        Collections.sort(students, Comparator.comparingInt(student -> student.grade));

        for (Student student : students) {
            System.out.println(student);
        }
    }
}

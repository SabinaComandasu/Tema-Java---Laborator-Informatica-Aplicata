import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Adresa adresaProfesor = new Adresa("Strada Test 13", "Craiova", "12345");
        Adresa adresaStudent = new Adresa("Strada Test 17", "Timisoara", "54321");


        Profesor profesor = new Profesor("Cerbulescu Catalin", 40, adresaProfesor, "Informatica");
        Student student1 = new Student("Student", 20, adresaStudent, "Automatica", "123ABC", 2);
        Student student2 = new Student("Vladut Florian", 20, adresaStudent, "Automatica", "456DEF", 2);


        List<Student> listaStud = new ArrayList<>();
        listaStud.add(student1);
        listaStud.add(student2);


        Curs curs = Curs.createNewCourse("Informatica Aplicata", profesor, listaStud, "Java");


        curs.addStudentToCourse(new Student("Comandasu Sabina", 20, adresaStudent, "Automatica", "789GHI", 2));
        curs.removeStudentFromCourse(student1);


        Adresa newAdresaProfesor = new Adresa("Strada Noua", "Oras Nou", "67890");
        Adresa newAdresaStudent = new Adresa("Strada Noua", "Oras Nou", "09876");
        curs.changeTeacherAddress(newAdresaProfesor);
        curs.changeStudentAddress(student2, newAdresaStudent);


        System.out.println("\nCurs: " + curs.getNume());
        System.out.println("Profesor: " + curs.getProfesor().getNume());
        System.out.println("Studenti:");
        for (Student student : curs.getStudenti()) {
            System.out.println("- " + student.getNume());
        }
        System.out.println("Tema: " + curs.getTema());
    }
}

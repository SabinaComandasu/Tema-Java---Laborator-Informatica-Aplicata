import java.util.List;

public class Curs {
    private String nume;
    private Profesor profesor;
    private List<Student> studenti;
    private String tema;

    public Curs(String nume, Profesor profesor, List<Student> studenti, String tema) {
        this.nume = nume;
        this.profesor = profesor;
        this.studenti = studenti;
        this.tema = tema;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public List<Student> getStudenti() {
        return studenti;
    }

    public void setStudenti(List<Student> studenti) {
        this.studenti = studenti;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public void addStudentToCourse(Student student) {
        studenti.add(student);
    }

    public void removeStudentFromCourse(Student student) {
        studenti.remove(student);
    }

    public void addTeacherToCourse(Profesor profesor) {
        this.profesor = profesor;
    }

    public void removeTeacherFromCourse() {
        this.profesor = null;
    }

    public void changeTeacherAddress(Adresa newAddress) {
        if (profesor != null) {
            profesor.setAdresa(newAddress);
        } else {
            System.out.println("Nu există profesor asociat acestui curs.");
        }
    }

    public void changeStudentAddress(Student student, Adresa newAddress) {
        student.setAdresa(newAddress);
    }

    public static Curs createNewCourse(String nume, Profesor profesor, List<Student> studenti, String tema) {
        return new Curs(nume, profesor, studenti, tema);
    }
}

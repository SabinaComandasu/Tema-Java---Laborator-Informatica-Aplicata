public class Student extends Persoana {
    private String facultate;
    private String ID_student;
    private int an_studiu;


    public Student(String nume, int varsta, Adresa adresa, String facultate, String ID_student, int an_studiu) {
        super(nume, varsta, adresa);
        this.facultate = facultate;
        this.ID_student = ID_student;
        this.an_studiu = an_studiu;
    }

    public String getFacultate() {
        return facultate;
    }

    public void setFacultate(String facultate) {
        this.facultate = facultate;
    }

    public String getID_student() {
        return ID_student;
    }

    public void setID_student(String ID_student) {
        this.ID_student = ID_student;
    }

    public int getAn_studiu() {
        return an_studiu;
    }

    public void setAn_studiu(int an_studiu) {
        this.an_studiu = an_studiu;
    }
}
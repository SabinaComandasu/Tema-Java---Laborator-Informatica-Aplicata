public class Profesor extends Persoana {
    private String specializare;


    public Profesor(String nume, int varsta, Adresa adresa, String specializare) {
        super(nume, varsta, adresa);
        this.specializare = specializare;
    }

    public String getSpecializare() {
        return specializare;
    }

    public void setSpecializare(String specializare) {
        this.specializare = specializare;
    }
}

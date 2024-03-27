public class Adresa {
    private String strada;
    private String oras;
    private String cod_postal;

    public Adresa(String strada, String oras, String cod_postal) {
        this.strada = strada;
        this.oras = oras;
        this.cod_postal = cod_postal;
    }

    public String getStrada() {
        return strada;
    }

    public void setStrada(String strada) {
        this.strada = strada;
    }

    public String getOras() {
        return oras;
    }

    public void setOras(String oras) {
        this.oras = oras;
    }

    public String getCod_postal() {
        return cod_postal;
    }

    public void setCod_postal(String cod_postal) {
        this.cod_postal = cod_postal;
    }
}

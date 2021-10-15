package polymorphism.overriding;

public class Hewan {
    protected String nama;

    public Hewan(String newNama) {
        nama = newNama;
    }

    public String buatSuara() {
        return nama + " bersuara.";
    }

    public String buatSuara(String suara) {
        return nama + " bersuara \"" + suara + "\"";
    }
}

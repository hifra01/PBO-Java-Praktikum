package polymorphism.overriding;

public class Burung extends Hewan{

    public Burung(String newNama) {
        super(newNama);
    }

    @Override
    public String buatSuara() {
        return nama + " bercuit \"cuit cuit\".";
    }

    public String buatSuara(String suara) {
        return nama + " bercuit \"" + suara + "\".";
    }
}

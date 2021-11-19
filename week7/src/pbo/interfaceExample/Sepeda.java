package pbo.interfaceExample;

public class Sepeda extends Kendaraan{
    public Sepeda(String nama) {
        super(nama);
    }

    @Override
    public void berjalan() {
        System.out.println(nama + " berjalan...");
    }
}

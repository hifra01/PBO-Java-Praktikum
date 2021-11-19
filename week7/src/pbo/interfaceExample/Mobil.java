package pbo.interfaceExample;

public class Mobil extends Kendaraan implements Bermotor{
    public Mobil(String nama) {
        super(nama);
    }

    @Override
    public void nyalakanMesin() {
        System.out.println("Mesin " + nama + " menyala...");
    }

    @Override
    public void matikanMesin() {
        System.out.println("Mesin " + nama + " mati...");
    }

    @Override
    public void berjalan() {
        nyalakanMesin();
        System.out.println(nama + " berjalan...");
        matikanMesin();
    }
}

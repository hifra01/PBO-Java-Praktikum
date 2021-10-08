import pbo.week4.Kucing;

public class Anggora extends Kucing {

    public Anggora(String inputNama) {
        super("anggora", true, inputNama);
    }

    @Override
    public void cetakNama() {
        System.out.println("Nama kucing anggora ini adalah " + nama);
    }

}

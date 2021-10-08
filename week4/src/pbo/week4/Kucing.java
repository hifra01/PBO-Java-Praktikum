package pbo.week4;

public class Kucing extends Mamalia{
    public boolean berbulu;
    private String ras;
    protected String nama;

    public Kucing(String inputRas, boolean inputBerbulu, String inputNama) {
        super(4, "darat");
        ras = inputRas;
        berbulu = inputBerbulu;
        nama = inputNama;
    }

    public void mengeong() {
        System.out.println(nama + " mengeong...");
    }

    @Override
    public String toString() {
        return "Kucing{" +
                "jumlah_kaki=" + jumlah_kaki +
                ", berbulu=" + berbulu +
                ", ras='" + ras + '\'' +
                ", nama='" + nama + '\'' +
                '}';
    }

    public void cetakNama() {}
}

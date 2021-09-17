package ilkom.pbo.b;

public class Kucing {
    String nama;
    String warna;

    //    constructor
    public Kucing(String nama, String warna) {
        this.nama = nama;
        this.warna = warna;
    }

    public void lari(String tujuan) {
        System.out.println(nama + " berlari... ke " + tujuan);
    }

    public void mengeong() {
        System.out.println("Meow...");
    }
}

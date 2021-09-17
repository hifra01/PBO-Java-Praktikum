public class Kucing {
    String nama;
    String warna;
    boolean sudahMakan;

//    constructor
    public Kucing(String nama, String warna) {
        this.nama = nama;
        this.warna = warna;
        this.sudahMakan = false;
    }

    void lari(String tujuan) {
        System.out.println(nama + " berlari... ke " + tujuan);
    }
    void makan() {
        System.out.println(nama + " makan.");
        sudahMakan = true;
    }
    void mengeong() {
        System.out.println("Meow...");
    }
}

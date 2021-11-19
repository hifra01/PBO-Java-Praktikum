package pbo.marketplace;


public class Item {
//    final: sebuah variabel setelah diberi nilai utk pertama kali, dia tidak bisa diubah lagi nilainya
//    nama = pisang
//    nama = apel /* bakal error, karena var nama final */

    final private String nama;
    final private double berat;
    final private long harga;
    private int jumlah;


    public Item(String nama, double berat, long harga, int jumlah) {
        this.nama = nama;
        this.berat = berat;
        this.harga = harga;
        this.jumlah = jumlah;
    }

    public String getNama() {
        return nama;
    }

    public double getBerat() {
        return berat;
    }

    public int getJumlah() {
        return jumlah;
    }

    public long getHarga() {
        return harga;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
}


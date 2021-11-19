package pbo.marketplace;

public class Akun {
    final private String nama;
    final private char jenisKelamin;
    final private String alamat;

    public Akun(String nama, char jenisKelamin, String alamat) {
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }

    public char getJenisKelamin() {
        return jenisKelamin;
    }

    public String getAlamat() {
        return alamat;
    }
}

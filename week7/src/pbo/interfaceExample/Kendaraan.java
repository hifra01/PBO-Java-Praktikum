package pbo.interfaceExample;

public abstract class Kendaraan {
    final public String nama;

    public Kendaraan(String nama) {
        this.nama = nama;
    }

    public abstract void berjalan();
}

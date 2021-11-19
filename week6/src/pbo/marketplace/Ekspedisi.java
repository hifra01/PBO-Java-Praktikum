package pbo.marketplace;

import java.util.Objects;

public class Ekspedisi {
    final private String namaEkspedisi;
    final private long hargaEkonomis;
    final private long hargaReguler;
    final private long hargaInstan;
    final private long hargaSehari;
    private long hargaTerpilih;
    private String paketTerpilih;

    public Ekspedisi(
            String namaEkspedisi,
            long hargaEkonomis,
            long hargaReguler,
            long hargaInstan,
            long hargaSehari,
            String paketTerpilih
    ) {
        this.namaEkspedisi = namaEkspedisi;
        this.hargaEkonomis = hargaEkonomis;
        this.hargaReguler = hargaReguler;
        this.hargaInstan = hargaInstan;
        this.hargaSehari = hargaSehari;

        setPaketTerpilih(paketTerpilih);
    }

    public void setPaketTerpilih(String paketTerpilih) {
        if (Objects.equals(paketTerpilih, "Ekonomis")) {
            hargaTerpilih = hargaEkonomis;
        }
        if (Objects.equals(paketTerpilih, "Reguler")) {
            hargaTerpilih = hargaReguler;
        }
        if (Objects.equals(paketTerpilih, "Instan")) {
            hargaTerpilih = hargaInstan;
        }
        if (Objects.equals(paketTerpilih, "Sehari")) {
            hargaTerpilih = hargaSehari;
        }
        this.paketTerpilih = paketTerpilih;
    }

    public String getNamaEkspedisi() {
        return namaEkspedisi;
    }

    public long getHargaEkonomis() {
        return hargaEkonomis;
    }

    public long getHargaReguler() {
        return hargaReguler;
    }

    public long getHargaInstan() {
        return hargaInstan;
    }

    public long getHargaSehari() {
        return hargaSehari;
    }

    public long getOngkirTerpilih() {
        return hargaTerpilih;
    }

    public String getPaketTerpilih() {
        return paketTerpilih;
    }
}

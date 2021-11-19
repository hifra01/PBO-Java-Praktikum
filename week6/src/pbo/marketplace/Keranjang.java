package pbo.marketplace;

import java.util.ArrayList;

public class Keranjang {
    final private Akun pemilik;

    private final ArrayList<Item> isiKeranjang = new ArrayList<Item>();
    private double totalBerat = 0;
    private Ekspedisi ekspedisi;

    public Keranjang(Akun pemilik) {
        this.pemilik = pemilik;
    }

    public Akun getPemilik() {
        return pemilik;
    }

    public ArrayList<Item> getIsiKeranjang() {
        return isiKeranjang;
    }

    public Ekspedisi getEkspedisi() {
        return ekspedisi;
    }

    public double getTotalBerat() {
        return totalBerat;
    }

    public void tambahItem(Item itemBaru) {
        isiKeranjang.add(itemBaru);
        totalBerat += (itemBaru.getBerat() * itemBaru.getJumlah());
    }

    public void setEkspedisi(Ekspedisi ekspedisi) {
        this.ekspedisi = ekspedisi;
    }

    public void setPaket(String paketTerpilih) {
        ekspedisi.setPaketTerpilih(paketTerpilih);
    }

    public long hitungOngkir() {
        return Math.round(totalBerat) * ekspedisi.getOngkirTerpilih();
    }

    public String cetakDaftarBarang() {
        String hasil = "";
        for (Item isi : isiKeranjang) {
            hasil += (isi.getNama() + " (Rp" + isi.getHarga() + " x " + isi.getJumlah() + ")\nRp" + (isi.getHarga() * isi.getJumlah()) + "\n\n");
        }
        return hasil;
    }

    public long getSubtotal() {
        long tempSubtotal = 0;
        for (Item isi: isiKeranjang) {
            tempSubtotal += (isi.getJumlah() * isi.getHarga());
        }
        return tempSubtotal;
    }

    public void cetakBukti() {
        if (isiKeranjang.isEmpty()) {
            System.out.println("Harap tambahkan item ke keranjang");
            return;
        }

        if (ekspedisi == null) {
            System.out.println("Harap pilih ekspedisi terlebih dahulu");
            return;
        }

        System.out.println("TOKOLAPAK\n" +
                "\n" +
                "Atas nama: " + pemilik.getNama() + "\n" +
                "Alamat: " + pemilik.getAlamat() + "\n" +
                "\n" +
                "Keranjang Belanja:\n" +
                "=====================================\n" +
                cetakDaftarBarang() +
                "=====================================\n" +
                "Subtotal: Rp" + getSubtotal() + "\n\n" +
                "Berat: " + totalBerat + "kg\n" +
                "Ekspedisi Pengiriman: " + ekspedisi.getNamaEkspedisi() + " - " + ekspedisi.getPaketTerpilih() + "\n" +
                "Ongkos kirim: Rp" + hitungOngkir() + "\n\n" +
                "Total: Rp" + (getSubtotal() + hitungOngkir()));
    }
}

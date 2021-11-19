import pbo.marketplace.*;

public class Marketplace {
    public static void main(String[] args) {
        Keranjang keranjang = new Keranjang(new Akun("Andi", 'L', "Jakarta"));
        keranjang.setEkspedisi(new JNE("Reguler"));
        keranjang.tambahItem(new Item("tas ransel", 0.4, 125000, 1));
        keranjang.tambahItem(new Item("Kotak pensil", 0.2, 47000, 1));
        keranjang.cetakBukti();
    }
}

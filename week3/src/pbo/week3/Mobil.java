package pbo.week3;

public class Mobil {
    private int kapasitasMesin;
    private int jumlahPenumpang;
    private int jumlahPintu;
    private String namaMerk;
    private String namaModel;

    public Mobil(String namaMerk, String namaModel, int jumlahPintu, int jumlahPenumpang, int kapasitasMesin) {
        this.namaMerk = namaMerk;
        this.namaModel = namaModel;
        this.jumlahPintu = jumlahPintu;
        this.jumlahPenumpang = jumlahPenumpang;
        this.kapasitasMesin = kapasitasMesin;
    }

//    overloading: method sama, parameter beda, output bisa beda
    public Mobil(String namaMerk, String namaModel) {
        this.namaMerk = namaMerk;
        this.namaModel = namaModel;
        this.jumlahPintu = 4;
        this.jumlahPenumpang = 7;
        this.kapasitasMesin = 1500;
    }

    public Mobil(String namaMerk, String namaModel, int jumlahPintu) {
        this.namaMerk = namaMerk;
        this.namaModel = namaModel;
        this.jumlahPintu = jumlahPintu;
        this.jumlahPenumpang = 7;
        this.kapasitasMesin = 1500;
    }

    public void getDetails() {
        System.out.println("Merk: " + namaMerk);
        System.out.println("Model: " + namaModel);
        System.out.println("Jumlah Pintu: " + jumlahPintu);
        System.out.println("Jumlah Penumpang: " + jumlahPenumpang);
        System.out.println("Kapasitas Mesin: " + kapasitasMesin +"cc");
    }


}

public class PersegiPanjang {
    private int panjang;
    private int lebar;
    private int keliling;
    private int luas;

    public PersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.keliling = hitungKeliling();
        this.luas = hitungLuas();
    }

//    buat getter

    int getPanjang() {
        return panjang;
    }

    int getLebar() {
        return lebar;
    }

    int getKeliling() {
        return keliling;
    }

    int getLuas() {
        return luas;
    }

//    bikin setter

    void setPanjang(int panjang) {
        this.panjang = panjang;
        this.keliling = hitungKeliling();
        this.luas = hitungLuas();
    }

    void setLebar(int lebar) {
        this.lebar = lebar;
        this.keliling = hitungKeliling();
        this.luas = hitungLuas();
    }

    int hitungKeliling() {
        return (2 * panjang) + (2 * lebar);
    }

    int hitungLuas() {
        return panjang * lebar;
    }
}

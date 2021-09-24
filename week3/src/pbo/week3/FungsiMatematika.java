package pbo.week3;

public class FungsiMatematika {
    static public double pi = 3.14;

    static private int cariKuadrat(int angka) {
        return angka * angka;
    }

    static public int cariKubik(int angka) {
        return cariKuadrat(angka) * angka;
    }
}

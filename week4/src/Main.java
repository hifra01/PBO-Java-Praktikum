import pbo.week4.Kucing;
import pbo.week4.Persia;

public class Main {
    public static void main(String[] args) {
        Anggora anggora = new Anggora("Meng");

        System.out.println(anggora.toString());
        anggora.mengeong();

        System.out.println("objek anggora adalah instance dari class Anggora = " + (anggora instanceof Anggora));
        System.out.println("objek anggora adalah instance dari class Kucing = " + (anggora instanceof Kucing));
//        System.out.println("objek anggora adalah instance dari class Persia = " + (anggora instanceof Persia)); /* Bakal error */

        Kucing kucingPersia = new Persia("persia1");
        System.out.println("objek kucingPersia adalah instance dari class Persia = " + (kucingPersia instanceof Persia));
        System.out.println("objek kucingPersia adalah instance dari class Kucing = " + (kucingPersia instanceof Kucing));
        System.out.println("objek kucingPersia adalah instance dari class Anggora = " + (kucingPersia instanceof Anggora));

        Kucing tom = new Anggora("Tom");
        tom.cetakNama();
    }
}

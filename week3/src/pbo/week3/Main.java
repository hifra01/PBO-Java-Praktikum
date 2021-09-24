package pbo.week3;

import java.util.Arrays;

public class Main {

    public static void printParam(String... param) {
        System.out.println(Arrays.toString(param));
    }

    public static void addParam(int a, int b) {
        System.out.println(a + b);
    }

    public static void addParam(String a, String b) {
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        Mobil mobilAvanza = new Mobil("Toyota", "Avanza", 4, 8, 1000);
        mobilAvanza.getDetails();

        System.out.println("========================");

        Mobil mobilInnova = new Mobil("Toyota", "Innova");
        mobilInnova.getDetails();

        Mobil mobilFerrari = new Mobil("Ferrari", "Spyder", 2);
        mobilFerrari.getDetails();

        printParam("Hello", "World", "From", "Java");

        addParam(3, 5);
        addParam("Hello", "World");

        ContohClass contohClass = new ContohClass();

        System.out.println(contohClass.publicProperty);
        contohClass.publicProperty = "Publik properti terganti";
        System.out.println(contohClass.publicProperty);

//        System.out.println(contohClass.privateProperty); /* Bakal error */
//        contohClass.privateProperty = "ganti private"; /* Bakal error */
        contohClass.panggilMethod();
        contohClass.panggilMethod3();

        KelasLuar kelasLuar = new KelasLuar();
//        System.out.println(kelasLuar.propertiLuar); /* Bakal error */

        KelasLuar.KelasDalam kelasDalam = kelasLuar.new KelasDalam();
        System.out.println(kelasDalam.propertiDalam);

        KelasLuar.KelasDalam kelasDalam1 = new KelasLuar().new KelasDalam();
        System.out.println(kelasDalam1.propertiDalam);

        KelasLuar.KelasDalamStatik kelasDalamStatik = new KelasLuar.KelasDalamStatik();
        System.out.println(kelasDalamStatik.propertiDalamStatik);

        System.out.println("==================");

        kelasDalam.getLuar();

//        System.out.println(FungsiMatematika.cariKuadrat(12)); /* Bakal Error */
        System.out.println(FungsiMatematika.cariKubik(12));
        System.out.println(FungsiMatematika.pi);


    }
}

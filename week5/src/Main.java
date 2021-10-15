import polymorphism.overloading.Hitung;
import polymorphism.overriding.Burung;
import polymorphism.overriding.Hewan;

public class Main {
    public static void main(String[] args) {
        Object result = Hitung.maxNumber(12, 24);
        System.out.println(result);
        System.out.println(result.getClass());

        System.out.println("===========================");

        Object result2 = Hitung.maxNumber(12.5, 24.2);
        System.out.println(result2);
        System.out.println(result2.getClass());

        System.out.println("===========================");

        Object result3 = Hitung.maxNumber(122, 26.9);
        System.out.println(result3);
        System.out.println(result3.getClass());

        System.out.println("===========================");

        Object result4 = Hitung.maxNumber(new int[]{12, 26, 45, 7, 9});
        System.out.println(result4);
        System.out.println(result4.getClass());

        System.out.println("===========================");

        Hewan kucing = new Hewan("meng");
        System.out.println(kucing.buatSuara());

        System.out.println("===========================");

        Hewan burung = new Burung("joni");
        System.out.println(burung.buatSuara());
        System.out.println(burung.buatSuara("tono"));
    }
}

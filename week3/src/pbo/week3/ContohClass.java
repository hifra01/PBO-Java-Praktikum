package pbo.week3;

public class ContohClass {
//    Access modifier: menentukan dalam lingkup apa sebuah variabel/method bisa dipanggil/diakses
//    public : Bisa diakses dari luar kelas, atau diakses ketika sudah menjadi objek
//    private: Hanya bisa diakses dari dalam kelas, tidak bisa diakses ketika sudah menjadi objek

    public String publicProperty = "Ini properti publik";
    private String privateProperty = "Ini properti privat";

    public void panggilMethod() {
        System.out.println(publicProperty);
        System.out.println(privateProperty);
    }

    private void panggilMethod2() {
        System.out.println(publicProperty);
        System.out.println(privateProperty);
    }

    public void panggilMethod3() {
        panggilMethod2();
    }

}

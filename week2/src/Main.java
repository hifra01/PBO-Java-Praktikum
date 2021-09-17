public class Main {
    public static void main(String[] args) {
        Kucing oren = new Kucing("oren", "oranye");
        System.out.println(oren.sudahMakan);
        oren.lari("belakang");
        oren.mengeong();
        oren.makan();
        System.out.println(oren.sudahMakan);

        PersegiPanjang pp = new PersegiPanjang(4, 3);
        System.out.println(pp.getPanjang());
        System.out.println(pp.getLebar());
        System.out.println(pp.getKeliling());
        System.out.println(pp.getLuas());
        System.out.println("============================");

        pp.setPanjang(8);
        System.out.println(pp.getPanjang());
        System.out.println(pp.getLebar());
        System.out.println(pp.getKeliling());
        System.out.println(pp.getLuas());

    }
}

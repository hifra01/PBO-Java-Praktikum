import pbo.abstraction.Ekspedisi;
import pbo.abstraction.JNE;
import pbo.abstraction.Sicepat;
import pbo.interfaceExample.*;

public class Main {
    public static void main(String[] args) {
        Ekspedisi jne = new JNE("Reguler");
//    Ekspedisi ekspedisi = new Ekspedisi("SiCepat", 10000, 20000, 30000, 40000); /* Bakal Error */
        Ekspedisi sicepat = new Sicepat("Instan");

        Kendaraan mobil = new Mobil("avanza");
        mobil.berjalan();

        Kendaraan sepeda = new Sepeda("brompton");
        sepeda.berjalan();

        Mobil innova = new Mobil("innova");
        innova.nyalakanMesin();
    }
}

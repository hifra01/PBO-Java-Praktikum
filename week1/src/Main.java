import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int luasPersegiPanjang(int panjang, int lebar) {
        int hasil = panjang * lebar;
        return hasil;
    }

    public static void main(String[] args) {
        /* Tipe data */
        byte bit = 127;
        long angkaPanjang = 64L;
        float bilanganKoma = 9.3f;
        double bilanganKomaButLonger = 9.3;
        boolean bool = true;
        char karakter = 'a';
        String kalimat = "Hello world!";

        String nama = "John Doe";
        int umur = 20;

        /* Mencetak Output */
        System.out.print("Halo, nama saya " + nama + ", umur saya " + umur + "!"); // Tidak ada newline
        System.out.print("\n");

        System.out.println("Halo, nama saya " + nama + ", umur saya " + umur + "!"); // Ada newline

        System.out.printf("Halo, nama saya %s, umur saya %d!%n", nama, umur); // String formatting

        /* Mencetak angka di belakang koma */
        double angkaDesimal = 9.6689302;
        System.out.printf("Dua angka di belakang koma: %.2f", angkaDesimal);

        /* Operator aritmatika */
        int angka1 = 10;
        int angka2 = 6;

        int hasilTambah = angka1 + angka2;
        int hasilKurang = angka1 - angka2;
        int hasilKali = angka1 * angka2;
        int hasilBagi = angka1 / angka2;
        int hasilModulo = angka1 % angka2;
        int tambahSatu = angka1++; // atau ++angka1
        int kurangSatu = angka1--; // atau --angka1
        /* Self assign */
        angka1 += 2; // Menambahkan 2 ke variabel angka1, berlaku juga utk operator aritmatika lain

        /* Operator perbandingan */
        boolean lebihDari = angka1 > angka2;
        boolean kurangDari = angka1 < angka2;
        boolean samaDengan = angka1 == angka2;
        boolean tidakSamaDengan = angka1 != angka2;
        boolean lebihSamaDengan = angka1 >= angka2;
        boolean kurangSamaDengan = angka1 <= angka2;

        /* Operator logika */
        boolean benar = true;
        boolean salah = false;

        boolean or = benar || salah;
        boolean and = benar && salah;
        boolean not = !true;

        /* Percabangan */
        int angkaKondisi = 10;

        if (angkaKondisi > 10) {
            System.out.println("Lebih dari sepuluh");
        } else if (angkaKondisi < 10) {
            System.out.println("Kurang dari sepuluh");
        } else {
            System.out.println("Sepuluh");
        }

        /* Perulangan */
        int counter = 1;
        System.out.println("Bilangan counter saat ini: " + counter);

        while (counter <= 10) {
            System.out.println(counter);
            counter++;
        }

        System.out.println("Bilangan counter saat ini: " + counter);
        do {
            System.out.println(counter);
        } while (counter <= 10);

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        /* Array */
        String[] kata = new String[10]; // Membuat array of String dengan kapasitas 10
        kata[0] = "Hello";
        kata[1] = "World";
        System.out.println(Arrays.toString(kata));
        System.out.println(kata[1]);
        System.out.println(kata[5]);

        /* ArrayList */
        ArrayList<String> listKata = new ArrayList<String>();
        System.out.println(listKata);
        listKata.add("Hello");
        System.out.println(listKata);
        listKata.add("World");
        System.out.println(listKata);
        System.out.println(listKata.get(1));

        /* Meminta input pengguna */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan panjang = ");
        int panjang = scanner.nextInt();
        scanner.nextLine(); // Panggil untuk membersihkan newline dari scanner, agar tidak memengaruhi input berikutnya

        System.out.print("Masukkan lebar = ");
        int lebar = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Masukkan nama Anda = ");
        String namaPengguna = scanner.nextLine();

        int luas = luasPersegiPanjang(panjang, lebar); // Memanggil fungsi
        System.out.printf("Halo, %s! Luas persegi panjangmu adalah %d!%n", namaPengguna, luas);
    }
}

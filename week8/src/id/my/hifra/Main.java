package id.my.hifra;

import id.my.hifra.exceptions.NoteException;
import id.my.hifra.exceptions.TitleException;
import id.my.hifra.models.NoteModel;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    static NoteModel noteModel;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            noteModel = new NoteModel();
            System.out.println("Koneksi berhasil");

            System.out.println("Menu: \n" +
                    "1. Lihat semua catatan\n" +
                    "2. Tambah catatan baru\n");

            System.out.print("Masukkan menu pilihan = ");
            String menuChoice = scanner.nextLine();

            switch (menuChoice) {
                case "1":
                    menuDaftarCatatan();
                    break;
                case "2":
                    menuTambahCatatan();
                    break;
                default:
                    System.out.println("Menu tidak tersedia");
            }


        } catch (SQLException e) {
            System.out.println("Terjadi Kesalahan: " + e.getMessage());
        }
    }

    public static void menuDaftarCatatan() throws SQLException {
        ResultSet daftarCatatan = noteModel.getNotes();

        while (daftarCatatan.next()) {
            System.out.print(daftarCatatan.getInt("id"));
            System.out.print(".     ");
            System.out.print(daftarCatatan.getString("title"));
            System.out.print("     ");
            System.out.print(daftarCatatan.getString("body"));
            System.out.print("     ");
            System.out.println();
        }
    }

    public static void menuTambahCatatan() throws SQLException {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Masukkan judul note = ");
            String title = scanner.nextLine(); // ""

            System.out.print("Masukkan isi note = ");
            String body = scanner.nextLine();

            if (title.isEmpty()) {
                throw new TitleException();
            }

            if (body.isEmpty()) {
                throw new NoteException("Isi tidak boleh kosong");
            }

            int result = noteModel.addNote(title, body);

            if (result > 0) {
                System.out.println("Berhasil update " + result + " baris.");
            }
        } catch (NoteException e) {
            System.out.println(e.getMessage());
        }
    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] a) {
        ArrayList<Mahasiswa> mahasiswas = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        boolean next = true;
        while (next) {
            System.out.print("Masukkan NIM: ");
            String nim = scanner.nextLine();

            System.out.print("Masukkan Nama: ");
            String nama = scanner.nextLine();

            System.out.print("Masukkan Alamat: ");
            String alamat = scanner.nextLine();

            Mahasiswa mahasiswa = new Mahasiswa(nim, nama, alamat);
            mahasiswas.add(mahasiswa);

            System.out.print("Tambah lagi? (y/n): ");
            String tambah = scanner.nextLine();

            if (tambah.equals("n")) {
                next = false;
            }
        }

        System.out.println("==================================");
        for (Mahasiswa mahasiswa : mahasiswas) {
            System.out.println(mahasiswa.getNim() + " | " + mahasiswa.getNama() + " | " + mahasiswa.getAlamat());
        }
    }
}
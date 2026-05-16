package CaseMethod;

import java.util.Scanner;

public class RoyalMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Membuat objek Scanner
        SistemAntrean antrean = new SistemAntrean();
        //Instansiasi Objek dengan menggunakan konstruktor sesuai dengan catatan modul supaya tidak membuang waktu
        antrean.tambahAntreanSilent(new Pembeli("Ainra", "08224500000"));
        antrean.tambahAntreanSilent(new Pembeli("Danra", "08224511111"));
        antrean.tambahAntreanSilent(new Pembeli("Sanri", "08224522222"));
        int pilihan;
        // Perulangan Fitur
        do {
            System.out.println("========================================");
            System.out.println("SISTEM ANTRIAN ROYAL DELISH");
            System.out.println("========================================");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian dan Pesan");
            System.out.println("4. Laporan Pesanan");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            pilihan = input.nextInt();
            input.nextLine();
            // Pemilihan Kondisi
            switch (pilihan) {
                case 1:
                    Pembeli pblawal = inputpPembeli(input); // method ada di bawah
                    antrean.tambahAntrean(pblawal); // Menambahkan antrean dengan memanggil method tambahAntrean yang ada dalam class SistemAntrean
                    break;
                case 2:
                    antrean.cetakAntrian(); // Memanggil method cetakAntrian yang ada dalam class SistemAntrean
                    break;
                case 3:
                    Pesanan psnawal = inputpPesanan(input); // Method ada di bawah
                    antrean.hapusAntrianDanPesan(psnawal); // Menambahkan pesanan dan menghapus antrean dengan memanggil method hapusAntrianDanPesan yang ada dalam class SistemAntrean
                    break;
                case 4:
                    antrean.laporanPesanan();// Mencetak seluruh riwayat pesanan yang sudah diurutkan secara manual berdasarkan abjad (Nama Pesanan)
                    break;
                case 0:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Menu tidak valid.");
            }
        } while (pilihan != 0);

        input.close();
    }

    // Method bantuan untuk membuat objek Pembeli baru berdasarkan inputan keyboard
    public static Pembeli inputpPembeli(Scanner input) {
        System.out.print("Masukkan Nama    : ");
        String namaPembeli = input.nextLine();
        System.out.print("Masukkan No Hp   : ");
        String Nohp = input.nextLine();
        return new Pembeli(namaPembeli, Nohp);
    }

    // Method bantuan untuk membuat objek Pesanan baru berdasarkan inputan keyboard
    public static Pesanan inputpPesanan(Scanner input) {
        System.out.print("Kode Pesanan    : ");
        int kodePesanan = input.nextInt();
        input.nextLine();
        System.out.print("Nama pesanan    : ");
        String namaPesanan = input.nextLine();
        System.out.print("Harga   : ");
        int harga = input.nextInt();
        input.nextLine();
        return new Pesanan(kodePesanan, namaPesanan, harga);
    }
}

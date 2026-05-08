package Tugas10;

import java.util.Scanner;

public class MainKRS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueKRS antrian = new QueueKRS(10);
        int pilihan;

        do {
            System.out.println("\n=== Layanan Persetujuan KRS DPA ===");
            System.out.println("1. Tambah Antrian Mahasiswa (Mendaftar)");
            System.out.println("2. Panggil Antrian Proses KRS (Memanggil 2 Mhs)");
            System.out.println("3. Lihat Semua Antrian KRS");
            System.out.println("4. Lihat 2 Antrian Terdepan");
            System.out.println("5. Lihat Antrian Paling Akhir");
            System.out.println("6. Cek Status Kosong / Penuh");
            System.out.println("7. Kosongkan Antrian KRS");
            System.out.println("8. Cetak Rekap Jumlah Antrian & Status Proses");
            System.out.println("0. Keluar");
            System.out.print("Pilih Menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi: ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    antrian.enqueue(new Mahasiswa(nim, nama, prodi, kelas));
                    break;
                case 2:
                    antrian.prosesKRS();
                    break;
                case 3:
                    antrian.printAll();
                    break;
                case 4:
                    antrian.lihatDuaTerdepan();
                    break;
                case 5:
                    antrian.lihatPalingAkhir();
                    break;
                case 6:
                    System.out.println("Queue Kosong? " + antrian.isEmpty());
                    System.out.println("Queue Penuh? " + antrian.isFull());
                    break;
                case 7:
                    antrian.clear();
                    break;
                case 8:
                    antrian.rekapKRS();
                    break;
                case 0:
                    System.out.println("Program Selesai.");
                    break;
                default:
                    System.out.println("Pilihan Tidak Valid.");
            }
        } while (pilihan != 0);
        sc.close();
    }
}
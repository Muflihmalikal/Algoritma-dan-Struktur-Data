package Jobsheet9.tugas;

import java.util.Scanner;

public class MainSurat17 {
    public static void main(String[] args) {
        StackSurat17 stack = new StackSurat17(10);
        Scanner sc = new Scanner(System.in);
        int menu;

        do {
            System.out.println("\nMenu Layanan Surat Izin Mahasiswa:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat (Berdasarkan Nama Mahasiswa)");
            System.out.println("5. Keluar");
            System.out.print("Pilih Menu: ");
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    System.out.print("ID Surat: ");
                    String id = sc.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    System.out.print("Jenis Izin (S: Sakit / I: Izin Lain): ");
                    char jenis = sc.nextLine().toUpperCase().charAt(0);
                    System.out.print("Durasi Izin (hari): ");
                    int durasi = sc.nextInt();
                    
                    Surat17 suratBaru = new Surat17(id, nama, kelas, jenis, durasi);
                    stack.push(suratBaru);
                    break;
                case 2:
                    Surat17 proses = stack.pop();
                    if (proses != null) {
                        System.out.println("Memproses Surat Izin:");
                        System.out.println("ID Surat: " + proses.idSurat);
                        System.out.println("Nama: " + proses.namaMahasiswa);
                        System.out.println("Status: Telah Divalidasi.");
                    }
                    break;
                case 3:
                    Surat17 terakhir = stack.peek();
                    if (terakhir != null) {
                        System.out.println("Surat Izin Terakhir:");
                        System.out.println("Nama: " + terakhir.namaMahasiswa + " | Durasi: " + terakhir.durasi + " Hari");
                    }
                    break;
                case 4:
                    System.out.print("Masukkan nama mahasiswa yang ingin dicari: ");
                    String cariNama = sc.nextLine();
                    stack.cariSurat(cariNama);
                    break;
                case 5:
                    System.out.println("Selesai...");
                    break;
                default:
                    System.out.println("Pilihan tidak ada.");
            }
        } while (menu != 5);
        sc.close();
    }
}
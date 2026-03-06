package quiz1;

import java.util.Scanner;

public class DosenMain_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Jumlah Dosen: ");
        int n = sc.nextInt();
        sc.nextLine();

        Dosis_17[] daftarDosen = new Dosis_17[n];

        for (int i = 0; i < n; i++) {

            System.out.println("\nData Dosen ke-" + (i + 1));

            System.out.print("NIDN : ");
            String nidn = sc.nextLine();

            System.out.print("Nama : ");
            String nama = sc.nextLine();

            System.out.print("Tahun Masuk : ");
            int tahunMasuk = sc.nextInt();
            sc.nextLine();

            System.out.print("Jenjang Pendidikan : ");
            String pendidikan = sc.nextLine();

            System.out.print("Prodi : ");
            String prodi = sc.nextLine();

            daftarDosen[i] = new Dosis_17(nidn, nama, tahunMasuk, pendidikan, prodi);
        }

        System.out.println("\n===== Data Dosen =====");
        for (int i = 0; i < n; i++) {
            daftarDosen[i].tampilkanInfo();
        }

        System.out.println("Apakah Ada Perubahan ?");
        System.out.print("(y untuk iya /n untuk tidak :)");
        String pilihan = sc.nextLine();

        if (pilihan.equalsIgnoreCase("y")) {
            System.out.println("masukkan nama dosen yang akan dirubah datanya :");
            String name = sc.nextLine();
            for (int i = 0; i < n; i++) {
                if (daftarDosen[i].nama.equalsIgnoreCase(name)) {
                    System.out.println("Data yang ingin dirubah :");
                    System.out.println("1. Program Studi");
                    System.out.println("2. Jenjang Pendidikan");
                    System.out.print("Ketik (1/2) : ");
                    String pil = sc.nextLine();
                    if (pil.equalsIgnoreCase("1")) {
                        System.out.println("Ubah Progaram Studi");
                        System.out.print("Masukkan Perubahan : ");
                        String prodibaru = sc.nextLine();
                        daftarDosen[i].ubahProdi(prodibaru);
                        break;
                    } else if (pil.equalsIgnoreCase("2")) {
                        System.out.println("Ubah Jenjang pendidikan");
                        System.out.print("Masukkan Perubahan : ");
                        String pendidikanBaru = sc.nextLine();
                        daftarDosen[i].ubahProdi(pendidikanBaru);
                    } else {
                        System.out.println("Fitur tidak terditeksi");
                    }
                } else{
                    System.out.println("Nama Dosen tidak ditemukan");
                }
            }

        }
        sc.close();
    }
}

package quiz1;

import java.util.Scanner;

public class MataKuliahMain_17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Kode MK : ");
        String kode = sc.nextLine();

        System.out.print("Nama MK : ");
        String nama = sc.nextLine();

        System.out.print("SKS : ");
        int sks = sc.nextInt();

        System.out.print("Jumlah Dosen Pengampu : ");
        int jml = sc.nextInt();
        sc.nextLine();
        MataKuliah_17 mk = new MataKuliah_17(kode, nama, sks, jml);

        for (int i = 0; i < jml; i++) {

            System.out.println("\nData Dosen ke-" + (i + 1));

            System.out.print("NIDN : ");
            String nidn = sc.nextLine();

            System.out.print("Nama : ");
            String namaDosen = sc.nextLine();

            System.out.print("Tahun Masuk : ");
            int tahunMasuk = sc.nextInt();
            sc.nextLine();

            System.out.print("Jenjang Pendidikan : ");
            String pendidikan = sc.nextLine();

            System.out.print("Prodi : ");
            String prodi = sc.nextLine();

            Dosis_17 d = new Dosis_17(nidn, namaDosen, tahunMasuk, pendidikan, prodi);
            mk.tambahDosen(d);
        }

        System.out.println("\n===== Data Mata Kuliah =====");
        mk.tampilkanInfo();
        sc.close();
    }
}
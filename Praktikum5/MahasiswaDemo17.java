import java.util.Scanner;

public class MahasiswaDemo17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        MahasiswaBerprestasi17 list = new MahasiswaBerprestasi17(jumlah);

        list.inputData();

        System.out.println("\nData mahasiswa sebelum sorting:");
        list.tampil();

        // System.out.println("\nData mahasiswa setelah sorting berdasarkan IPK
        // (DESC):");
        // list.bubbleSort();
        // list.tampil();

        System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC)");
        list.selectionSort();
        list.tampil();

        // System.out.println("Data yang sudah terurut menggunakan INSERTION SORT
        // (ASC)");
        // list.insertionSort();
        // list.tampil();

        System.out.println("---------------------------------");
        System.out.println("Pencarian data");
        System.out.println("---------------------------------");
        System.out.println("masukkan ipk mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        double cari = sc.nextDouble();

        // System.out.println("menggunakan sequential searching");
        // double posisi = list.sequentialSearching(cari);
        // int pss = (int) posisi;
        // list.tampilPosisi(cari, pss);
        // list.tampilDataSearch(cari, pss);
        System.out.println("");
        System.out.println("menggunakan binary search");
        System.out.println("");
        int posisi2 = list.findBinarySearch(cari, 0, list.listMhs.length - 1);
        int pss2 = (int) posisi2;
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);

        sc.close();
    }
}
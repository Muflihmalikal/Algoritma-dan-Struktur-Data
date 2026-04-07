import java.util.Scanner;

public class MainDosen17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah data dosen: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        DataDosen17 data = new DataDosen17(jumlah);

        int pilih;
        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampil Data");
            System.out.println("3. Sorting ASC (Termuda → Tertua)");
            System.out.println("4. Sorting DSC (Tertua → Termuda)");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    data.tambah(sc);
                    break;
                case 2:
                    data.tampil();
                    break;
                case 3:
                    data.bubbleSortASC();
                    System.out.println("Data berhasil diurutkan ASC");
                    break;
                case 4:
                    data.bubbleSortDSC();
                    System.out.println("Data berhasil diurutkan DSC");
                    break;
                case 5:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilih != 5);
    }
}

import java.util.Scanner;

public class tugas2 {
    static Scanner sc = new Scanner(System.in);

    public static void inputJadwal(String[][] jadwal, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Jadwal ke-" + (i + 1));
            System.out.print("Nama MK : ");
            jadwal[i][0] = sc.nextLine();
            System.out.print("Ruang : ");
            jadwal[i][1] = sc.nextLine();
            System.out.print("Hari : ");
            jadwal[i][2] = sc.nextLine();
            System.out.print("Jam : ");
            jadwal[i][3] = sc.nextLine();
            System.out.println();
        }
    }

    public static void tampilSemua(String[][] jadwal, int n) {
        System.out.println("=== Data Jadwal ===");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-20s %-15s %-10s %-10s%n",
                    jadwal[i][0], jadwal[i][1], jadwal[i][2], jadwal[i][3]);
        }
    }

    public static void cariHari(String[][] jadwal, int n) {
        System.out.print("Masukkan Hari : ");
        String hari = sc.nextLine();
        for (int i = 0; i < n; i++) {
            if (jadwal[i][2].equalsIgnoreCase(hari)) {
                System.out.println(jadwal[i][0] + " " + jadwal[i][3]);
            }
        }
    }

    public static void cariMK(String[][] jadwal, int n) {
        System.out.print("Masukkan Nama MK : ");
        String mk = sc.nextLine();
        for (int i = 0; i < n; i++) {
            if (jadwal[i][0].equalsIgnoreCase(mk)) {
                System.out.println(jadwal[i][0] + " " + jadwal[i][2] + " " + jadwal[i][3]);
            }
        }
    }

    public static void main(String[] args) {

        System.out.print("Jumlah Jadwal : ");
        int n = sc.nextInt();
        sc.nextLine();

        String[][] jadwal = new String[n][4];

        inputJadwal(jadwal, n);
        tampilSemua(jadwal, n);
        cariHari(jadwal, n);
        cariMK(jadwal, n);
    }
}

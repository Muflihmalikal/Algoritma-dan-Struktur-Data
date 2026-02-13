import java.util.Scanner;

public class praktikum1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("======================");
        System.out.print("Masukkan Nilai Tugas:");
        int tugas = sc.nextInt();
        System.out.print("Masukkan Nilai Kuis:");
        int kuiz = sc.nextInt();
        System.out.print("Masukkan Nilai UTS:");
        int uts = sc.nextInt();
        System.out.print("Masukkan Nilai UAS:");
        int uas = sc.nextInt();
        System.out.println("======================");
        System.out.println("======================");
        String huruf = "";
        if (tugas > 100 || kuiz > 100 || uts > 100 || uas > 100) {
            System.out.println("nilai tidak valid");
            System.out.println("======================");
            System.out.println("======================");
        } else {
            double akhir = (tugas * 0.2) + (kuiz * 0.2) + (uts * 0.3) + (uas * 0.3);
            System.out.println("nilai akhir : " + akhir);
            if (akhir > 80 && akhir <= 100) {
                huruf = "A";
                System.out.println("nilai huruf : " + huruf);
            } else if (akhir <= 80 && akhir > 73) {
                huruf = "B+";
                System.out.println("nilai huruf : " + huruf);
            } else if (akhir <= 73 && akhir > 65) {
                huruf = "B";
                System.out.println("nilai huruf : " + huruf);
            } else if (akhir <= 65 && akhir > 60) {
                huruf = "C+";
                System.out.println("nilai huruf : " + huruf);
            } else if (akhir <= 60 && akhir > 50) {
                huruf = "C";
                System.out.println("nilai huruf : " + huruf);
            } else if (akhir <= 50 && akhir > 39) {
                huruf = "D";
                System.out.println("nilai huruf : " + huruf);
            } else if (akhir <= 39) {
                huruf = "E";
                System.out.println("nilai huruf : " + huruf);
            }
            System.out.println("======================");
            System.out.println("======================");
            if ("D".equalsIgnoreCase(huruf) || "E".equalsIgnoreCase(huruf)) {
                System.out.println("Tidak Lulus");
            } else {
                System.out.println("SELAMAT ANDA Lulus");
            }
        }
        sc.close();
    }
}

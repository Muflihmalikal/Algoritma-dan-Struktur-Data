import java.util.Scanner;

public class praktikum3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mata kuliah: ");
        int jmlhmk = sc.nextInt();
        sc.nextLine();

        String[] mk = new String[jmlhmk];
        String[] huruf = new String[jmlhmk];
        int[] sks = new int[jmlhmk];
        double[] nilai = new double[jmlhmk];
        double[] nilaiSetara = new double[jmlhmk];

        double totalMutu = 0;
        int totalSKS = 0;

        System.out.println("=====================================");
        System.out.println("Input Data Mata Kuliah");
        System.out.println("=====================================");

        for (int i = 0; i < jmlhmk; i++) {
            System.out.print("Nama Mata Kuliah ke-" + (i + 1) + " : ");
            mk[i] = sc.nextLine();

            System.out.print("Bobot SKS : ");
            sks[i] = sc.nextInt();
            sc.nextLine();

            System.out.print("Nilai Huruf : ");
            huruf[i] = sc.nextLine();
            if (huruf[i].equalsIgnoreCase("A")) {
                nilaiSetara[i] = 4.0;
            } else if (huruf[i].equalsIgnoreCase("B+")) {
                nilaiSetara[i] = 3.5;
            } else if (huruf[i].equalsIgnoreCase("B")) {
                nilaiSetara[i] = 3.0;
            } else if (huruf[i].equalsIgnoreCase("C+")) {
                nilaiSetara[i] = 2.5;
            } else if (huruf[i].equalsIgnoreCase("C")) {
                nilaiSetara[i] = 2.0;
            } else if (huruf[i].equalsIgnoreCase("D")) {
                nilaiSetara[i] = 1.0;
            } else {
                nilaiSetara[i] = 0.0;
            }
        }
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Masukkan nilai angka dari MK " + mk[i] + " : ");
            nilai[i] = sc.nextDouble();
        }

        System.out.println("=====================================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("=====================================");
        System.out.printf("%-25s%-10s%-15s%-10s%n",
                "MK", "nilai angka", "Nilai Huruf", "Bobot");

        for (int i = 0; i < jmlhmk; i++) {
            System.out.printf("\"%-25s%-10.2f%-15s%-10.2f%n",
                    mk[i], nilai[i], huruf[i], nilaiSetara[i]);

            totalMutu += nilaiSetara[i] * sks[i];
            totalSKS += sks[i];
        }
        double ip = totalMutu / totalSKS;

        System.out.println("=====================================");
        System.out.printf("IP Semester : %.2f%n", ip);

        sc.close();
    }
}
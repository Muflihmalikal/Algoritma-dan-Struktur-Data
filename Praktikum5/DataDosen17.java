import java.util.Scanner;

class DataDosen17 {
    DOsen17[] listDosen;
    int idx = 0;

    DataDosen17(int jumlah) {
        listDosen = new DOsen17[jumlah];
    }

    void tambah(Scanner sc) {
        if (idx < listDosen.length) {
            System.out.print("Nama Dosen: ");
            String nama = sc.nextLine();

            System.out.print("Usia: ");
            int usia = sc.nextInt();
            sc.nextLine();

            listDosen[idx] = new DOsen17(nama, usia);
            idx++;
        } else {
            System.out.println("Data penuh!");
        }
    }

    void tampil() {
        for (int i = 0; i < idx; i++) {
            listDosen[i].tampil();
        }
    }

    void bubbleSortASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 1; j < idx - i; j++) {
                if (listDosen[j - 1].usia > listDosen[j].usia) {
                    DOsen17 tmp = listDosen[j];
                    listDosen[j] = listDosen[j - 1];
                    listDosen[j - 1] = tmp;
                }
            }
        }
    }

    void bubbleSortDSC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 1; j < idx - i; j++) {
                if (listDosen[j - 1].usia < listDosen[j].usia) {
                    DOsen17 tmp = listDosen[j];
                    listDosen[j] = listDosen[j - 1];
                    listDosen[j - 1] = tmp;
                }
            }
        }
    }
}

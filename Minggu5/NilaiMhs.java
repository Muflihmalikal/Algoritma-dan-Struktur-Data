package Minggu5;

public class NilaiMhs {

    String[] nama = { "Ahmad", "Budi", "Cindy", "Dian", "Eko", "Fajar", "Gina", "Hadi" };
    String[] nim = { "220101001", "220101002", "220101003", "220101004", "220101005", "220101006", "220101007",
            "220101008" };
    int[] tahunMasuk = { 2022, 2022, 2021, 2021, 2023, 2020, 2023, 2020 };

    int[] nilaiUTS = { 78, 85, 90, 76, 92, 88, 80, 82 };
    int[] nilaiUAS = { 82, 88, 87, 79, 95, 85, 83, 84 };

    int jumlah = nilaiUTS.length;

    int maxUTS_DC(int l, int r) {
        if (l == r) {
            return nilaiUTS[l];
        }

        int mid = (l + r) / 2;

        int left = maxUTS_DC(l, mid);
        int right = maxUTS_DC(mid + 1, r);

        return Math.max(left, right);
    }

    int minUTS_DC(int l, int r) {
        if (l == r) {
            return nilaiUTS[l];
        }

        int mid = (l + r) / 2;

        int left = minUTS_DC(l, mid);
        int right = minUTS_DC(mid + 1, r);

        return Math.min(left, right);
    }

    double rataUAS_BF() {
        double total = 0;

        for (int i = 0; i < jumlah; i++) {
            total += nilaiUAS[i];
        }

        return total / jumlah;
    }
}

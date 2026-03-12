package Minggu5;

public class NilaiMhsMain {
    public static void main(String[] args) {

        NilaiMhs nm = new NilaiMhs();

        System.out.println("UTS Tertinggi : " + nm.maxUTS_DC(0, nm.jumlah - 1));
        System.out.println("UTS Terendah  : " + nm.minUTS_DC(0, nm.jumlah - 1));
        System.out.println("Rata-rata UAS : " + nm.rataUAS_BF());

    }
}

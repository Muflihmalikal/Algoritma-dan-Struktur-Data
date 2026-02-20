public class MataKuliahMain17 {
    public static void main(String[] args) {
        MataKuliah17 mhs1 = new MataKuliah17();
        mhs1.nama = "Sistem Operasi";
        mhs1.kodeMK = "ysmaieg";
        mhs1.sks = 2;
        mhs1.jumlahjam = 7;
        mhs1.tampilinformasi();
        mhs1.ubahSKS(4);
        mhs1.tambahJam(8);
        mhs1.tampilinformasi();
        mhs1.kurangiJam(5);
        mhs1.tampilinformasi();
        mhs1.kurangiJam(16);
        mhs1.tampilinformasi();
        MataKuliah17 mhs2 = new MataKuliah17("PASD", "OOP", 12, 30);
        mhs2.tampilinformasi();
    }
}

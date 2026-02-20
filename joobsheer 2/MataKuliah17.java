public class MataKuliah17 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahjam;

    void tampilinformasi() {
        System.out.println("KodeMata Kuliah: " + kodeMK);
        System.out.println("Nama Mata Kuliah: " + nama);
        System.out.println("Jumalag SKS: " + sks);
        System.out.println("Jumlah Jam: " + jumlahjam);
    }

    void ubahSKS(int sksBaru) {
        this.sks = sksBaru;
        System.out.println("SKS berhasil diubah menjadi " + this.sks);
    }

    void tambahJam(int jam) {
        this.jumlahjam += jam;
    }

    void kurangiJam(int jam) {
        if (this.jumlahjam < jam) {
            System.out.println("Pengurangan tidak dapat dilakukan");
        } else {
            this.jumlahjam -= jam;
            System.out.println("Jam berhasil dikurangi. Total jam sekarang: " + this.jumlahjam);
        }
    }

    public MataKuliah17() {

    }

    public MataKuliah17(String nm, String kodeMK, int sks, int jumlahjam) {
        this.nama = nm;
        this.kodeMK = kodeMK;
        this.sks = sks;
        this.jumlahjam = jumlahjam;
    }
}

public class Dosen17 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlihan;

    void tampilinformasi() {
        System.out.println("Id Dosen: " + idDosen);
        System.out.println("Nama Dosen: " + nama);
        System.out.println("Status Dosen: " + statusAktif);
        System.out.println("Tahun Bergabung: " + tahunBergabung);
        System.out.println("Bidang Keahlian: " + bidangKeahlihan);
    }

    void setStatusAktif(boolean status) {
        this.statusAktif = status;
        if (status) {
            System.out.println("Dosen AKTIF.");
        } else {
            System.out.println("Dosen TIDAK AKTIF.");
        }
    }

    public int hitungMasaKerja(int thnSkrg) {
        return thnSkrg - this.tahunBergabung;
    }

    void ubahKeahlian(String bidang) {
        this.bidangKeahlihan = bidang;
        System.out.println("Bidang keahlian berhasil diubah menjadi " + bidang);
    }

    public Dosen17() {

    }

    public Dosen17(String nm, String id, int thn, boolean status, String bidang) {
        this.nama = nm;
        this.idDosen = id;
        this.tahunBergabung = thn;
        this.statusAktif = status;
        this.bidangKeahlihan = bidang;
    }
}

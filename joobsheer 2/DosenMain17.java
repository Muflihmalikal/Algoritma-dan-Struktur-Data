public class DosenMain17 {
    public static void main(String[] args) {
        Dosen17 dsn1 = new Dosen17();
        dsn1.idDosen = "2362817";
        dsn1.nama = "Kurniawan";
        dsn1.setStatusAktif(true);
        dsn1.tahunBergabung = 2023;
        dsn1.bidangKeahlihan = "SIPIL";
        dsn1.tampilinformasi();
        int masaKerja = dsn1.hitungMasaKerja(2026);
        System.out.println("Masa kerja: " + masaKerja + " tahun");
        dsn1.ubahKeahlian("TIK");
        dsn1.tampilinformasi();
        Dosen17 dsn2 = new Dosen17("Supratman", "5230839", 2023, true, "Akutansi");
        dsn2.tampilinformasi();
    }
}

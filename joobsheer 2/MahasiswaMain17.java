public class MahasiswaMain17 {
    public static void main(String[] args) {
        Mahasiswa17 mhsl = new Mahasiswa17();
        mhsl.nama = "Muhammad Ali Farhan";
        mhsl.nim = "2241720171";
        mhsl.kelas = "SI 2J";
        mhsl.ipk = 3.55;

        mhsl.tampilkanInformasi();
        mhsl.ubahKelas("SI 2K");
        mhsl.updateIPK(3.60);
        mhsl.tampilkanInformasi();

        Mahasiswa17 mhs2 = new Mahasiswa17("Annisa Nabila", "2141720160", 3.25, "TI 2L");
        mhs2.updateIPK(3.30);
        mhs2.tampilkanInformasi();
        Mahasiswa17 mhsMuflih = new Mahasiswa17("Muhammad Muflih Rafiansyah Fendy", "254107060099", 3.89, "SIB 1D");
        mhsMuflih.tampilkanInformasi();
    }
}

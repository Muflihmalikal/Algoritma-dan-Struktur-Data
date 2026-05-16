package Jobsheet12;

public class Mahasiswa17 {
    // Percobaan 1 nomor 3
    String nim;
    String nama;
    String kelas;
    double ipk;

    public Mahasiswa17(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tampil() {
        System.out.println(
                "NIM : " + nim +
                        "\nNama : " + nama +
                        "\nKelas : " + kelas +
                        "\nIPK : " + ipk

        );
    }
    // Penutupan Percobaan 1 nomor 3
}

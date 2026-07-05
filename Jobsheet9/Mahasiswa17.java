package Jobsheet9;

public class Mahasiswa17 {
   String nim, nama, kelas;
    int nilai;

    Mahasiswa17(String nama, String nim, String kelas) {
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        this.nilai = -1;
    }

    void tugasDinilai(int nilai) {
        this.nilai = nilai;
    }
}

package Tugas10;

public class Mahasiswa {

    String nim;
    String nama;
    String prodi;
    String kelas;
    Mahasiswa[] data;
    int front;
    int rear;
    int size;
    int max;

    public Mahasiswa(String nim, String nama, String prodi, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.kelas = kelas;
    }

    public void tampilkanData() {
        System.out.println(nim + " - " + nama + " - " + prodi + " - " + kelas);
    }

}

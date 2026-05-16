package Pertemuan12;
public class Mahasiswa17 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    public Mahasiswa17() {
    }

    public Mahasiswa17(String nm, String name, String kls, double ip) {
        this.nim = nm;
        this.nama = name;
        this.kelas = kls;
        this.ipk = ip;
    }

    public void tampilInformasi() {
        System.out.println(nama);
        System.out.println(nim);
        System.out.println(kelas);
        System.out.println(ipk);
    }
}
package CaseMethod;

public class Pembeli {
    String namaPembeli;
    String NoHp;

    // Constructor sesuai diagram
    public Pembeli(String b, String c) {
        namaPembeli = b; 
        NoHp = c;
    }

    // Tambahan method untuk menampilkan data
    public void tampilkanInfoPembeli() {
        System.out.println("--- Data Pembeli ---");
        System.out.println("Nama  : " + namaPembeli);
        System.out.println("No HP : " + NoHp);
    }
}
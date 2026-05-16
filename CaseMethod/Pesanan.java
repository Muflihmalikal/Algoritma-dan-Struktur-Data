package CaseMethod;

public class Pesanan {
    int kodePesanan;
    String namaPesanan;
    int harga;

    // Constructor sesuai diagram
    public Pesanan(int a, String b, int d) {
        kodePesanan = a;
        namaPesanan = b;
        harga = d;
    }

    // Tambahan method untuk menampilkan data
    public void tampilkanInfoPesanan() {
        System.out.println("--- Data Pesanan ---");
        System.out.println("Kode Pesanan : " + kodePesanan);
        System.out.println("Nama Pesanan : " + namaPesanan);
        System.out.println("Harga        : Rp" + harga);
    }
}
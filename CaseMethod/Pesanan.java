package CaseMethod;

public class Pesanan {
    int kodePesanan;
    String namaPesanan;
    int harga;
    String kategori; // modifikasi menambahkan variabel baru

    // Constructor sesuai diagram
    public Pesanan(int a, String b, int d, String k) {
        kodePesanan = a;
        namaPesanan = b;
        harga = d;
        kategori = k;// menambahkan kategori
    }

    // Tambahan method untuk menampilkan data
    public void tampilkanInfoPesanan() {
        System.out.println("--- Data Pesanan ---");
        System.out.println("Kode Pesanan : " + kodePesanan);
        System.out.println("Nama Pesanan : " + namaPesanan);
        System.out.println("Kategori     : " + kategori);
        System.out.println("Harga        : Rp" + harga);
    }
}
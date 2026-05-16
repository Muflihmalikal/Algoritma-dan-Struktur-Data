package CaseMethod;

public class Node {
    int noAntrean;
    Pembeli pembeli;
    Pesanan pesanan; // Awalnya null, baru diisi saat dipanggil/memesan
    Node prev, next;

    public Node(int noAntrean, Pembeli pembeli) {
        this.noAntrean = noAntrean;
        this.pembeli = pembeli;
        this.pesanan = null; // Belum ada pesanan saat baru antre
        this.prev = null;
        this.next = null;
    }
}
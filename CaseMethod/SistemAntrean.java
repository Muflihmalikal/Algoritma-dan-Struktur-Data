package CaseMethod;

public class SistemAntrean {
    // Pointer untuk Double Linked List Antrean Utama (Belum diproses)
    Node head, tail;
    int size; // Menyimpan jumlah antrean saat ini
    int nomorAntreanOtomatis; // Counter untuk men-generate nomor urut antrean secara otomatis

    // Pointer untuk Double Linked List Laporan/Riwayat (Sudah diproses/memesan)
    Node headRiwayat, tailRiwayat;

    public SistemAntrean() {
        head = null;
        tail = null;
        size = 0;
        nomorAntreanOtomatis = 0;

        // Inisialisasi riwayat
        headRiwayat = null;
        tailRiwayat = null;
    }

    // Method pengecekan apakah Antrean Utama kosong
    public boolean isEmpty() {
        return head == null;
    }

    // Method pengecekan apakah Riwayat Pesanan kosong
    public boolean isRiwayatEmpty() {
        return headRiwayat == null;
    }

    // --- Fitur 1: Tambah Antrian ---
    public void tambahAntrean(Pembeli pembeliBaru) {
        nomorAntreanOtomatis++; // Nomor antrean otomatis bertambah
        Node newNode = new Node(nomorAntreanOtomatis, pembeliBaru);

        // Menambahkan data ke posisi paling belakang (Konsep Enqueue pada Queue)
        if (isEmpty()) {
            head = tail = newNode; // Jika kosong, head dan tail menunjuk ke node yang sama
        } else {
            tail.next = newNode; // Sambungkan tail lama ke node baru
            newNode.prev = tail; // Sambungkan prev node baru ke tail lama
            tail = newNode;// Pindahkan pointer tail ke node paling baru
        }
        size++;

        // Menampilkan output sesuai format di soal
        System.out.println("Nama Pembeli : " + pembeliBaru.namaPembeli);
        System.out.println("No HP        : " + pembeliBaru.NoHp);
        System.out.println("Antrian berhasil ditambahkan dengan nomor: " + nomorAntreanOtomatis);
        System.out.println("----------------------------------------");
    }

    // --- Fitur 2: Cetak Antrian ---
    public void cetakAntrian() {
        System.out.println("========================================");
        System.out.println("Daftar Antrian Pembeli");
        System.out.println("========================================");
        // %-15s artinya format String dengan lebar 15 karakter dan rata kiri
        System.out.printf("%-15s %-20s %s\n", "No Antrian", "Nama", "No HP");

        if (isEmpty()) {
            System.out.println("Antrian saat ini kosong.");
            return;
        }

        // Traversal dari head sampai menemukan null
        Node current = head; // Mulai dari node paling depan
        while (current != null) {
            System.out.printf("%-15d %-20s %s\n",
                    current.noAntrean,
                    current.pembeli.namaPembeli,
                    current.pembeli.NoHp);
            current = current.next; // Lanjut ke node berikutnya
        }
    }

    // --- Fitur 3: Hapus Antrian dan Pesan ---
    public void hapusAntrianDanPesan(Pesanan pesananBaru) {
        // Cek apakah antrean kosong
        if (isEmpty()) {
            System.out.println("Antrian saat ini kosong, tidak ada yang bisa dipanggil.");
            return;
        }

        // Ambil data orang terdepan (FIFO)
        Node nodeSelesai = head;

        // Hapus dari antrean utama (Dequeue)
        head = head.next;
        if (head != null) {
            head.prev = null;// Putuskan koneksi ke node lama agar terhapus sempurna
        } else {
            tail = null; // Jika antrean jadi kosong
        }
        size--;

        // 3. Masukkan data pesanan yang baru diinput ke dalam node pembeli tersebut
        nodeSelesai.pesanan = pesananBaru;

        // 4. Bersihkan pointer prev & next dari node yang dihapus
        nodeSelesai.next = null;
        nodeSelesai.prev = null;

        // 5. Pindahkan node tersebut ke dalam struktur data Linked List Riwayat
        if (headRiwayat == null) {
            headRiwayat = tailRiwayat = nodeSelesai;
        } else {
            tailRiwayat.next = nodeSelesai;
            nodeSelesai.prev = tailRiwayat;
            tailRiwayat = nodeSelesai;
        }

        // Tampilkan output sukses
        System.out.println(nodeSelesai.pembeli.namaPembeli + " telah memesan " + pesananBaru.namaPesanan);
    }

    // --- Method Bantuan untuk Sorting (Bubble Sort pada Linked List) ---
    private void urutkanRiwayatByNamaPesanan() {
        // Jika riwayat kosong atau hanya 1 data, tidak perlu diurutkan
        if (headRiwayat == null || headRiwayat.next == null) {
            return;
        }

        boolean ditukar;
        Node current;

        // Menggunakan Algoritma Bubble Sort manual untuk Double Linked List
        do {
            ditukar = false;
            current = headRiwayat;

            while (current.next != null) {
                // Membandingkan nama pesanan secara alfabet (A-Z) mengabaikan huruf besar/kecil
                if (current.pesanan.namaPesanan.compareToIgnoreCase(current.next.pesanan.namaPesanan) > 0) {

                    // Jika urutan salah, lakukan Swap Pertukaran Data di dalam Node
                    Pesanan tempPesanan = current.pesanan;
                    current.pesanan = current.next.pesanan;
                    current.next.pesanan = tempPesanan;

                    Pembeli tempPembeli = current.pembeli;
                    current.pembeli = current.next.pembeli;
                    current.next.pembeli = tempPembeli;

                    int tempNo = current.noAntrean;
                    current.noAntrean = current.next.noAntrean;
                    current.next.noAntrean = tempNo;

                    ditukar = true;// Menandakan ada pertukaran yang terjadi di iterasi ini
                }
                current = current.next;// Lanjut node berikutnya
            }
        } while (ditukar);// Ulangi terus sampai tidak ada data yang perlu ditukar lagi
    }

    // --- Fitur 4: Laporan Pesanan ---
    public void laporanPesanan() {
        System.out.println("========================================");
        System.out.println("LAPORAN PESANAN (URUT NAMA PESANAN)");
        System.out.println("========================================");
        // Format ditambahkan kolom kategori (15 karakter kiri)
        System.out.printf("%-18s %-25s %-15s %s\n", "Kode Pesanan", "Nama Pesanan", "Kategori", "Harga");
        if (isRiwayatEmpty()) {
            System.out.println("Belum ada pesanan yang masuk.");
            return;
        }

        // Panggil method sorting manual sebelum melakukan pencetakan data
        urutkanRiwayatByNamaPesanan();

        // Traversal mencetak data dari Double Linked List Riwayat yang sudah terurut
        Node current = headRiwayat;
        // Variabel untuk menyimpan rekap pesanan
        int totalMakanan = 0;
        int totalMinuman = 0;
        while (current != null) {
            System.out.printf("%-18d %-25s %-15s %d\n",
                    current.pesanan.kodePesanan,
                    current.pesanan.namaPesanan,
                    current.pesanan.kategori,// Menampilkan Kategori dalam kolom pesanan
                    current.pesanan.harga);
            // Proses pengecekan kategori untuk rekap (mengabaikan huruf besar/kecil)
            if (current.pesanan.kategori.equalsIgnoreCase("Makanan")) {
                totalMakanan++;
            } else if (current.pesanan.kategori.equalsIgnoreCase("Minuman")) {
                totalMinuman++;
            }
            current = current.next; // Lanjut ke data berikutnya
        }
        // Menampilkan Rekapitulasi di bagian bawah
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Rekap Jumlah Pesanan:");
        System.out.println("Total Makanan : " + totalMakanan);
        System.out.println("Total Minuman : " + totalMinuman);
        System.out.println("=================================================================");
    }

    // Penmabhan Untuk data yang diinputkan saat awal program tidak muncul dalam
    // permukaan
    public void tambahAntreanSilent(Pembeli pembeliBaru) {
        nomorAntreanOtomatis++;
        Node newNode = new Node(nomorAntreanOtomatis, pembeliBaru);

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
        // Sengaja tidak ada System.out.println di sini agar senyap
    }
}

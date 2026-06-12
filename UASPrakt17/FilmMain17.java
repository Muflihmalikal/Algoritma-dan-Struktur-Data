package UASPrakt17;

public class FilmMain17 {
 public static void main(String[] args) {
        BinarySearchTreeFilm17 bst = new BinarySearchTreeFilm17();

        // Menginput Data Awal ke Tree
        bst.add(new Film17("FL105", "Interstellar", "Sci-Fi", 8.6));
        bst.add(new Film17("FL102", "Coco", "Animation", 8.4));
        bst.add(new Film17("FL108", "Inception", "Sci-Fi", 8.8));
        bst.add(new Film17("FL101", "Up", "Animation", 8.3));
        bst.add(new Film17("FL104", "Parasite", "Thriller", 8.5));
        bst.add(new Film17("FL107", "Spirited Away", "Fantasy", 8.6));

        // 1. Tampilkan seluruh data film menggunakan in-order traversal
        System.out.println("Data film in-order:");
        bst.traverseInOrder(bst.root);
        System.out.println();

        // 2. Tampilkan seluruh data film menggunakan pre-order traversal
        System.out.println("Data film pre-order:");
        bst.traversePreOrder(bst.root);
        System.out.println();

        // 3. Tampilkan hasil pencarian kode film FL104
        System.out.print("Pencarian FL104: ");
        if (bst.find("FL104")) {
            System.out.println("ditemukan");
        } else {
            System.out.println("tidak ditemukan");
        }

        // 4. Tampilkan hasil pencarian kode film FL110
        System.out.print("Pencarian FL110: ");
        if (bst.find("FL110")) {
            System.out.println("ditemukan");
        } else {
            System.out.println("tidak ditemukan");
        }
        System.out.println();

        // 5. Tampilkan jumlah seluruh film dalam tree
        System.out.println("Jumlah film: " + bst.hitungJumlahFilm(bst.root));
        System.out.println();

        // 6. Tampilkan data film dengan rating tertinggi
        System.out.println("Film dengan rating tertinggi:");
        Film17 tertinggi = bst.cariRatingTertinggi(bst.root);
        if (tertinggi != null) {
            System.out.println("Kode Film: " + tertinggi.kodeFilm);
            System.out.println("Judul: " + tertinggi.judul);
            System.out.println("Genre: " + tertinggi.genre);
            System.out.println("Rating: " + tertinggi.rating);
        }
    }
   
}

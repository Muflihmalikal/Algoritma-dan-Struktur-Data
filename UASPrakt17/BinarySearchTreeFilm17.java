package UASPrakt17;

public class BinarySearchTreeFilm17 {
    NodeFilm17 root;

    public BinarySearchTreeFilm17() {
        root = null;
    }

    // Method mengecek apakah tree kosong
    public boolean isEmpty() {
        return root == null;
    }

    // Method untuk menambahkan data film ke dalam tree
    public void add(Film17 data) {
        root = addRecursive(root, data);
    }

    private NodeFilm17 addRecursive(NodeFilm17 current, Film17 data) {
        if (current == null) {
            return new NodeFilm17(data);
        }

        // Membandingkan kodeFilm secara ascending
        if (data.kodeFilm.compareTo(current.data.kodeFilm) < 0) {
            current.left = addRecursive(current.left, data);
        } else if (data.kodeFilm.compareTo(current.data.kodeFilm) > 0) {
            current.right = addRecursive(current.right, data);
        }

        return current;
    }

    // Method untuk mencari film berdasarkan kode
    public boolean find(String kodeFilm) {
        return findRecursive(root, kodeFilm);
    }

    private boolean findRecursive(NodeFilm17 current, String kodeFilm) {
        if (current == null) {
            return false;
        }

        if (kodeFilm.equals(current.data.kodeFilm)) {
            return true;
        }

        if (kodeFilm.compareTo(current.data.kodeFilm) < 0) {
            return findRecursive(current.left, kodeFilm);
        } else {
            return findRecursive(current.right, kodeFilm);
        }
    }

    // Traversal In-Order (Left, Root, Right)
    public void traverseInOrder(NodeFilm17 node) {
        if (node != null) {
            traverseInOrder(node.left);
            node.data.tampilInformasi();
            traverseInOrder(node.right);
        }
    }

    // Traversal Pre-Order (Root, Left, Right)
    public void traversePreOrder(NodeFilm17 node) {
        if (node != null) {
            node.data.tampilInformasi();
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    // Method untuk menghitung total node/film di dalam tree
    public int hitungJumlahFilm(NodeFilm17 node) {
        if (node == null) {
            return 0;
        }
        return 1 + hitungJumlahFilm(node.left) + hitungJumlahFilm(node.right);
    }

    // Method rekursif untuk mencari film dengan rating tertinggi
    public Film17 cariRatingTertinggi(NodeFilm17 node) {
        if (node == null) {
            return null;
        }

        Film17 maxFilm = node.data;
        Film17 leftMax = cariRatingTertinggi(node.left);
        Film17 rightMax = cariRatingTertinggi(node.right);

        if (leftMax != null && leftMax.rating > maxFilm.rating) {
            maxFilm = leftMax;
        }
        if (rightMax != null && rightMax.rating > maxFilm.rating) {
            maxFilm = rightMax;
        }

        return maxFilm;
    }
}

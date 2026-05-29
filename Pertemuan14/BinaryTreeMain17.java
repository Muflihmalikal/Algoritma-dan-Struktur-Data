package Pertemuan14;
public class BinaryTreeMain17 {
    public static void main(String[] args) {
        BinaryTree17 bst = new BinaryTree17();
        
        bst.addRekursif(new Mahasiswa17("244160121", "Ali", "A", 3.57));
        bst.addRekursif(new Mahasiswa17("244160221", "Badar", "B", 3.85));
        bst.addRekursif(new Mahasiswa17("244160185", "Candra", "C", 3.21));
        bst.addRekursif(new Mahasiswa17("244160220", "Dewi", "B", 3.54));

        System.out.println("\nDaftar semua mahasiswa (in order traversal):");
        bst.traverseInOrder(bst.root);
        
        System.out.println("\n--- TUGAS 2 ---");
        bst.cariMinIPK();
        bst.cariMaxIPK();
        
        System.out.println("\n--- TUGAS 3 ---");
        bst.tampilMahasiswaIPKdiAtas(3.50);
        
        System.out.println("\nPenghapusan data mahasiswa");
        bst.delete(3.57);
        System.out.println("Daftar semua mahasiswa setelah penghapusan 1 mahasiswa (in order traversal):");
        bst.traverseInOrder(bst.root);
    }
}
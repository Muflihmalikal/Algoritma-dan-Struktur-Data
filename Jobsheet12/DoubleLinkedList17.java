package Jobsheet12;

import org.w3c.dom.Node;

public class DoubleLinkedList17 {
    // Percobaan 1 nomor 5
    Node17 head;
    Node17 tail;
    // Penutup Percobaan 1 nomor 5

    // Percobaan 1 nomor 6
    public DoubleLinkedList17() {
        head = null;
        tail = null;
    }
    // Penutup Percobaan 1 nomor 6

    // Percobaan 1 nomor 7
    public boolean isEmpty() {
        return head == null;

    }
    // Penutup Percobaan 1 nomor 7

    // Percobaan 1 nomor 8
    public void addFirst(Mahasiswa17 data) {
        Node17 newNode = new Node17(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;

        }

    }
    // Penutup Percobaan 1 nomor 8

    // Percobaan 1 nomor 9
    public void addLast(Mahasiswa17 data) {
        Node17 newNode = new Node17(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;

        }
    }
    // Penutup Percobaan 1 nomor 9

    // Percobaan 1 nomor 10
    public void insertAfter(String keyNim, Mahasiswa17 data) {
        Node17 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Data dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }
        Node17 newNode = new Node17(data);

        // jika current adalah tail, node baru ditambahkan di akhir
        if (current == tail) {
            newNode.prev = current;
            current.next = newNode;
            tail = newNode;
        } else { // node baru disisipkan di tengah
            newNode.prev = current;
            newNode.next = current.next;
            current.next.prev = newNode;
            current.next = newNode;
        }
        System.out.println("Data berhasil disisipkan setelah NIM " + keyNim);

    }
    // Penutup Percobaan 1 nomor 10

    // Percobaan 1 nomor 11
    public void print() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong.");
            return;
        }
        Node17 current = head;
        while (current != null) {
            current.data.tampil();
            current = current.next;

        }
    }

    // Penutup Percobaan 1 nomor 11
    // Modifikasi Pertanyaan 1 nomor 6
    public void printReverse() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong.");
            return;
        }
        System.out.println("Mencetak isi linked list secara terbalik:");
        Node17 current = tail;
        while (current != null) {
            current.data.tampil();
            current = current.prev; // Berjalan mundur menggunakan prev
        }
    }
    // Penutup Pertanyaan 1 nomor 6

    // Percobaan 2 nomor 1
    public void removeFirst() {
    if (isEmpty()) {
        System.out.println("Linked List kosong.");
        return;
    }
    System.out.println("\n--- Data yang berhasil dihapus di awal ---");
    head.data.tampil(); 
    System.out.println("------------------------------------------");

    if (head == tail) {
        head = tail = null;
    } else {
        head = head.next;
        head.prev = null;
    }
}
    // Penutup Percobaan 2 nomor 1

    // Percobaan 2 nomor 2
    public void removeLast() {
    if (isEmpty()) {
        System.out.println("Linked List kosong.");
        return;
    }
    System.out.println("\n--- Data yang berhasil dihapus di akhir ---");
    tail.data.tampil(); 
    System.out.println("-------------------------------------------");

    if (head == tail) {
        head = tail = null;
    } else {
        tail = tail.prev;
        tail.next = null;
    }
}
    // Penutup Percobaan 2 nomor 2

}
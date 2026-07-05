package Jobsheet9.tugas;

public class StackSurat17 {
    Surat17[] suratArray;
    int top;
    int size;

    public StackSurat17(int size) {
        this.size = size;
        suratArray = new Surat17[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(Surat17 surat) {
        if (!isFull()) {
            top++;
            suratArray[top] = surat;
            System.out.println("Surat dari " + surat.namaMahasiswa + " berhasil ditambahkan.");
        } else {
            System.out.println("Stack surat penuh!");
        }
    }

    public Surat17 pop() {
        if (!isEmpty()) {
            Surat17 popSurat = suratArray[top];
            top--;
            return popSurat;
        } else {
            System.out.println("Belum ada surat izin yang masuk.");
            return null;
        }
    }

    public Surat17 peek() {
        if (!isEmpty()) {
            return suratArray[top];
        } else {
            System.out.println("Belum ada surat izin yang masuk.");
            return null;
        }
    }

    public void cariSurat(String nama) {
        if (!isEmpty()) {
            boolean found = false;
            for (int i = top; i >= 0; i--) {
                if (suratArray[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                    System.out.println("Surat Ditemukan!");
                    System.out.println("ID Surat: " + suratArray[i].idSurat);
                    System.out.println("Nama: " + suratArray[i].namaMahasiswa);
                    System.out.println("Jenis Izin: " + (suratArray[i].jenisIzin == 'S' ? "Sakit" : "Izin Lain"));
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Surat atas nama " + nama + " tidak ditemukan.");
            }
        } else {
            System.out.println("Belum ada surat yang terdaftar.");
        }
    }
}

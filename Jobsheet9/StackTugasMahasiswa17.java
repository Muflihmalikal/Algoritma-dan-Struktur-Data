package Jobsheet9;

public class StackTugasMahasiswa17 {
    Mahasiswa17[] stack;
    int size;
    int top;

    public StackTugasMahasiswa17(int size) {
        this.size = size;
        stack = new Mahasiswa17[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(Mahasiswa17 mhs) {
        if (!isFull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan tugas lagi.");
        }
    }

    public Mahasiswa17 pop() {
        if (!isEmpty()) {
            Mahasiswa17 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack kosong! Tidak ada tugas untuk dinilai.");
            return null;
        }
    }

    public Mahasiswa17 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan");
            return null;
        }
    }
    
    // Melihat tugas terbawah (yang pertama kumpul)
    public Mahasiswa17 peekBottom() {
        if (!isEmpty()) {
            return stack[0];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan");
            return null;
        }
    }

    public void print() {
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
        }
    }
    
    // Menghitung jumlah tugas
    public int getJumlahTugas() {
        return top + 1;
    }

    public String konversiDesimalKeBiner(int nilai) {
        StackKonversi17 stackKonv = new StackKonversi17();
        while (nilai > 0) {
            int sisa = nilai % 2;
            stackKonv.push(sisa);
            nilai = nilai / 2;
        }
        String biner = new String();
        while (!stackKonv.isEmpty()) {
            biner += stackKonv.pop();
        }
        return biner;
    }
}

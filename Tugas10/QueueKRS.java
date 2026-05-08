package Tugas10;

public class QueueKRS {
    Mahasiswa[] data;
    int front, rear, size, max;
    int jumlahKRS;
    int maxDPA = 30;

    public QueueKRS(int n) {
        max = n;
        data = new Mahasiswa[max];
        size = 0;
        front = rear = -1;
        jumlahKRS = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void clear() {
        if (!isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Antrian KRS berhasil dikosongkan.");
        } else {
            System.out.println("Antrian masih kosong.");
        }
    }

    public void enqueue(Mahasiswa dt) {
        if (isFull()) {
            System.out.println("Antrian penuh, maksimal 10 Mahasiswa!");
        } else {
            if (isEmpty())
                front = rear = 0;
            else
                rear = (rear == max - 1) ? 0 : rear + 1;

            data[rear] = dt;
            size++;
            System.out.println(dt.nama + " masuk ke antrian persetujuan KRS.");
        }
    }

    public void prosesKRS() {
        if (isEmpty()) {
            System.out.println("Antrian KRS kosong.");
        } else {
            System.out.println("\n== Memanggil Antrian untuk Proses KRS ==");
            int dipanggil = 0;
            while (!isEmpty() && dipanggil < 2) {
                Mahasiswa mhs = data[front];
                size--;
                jumlahKRS++;

                if (isEmpty())
                    front = rear = -1;
                else
                    front = (front == max - 1) ? 0 : front + 1;

                System.out.print((dipanggil + 1) + ". ");
                mhs.tampilkanData();
                dipanggil++;
            }
            System.out.println("Mahasiswa tersebut sedang diproses oleh DPA.");
        }
    }

    public void printAll() {
        if (isEmpty()) {
            System.out.println("Antrian KRS masih kosong.");
        } else {
            System.out.println("== Semua Antrian KRS Saat Ini ==");
            int i = front, j = 1;
            while (i != rear) {
                System.out.print(j + ". ");
                data[i].tampilkanData();
                i = (i + 1) % max;
                j++;
            }
            System.out.print(j + ". ");
            data[i].tampilkanData();
            System.out.println("Total dalam antrian: " + size);
        }
    }

    public void lihatDuaTerdepan() {
        if (isEmpty()) {
            System.out.println("Antrian KRS kosong.");
        } else {
            System.out.println("== 2 Antrian Terdepan ==");
            System.out.print("1. ");
            data[front].tampilkanData();
            if (size >= 2) {
                int next = (front + 1) % max;
                System.out.print("2. ");
                data[next].tampilkanData();
            }
        }
    }

    public void lihatPalingAkhir() {
        if (isEmpty())
            System.out.println("Antrian KRS kosong.");
        else {
            System.out.println("== Antrian Paling Akhir ==");
            data[rear].tampilkanData();
        }
    }

    public void rekapKRS() {
        System.out.println("== Rekapitulasi Proses KRS ==");
        System.out.println("Jumlah mahasiswa mengantri: " + size);
        System.out.println("Jumlah mahasiswa sudah diproses KRS: " + jumlahKRS);
        System.out
                .println("Sisa mahasiswa DPA yang belum KRS: " + (maxDPA - jumlahKRS) + " (dari target 30 Mahasiswa)");
    }
}
package quiz1;

public class MataKuliah_17 {

    String kodeMK;
    String namaMK;
    int sks;
    Dosis_17[] dosenPengampu;
    int jumlahDosen = 0;

    public MataKuliah_17(String kodeMK, String namaMK, int sks, int maxDosen) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.sks = sks;
        dosenPengampu = new Dosis_17[maxDosen];
    }

    public void tampilkanInfo() {
        System.out.println("Kode MK : " + kodeMK);
        System.out.println("Nama MK : " + namaMK);
        System.out.println("SKS : " + sks);

        System.out.println("Dosen Pengampu : ");
        for (int i = 0; i < jumlahDosen; i++) {
            System.out.println("- " + dosenPengampu[i].nama);
        }

        System.out.println("---------------------------");
    }

    public void ubahNamaMK(String namaBaru) {
        namaMK = namaBaru;
    }

    public void ubahSKS(int sksBaru) {
        if (sksBaru >= 2) {
            sks = sksBaru;
        } else {
            System.out.println("SKS tidak boleh kurang dari 2");
        }
    }

    public void tambahDosen(Dosis_17 dosen) {
        if (jumlahDosen < dosenPengampu.length) {
            dosenPengampu[jumlahDosen] = dosen;
            jumlahDosen++;
        } else {
            System.out.println("Kapasitas dosen penuh");
        }
    }
}

public class praktikum4 {

    public static int hitungPendapatan(int[][] stok, int[] harga, int cabang) {
        int total = 0;
        for (int i = 0; i < harga.length; i++) {
            total += stok[cabang][i] * harga[i];
        }
        return total;
    }

    public static String statusCabang(int pendapatan) {
        if (pendapatan > 1500000) {
            return "Sangat Baik";
        } else if (pendapatan >= 1000000) {
            return "Baik";
        } else if (pendapatan >= 500000) {
            return "Cukup";
        } else {
            return "Kurang";
        }
    }

    public static void main(String[] args) {

        int[][] stok = {
                { 10, 5, 15, 7 },
                { 6, 11, 9, 12 },
                { 2, 10, 10, 5 },
                { 5, 7, 12, 9 }
        };
        int[] harga = { 75000, 50000, 60000, 10000 };
        String[] namaCabang = {
                "RoyalGarden 1",
                "RoyalGarden 2",
                "RoyalGarden 3",
                "RoyalGarden 4"
        };
        System.out.println("Pendapatan dan Status Cabang");
        System.out.println("=====================================");
        for (int i = 0; i < stok.length; i++) {
            int pendapatan = hitungPendapatan(stok, harga, i);
            String status = statusCabang(pendapatan);
            System.out.println(namaCabang[i]);
            System.out.println("Pendapatan : Rp " + pendapatan);
            System.out.println("Status     : " + status);
            System.out.println("-------------------------------------");
        }
    }
}

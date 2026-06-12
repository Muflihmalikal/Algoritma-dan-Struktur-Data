package Praktikum14;

import java.util.ArrayList;
import java.util.Collections;

public class SortingDemo {
    public static void main(String[] args) {
        ArrayList<String> daftarSiswa = new ArrayList<>();
        daftarSiswa.add("Zainab");
        daftarSiswa.add("Andi");
        daftarSiswa.add("Rara");

        Collections.sort(daftarSiswa);
        System.out.println("Data Siswa (Sorted): " + daftarSiswa);

        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer(1, "Zakia"));
        customers.add(new Customer(2, "Budi"));
        customers.add(new Customer(3, "Andi"));

        customers.sort((c1, c2) -> c1.name.compareTo(c2.name));
        System.out.println("Data Customers (Sorted by Name): " + customers);
    }
}
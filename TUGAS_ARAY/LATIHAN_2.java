package TUGAS_ARAY;

public class LATIHAN_2 {
    public static void main(String[] args) {
        // Data Pembeli
        String[] namaPembeli = {"Yuzkin", "Salsabila", "Eza"};
        String[] jurusan = {"Bandung", "Jakarta", "Bandung"};
        String[] kelas = {"Ekonomi", "Bisnis", "Bisnis"};
        int[] jumTiket = {2, 1, 3};
        int[] harga = new int[3];
        int[] bayar = new int[3];

        // Menentukan Harga dan Menghitung Total Bayar
        for (int i = 0; i < 3; i++) {
            // Cek Jurusan dan Kelas untuk menentukan harga tiket
            if (jurusan[i].equalsIgnoreCase("Bandung")) {
                if (kelas[i].equalsIgnoreCase("Bisnis")) {
                    harga[i] = 40000;
                } else if (kelas[i].equalsIgnoreCase("Ekonomi")) {
                    harga[i] = 20000;
                }
            } else if (jurusan[i].equalsIgnoreCase("Jakarta")) {
                if (kelas[i].equalsIgnoreCase("Bisnis")) {
                    harga[i] = 60000;
                } else if (kelas[i].equalsIgnoreCase("Ekonomi")) {
                    harga[i] = 40000;
                }
            }
            
            // Hitung total yang harus dibayar
            bayar[i] = harga[i] * jumTiket[i];
        }

        // Menampilkan Hasil
        System.out.println("=====================================================================================");
        System.out.printf("%-4s %-12s %-10s %-8s %-10s %-8s %-10s%n",
                "No", "Nama Pembeli", "Jurusan", "Kelas", "Jum Tiket", "Harga", "Bayar");
        System.out.println("=====================================================================================");

        for (int i = 0; i < 3; i++) {
            System.out.printf("%-4d %-12s %-10s %-8s %-10d %-8d %-10d%n",
                    (i + 1), namaPembeli[i], jurusan[i], kelas[i], jumTiket[i], harga[i], bayar[i]);
        }

        System.out.println("=====================================================================================");
    }
}


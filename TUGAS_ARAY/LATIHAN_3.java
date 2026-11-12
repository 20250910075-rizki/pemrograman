package TUGAS_ARAY;

public class LATIHAN_3 {
    public static void main(String[] args) {
        // Data Barang
        String[] kodeBarang = {"A01", "B02", "C02"};
        String[] namaBarang = {"Hardisk", "Monitor", "Mouse"};
        int[] hargaSatuan = {700000, 800000, 50000};

        // Data Pembelian
        String[] namaPembeli = {"Yuzkin", "Salsabila", "Eza"};
        String[] kodeInput = {"A01", "B02", "C02"};
        int[] jumlah = {2, 1, 3};
        String[] namaBrg = new String[3];
        int[] harga = new int[3];
        int[] bayar = new int[3];

        // Proses Pencocokan Data & Perhitungan
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < kodeBarang.length; j++) {
                if (kodeInput[i].equals(kodeBarang[j])) {
                    namaBrg[i] = namaBarang[j];
                    harga[i] = hargaSatuan[j];
                }
            }
            bayar[i] = harga[i] * jumlah[i];
        }

        // Tampilkan Hasil
        System.out.println("================================================================================");
        System.out.printf("%-4s %-14s %-11s %-10s %-7s %-9s %-10s%n",
                "No", "Nama Pembeli", "KodeBarang", "NamaBarang", "Jumlah", "Harga", "Bayar");
        System.out.println("================================================================================");

        for (int i = 0; i < 3; i++) {
            System.out.printf("%-4d %-14s %-11s %-10s %-7d %-9d %-10d%n",
                    (i + 1), namaPembeli[i], kodeInput[i], namaBrg[i], jumlah[i], harga[i], bayar[i]);
        }

        System.out.println("================================================================================");
    }
}

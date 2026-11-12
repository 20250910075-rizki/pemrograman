  package TUGAS_ARAY;

public class LATIHAN_1 {
    public static void main(String[] args) {
        // Data Mahasiswa
        String[] nim = {"001", "002", "003"};
        String[] nama = {"Dadan", "Didin", "Deden"};
        int[] uts = {80, 75, 60};
        int[] uas = {80, 80, 80};
        double[] nilaiAkhir = new double[3];
        char[] index = new char[3];

        // Hitung Nilai Akhir dan Tentukan Index
        for (int i = 0; i < 3; i++) {
            // Rumus: UTS 50% + UAS 50%
            nilaiAkhir[i] = (uts[i] * 0.5) + (uas[i] * 0.5);
            
            // Penentuan Index
            if (nilaiAkhir[i] >= 80) {
                index[i] = 'A';
            } else if (nilaiAkhir[i] >= 70) {
                index[i] = 'B';
            } else if (nilaiAkhir[i] >= 60) {
                index[i] = 'C';
            } else if (nilaiAkhir[i] >= 50) {
                index[i] = 'D';
            } else {
                index[i] = 'E';
            }
        }

        // Tampilkan Hasil
        System.out.println("=============================================================");
        System.out.printf("%-4s %-6s %-10s %-6s %-6s %-12s %-5s%n",
                "No", "Nim", "Nama", "UTS", "UAS", "Nilai Akhir", "Index");
        System.out.println("=============================================================");

        for (int i = 0; i < 3; i++) {
            System.out.printf("%-4d %-6s %-10s %-6d %-6d %-12.1f %-5c%n",
                    (i + 1), nim[i], nama[i], uts[i], uas[i], nilaiAkhir[i], index[i]);
        }

        System.out.println("=============================================================");
    }
}



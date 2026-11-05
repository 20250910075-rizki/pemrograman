import java.util.Scanner;


public class Tugas {
    public static void main(String[] args ){
        Scanner input = new Scanner(System.in);
        System.out.println("===HITUN NILAI AKHIR===");
        
        System.out.print("Masukan niali MP (pratikum/tugas): ");
        double mp = input.nextDouble();
        
        System.out.print("Masukan niali uts  : ");
        double uts = input.nextDouble();

        System.out.print("masukan nilai uas : ");
        double uas = input.nextDouble();

        double nilaiakhir = (6 * mp + 2 * uts + 2 * uas) / 10;


        System.out.println("===HASIL PERHITUNGAN===");
        System.out.println("niali mp : " + mp);
        System.out.println("niali uts : " + uts);
        System.out.println("niali uas : " + uas);
        System.out.println("-----------------------------");
        System.out.printf("nilai akhir : %.2f%n", nilaiakhir);


    }



    
}

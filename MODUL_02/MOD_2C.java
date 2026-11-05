
import java.util.Scanner;
public class MOD_2C {
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
        
String nama, mk, prodi;
int nilai;
System.out.print("siapa nama anda:");
nama = input.nextLine();
System.out.print("Nama matakuliah:");
mk = input.nextLine();
System.out.print("program studi :");
prodi = input.nextLine();
System.out.print("Nilai anda");
nilai = input.nextInt();

System.out.println("--HASIL INPUTAN--");
System.out.println("Nama\t :" + nama);
System.out.println("Matakuliah\t : " + mk);
System.out.println("Program Studi\t : " + prodi);
System.out.println("nilai MK \t :" + nilai);
input.close();

    }    
}

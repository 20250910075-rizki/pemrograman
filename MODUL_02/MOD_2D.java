import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.Spring;
public class MOD_2D{
    public static void main(Spring[]args) throws IOException{
        String nama, mk, prodi;
        String nilai;
        try (BufferedReader bufferedReader = new BufferedReader (new InputStreamReader (System.in))){

            System.out.println("siapa nama anda:");
            nama = bufferedReader.readLine();
            System.out.println("Nama matakuliah:");
            mk = bufferedReader.readLine();
            System.out.println("program studi :");
            prodi = bufferedReader.readLine();
            System.out.println("Nilai anda");
            nilai = bufferedReader.readLine();

            System.out.println("--HASIL INPUTAN--");
            System.out.println("Nama\t :" + nama);
            System.out .println("matakuliah\t : " + mk);
            System.out.println("program studi\t : " + prodi);
            System.out.println("nilai mk \t :" + nilai);


            //untuk mengambil hasil integer pada variabel nilai anda perlu mengonversinya menjadi interge  
            
        }
    }
}

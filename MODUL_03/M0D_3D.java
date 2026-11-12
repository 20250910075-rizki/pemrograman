package MODUL_03;

import java.util.Scanner;

public class M0D_3D {

      public static void main(String args[]) {        
        Scanner input = new Scanner(System.in);
        
        String mahasiswa[][];        
        int jumlah;        
        
        System.out.println("DATA NILAI MAHASISWA");
        System.out.println("SISTEM INFORMASI");
        System.out.println("FKOM - UNIKU\n");
        
        System.out.print("Jumlah Orang : ");        
        jumlah = Integer.parseInt(input.nextLine());        
        
        mahasiswa = new String[jumlah][6];        
        
        
        for (int i = 0; i < jumlah; i++) {            
            System.out.println("\nData Mahasiswa ke - " + (i + 1));            
            System.out.print("NIM : ");            
            mahasiswa[i][0] = input.nextLine();            
            System.out.print("NAMA : ");            
            mahasiswa[i][1] = input.nextLine();            
            System.out.print("NILAI : ");            
            mahasiswa[i][2] = input.nextLine();        
        }        
        
        
        System.out.println("\n======================================");
        System.out.println("No.\tNIM\tNAMA\tNILAI");
        System.out.println("======================================");
        
        for (int i = 0; i < jumlah; i++) {            
            System.out.println((i + 1) + "\t" 
                + mahasiswa[i][0] + "\t" 
                + mahasiswa[i][1] + "\t" 
                + mahasiswa[i][2]);
        }
        
        input.close();
    } 
}

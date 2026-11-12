package MODUL_03;

 class M0D_3C{
    public static void main(String args[]) {        
        int duaD[][] = new int[4][5];        
        int i, j, k = 0;        
        
        // Mengisi array
        for (i = 0; i < 4; i++) {            
            for (j = 0; j < 5; j++) {                
                duaD[i][j] = k;                
                k++;            
            }        
        }        
        
        // Menampilkan array
        for (i = 0; i < 4; i++) {            
            for (j = 0; j < 5; j++) {                
                System.out.print(duaD[i][j] + " ");            
            }            
            System.out.println();        
        }    
    } 
}




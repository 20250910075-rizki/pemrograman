import javax.swing.JOptionPane;
public class MOD_2E {
    public static void main(String[]args){
        String  panjang, lebar;
        int luas;

        panjang =JOptionPane.showInputDialog("masukan nilai panjang");
        int pj = Integer.parseInt(panjang);
        lebar = JOptionPane.showInputDialog("masukan nilai lebar");
        int lb = Integer.parseInt(lebar);

        luas =pj * lb;
        JOptionPane.showConfirmDialog(null, "Luas persegi panjang: " + luas);

      }
    
}


package tugasModul1;
import java.util.Scanner;
public class tugasNo1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Yosieka Putri Wibawa/ XRPL 6/ 40");
         System.out.println("================================");
         System.out.println("----- Luas Permukaan Bola -----");
         System.out.println("================================");
         double r, luasBola, bil = 0;
         System.out.println(">>Mencari Luas Permukaan Bola<<");
         System.out.println();
         System.out.print("Masukkan jari-jari bola :");
         r = input.nextDouble();
         double phi = 3.14;
           luasBola = 4 *phi *r*r;
           System.out.println("Luas permukaan bola :" + luasBola + "cm2");
    } 
}


package HelloTelkom;
import java.util.Scanner;
public class latihan10 {

    public static void main(String[] args) {
     Scanner masukan = new Scanner(System.in);
     System.out.print("Masukkan batas bilangan :");
     int batas = masukan.nextInt();
     int hasil = 0;
     for (int i=1; i<=batas; i++){
         hasil += i;
         System.out.println("Total jumlahnya adalah :" + hasil);
     }
   }
}

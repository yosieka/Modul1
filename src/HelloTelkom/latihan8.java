
package HelloTelkom;
import java.util.Scanner;
public class latihan8 {

    public static void main(String[] args) {
       Scanner masukan = new Scanner(System.in);
       System.out.print("Masukkan nilai TPA :");
       int tpa = masukan.nextInt();
       System.out.print("Masukkan nilai Bahasa Inggris :");
       int big = masukan.nextInt();
       if ( tpa >65 && big>65){
           System.out.println("Siswa dapat Beasiswa");
       }else
           System.out.println("Siswa tidak mendapat Beasiswa");
    }
    
}

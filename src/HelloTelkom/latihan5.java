package HelloTelkom;

import java.util.Scanner;

public class latihan5 {

    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        int nilai;
        System.out.println("Masukkan nilai akhir PBO :");
        nilai = masukan.nextInt();
        if (nilai < 70) {
            System.out.println("Siswa tidak lulus");
            if (nilai > 70) {
                System.out.println("Siswa lulus");
            }
        }
    }

}

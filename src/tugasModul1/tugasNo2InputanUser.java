package tugasModul1;

import java.util.Scanner;

public class tugasNo2InputanUser {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Yosieka Putri Wibawa/ XRPL 6/ 40");
        System.out.println("=================================");
        System.out.println("<<<KONVERSI SUHU>>>");
        System.out.println("====================");
        int ulangi;
        do {
            System.out.println();
            System.out.print("Masukkan suhu yang akan dikonversi dalam bentuk celcius:");
            double awal = input.nextDouble();
            System.out.println("===========================================================");
            System.out.println("pilihan Suhu Yang dikonversikan ");
            System.out.println("1.Reamur");
            System.out.println("2.Farenheit");
            System.out.println("3.Kelvin");
            System.out.print("Masukkan pilihan :");
            int pilih = input.nextInt();
            System.out.println();
            if (pilih == 1) {
                double r = awal * 4 / 5;
                System.out.println("Dalam bentuk Reamur adalah :" + r + "'R");

            }
            if (pilih == 2) {
                double f = awal * 9 / 5 + 32;
                System.out.println("Dalam bentuk Farenheit adalah :" + f + "'F");

            }
            if (pilih == 3) {
                double k = awal + 273;
                System.out.println("Dalam bentuk Kelvin adalah :" + k + "'K");

            }
            System.out.print("Apakah anda ingin Mengulangi? 1 for Ya dan 0 for Tidak :");
            ulangi = input.nextInt();
        } while (ulangi == 1);
        System.out.println("=========== ^-^ Selesai ^-^ =============");
    }

}

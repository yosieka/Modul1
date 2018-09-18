package tugasModul1;

import java.util.Scanner;

public class tugasNo3Inputan {

    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        System.out.println("Yosieka Putri Wibawa/ XRPL 6/ 40");
        System.out.println("==================================");
        int ulangi = 1;
        do {
            System.out.println(">>>>>>>>>>>>>>>*<<<<<<<<<<<<<<,");
            System.out.print("Nama :");
            String nama = masukan.next();
            System.out.print("NIS :");
            String nis = masukan.next();
            System.out.print("Tempat Lahir :");
            String tempat = masukan.next();
            System.out.print("Tanggal Lahir :");
            String tanggal = masukan.next();
            System.out.print("Jenis Kelamin :");
            String jenis = masukan.next();
            System.out.print("Alamat di Malang :");
            String alamat = masukan.next();
            System.out.print("Motto Hidup :");
            String motto = masukan.next();
            System.out.print("Apakah ingin mengulagi? 1 for ya, 2 for tidak : " );
            ulangi = masukan.nextInt();
            System.out.println();
        } while (ulangi == 1);
        System.out.println("==============SELESAI================");
    }

}

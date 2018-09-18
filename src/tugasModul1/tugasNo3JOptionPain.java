package tugasModul1;

import javax.swing.JOptionPane;
import java.util.Scanner;
public class tugasNo3JOptionPain {

    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        System.out.println("Yosieka Putri Wibawa/ XRPL 6/ 40");
        System.out.println("==================================");
        int ulangi;
        
        System.out.println("----------------------------------");
        String nama = JOptionPane.showInputDialog("Masukkan Nama Anda :");        
        String nis = JOptionPane.showInputDialog("Masukkan NIS Anda :");
        String tLahir = JOptionPane.showInputDialog("Masukkan Tempat Lahir Anda :");
        String tanggal = JOptionPane.showInputDialog("Masukkan Tanggal Lahir Anda :");
        String jenis = JOptionPane.showInputDialog("Masukkan Jenis Kelamin Anda :");
        String alamat = JOptionPane.showInputDialog("Masukkan Alamat Anda diMalang :");
        String motto = JOptionPane.showInputDialog("Masukkan Motto Hidup Anda :");
        JOptionPane.showMessageDialog(null, "Nama : " + nama + "\nNIS : " + nis + "\nTempat Lahir : " + tLahir + "\nTanggal Lahir : " + tanggal + 
                "\nJenis Kelamin : " + jenis + "\nAlamat diMalang : " + alamat + "\nMotto : " + motto);
        System.out.println();

        System.out.println("============SELESAI==============");

        }

}

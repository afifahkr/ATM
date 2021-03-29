/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

/**
 *
 * @author lenovo
 */
import java.util.Scanner;
class Atm {
  public static void main(String[] args) {
    Scanner atm = new Scanner(System.in);
    int saldo = 5000000;

    System.out.print("Masukkan pin ATM Anda : ");
    int pass = atm.nextInt();

    while (pass != 0) {
    System.out.println();
    System.out.println("LIST MENU");
    System.out.println("_______________________");
    System.out.println("Tekan 1 untuk Cek saldo");
    System.out.println("Tekan 2 untuk Tarik tunai");
    System.out.println("Tekan 3 untuk Keluar");
    System.out.print("Pilihan : ");
    
    int n = atm.nextInt();
    System.out.println();

      if (n == 1) {
        System.out.println("CEK SALDO");
        System.out.println("Saldo Anda = " + saldo);
        
      } else if (n == 2) {
        System.out.println("TARIK TUNAI");
        System.out.print("Masukkan jumlah uang yang ingin ditarik (Kelipatan 1000000) = ");
        int penarikan = atm.nextInt();
        int saldo2 = saldo-penarikan;
          if (penarikan < saldo && penarikan % 100000 == 0) {
            System.out.println("Silakan ambil uang Anda");
            System.out.println("Sisa saldo anda = " + saldo2);
          } else {
            System.out.println("Silahkan masukkan jumlah sesuai ketentuan");
          }
      } else if (n == 3) {
        System.out.println("Keluar");
        System.out.println("Terima kasih ");
        break;
        
      } else {
        System.out.println("Silahkan coba lagi");
     }
    }
  }
}
package belajar_java_CS;

import java.util.Scanner;

public class _4_operasiAritmatika {
    public static void main(String[] args) {
        /*// operasi aritmatika: +, -, *, /, %
        int hasilTambah = 2 + 3;
        System.out.println(hasilTambah); ---> 5

        int hasilKurang = 50 - 19;
        System.out.println(hasilKurang); ---> 31

        int hasilKali = 25 * 14;
        System.out.println(hasilKali); ---> 350

        double hasilBagi1 = 5 / 2;
        double hasilBagi2 = 5 / 2d;
        System.out.println(hasilBagi1); ---> 2.0
        System.out.println(hasilBagi2); ---> 2.5

        int hasilModulus1 = 10 % 10;
        int hasilModulus2 = 10 % 9;
        System.out.println(hasilModulus1); ---> 0
        System.out.println(hasilModulus2); ---> 1
        */

        //membuat scanner
        Scanner input = new Scanner (System.in);

        // membuat variabel dan tipe data
        int choose = 0;
        String tempName = "";

        String film1 = "Doraemon";
        String film2 = "Naruto";
        String film3 = "Hamtaro";

        // menampilkan output ke user
        System.out.println("\t\t Bioskop 21 CS");
        System.out.println("==================");
        System.out.println("| Nama Film     |");
        System.out.println("------------------");
        System.out.printf("| %13s |\n", film1);
        System.out.printf("| %13s |\n", film2);
        System.out.printf("| %13s |\n", film3);
        System.out.println("------------------");

        // menampilkan menu
        System.out.println("1. Buy");
        System.out.println("2. Pay");
        System.out.println("3. View");
        System.out.println("4. Update");
        System.out.println("5. Delete");

        // memilih menu
        System.out.print("Choose >> ");
        choose = input.nextInt(); input.nextLine();

        // input nama
        System.out.print("Masukkan Nama Anda: ");
        tempName = input.nextLine();

        // menampilkan output
        System.out.println("Kategori  : " + choose);
        System.out.println("Nama      : " + tempName);

        // variabel untuk operasi aritmatika
        int tempPrice = 0;
        int tempJumlah = 0;
        int uang = 0;
        int charge = 0;

        // operasi aritmatika
        System.out.print("Masukkan Jumlah Pembelian  [harus lebih dari 0]: ");
        tempJumlah = input.nextInt(); input.nextLine();

        tempPrice = 75_000;

        int totalPrice = tempPrice * tempJumlah;
        System.out.println("Total Harga: " + totalPrice);

        System.out.print("Masukkan Jumlah Uang: ");
        uang = input.nextInt(); input.nextLine();

        charge = (uang - totalPrice);
        System.out.println("Charge: " + charge);
        System.out.println("Thank You :)");
        
    }
}

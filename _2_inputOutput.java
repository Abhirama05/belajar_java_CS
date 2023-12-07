package belajar_java_CS;

import java.util.Scanner;

public class _2_inputOutput {
    public static void main(String[] args) {
        // membuat Scanner
        Scanner input = new Scanner(System.in);

        // membuat variabel
        int choose = 0;
        String tempName = "";

        // menampilkan output ke user
        System.out.println("\t\t Bioskop 21 CS");
        System.out.println("=========================================");
        System.out.println("| Kode Film | Nama Film     | Harga     |");
        System.out.println("-----------------------------------------");

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
    }
}

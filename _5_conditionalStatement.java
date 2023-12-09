package belajar_java_CS;

import java.util.Scanner;

public class _5_conditionalStatement {
    public static void main(String[] args) {
        /*
         * Comparison Operator
         * == (sama dengan)
         * != (tidak sama dengan)
         * > (lebih dari)
         * < (kurang dari)
         * >= (lebih dari sama dengan)
         * <= (kurang dari sama dengan)
         */
        
        /*
         * Logical Operator
         * && (AND)
         * || (OR)
         * ! (NOT)
         */

        /*
         * IF ELSE Statement
         * contoh 1:
         * if (nobitaGrade >= 70){
         *  System.out.println("Nobita Lulus");
         * } else {
         *  System.out.println("Nobita Tidak Lulus");
         * }
         * 
         * contoh 2:
         * if (nobitaGrade == 0){
         *  System.out.println("Nobita Tidak Lulus dan Tidak Bisa Remedial");
         * } else if (nobitaGrade >= 60 && nobitaGrade <70){
         *  System.out.println("Nobita Tidak Lulus dan Bisa Remedial");
         * } else {
         *  System.out.println("Nobita Lulus");
         * }
         */

        /*
         * Switch Statement
         * int day = 4;
         * switch (day){
         *  case 1 :
         *      System.out.println("Monday");
         *      break;
         *  case 2 :
         *      System.out.println("Tuesday");
         *      break;
         *  case 3 :
         *      System.out.println("Wednesday");
         *      break;
         *  case 4 :
         *      System.out.println("Thursday");
         *      break;
         *  case 5 :
         *      System.out.println("Friday");
         *      break;
         *  case 6 :
         *      System.out.println("Saturday");
         *      break;
         *  case 7 :
         *      System.out.println("Sunday");
         *      break;
         * }
         */

        // membuat Scanner
        Scanner input = new Scanner(System.in);

        // membuat variabel dan tipe data
        int choose = 0;
        String tempName = "";

        String film1 = "Doraemon";
        String film2 = "Naruto";
        String film3 = "Hamtaro";

        // menampilkan output ke user
        System.out.println("\t\t Bioskop 21 CS");
        System.out.println("==================");
        System.out.println("| Kode Film | Nama Film     |");
        System.out.println("------------------");
        System.out.printf("| %9s | %13s |\n", 1, film1);
        System.out.printf("| %9s | %13s |\n", 2, film2);
        System.out.printf("| %9s | %13s |\n", 3,  film3);
        System.out.println("------------------");

        // menampilkan menu
        System.out.println("1. Buy");
        System.out.println("2. View");
        System.out.println("3. Update");
        System.out.println("4. Delete");

        // memilih menu
        System.out.print("Choose >> ");
        choose = input.nextInt(); input.nextLine();

        switch (choose) {
            case 1:
                // input nama
                System.out.print("Masukkan Nama Anda: ");
                tempName = input.nextLine();

                // variabel untuk operasi aritmatika
                int tempPrice = 0;
                int tempKode = 0;
                int tempJumlah = 0;
                int uang = 0;
                int charge = 0;

                // input kode film
                System.out.print("Masukkan Kode Film [1, 2, 3]: ");
                tempKode = input.nextInt(); input.nextLine();

                // operasi aritmatika
                System.out.print("Masukkan Jumlah Pembelian  [harus lebih dari 0]: ");
                tempJumlah = input.nextInt(); input.nextLine();

                if (tempKode == 1){
                    tempPrice = 35_000;
                } else if (tempKode == 2){
                    tempPrice = 25_000;
                } else {
                    tempPrice = 50_000;
                }

                // menampilkan output
                System.out.println("\nNama\t\t\t: " + tempName);
                System.out.println("Kode Film yang dipilih\t: " + tempKode);
                System.out.println("Jumlah Pembelian\t: " + tempJumlah);
                System.out.println();

                int totalPrice = tempPrice * tempJumlah;
                System.out.println("Total Harga: " + totalPrice);

                System.out.print("Masukkan Jumlah Uang: ");
                uang = input.nextInt(); input.nextLine();

                if (uang < totalPrice){
                    System.out.println("Uangnya Kurangg!");
                } else {
                    charge = (uang - totalPrice);
                    System.out.println("Charge: " + charge);
                    System.out.println("Thank You :)");
                }

                
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        
            default:
                break;
        }

        
          
    }
}

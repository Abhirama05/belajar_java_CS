package belajar_java_CS;

import java.util.Scanner;

public class _6_exceptionHandling {
    // contoh method exception handling dari throws
    /*
     * public static void f() throws NullPointerException, ArrayIndexOutOfBoundsException{
     *  throw new NullPointerException();
     * }
     */
    public static void main(String[] args) {
        /* 
         * Keyword Exception Handling
         * try, catch, finally, throw, throws
        */

        /*
         * TRY CATCH
         * try{
         *  int a = 27 / 0;
         * } catch (Exception e){
         *  System.out.println("ups, error!");
         * }
         */

        /*
         * FINALLY (tetap ditampilkan walaupun tidak ada error)
         * try{
         *  // int a = 27 / 0;
         * } finally {
         *  System.out.println("Terima kasih telah menjalankan program");
         * }
         */

        /*
         * TRY CATCH FINALLY
         * try{
         *  int a = 27 / 0;
         * } catch (Exception e){
         *  System.out.println("ada kesalahan yang muncul");
         * } finally {
         *  System.out.println("terima kasih telah menjalankan program");
         * }
         */

        /*
         * THROW
         * try{
         *  throw new Exception("kesalahan terjadi");
         * } catch (Exception e){
         *  System.out.println(e);
         * }
         */

        /*
         * THROWS
         * try{
         *  f(); // ---> method di atas psvm
         * } catch (Exception e){
         *  System.out.println(e);
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

        // exception handling
        try{
            choose = input.nextInt(); input.nextLine();
        } catch (Exception e){
            System.out.println("Harus Angka!!");
            choose =- 1;
            input.nextLine();
        }
        
        // switch statement
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

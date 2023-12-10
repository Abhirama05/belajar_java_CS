package belajar_java_CS;

import java.util.Scanner;

public class _8_stringFunction {
    public static void main(String[] args) {
        /* Contoh String Function
           String nama = "Abhirama Jenanda";
           //             0123456789......

           System.out.println(nama.charAt(1)); ---> b
           System.out.println(nama.length()); ---> 16
           System.out.println(nama.substring(0, 8)); ---> Abhirama
           System.out.println(nama.contains("rama") && nama.contains("nanda")); ---> true
           System.out.println(nama.startsWith("Jenanda")); ---> false
           System.out.println(nama.endsWith("Jenanda")); ---> true
        */ 
        // membuat Scanner
        Scanner input = new Scanner(System.in);

        // membuat variabel dan tipe data
        int choose = 0;
        String tempName = "";

        String film1 = "Doraemon";
        String film2 = "Naruto";
        String film3 = "Hamtaro";

        // looping do-while
        do {
            // menambahkan enter pada awal program
            for (int i=0; i<3; i++){
                System.out.println();
            }
            // menampilkan output ke user
            System.out.println("\tBioskop 21 CS");
            System.out.println("=============================");
            System.out.println("| Kode Film | Nama Film     |");
            System.out.println("-----------------------------");
            System.out.printf("| %9s | %13s |\n", 1, film1);
            System.out.printf("| %9s | %13s |\n", 2, film2);
            System.out.printf("| %9s | %13s |\n", 3,  film3);
            System.out.println("-----------------------------");

            // menampilkan menu
            System.out.println("1. Buy");
            System.out.println("2. View");
            System.out.println("3. Update");
            System.out.println("4. Delete");
            System.out.println("5. Exit");
            System.out.println("-----------------------------");

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
                    // String function
                    String tempEmail = "";

                    do{ 
                        // input nama
                        System.out.print("Masukkan Nama Anda : ");
                        tempName = input.nextLine();
                    }while(tempName.isEmpty() || tempName.length() < 3); 
                    // akan looping kalau nama yg diinput kosong atau kurang dari 3 huruf
                    
                    do{
                        System.out.print("Masukkan Email Anda : ");
                        tempEmail = input.nextLine();
                    } while(!tempEmail.contains("@") || !tempEmail.contains(".com"));
                    // akan looping kalau email yg diinput tidak ada @ atau .com

                    // variabel untuk operasi aritmatika
                    int tempPrice = 0;
                    int tempKode = 0;
                    int tempJumlah = 0;
                    int uang = 0;
                    int charge = 0;
                    
                    try{
                        // looping do-while
                        do {
                            // input kode film
                            System.out.print("Masukkan Kode Film [1, 2, 3]: ");
                            tempKode = input.nextInt(); input.nextLine();
                        } while(tempKode < 1 || tempKode > 3);
                        
                        do{
                            // operasi aritmatika
                            System.out.print("Masukkan Jumlah Pembelian  [harus lebih dari 0]: ");
                            tempJumlah = input.nextInt(); input.nextLine();
                        }while (tempJumlah <= 0);
                    } catch (Exception e){
                        System.out.println("Error, harus angka!!");
                    }
                    
                    if (tempKode == 1){
                        tempPrice = 35_000;
                    } else if (tempKode == 2){
                        tempPrice = 25_000;
                    } else {
                        tempPrice = 50_000;
                    }

                    // menampilkan output
                    System.out.println("--------------------------------------------");
                    System.out.println("Nama\t\t\t: " + tempName);
                    System.out.println("Email\t\t\t: " + tempEmail);
                    System.out.println("Kode Film yang dipilih\t: " + tempKode);
                    System.out.println("Jumlah Pembelian\t: " + tempJumlah);
                    System.out.println("--------------------------------------------");
        
                    int totalPrice = tempPrice * tempJumlah;
                    System.out.println("Total Harga: " + totalPrice);

                    // looping apabila uang yg diinput kurang
                    do{
                        System.out.print("Masukkan Jumlah Uang: ");
                        uang = input.nextInt(); input.nextLine();

                        if (uang < totalPrice){
                                System.out.println("Uangnya Kurangg!");
                        } else {
                            charge = (uang - totalPrice);
                            System.out.println("Charge: " + charge);
                            System.out.println("Thank You :)");
                        }
                    } while (uang < totalPrice);
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
        } while(choose != 5);
    }
}

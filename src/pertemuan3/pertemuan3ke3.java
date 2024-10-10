package pertemuan3;

import java.util.Scanner;

public class pertemuan3ke3 {
    
        public static void main(String[] args) {
            int angka;
            Scanner myInput = new Scanner(System.in);

            angka = myInput.nextInt();
            switch (angka) {
                case 1:
                    System.out.println("Angkanya 1");
                    break;
                case 2:
                    System.out.println("Angkanya 2");
                case 3:
                    // System.out.println("Angkanya 3"); <- kesalahan logika
                    System.out.println("Angkanya 2 atau 3");
                    // karena 2 tidak di break
                    break;
                default:
                    System.out.println("Angkanya bukan 1-3");
            }

            myInput.nextLine();
            System.out.print("Masukkan huruf: ");
            String huruf = myInput.nextLine();
            switch (huruf){
                case "A":
                case "a": // seperti OR
                    System.out.println("Hurufnya A");
                    break;
                case "B":
                case "b":
                    System.out.println("Hurufnya B");
                    break;
                case "Halo":
                    System.out.println("Halo juga");
                    break;
                default:
                    System.out.println("Huruf tidak dikenal");
                    break;

            }

        /* Buatlah menu seperti ini:
            MENU:
            1. Halo
            2. English
            3. Spanish
            4. Gak tau
            Masukkan pilihan:

            jika pilih 1 output Halo, jika 2 output Hello, dst..
            jika bukan 1-4 output "Salah Pilihan"
         */

            System.out.println("MENU");
            System.out.println("1. Halo");
            System.out.println("2. English");
            System.out.println("3. Spanish");
            System.out.println("4. Gak tau");
            System.out.print("Masukkan pilihan: ");
            int pilihan = myInput.nextInt();
            switch (pilihan){
                case 1:
                    System.out.println("Halo");
                    break;
                case 2:
                    System.out.println("Hello");
                    break;
                case 3:
                    System.out.println("Hola");
                    break;
                case 4:
                    System.out.println("Apa lagi saya");
                    break;
                default:
                    System.out.println("Salah Pilihan");
            }
        }

}

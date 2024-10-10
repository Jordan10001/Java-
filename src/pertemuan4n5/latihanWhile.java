package pertemuan4n5;
import java.util.Scanner;

public class latihanWhile {
     /* Buat program tebak angka
           Hasilkan angka random 1-10
           Minta tebakan dari user
           Jika tebakan terlalu kecil output "Terlalu kecil"
           Jika tebakan terlalu besar output "Terlalu besar"
           Minta tebakan sampai benar
           Jika tebakan benar output "ANDA BENAR"
         */
    // Cara random 1-10;
    // (Math.random()*9)+1

    public static void main(String[] args) {
        int angkaRandom = (int) (Math.random()*9)+1; //inisialisasi
        int tebakan;
        Scanner myInput = new Scanner(System.in);
        // Pakai do- while
        do {
            System.out.print("Tebak angka! (1-10): ");
            tebakan = myInput.nextInt(); // perubahan
            if(tebakan<angkaRandom) System.out.println("Terlalu Kecil");
            if(tebakan>angkaRandom) System.out.println("Terlalu Besar");
        } while(tebakan!=angkaRandom);
        System.out.println("Anda Benar");

        // Pakai while dengan flag
        boolean tebakanBenar = false; // init
        while(!tebakanBenar){ // cek kondisi
            System.out.print("Tebak angka! (1-10): ");
            tebakan = myInput.nextInt(); // perubahan
            if(tebakan<angkaRandom) System.out.println("Terlalu Kecil");
            if(tebakan>angkaRandom) System.out.println("Terlalu Besar");
            if(tebakan == angkaRandom) tebakanBenar = true;
        }
        System.out.println("Anda Benar");
    }
}

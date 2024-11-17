package pertemuan4n5;
import java.util.Scanner;

public class belajarWhile {
    public static void main(String[] args) {

        int x = 1; // inisialisasi
        while (x < 10) { // pengecekan kondisi - pre check
            System.out.println("DIDALAM LOOP");
            System.out.println("MASIH DIDALAM LOOP");
            System.out.println("X sekarang = " + x);
            x += 1; // perubahan
        }
        System.out.println("KELUAR DARI LOOP");

        Scanner myInput = new Scanner(System.in);
        // RED flag tindakan dulu baru chek
        int inputUser; // inisialisasi
        // kita mau ketika user masukkan 2 maka keluar dari loop
        do {
            System.out.println("Masukkan 2 untuk keluar dari loop");
            inputUser = myInput.nextInt(); // perubahan
        } while (inputUser != 2); // pengecekan kondisi - post check


    }
}
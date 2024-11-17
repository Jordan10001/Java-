package pertemuan6;

import java.util.Scanner;

public class latihanarray {
    /*
    Buat array yang menampung 10 nama
    nama di input oleh user dengan scaner
     */
    public static void main(String[] args) {
        // sudah siapkan array dan scanner
        Scanner in = new Scanner(System.in);
        String[] namanama = new String[10];
        //cara satu

        /*
        for (int i = 0; i <namanama.length ; i++) {
            System.out.printf("Masukan nama %d : \n ",i+1);
            namanama[i] = in.nextLine();
        }
        //Mengunakan foreach loop untuk mengakses
        for (String nama : namanama) {
            System.out.println(nama);
        }
         */

        for (int i = 0; i <=9 ; i++) {
            System.out.print("Masukan nama : ");
            namanama[i]=in.nextLine();
        }
        System.out.println("Nama yang dimasukan tadi");
        for (int i = 0; i <=9 ; i++) {
            System.out.println(namanama[i]);
        }



    }
}

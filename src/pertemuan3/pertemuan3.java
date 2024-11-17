package pertemuan3;

import java.util.Scanner;
public class pertemuan3 {

        //Belajar If, Else if. Else


        //input suhu
        //jika dibawah 25 derajat, print "pakai jaket"
        //jika diatas, print "mulai panas"


        public static void main(String[] args) {

            int suhu;
            suhu = 19;

            if(suhu<25) {
                System.out.println("Pakai Jaket!");
            } else {
                System.out.println("Mulai Panas!");
            }

            int angka = 10; // "=" assignment
            if(angka==10) System.out.println("Angka = 10"); // "==" equal


            // buat program menerima input angka dari user
            // jika angka dibawah 10 maka dikalikan 10 lalu di print
            // jika angka 10 keatas maka langsung di print

            Scanner myInput = new Scanner(System.in);
            int angkaInput;
       /*
        System.out.print("Masukkan angka: ");
        angkaInput = myInput.nextInt();

        if(angkaInput<10) {
            // tergantung kondisi
            angkaInput = angkaInput * 10;
        }

        // di luar kondisi
        System.out.println(angkaInput);
        */


            // nilai 85 keatas = A <- happy path (cuma 1 kondisi)
            // nilai 75 - 84 = B
            // nilai 55 - 74 = C
            // nilai 54 kebawah = D <- happy path (cuma 1 kondisi)

            int nilai;
            nilai = 84;
        /*
        if (nilai >= 85) {
            System.out.println("A");
        }
        if (nilai <= 84 && nilai >= 75) {
            System.out.println("B");
        }
         */

            if (nilai >= 85){
                System.out.println("A");
            }else if(nilai >= 75){
                System.out.println("B");
            }else if(nilai >= 55){
                System.out.println("C");
            }else {
                System.out.println("D");
            }

            if (nilai <= 54){
                System.out.println("D");
            } else if (nilai <= 74){
                System.out.println("C");
            } else if (nilai <= 84){
                System.out.println("B");
            } else {
                System.out.println("A");
            }

            int angka2 = 7;

            // perbandingan DAN
            if (angka2 > 5 && angka2 < 10) {
                System.out.println("Angka di antara 5-10");
            }
            if (angka2 < 5 || angka2 > 10) {
                System.out.println("Angka di luar 5-10");
            }

            if (!(angka2<5)) {
                System.out.println("Angka TIDAK lebih kecil dari 5");
            }


        }





}

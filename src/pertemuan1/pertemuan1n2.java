package pertemuan1;

import java.util.Scanner;

public class pertemuan1n2 {
    public static void main(String[] args) {
        /*
        System.out.println("APA KABAR");
        // operasi matematika
        System.out.println("12 dikurangi 5 = " + (12-5));
        System.out.println("12" + 5);
        System.out.println("Sisa pembagian 12 dibagi 5 = " + 12%5);

         */

        // deklarasi variabel
        /*
        int angka1 = 13; // literal (dikasih value)
        int angka2 = 5;
        int angka3;
         */

        int angka1 = 13, angka2 = 5, hasilPenjumlahan; // cara singkatnya

        angka1 = 10;
        angka2 = 7;
        angka2 = angka2 + 5; // 7 ditambah 5 menjadi angka2 yg baru
        // angka1 + angka2 = angka3; BUKAN begini
        hasilPenjumlahan = angka1 + angka2;

        System.out.print("Hasil penjumlahan " + angka1 + " dan " + angka2);
        System.out.println(" adalah: " + hasilPenjumlahan);

        double angkaDesimal = 17e4; // 17 x 10 pangkat 4
        System.out.println(angkaDesimal);
        String kalimat1 = "Saya suka";
        String kalimat2 = "belajar java";
        System.out.println(kalimat1 + " " + kalimat2);

        Scanner inputUser = new Scanner(System.in);
        // bikin object Scanner namanya inputUser

        System.out.print("Input kalimat: ");
        String kalimatUser = inputUser.nextLine();
        System.out.println("Input barusan adalah: " + kalimatUser);
        System.out.print("Input angka: ");
        int angkaUser = inputUser.nextInt();
        System.out.println("Input barusan adalah: " + angkaUser);

        // the enter ketinggalan problem
        inputUser.nextLine(); // membuang enter yg ketinggalan
        System.out.print("Input kalimat lagi: ");
        String kalimatUser2 = inputUser.nextLine();
        System.out.println("Input barusan adalah: " + kalimatUser2);





    }
}

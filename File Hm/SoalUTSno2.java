import java.util.Scanner;

public class SoalUTSno2 {
    public static void main(String[] args) {
        int angkaKecil = 0, angkaBesar = 0, a = 0, b = 0, x, y, pilihan = 0;
        while (true) {
            System.out.println("== MENU ==");
            System.out.println("1. Masukkan angka-angka");
            System.out.println("2. Keluar");
            System.out.print("Pilihan: ");
            Scanner input = new Scanner(System.in);
            pilihan = input.nextInt();
            if (pilihan == 1) {
                System.out.print("Masukkan banyaknya angka: ");
                x = input.nextInt();
                for (int i = 1; i<=x ;i++ ) {
                    System.out.print("Masukkan angka ke-" + i + ": ");
                    y = input.nextInt();
                    if (y < 10) {
                        angkaKecil += y;
                        a++;
                    } else {
                        angkaBesar += y;
                        b++;
                    }
                }
                System.out.println("Banyaknya angka kecil = " + a);
                System.out.println("Hasil penjumlahan angka-angka kecil = " + angkaKecil);
                System.out.println("Banyaknya angka besar = " + b);
                System.out.println("Hasil penjumlahan angka-angka besar = " + angkaBesar);
            } else
                if (pilihan==2)break;

        }
    }
}
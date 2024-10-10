import java.util.Scanner;

public class numbermirrortriagel {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(); // Anda bisa mengubah nilai n sesuai keinginan

        // Bagian pertama dari pola
        for (int i = 0; i < n; i++) {
            // Cetak spasi
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // Cetak angka dari (i+1) sampai n
            for (int j = i + 1; j <= n; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        // Bagian kedua dari pola
        for (int i = n - 2; i >= 0; i--) {
            // Cetak spasi
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // Cetak angka dari (i+1) sampai n
            for (int j = i + 1; j <= n; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

import java.util.Scanner;

public class Tahunlahir {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukan umur : ");
        int umur = in.nextInt();

        System.out.println("------------------------------------------------------------");

        System.out.println("Tahun lahir anda adalah : "+(2024-umur));
    }
}

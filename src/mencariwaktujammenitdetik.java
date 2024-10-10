import java.util.Scanner;

public class mencariwaktujammenitdetik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Jumlah Detik: ");
        int time,jam,menit,detik;
        time = sc.nextInt();
        detik = time%60;
        menit = time/60%60;
        jam = time/3600;
        System.out.print("Waktu: ");
        System.out.println(jam + ":" + menit + ":" + detik);

    }
}
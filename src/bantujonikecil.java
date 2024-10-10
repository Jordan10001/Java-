import java.text.DecimalFormat;
import java.util.Scanner;
// BELUM SELSAI
public class bantujonikecil {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double diameter = sc.nextDouble();
        double tinggi = sc.nextDouble();
        totalVolume(tingkat1(diameter, tinggi), tingkat2(diameter, tinggi), tingkat3(diameter, tinggi));
    }

    public static double tingkat1(double diameter, double tinggi) {
        return Math.PI * Math.pow(diameter / 2, 2) * tinggi;
    }

    public static double tingkat2(double diameter, double tinggi) {
        return tingkat1(2.0 / 3.0 * diameter, tinggi);
    }

    public static double tingkat3(double diameter, double tinggi) {
        return tingkat1(1.0 / 3.0 * diameter, tinggi);
    }

    public static void totalVolume(double t1, double t2, double t3) {
        System.out.printf("%.2f", t1 + t2 + t3);
    }

}

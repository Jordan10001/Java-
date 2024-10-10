import java.util.Scanner;

public class sistempenilaianmatkul {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double[] nilai = new double[n];//array untuk menyimpan nilai mahasiswa

        for (int i = 0; i < n; i++) {
            nilai[i] = in.nextDouble();
        }

        double avg = hitungRataRata(nilai);
        System.out.printf("%.2f%n", avg);
    }

    public static double hitungRataRata(double[] nilai) {
        double sum = 0;
        for (double x : nilai) {
            sum += x;
        }
        return sum/nilai.length;//mengembalikan nilai rata-rata
    }
}

import java.util.Scanner;

public class investment {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double uang = in.nextDouble();
        int bulan = in.nextInt();

        System.out.println(uang * bulan * 0.02);

    }
}

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Testings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        Arrays.sort(array);

        double median = 0;
        if (n % 2 != 0) {
            median = array[(n - 1) / 2];
        } else {
            median = (double) (array[(n - 1) / 2] + array[n / 2]) / 2;
        }

        System.out.println(median);
    }
}

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class pelepasankelas12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        Integer[] puzzle = new Integer[n];
        for (int i = 0; i < n; i++) {
            puzzle[i] = scanner.nextInt();
        }
        Arrays.sort(puzzle, Comparator.reverseOrder());
        int selisihTerkecil = Integer.MAX_VALUE;
        for (int j = 0; j + (m - 1) < n; j++) {
            int selisih = puzzle[j] - puzzle[j + (m - 1)];
            if (selisih < selisihTerkecil)
                selisihTerkecil = selisih;
        }
        System.out.println(selisihTerkecil);
    }
}

import java.util.Scanner;

public class matrixcantik {
    public static void main(String[] args) {
        int x = 0, y = 0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0, j = 0; i < 25; i++) {
            j = scanner.nextInt();

            if (j == 0) continue;

            x = i % 5;
            y = i / 5;
        }

        System.out.println(Math.abs(x - 2) + Math.abs(y - 2));
        scanner.close();
    }
}

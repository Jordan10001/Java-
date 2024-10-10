import java.util.Scanner;

public class angkadalamstring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        int hasil=0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) >= '0' && input.charAt(i) <= '9') {
                hasil += input.charAt(i) - '0';
            }
        }
        System.out.println(hasil);
    }
}

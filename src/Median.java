import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Median {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan jumlah array : ");
        int input = in.nextInt();
        in.nextLine();
        System.out.println("Masukkan array : ");
        for (int i = 0; i <input ; i++) {
            arr.add(in.nextInt());
        }
        Arrays.sort(arr.toArray());

        median(arr);
    }

    public static void median(ArrayList<Integer> arr){
        int n = arr.size();
        if (n % 2 == 0) {
            System.out.println("Median: "+ (arr.get(n / 2 - 1) + arr.get(n / 2)) / 2.0);
        } else {
            System.out.println("Median: " + arr.get(n / 2) * 1.0);
        }
    }


}

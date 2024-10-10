import java.util.Arrays;
import java.util.Scanner;

public class medianarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Array1 = sc.nextInt();
        int Array2 = sc.nextInt();
        int input = Array1+Array2;
        int[] angka = new int[input];
        for (int i = 0; i < input; i++) {
            angka[i] = sc.nextInt();

        }
        Arrays.sort(angka);
        if(input%2==1){
            System.out.printf("%.1f",(double)angka[input/2]);
        }
        else System.out.printf("%.1f",(double)(angka[input/2] + angka[input/2-1])/2);
    }
}

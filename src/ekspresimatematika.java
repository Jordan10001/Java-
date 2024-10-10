import java.util.Scanner;

public class ekspresimatematika {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int hasil1=a+b+c;
        int hasil2=a*b+c;
        int hasil3=a*(b+c);
        int hasil4=a+b*c;
        int hasil5=(a+b)*c;
        int hasil6=a*b*c;
        System.out.println(Math.max(Math.max(Math.max(Math.max(Math.max(hasil5,hasil6),hasil4),hasil3),hasil2),hasil1));

    }
}

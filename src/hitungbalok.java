import java.util.Scanner;

public class hitungbalok {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        int l = in.nextInt();
        int t = in.nextInt();
        HitungBalok(p,l,t);
    }

    public static void HitungBalok(int panjang, int lebar, int tinggi){
        System.out.println(panjang*lebar);
        System.out.println(panjang*lebar*tinggi);
    }



}

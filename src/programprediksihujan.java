import java.util.Scanner;

public class programprediksihujan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suhu = sc.nextInt();
        int awan = sc.nextInt();
        int tekanan = sc.nextInt();
        if(suhu<30 && awan==1 && tekanan>=1000 && tekanan<=1010) System.out.println("Hujan");
        else System.out.println("Tidak hujan");
    }
}

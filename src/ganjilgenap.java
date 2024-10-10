import java.util.Scanner;

public class ganjilgenap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int angka = in.nextInt();
        if (0<angka||angka<100){
            if (angka%2==0){
                deretgenap(angka);
            }else {
                deretganjil(angka);
            }
        }
    }

    public static void deretganjil(int inuser){
        for (int i = 0, number = 1; i < inuser ; i++) {
            System.out.print(number+" ");
            number += 2;
        }
    }

    public static void  deretgenap (int inuser){
        for (int i = 0,number = 0; i <inuser ; i++) {
            System.out.print(number+" ");
            number+=2;
        }
    }
}

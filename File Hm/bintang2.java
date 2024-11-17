import java.util.Scanner;

public class bintang2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //Buat pattern ukuran
        int panjang = 1;
        for (int i = 2; i <=n ; i++) {
            panjang += 4;
        }
        printpat(panjang);
    }

    public static void printpat(int userinput){
        for (int i = 0; i < userinput; i++) {
            for (int j = 0; j < userinput; j++) {
                int m = userinput-i-1; //dari jarak paling akhir ke awal
                int x = userinput-j-1; //dari jarak paling akhir ke awal
                int distance = Math.min(Math.min(i, m), Math.min(j, x));
                if (distance % 2 == 0) {
                    System.out.print("*  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}

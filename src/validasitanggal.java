import java.util.Scanner;

public class validasitanggal {
    public static boolean Kabisat(int x){
        if (x%400==0) return true;
        else if (x%100==0) return false;
        else return x % 4 == 0;
    }
    public static boolean Check(int tang, int bul, int tah){
        if (bul > 0 && bul <=12 && tang > 0 && tah>0){
            if((bul%2==1&&bul<=7)||(bul%2==0&&bul>7)) return tang<=31;
            else if (bul==2){
                if (Kabisat(tah)&&tang<=29) return true;
                else return !Kabisat(tah) && tang <= 28;
            }
            else return tang<=30;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int tanggal = sc.nextInt();
        int bulan = sc.nextInt();
        int tahun = sc.nextInt();
        if (Check(tanggal,bulan,tahun)) System.out.println("Valid");
        else System.out.println("Tidak valid");
    }
}

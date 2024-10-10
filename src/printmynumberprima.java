import java.util.Scanner;

public class printmynumberprima {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int angkaawal = in.nextInt();
        int angkakedua = in.nextInt();
        bilangan(angkaawal,angkakedua);
    }
    public static boolean cekBilanganPrima(int angka) {
        if (angka < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(angka); i++) {
            if (angka % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void bilangan (int angkaawal, int angkakedua) {
        boolean  adabilanganprima = false;

        for (int i = angkaawal; i <=angkakedua ; i++) {
            if (cekBilanganPrima(i)){
                System.out.print(i+" ");
                adabilanganprima = true;
            }
        }
        if (!adabilanganprima){
            System.out.print("ERROR!");
        }
    }
}

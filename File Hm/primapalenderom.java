import java.util.Scanner;

public class primapalenderom {
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        int n = myInput.nextInt();
        System.out.println(balikangka(n));
        System.out.println(3657%10);
    }
    public static int balikangka(int angka){
        int tmp = angka;
        int reversed = 0;
        while (tmp != 0) {
            int kanan = tmp % 10;
            reversed = reversed * 10 + kanan;
            tmp = tmp / 10;
        }
        return reversed;
    }

    public static boolean isPalindrome(String str) {
        // Menghapus spasi, mengabaikan huruf besar/kecil
        String cleanedStr = str.replaceAll("\\s+", "").toLowerCase();

        // Menggunakan StringBuilder untuk membalikkan string
        String reversedStr = new StringBuilder(cleanedStr).reverse().toString();

        // Membandingkan string asli dengan string yang dibalik
        return cleanedStr.equals(reversedStr);
    }
}
/*
3567
7

356
6

35
5

3
3

 */
import java.text.DecimalFormat;
import java.util.Scanner;

public class luasbangundatar {
    public static double persegiPanjang(double alas, double tinggi){
        double hasil= alas*tinggi;
        return hasil;
    }
    public static double belahKetupat(double alas, double tinggi){
        double hasil=  0.5*tinggi*alas;
        return hasil;
    }
    public static double trapesium(double alas, double tinggi){
        double alas2= alas*2.0/3.0;
        double hasil= 0.5*tinggi*(alas2+alas);
        return hasil;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double alaspanjang = in.nextDouble();
        double tinggilebar = in.nextDouble();

        persegiPanjang(alaspanjang,tinggilebar);
        belahKetupat(alaspanjang,tinggilebar);
        trapesium(alaspanjang,tinggilebar);


    }
}


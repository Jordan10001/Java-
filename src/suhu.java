import java.text.DecimalFormat;
import java.util.Scanner;

public class suhu {
    /*
    F=(9/5) * OC + 32
    K=OC + 273.15
    R=(4/5) * OC
     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float cs = in.nextFloat();

        float f = (9.0f/5.0f) * cs +32;
        float k = cs + (273.15f);
        float r = (4.0f/5.0f)*cs;

        System.out.printf("%.2f\n",f);// untuk 2 angka di blakang koma
        System.out.printf("%.2f\n",k);
        System.out.printf("%.2f\n",r);
    }


}

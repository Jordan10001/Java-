import java.text.DecimalFormat;
import java.util.Scanner;

public class hadiapakyohan {

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        DecimalFormat df= new DecimalFormat("0.00");
        System.out.print("Panjang : ");
        double panjang = in.nextDouble();
        System.out.print("Lebar : ");
        double lebar = in.nextDouble();
        System.out.print("Kedalaman Kolam : ");
        double kedalaman = in.nextDouble();
        System.out.print("Diameter Lingkaran : ");
        double diameter = in.nextDouble();
        System.out.print("Ketebalan : ");
        double ketebalan = in.nextDouble();
        System.out.println("========================================");
        double kedalamanafter = kedalaman-ketebalan;
        double jarijari = diameter/2-ketebalan;
        System.out.println("V BALOK : "+volumeBalok(panjang,lebar,kedalaman,ketebalan));
        System.out.println("V LINGKARAN :"+df.format(volumeKolamLingkaran(diameter,kedalaman,ketebalan)));
        System.out.println("V TEMBERENG :"+hitungLuasTembereng(diameter,kedalaman,ketebalan));
        double vbalok = volumeBalok(panjang,lebar,kedalaman,ketebalan);
        double vlingkaran = volumeKolamLingkaran(kedalamanafter,jarijari,ketebalan);
        double tembereng = hitungLuasTembereng(diameter,kedalaman,ketebalan);
        System.out.println(df.format((vbalok+vlingkaran)-tembereng));



    }
    public static double volumeBalok(double panjang, double lebar, double kedalaman, double  ketebalan){
        double p =panjang-2*ketebalan;
        double l =lebar-2*ketebalan;
        double k =kedalaman-ketebalan;
        double hasil= p*l*k;
            return hasil;
    }

    public static double volumeKolamLingkaran(double kedalamanafter,  double jarijari, double ketebalan){
        //Hitung lingkaran satu
        double volume = Math.PI*Math.pow(jarijari,2)*(kedalamanafter+ketebalan); // 3.14*jari2*jari2*k
        //hitung lingkaran dua
        double volume2 =Math.PI*Math.pow(jarijari-ketebalan,2)*ketebalan;
        // volum 1 + 2
        double hasil= volume+volume2;
            return hasil;
    }

    public static double hitungLuasTembereng(double diameter, double kedalaman, double ketebalan) {
        // Luas sektor lingkaran
        double d =diameter-ketebalan;
        double k =kedalaman-ketebalan;
        double jari2 =d/2;
        double luasSektor = Math.acos((jari2 - k) / jari2) * jari2 * jari2;

        // Luas segitiga yang terbentuk di dalam sektor
        double luasSegitiga = (jari2 - k ) * Math.sqrt(2 * jari2 * k - k * k);

        double luas = luasSektor - luasSegitiga;
        double hasil = luas*k;
        // Luas tembereng = Luas sektor - Luas segitiga
        return hasil;
    }

    //public static double totalVolume(){

    //}







}

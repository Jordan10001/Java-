import java.util.Scanner;

public class tokorotipetralapar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int jumlahroti = in.nextInt();
        int hargatepung = in.nextInt();;
        int hargatelur = in.nextInt();
        int hargagula = in.nextInt();


        System.out.println(hargajual(hargatepung,hargatelur,hargagula));
        System.out.println(totalkeuntungan(hargajual(hargatepung,hargatelur,hargagula),jumlahroti));
    }

    public static int hargajual (int tepung, int telur, int gula){
        int hgjual = (tepung+telur+gula)*2;
        return hgjual;
    }

    public static int totalkeuntungan (int jual,int tbarang){
        int tkeuntungan = jual/2*tbarang;
        return tkeuntungan;
    }
}

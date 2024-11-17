import java.util.Scanner;

public class LoveCalcu {
    static int nambah(int Val1){
        while (Val1>=10){
            int val = 0;
            while (Val1>0){
                val+= Val1%10;
                Val1=Val1/10;
            }
            Val1 = val;
        }return Val1;
    }

    static int hitung(String nama){
        int val= 0;
        for(int i = 0; i<nama.length(); i++){
            val += nama.charAt(i) - 64;
        }
        return val;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String nama1 = sc.nextLine();
        String nama1Temp = nama1.toUpperCase();
        String nama2 = sc.nextLine();
        String nama2Temp = nama2.toUpperCase();

        int val1 = hitung(nama1Temp);
        int val2 = hitung(nama2Temp);

        System.out.println(nama1 +" = " +val1);
        System.out.println(nama2+" = "+val2);
        System.out.println(nambah(val1));
        System.out.println(nambah(val2));

        double x = nambah(val1);
        double y = nambah(val2);
        double hasil = (x/y)*100;
        if (y<x){
            hasil=(y/x)*100;
        }
        System.out.printf("%.2f",hasil);
        System.out.print("%");
    }
}
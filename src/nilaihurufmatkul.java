import java.util.Scanner;

public class nilaihurufmatkul {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double nilai1 =in.nextDouble();
        double nilai2 =in.nextDouble();
        double nilai3 =in.nextDouble();
        double nilai4 =in.nextDouble();

        double nilaiakhir = (nilai1*0.2)+(nilai2*0.2)+(nilai3*0.3)+(nilai4*0.3);

        if (nilaiakhir>=86) System.out.println("A");
        else if (nilaiakhir>=76) {
            System.out.println("B+");
        } else if (nilaiakhir>=69) {
            System.out.println("B");
        } else if (nilaiakhir>=61) {
            System.out.println("C+");
        } else if (nilaiakhir>=56) {
            System.out.println("C");
        } else if (nilaiakhir>=41) {
            System.out.println("D");
        }else System.out.println("E");
    }
}

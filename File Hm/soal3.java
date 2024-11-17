import java.util.Random;
import java.util.Scanner;

public class soal3 {

        public static void main(String[] args) {
            Random ran = new Random();
            Scanner sc = new Scanner(System.in);
            int ranum,pilihan;
            ranum = ran.nextInt(3)+1;//Random num 1-3
            System.out.print("1. Gunting\n"+"2. Batu\n"+"3. Kertas\n"+"CHOICE[1/2/3]: ");
            pilihan = sc.nextInt();
            if (pilihan>0&&pilihan<4){//Antisipasi jawaban di luar option 1=gunting, 2=batu, 3=kertas
                if ((pilihan==1&&ranum==2)||(pilihan==2&&ranum==3)||(pilihan==3&&ranum==1)){//Kalah
                    if (pilihan==1) System.out.println("GUNTING Vs BATU");
                    else if (pilihan==2) System.out.println("BATU Vs KERTAS");
                    else System.out.println("KERTAS Vs GUNTING");
                    System.out.println("Hasil = Kalah");
                }
                else if ((pilihan==1&&ranum==3)||(pilihan==2&&ranum==1)||(pilihan==3&&ranum==2)){//Menang
                    if (pilihan==1) System.out.println("GUNTING Vs KERTAS");
                    else if (pilihan==2) System.out.println("BATU Vs GUNTING");
                    else System.out.println("KERTAS Vs BATU");
                    System.out.println("Hasil = Menang");
                }
                else{//Draw
                    if (pilihan==1) System.out.println("GUNTING Vs GUNTING");
                    else if (pilihan==2) System.out.println("BATU Vs BATU");
                    else System.out.println("KERTAS Vs KETAS");
                    System.out.println("Hasil = Seri");}
            }
            else System.out.println("Pilih yang bener");
        }

}

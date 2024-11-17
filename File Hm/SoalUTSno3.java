import java.util.Random;
import java.util.Scanner;

public class SoalUTSno3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int baris, kolom;
        int[][] matriks;
        System.out.print("Inputkan jumlah baris data matriks: ");
        baris=input.nextInt();
        System.out.print("Inputkan jumlah kolom data matriks: ");
        kolom=input.nextInt();
        matriks=new int[baris][kolom];
        isiMatriksRandom(matriks ,baris, kolom);
        display(matriks);
        System.out.println();
        matriks=resize(matriks, baris, kolom);
        display(matriks);
    }
    public static void display(int[][] arr){
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++) {
                System.out.print(arr[i][j]+"\t\t");
            }
            System.out.println();
        }
    }
    public static void isiMatriksRandom(int [][] arr, int baris, int kolom){
        Random rand=new Random();
        for (int i=0;i<baris;i++){
            for (int j=0;j<kolom;j++){
                arr[i][j]=(int)(Math.floor(rand.nextInt(101)));
            }
        }
    }
    public static int[][] resize (int[][]arr, int baris, int kolom){
        int[][] hasil=new int[baris*2][kolom*2];
        for (int i=0;i<baris*2;i++)
            for (int j=0;j<kolom*2;j++)
                hasil[i][j]=arr[i/2][j/2];
        return hasil;
    }
}

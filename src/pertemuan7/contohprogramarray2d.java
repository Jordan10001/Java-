package pertemuan7;

import java.util.Scanner;

public class contohprogramarray2d {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("MAsukan Jumlah kelompok : ");
        int jumlahkelompok = in.nextInt();

        System.out.print("Masukan jumlah anak per kelompok : ");
        int jumlahanakperkelompok = in.nextInt();

        in.nextLine();//clear enter

        String[][]daftarkelompok = new String[jumlahkelompok][jumlahanakperkelompok];

        for (int i = 0; i <jumlahkelompok ; i++) {
            //loop kelompok
            for (int j = 0; j <jumlahanakperkelompok ; j++) {
                System.out.printf("Masukan nama angota kelompok %d anak ke %d : \n",i+1,j+1);
                daftarkelompok[i][j] = in.nextLine();


            }

        }

        for(String[]baris : daftarkelompok){
            for (String nama : baris){
                System.out.print(nama+" ");
            }
            System.out.println();
        }

    }
}

package pertemuan7;

import java.util.ArrayList;
import java.util.Scanner;

public class latihanarraylist {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int pilihan = 0;
        ArrayList<String> nama = new ArrayList<>();
        do {
            System.out.println("====MENU====");
            System.out.println("1, Tambahkan Nama");
            System.out.println("2. Cetak Daftar Nama");
            System.out.println("3. Exit");
            System.out.print("Masukan pilihan : ");
            pilihan = in.nextInt();
            in.nextLine();
            switch (pilihan){
                case 1:
                    System.out.println("Input Nama : ");
                    nama.add(in.nextLine());
                    break;
                case 2:
                    System.out.println("Daftar Nama : ");
                    for (String s : nama){
                        System.out.println(s);
                    }
                    break;
                case 3:
                    //EXIT
                    System.out.println("Tahnkuou");
                    break;
            }
        }while (pilihan !=3);
    }
}

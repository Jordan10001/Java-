package pertemuan7;

import java.util.Scanner;

public class array2d {
    public static void main(String[] args) {

        //ARRAY 2D

        String[][] array2d = new String[2][3];
        array2d[0][0] ="Andi";
        array2d[0][1] ="Budi";
        array2d[0][2] ="Wati";
        //artinya array2d ini memiliki baris pertama berupa array String[3] berisi String

        array2d[1][0] ="Joni";
        array2d[1][1] ="Jono";
        array2d[1][2] ="Alex";
        // baris kedua jugg berupg orray String[3]

        // misal mau tau panjangnya array yang di baris kedug bggaimana carenya?
        System.out.println(array2d[1].length);

        //mau tau jumlah baris yang ada
        System.out.println(array2d.length);

        //mau ganti jono dengan jeni
        array2d[1][1]="Jeni";

        for (int i = 0; i <array2d.length ; i++) { //LOOP BARIS
            for (int j = 0; j <array2d[i].length ; j++) { //LOOP KOLOM
                System.out.print(array2d[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("------------------------------------------------------");
        //JAGGED ARRAY

        String[][]arrayjagged = new String[3][];
        arrayjagged[0] = new String[]{"A","B","C"};
        arrayjagged[1] = new String[]{"D","E"};
        arrayjagged[2] = new String[]{"F","G","H","I"};

        System.out.println(arrayjagged[2].length); //4
        System.out.println(arrayjagged[0].length); //3

        for (int i = 0; i <arrayjagged.length ; i++) {
            for (int j = 0; j <arrayjagged[i].length ; j++) {
                System.out.print(arrayjagged[i][j]+" ");
            }
            System.out.println();
        }




    }
}

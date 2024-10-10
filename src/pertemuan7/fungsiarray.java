package pertemuan7;

import java.util.Scanner;

public class fungsiarray {
    public static void printArray(String[] arraynya){
        for (String s : arraynya){
            System.out.println(s);
        }
    }
    // menyambung 2 array String menjadi array string yg baru
    public static String[] sambungArray(String[] array1, String[] array2){
        int panjangHasil = array1.length + array2.length;
        String[] arrayHasil = new String[panjangHasil];

        // diisi dengan isinya array1
        for (int i=0; i<array1.length; i++){
            arrayHasil[i] = array1[i];
        }

        // diisi dengan isinya array2
        // index array2 dimulai 0
        for (int i = 0; i<array2.length; i++){
            arrayHasil[array1.length+i]=array2[i];
        }
        return arrayHasil;
    }

    // buat method yang menerima array int dan menghasilkan array baru berupa array tadi
    // tapi urutannya dibalik
    public static int[] membalikAngka(int[] angka){
        int[] arrayHasil = new int[angka.length];
        int indeksAsal;
        for (int i = 0; i<angka.length; i++){
            indeksAsal = angka.length-1-i;
            arrayHasil[i] = angka[indeksAsal];
        }

        return arrayHasil;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] daftar = {"A","B","C"};
        String[] daftar2 = {"D","E","F","G"};

        String[] daftar3 = sambungArray(daftar,daftar2);
        printArray(daftar3);

        int[] angka1 = {1,2,3,4,5,6,7};
        int[] angka2 = membalikAngka(angka1);

        for (int a : angka2){
            System.out.println(a);
        }
    }
}

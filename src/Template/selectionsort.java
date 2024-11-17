package Template;

import java.util.ArrayList;

public class selectionsort {
    public static void selectionsort(int[] array){
        for (int i = 0; i <array.length -1 ; i++) {
            int min = i;
            for (int j = i+1; j <array.length; j++) {
                if (array[j]<array[min]){
                    min = j;
                }
            }
            int temp = array[min];
            array[min]=array[i];
            array[i]=temp;
        }
    }
    public static void selectionSort(ArrayList<Integer> arr) {
        int n = arr.size();
        // Iterasi melalui seluruh array
        for (int i = 0; i < n - 1; i++) {
            // Anggap elemen pertama adalah elemen terkecil
            int minIndex = i;
            // Mencari elemen terkecil di sisa array
            for (int j = i + 1; j < n; j++) {
                if (arr.get(j) < arr.get(minIndex)) {
                    minIndex = j; // Menyimpan indeks elemen terkecil
                }
            }
            // Swap elemen terkecil dengan elemen pertama yang tidak terurut
            int temp = arr.get(minIndex);
            arr.set(minIndex, arr.get(i));
            arr.set(i, temp);
        }
    }
    public static void main(String[] args) {
        int[]daftarangka ={2,5,1,2,6,4};
        selectionsort(daftarangka);
        for (int i : daftarangka){
            System.out.println(i);
        }
    }

}

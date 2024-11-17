package Template;

import java.util.ArrayList;
import java.util.Scanner;

public class bublesortarraylist {


    public static void bubbleSort(ArrayList<Integer> arr) {
        int n = arr.size();
        boolean swapped;

        // Loop untuk setiap elemen array
        for (int i = 0; i < n; i++) {
            swapped = false; // Untuk cek apakah ada swap dalam satu iterasi
            // Loop untuk membandingkan elemen berpasangan
            for (int j = 0; j < n - i - 1; j++) {
                if (arr.get(j) > arr.get(j + 1)) {
                    // Swap jika elemen sekarang lebih besar dari elemen berikutnya
                    int temp = arr.get(j); // temp = arr[j];
                    arr.set(j, arr.get(j + 1));// arr[j] = arr[j+1]
                    arr.set(j + 1, temp);//arr[j+1] = temp
                    swapped = true;
                }
            }
            // Jika tidak ada swap, array sudah terurut
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen: ");
        int n = scanner.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();

        System.out.println("Masukkan elemen array:");
        for (int i = 0; i < n; i++) {
            arr.add(scanner.nextInt());
        }

        // Sorting menggunakan bubble sort
        bubbleSort(arr);

        // Menampilkan array yang telah diurutkan
        System.out.println("Array setelah diurutkan:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class mendekteksiwaktutumbuh {
    // Menerima input int berapa banyak bitbit yang akan ditanam
    // Buat array untuk menampung waktu tumbuh bibit
    // Menerima input int  waktu tumbuh bibit tiap bibit
    //
    // Mengurutkan waktu tumbuh bibit dari yang paling lama ke yang paling cepat
    //
    // Membuat variabel maksimalHari dengan nilai 0
    // looping untuk menghitung hari maksimal
    // Di dalam loping simpan variabel waktu tunggu paling lama
    // Jika ada waktu tumbuh yang melebihi waktu tunggu paling lama
    // Maka variabel waktu tunggu paling lama di update dengan waktu yang baru
    // Setiap loop setelah melewati satu hari akan ditambah 1
    // Waktu tunggu paling lama di tambah 1
    // Karena pemilik pohona akan mengadakan pestanya ke esokan harinya setelah pohon paling lama tumbuh

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Jumlah bibit yang akan ditanam: ");
        int n = sc.nextInt();
        Integer[] waktuTumbuh = new Integer[n];
        for (int i =0; i<n; i++){
            System.out.print("Waktu tumbuh bibit " + (i+1)+": ");
            waktuTumbuh[i]= sc.nextInt();
        }
        Arrays.sort(waktuTumbuh, Collections.reverseOrder());//untuk mengurutkan waktu tumbuh bibit dari yang terbesar

        int maksimalHari= 0;
        for (int i=0; i<n; i++){
            int hari = waktuTumbuh[i]+(i+1);
            if (hari>maksimalHari) { // Jika hari lebih besar dari maksimalHari
                maksimalHari=hari;
            }
        }
        System.out.println("Pesta dapat diadakan "+ (maksimalHari+1) +" hari setelah penanaman bibit pertama.");

    }

}

import java.util.ArrayList;
import java.util.Scanner;

public class QuestComputationalThinking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan Jumlah Foto : ");
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<Integer> jarak = new ArrayList<>(); //buat nyimpen jarak
        jarak.add(0);
        ArrayList<Integer> waktu = new ArrayList<>(); // buat nyimpen waktu
        waktu.add(0);
        for (int i = 0; i <n ; i++) {
            System.out.print("Masukan Jarak Foto Satuan Km ke-"+(i+1)+" : ");
            jarak.add((int) (sc.nextDouble()*1000)); // Di ubah ke meter
            System.out.println("Masukan Waktu Foto ke-"+(i+1)+" : ");
            System.out.print("Jam : ");// satuan jam
            int jam = sc.nextInt();
            System.out.print("Menit : "); // satuan menit
            int menit = sc.nextInt();
            int totalwaktu = (jam*60)+menit;
            waktu.add(totalwaktu);// Di ubah ke satuan menit
            sc.nextLine();
        }
        ArrayList<Integer> jarak2 = new ArrayList<>();// buat carik selisih jarak foto 1 dengan foto 2
        ArrayList<Integer> waktu2 = new ArrayList<>();// buat carik selisih waktu foto 1 dengan foto 2
        for (int i = 0; i < jarak.size()-1 ; i++) {
            jarak2.add(jarak.get(i+1)-jarak.get(i));
        }
        for (int i = 0; i <waktu.size()-1 ; i++) {
            waktu2.add(waktu.get(i+1)-waktu.get(i));
        }
        ArrayList<Integer> kecepatan = new ArrayList<>();// buat carik kecepatan tiap foto
        for (int i = 0; i < jarak2.size(); i++) {
            kecepatan.add(jarak2.get(i)/waktu2.get(i));
        }
        for (int i = 0; i < kecepatan.size(); i++) { // output kecepatan tiap foto
            System.out.println("Kecepatan Foto ke - "+ (i+1) + " : " + kecepatan.get(i) + " M/menit");
        }
        bublesort(kecepatan);
        System.out.println("Kecepatan Foto Tercepat : "+kecepatan.getFirst()+" M/menit");// output kecepatan foto tercepat

    }
    public static void bublesort(ArrayList<Integer>aar){ //untuk mengurutkan kecepatan foto dari yang paling tinggi ke rendah
        for (int i = 0; i <aar.size() ; i++) {
            for (int j = 0; j < aar.size()-i-1 ; j++) {
                if(aar.get(j)<aar.get(j+1)){
                    int temp = aar.get(1);
                    aar.set(j,aar.get(j+1));
                    aar.set(j+1,temp);
                }
            }
        }
    }
}


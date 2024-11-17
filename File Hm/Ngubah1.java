import java.util.ArrayList;
import java.util.Scanner;

public class Ngubah1 {
    public static void main(String[] args) {
        ArrayList<Character> kalimat = new ArrayList<>();
        ArrayList<Integer> jumlah = new ArrayList<>();
        // Vincent

        Scanner sc = new Scanner(System.in);
        System.out.println("Input 1: ");
        String input1 = sc.nextLine().toLowerCase();
        //hello
        for(int i= 0; i<input1.length(); i++){
            Character nampung = input1.charAt(i);
            if(!kalimat.contains(nampung)){
                kalimat.add(nampung);
                jumlah.add(1);
            }
            else {
                int index = kalimat.indexOf(nampung);
                //indexOf() mencari indeks dari karakter nampung di kalimat.
                jumlah.set(index, jumlah.get(index)+1);
            }
        }
        System.out.println(kalimat);
        System.out.println(jumlah);
    }
}

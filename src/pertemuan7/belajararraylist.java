package pertemuan7;

import java.util.ArrayList;

public class belajararraylist {
    public static void main(String[] args) {
        ArrayList<Integer> daftarangka = new ArrayList<>();
        ArrayList<String> daftarnama = new ArrayList<>();
        daftarnama.add("joni");//TERISISI DI INDEX 0
        String nama = daftarnama.get(0);
        System.out.println(nama);
        daftarnama.add("jono");//TERISISI DI INDEX 1
        daftarnama.add("Budi");//TERISISI DI INDEX 2

        for (int i = 0; i <daftarnama.size() ; i++) {
            System.out.println(daftarnama.get(i));
        }

        daftarnama.set(1,"Andi");//MENGGANTI INDEX 1 SEBELUMNYA

        for(String s: daftarnama){
            System.out.println(s);
        }

        daftarnama.remove(1);//MENGHAPUS ANDI
        System.out.println(daftarnama.get(1));//MENAMPILKAN BUDI
        //System.out.println(daftarnama.get(2));  ERROR KARENA ISI DALAM ARRAYLIST BERGESER

        //Untuk clear lis gunakan
        // daftarnama,clear();

    }
}

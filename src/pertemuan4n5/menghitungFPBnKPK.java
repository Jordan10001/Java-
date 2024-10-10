package pertemuan4n5;

import java.util.Scanner;

public class menghitungFPBnKPK {
    /*
   Membuat program untuk menghitung FPB dan KPK
    */
    //PILIHAN 1
    public static void pilihansatu(){
        //menerima dua angka lalu melempar ke methon hitung angka
        Scanner in= new Scanner(System.in);
        System.out.print("Masukan angka pertama : ");
        int angka1= in.nextInt();
        System.out.print("Masukan angka kedua : ");
        int angka2= in.nextInt();
        //panggil methon hitung KPK
        int hasil;
        if (angka1>angka2){
            hasil = hitungkpk(angka1,angka2);
        }else {
            hasil = hitungkpk(angka2,angka1);
        }
        // lalu cetak hasil
        System.out.println("KPK nya adalah : "+hasil);
    }

    public static int hitungkpk (int angkabesar,int angkakecil){
        //menghitung KPK dengan cara mengalikan angka besar dan hasilnya di bagi angka kecil untuk
        //menemukan kelipatan yang sama
        int hasil = angkabesar;
        int pengali =1;
        while ((hasil%angkakecil)!=0){
            hasil = angkabesar*pengali;
            pengali++;
        }
        return hasil;
    }

    //PILIHAN 2
    public static void pilihandua(){
        //menerima dua angka lalu melempar ke methon hitung angka
        Scanner in= new Scanner(System.in);
        System.out.print("Masukan angka pertama : ");
        int angka1= in.nextInt();
        System.out.print("Masukan angka kedua : ");
        int angka2= in.nextInt();
        //panggil methon hitung FPB
        int hasil;
        if (angka1<angka2){
            hasil = hitungfpb(angka1,angka2);
        }else {
            hasil = hitungfpb(angka2,angka1);
        }
        // TUGAS
        // lalu cetak hasil
        System.out.println("FPB nya adalah : "+hasil);

    }

    public static int hitungfpb(int angkakecil, int angkabesar){
        //Hitung FPB cara :
        //Loop membagi mundur mulai angka yg kecil sebagai pembagi
        // lalu cek anpakah angka kecil dan angka besar habis dibagi angka tsb
    int hasil = 1;
        for (int i = angkakecil; i>= 1; i--){
            if(angkakecil%i==0){
                if(angkabesar%i==0){
                    hasil=i;
                    break;
                }
            }
        }
        return hasil;
    }

    public static void main(String[] args) {
        // Buat menu
        Scanner in= new Scanner(System.in);
        int pilihan = 0;
        do {
            System.out.println("====MENU====");
            System.out.println("1, Hitung KPK");
            System.out.println("2. Hitung FPB");
            System.out.println("3. Exit");
            System.out.print("Masukan pilihan : ");
            pilihan = in.nextInt();
            in.nextLine();

            switch (pilihan){
                case 1:
                    //hitung KPK
                    pilihansatu();
                    break;
                case 2:
                    //hitung FPB
                    pilihandua();
                    break;
                case 3:
                    //EXIT
                    System.out.println("Tahnkyou");
                    break;
                default:
                    System.out.println("Masukan yang benar");
            }


        }while (pilihan !=3);

    }
}

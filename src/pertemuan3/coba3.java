package pertemuan3;

public class coba3 {
    //contoh standart method
    public  static int perkalian (int angka1, int angka2){
        int hasil=angka1 * angka2;
        return hasil;
    }

    // mengubah int menjadi string
    public static String mengubahangkaJadiHuruf(int angka){
        return "" + angka;
    }

    //contoh menthod tanpa return value
    public static void cetakAngka(int angka) {
        System.out.println("Angkanya ="+angka);

    }

    //contoh method tanpa parameter
    public static int menghasilkanLima() {
        return 5;
    }

    //contoh method tanpa parameter dan value
    public static void mencetakHeader(){
        System.out.println("U.D. for real");
        System.out.println("jalan mangga no 5");
        System.out.println("menjual bahan bangunan");
    }

    //lokalisasi variabel
    public static void mencetakduaangka(int angka1, int angka2) {
        System.out.println("Angka pertama =" + angka1);
        System.out.println("Angka kedua ="+angka2);
    }




    public static void main(String[] args) {

        //testing methods
        int x =5;
        int y =10;
        cetakAngka(perkalian(x,y));

        System.out.println("angka 5 dari method ->" + menghasilkanLima());
        mencetakHeader();

        //
        String lima= mengubahangkaJadiHuruf(menghasilkanLima());

        // variabel tdk berhubungan dng variabel yang di method
        int angka1= 7;
        int angka2= 9;
        mencetakduaangka(angka1,angka2);

    }
}

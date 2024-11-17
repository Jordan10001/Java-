import java.util.Scanner;

public class soalbonus {

        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            System.out.print("Bulan Sekarang: ");
            String moth = sc.nextLine();//input bulan sekarang
            System.out.print("Bulan Kehamilan: ");
            int B_kehamilan = sc.nextInt(); // usia kehamilan

            if (B_kehamilan<0||B_kehamilan>9) System.out.println("Invalid");//9 bulan ke atas hrus nya udh lahir eror
                else {
                    int Expetasi_int = 9-B_kehamilan;//Berapa lama sebelum bulan lahir
                    moth=moth.toUpperCase();// Semua jadi kapital
                    int Bulan_inINT;  //variabel
                        switch (moth){//Bulan jadiin angka biar gampang di operasikan
                            case "JANUARI" -> Bulan_inINT = 1;
                            case "FEBRUARI" -> Bulan_inINT = 2;
                            case "MARET" -> Bulan_inINT = 3;
                            case "APRIL" -> Bulan_inINT = 4;
                            case "MEI" -> Bulan_inINT = 5;
                            case "JUNI" -> Bulan_inINT = 6;
                            case "JULI" -> Bulan_inINT = 7;
                            case "AGUSTUS" -> Bulan_inINT = 8;
                            case "SEPTEMBER" -> Bulan_inINT = 9;
                            case "OKTOBER" -> Bulan_inINT = 10;
                            case "NOVEMBER" -> Bulan_inINT = 11;
                            case "DESEMBER" -> Bulan_inINT = 12;
                            default -> Bulan_inINT = -1;
                        }
                    if (Bulan_inINT<0) System.out.println("Bukan bulan");
                        else {
                            int Expetasi_Lahir = Bulan_inINT + Expetasi_int; //Operasi untuk menentukan bulan lahiran dalam angka
                            Expetasi_Lahir = Expetasi_Lahir%12;//klo lbh dri 12 kan ngulang ke januari
                            String Bulan_Lahir; //variabel
                            switch (Expetasi_Lahir){//dri ekspetasi lahir jadi String
                                case 1 -> Bulan_Lahir = "Januari";
                                case 2 -> Bulan_Lahir = "Februari";
                                case 3 -> Bulan_Lahir = "Maret";
                                case 4 -> Bulan_Lahir = "April";
                                case 5 -> Bulan_Lahir = "Mei";
                                case 6 -> Bulan_Lahir = "Juni";
                                case 7 -> Bulan_Lahir = "Juli";
                                case 8 -> Bulan_Lahir = "Agustus";
                                case 9 -> Bulan_Lahir = "September";
                                case 10 -> Bulan_Lahir = "Oktober";
                                case 11 -> Bulan_Lahir = "November";
                                case 12 -> Bulan_Lahir = "Desember";
                                default -> Bulan_Lahir = "GTW";
                            }
                            System.out.println("Perkiraan Bulan Kelahiran: "+Bulan_Lahir);
                        }
                }
        }

}

import java.util.Scanner;

public class latihanUTSno1 {
    /*1. Pada hari Senin sampai Jumat Pagi dan Siang Joni ke Sekolah. Sorenya Jika tidak hujan maka Joni bermain bola,
    kecuali hari Selasa dan Kamis hujan atau tidak, Joni les. Pada hari Sabtu dan Minggu Siang jika tidak hujan
    joni ke mall, jika hujan joni bermain game. Pada hari minggu pagi Joni ke Gereja. Selain hal-hal diatas itu,
    Joni tidur. Buatlah program yang menanyakan hari, waktu (pagi/siang/sore), dan hujan atau tidak lalu menampilkan
    jawaban yang benar Joni sedang apa hari itu!
    Contoh pertanyaan:
    Hari apa ini? Senin
    Waktu? Siang
    Hujan? Tidak
    Joni di Sekolah
     */
    // senin sampai jumat pagi dan siang ke sekolah
    // sore jika tidak hujan bermain bola
    // selasa dan kamis hujan atau tidak les
    // sabtu dan minggu siang jika tidak hujan ke mall jika hujan bermain game
    // minggu pagi ke gereja
    // selain itu tidur
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String hari, waktu, cuaca;
        System.out.println("Hari apa ini?");
        hari = in.nextLine();
        System.out.println("Waktu?");
        waktu = in.nextLine();
        System.out.println("Hujan / Tidak?");
        cuaca = in.nextLine();

        hari=hari.toLowerCase();
        waktu=waktu.toLowerCase();
        cuaca=cuaca.toLowerCase();

        if (hari.equals("senin")||hari.equals(("selasa"))||hari.equals("rabu")||hari.equals("kamis")||hari.equals("jumat")) {
            if (waktu.equals(("pagi")) || waktu.equals("siang")) {
                if (cuaca.equals("hujan")||cuaca.equals("tidak")){
                System.out.println("Joni ke Sekolah");
                }
            } else if (waktu.equals("sore")) {
                if (hari.equals("selasa") || hari.equals("kamis")) {
                    if (cuaca.equals("hujan")||cuaca.equals("tidak")) {
                        System.out.println("Joni Les");
                    }
                } else {
                    if (cuaca.equals("tidak")) {
                        System.out.println("Joni bermain bola");
                    } else {
                        System.out.println("Joni Coli");
                    }
                }
            }
        } else if (hari.equals("sabtu")) {
            if (waktu.equals("siang")){
                if (cuaca.equals("tidak")) {
                    System.out.println("Joni ke Mall");
                } else {
                    System.out.println("Joni bermain game");
                }
            }else {
                System.out.println("Joni Coli");
            }
        } else if (hari.equals("minggu")) {
            if (waktu.equals("siang")){
                if (cuaca.equals("tidak")) {
                    System.out.println("Joni ke Mall");
                } else {
                    System.out.println("Joni bermain game");
                }
            } else if (waktu.equals("pagi")) {
                System.out.println("Joni ke Gereja");
            } else {
                System.out.println("Joni Coli");
            }
        }else {
            System.out.println("YANG BENER KONTOL");
        }

    }





}

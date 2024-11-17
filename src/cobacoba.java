import java.util.Scanner;

public class cobacoba {
    public static void main(String[] args) {
        /*
        Scanner inputUser = new Scanner(System.in);
        System.out.print("imput kalimat bro:");
        String kalimatuser = inputUser.nextLine();
        System.out.println("Kalimat user adalah:" + kalimatuser);
        System.out.print("imput angka bro");
        int angkauser = inputUser.nextInt();
        System.out.println("angka user adalah:" + angkauser);

        inputUser.nextLine();
        System.out.print("imput kalimat bro ke2 :");
        String kalimatuser2 = inputUser.nextLine();
        System.out.println("kalimat user ke 2 adalah:" + kalimatuser2);
         */

        /*
        Scanner inputUser = new Scanner(System.in);
        System.out.print("Nama Mahasiswa:");
        String namaMahasiswa = inputUser.nextLine();
        System.out.print("NRP Mahasiswa:");
        String nrpmaMahasiswa = inputUser.nextLine();
        System.out.print("SKS :");
        int sks = inputUser.nextInt();
        System.out.print("Semester:");
        int semester = inputUser.nextInt();
        System.out.println("Saya mahasiswa " + namaMahasiswa + "  nrp  " +
                nrpmaMahasiswa + "  dengan SKS" +sks+"  semester  "+semester);
         */

        Scanner inputUser = new Scanner(System.in);
        System.out.print("x1 :");
        int x1 = inputUser.nextInt();
        System.out.print("x2 :");
        int x2 = inputUser.nextInt();
        System.out.print("y1 :");
        int y1 = inputUser.nextInt();
        System.out.print("y2 :");
        int y2 = inputUser.nextInt();

        int hasill = (int) Math.sqrt(Math.pow(x2 - x1,2)+(Math.pow(y2 - y1,2)));

        System.out.println("D ="+ hasill  );
    }
}

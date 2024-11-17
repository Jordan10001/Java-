import java.util.Scanner;

public class helpme {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        // Masukan angka 5 digit
        int angkainput = in.nextInt();
        // convert int to string
        String angka = String.valueOf(angkainput);
        angkaberuntung(angka);
    }

    public static void angkaberuntung(String angkainput){
        String angka1string = angkainput.substring(0,3);
        int angka1int = Integer.parseInt(angka1string);
        //convert string to int
        String angka2string = angkainput.substring(3,5);
        int angka2int = Integer.parseInt(angka2string);
        //convert string to int
        System.out.println(angka1int+angka2int);
    }
}

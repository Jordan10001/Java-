import java.util.Scanner;

public class c14240117 {
    public static void konversiNilai(double penguasaan) {

        if (penguasaan >= 86 && penguasaan <= 100) {
            System.out.println("Nilai Huruf = A");
            System.out.println("Nilai Numerik = 4");
            System.out.println("Kategori = Istimewa");
        } else {
            if (penguasaan >= 76 && penguasaan <= 85) {
                System.out.println("Nilai Huruf = B+");
                System.out.println("Nilai Numerik = 3,5");
                System.out.println("Kategori = Baik Sekali");
            }
            else {
                if (penguasaan >= 69 && penguasaan <= 75) {
                    System.out.println("Nilai Huruf = B");
                    System.out.println("Nilai Numerik = 3");
                    System.out.println("Kategori = Baik");
                }
                else {
                    if (penguasaan >= 61 && penguasaan <= 68) {
                        System.out.println("Nilai Huruf = C+");
                        System.out.println("Nilai Numerik = 2,5");
                        System.out.println("Kategori = Cukup Baik");
                    }
                    else {
                        if (penguasaan >= 56 && penguasaan <= 60) {
                            System.out.println("Nilai Huruf = C");
                            System.out.println("Nilai Numerik = 2");
                            System.out.println("Kategori = Cukup");
                        }
                        else {
                            if (penguasaan >= 41 && penguasaan <= 55) {
                                System.out.println("Nilai Huruf = D");
                                System.out.println("Nilai Numerik = 1");
                                System.out.println("Kategori = Kurang");
                            }
                            else {
                                if (penguasaan >= 0 && penguasaan <= 40) {
                                    System.out.println("Nilai Huruf = E");
                                    System.out.println("Nilai Numerik = 0");
                                    System.out.println("Kategori = Buruk");
                                }
                            }
                        }
                    }
                }
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Nilai(%) = ");
        double nilai = sc.nextDouble();
        konversiNilai(nilai);



    }
}
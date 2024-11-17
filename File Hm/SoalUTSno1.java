import java.util.Scanner;

public class SoalUTSno1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int left = 2, right = 5, top = 8, bottom = 1;
        System.out.print("X: ");
        int x = input.nextInt();
        System.out.print("Y: ");
        int y = input.nextInt();

        if (isInsideOf(x, y, left, right, top, bottom)) {
            System.out.println("Evaluasi soal A ");
            System.out.println("("+x+", "+y+") ada di dalam kotak soal A");
        } else {
            System.out.println("Evaluasi soal A ");
            System.out.println("("+ x + ", " + y + ") tidak ada di dalam kotak soal A");
        }

        System.out.println("Evaluasi soal B titik di kotak A, B, C atau D");
        if (isInsideOf(x, y, 2, 9, 7, 1)) {  // batas besar kotak A
            if (isInsideOf(x, y, 3, 5, 5, 2)) {  // batas kotak B di dalam A
                System.out.println("titik di dalam kotak B");
            } else if (isInsideOf(x, y, 7, 9, 5, 3)) {  // batas kotak C di dalam A
                System.out.println("titik di dalam kotak C");
            } else if (isInsideOf(x, y, 2, 4, 7, 6)) {  // batas kotak D di dalam A
                System.out.println("Titik di dalam kotak A");
            } else System.out.println("titik di dalam kotak A");
        } else if (isInsideOf(x, y, 9, 10, 6, 3)) {  // batas kotak C di luar bagian A
            System.out.println("Titik di dalam kotak C");
        } else if (isInsideOf(x, y, 1, 4, 9, 6)) {  // batas kotak D di luar A bagian besar
            System.out.println("Titik di kotak D");
        } else if (isInsideOf(x, y, 1, 2, 7, 6)) {  // batas kotak D di luar A bagian kecil
            System.out.println("Titik di kotak D");
        } else System.out.println("Titik tidak di dalam kotak A, B, C, D");





    }
    public static boolean isInsideOf (int x, int y, int left, int right, int top, int bottom) {
        // evaluasi kotak soal A
        //System.out.println("("+x+", "+y+") ada di dalam kotak");
        //System.out.println("("+ x + ", " + y + ") tidak ada di dalam kotak");
        return x >= left && x <= right && y <= top && y >= bottom;
    }

}

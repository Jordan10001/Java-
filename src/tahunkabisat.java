import java.util.Scanner;

public class tahunkabisat {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int year = in.nextInt();

        if (year>=1){
            if (year % 4 == 0){
                if (year % 100 == 0){
                    if (year % 400 == 0){
                        System.out.println("true");//jika thaun habis di gai 4 100 400 maka true
                    }else System.out.println("false");//jika thaun tidak bisa di bagi 400 false
                }else System.out.println("true");//tahun bisa di bagi 4 tapi tidak dibagi 100 true
            }else System.out.println("false");//tahun tidak bisa di bagi 4 false
        }else System.out.println("false");
    }
}

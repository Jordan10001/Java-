import java.util.Scanner;

public class weekendweekday {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        String hari = in.nextLine();

        if (hari.equals("sabtu")||hari.equals("minggu")) System.out.println("weekend");
        else System.out.println("weekday");
    }
}

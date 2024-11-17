import java.util.Scanner;

public class soal2 {

        public static void morse(String a){
            a = a.toUpperCase();//input bisa kapital atau tidak
            switch (a) {
                case "A" -> System.out.println(".-");
                case "B" -> System.out.println("-...");
                case "C" -> System.out.println("-.-.");
                case "D" -> System.out.println("-..");
                case "E" -> System.out.println(".");
                case "F" -> System.out.println("..-.");
                case "G" -> System.out.println("--.");
                case "H" -> System.out.println("....");
                case "I" -> System.out.println("..");
                case "J" -> System.out.println(".---");
                case "K" -> System.out.println("-.-");
                case "L" -> System.out.println(".-..");
                case "M" -> System.out.println("--");
                case "N" -> System.out.println("-.");
                case "O" -> System.out.println("---");
                case "P" -> System.out.println(".--.");
                case "Q" -> System.out.println("--.-");
                case "R" -> System.out.println(".-.");
                case "S" -> System.out.println("...");
                case "T" -> System.out.println("-");
                case "U" -> System.out.println("..-");
                case "V" -> System.out.println("...-");
                case "W" -> System.out.println(".--");
                case "X" -> System.out.println("-..-");
                case "Y" -> System.out.println("-.--");
                case "Z" -> System.out.println("--..");
                default -> System.out.println("Cannot be turned to morse");
            }
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Char: ");
            String car = sc.nextLine();
            System.out.print("Morse: ");
            morse(car);

        }

}

import java.util.ArrayList;
import java.util.Scanner;

public class validation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        ArrayList<Character> arr = new ArrayList<>();
        char[] temp = input.toCharArray();
        // {[()]}
        // [{}]()
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] == ')' && arr.get(arr.size() - 1) == '(' ||
                temp[i] == '}' && arr.get(arr.size() - 1) == '{' ||
                temp[i] == ']' && arr.get(arr.size() - 1) == '[')
                arr.remove(arr.size() - 1);
            else arr.add(temp[i]);
        }
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i));
        }
        System.out.println();
        return;
    }

    public boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;
        ArrayList<Character> arr = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (arr.size() == 0) {
                if (s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']') return false;
            }
            if (s.charAt(i) == ')' && arr.get(arr.size() - 1) == '(' ||
                s.charAt(i) == '}' && arr.get(arr.size() - 1) == '{' ||
                s.charAt(i) == ']' && arr.get(arr.size() - 1) == '[')
                arr.remove(arr.size() - 1);
            else arr.add(s.charAt(i));
        }
        return arr.size() == 0;
    }
}

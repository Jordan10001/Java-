package Template;

public class brutforce {
    public static void main(String[] args) {
        String text = "abracadabra";
        String pattern = "abra";

        System.out.println("Text: " + text);
        System.out.println("Pattern: " + pattern);

        bruteForceSearch(text, pattern);
    }

    public static void bruteForceSearch(String text, String pattern) {
        int textLength = text.length();
        int patternLength = pattern.length();

        for (int i = 0; i <= textLength - patternLength; i++) {
            int j;
            for (j = 0; j < patternLength; j++) {
                if (text.charAt(i + j) != pattern.charAt(j)) {
                    break;
                }
            }
            if (j == patternLength) {
                System.out.println("Pattern found at index: " + i);
            }
        }
    }
}

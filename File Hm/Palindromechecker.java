public class Palindromechecker {
    public static boolean isPalindrome(String str) {
        // Menghapus spasi, mengabaikan huruf besar/kecil
        String cleanedStr = str.replaceAll("\\s+", "").toLowerCase();

        // Menggunakan StringBuilder untuk membalikkan string
        String reversedStr = new StringBuilder(cleanedStr).reverse().toString();

        // Membandingkan string asli dengan string yang dibalik
        return cleanedStr.equals(reversedStr);
    }

    public static void main(String[] args) {
        String testString = "A man a plan a canal Panama";

        if (isPalindrome(testString)) {
            System.out.println("\"" + testString + "\" is a palindrome.");
        } else {
            System.out.println("\"" + testString + "\" is not a palindrome.");
        }
    }
}

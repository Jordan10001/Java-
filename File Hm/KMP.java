public class KMP {
        // Method untuk membangun LPS array
        public static int[] computeLPSArray(String pattern) {
            int[] lps = new int[pattern.length()];
            int len = 0;  // panjang prefix yang cocok
            lps[0] = 0;   // lps[0] selalu 0
            int i = 1;

            // Membangun LPS array
            while (i < pattern.length()) {
                if (pattern.charAt(i) == pattern.charAt(len)) {
                    len++;
                    lps[i] = len;
                    i++;
                } else {
                    if (len != 0) {
                        len = lps[len - 1];
                    } else {
                        lps[i] = 0;
                        i++;
                    }
                }
            }
            return lps;
        }

        // Method utama untuk KMP pattern matching
        public static void KMPSearch(String text, String pattern) {
            int[] lps = computeLPSArray(pattern);
            int i = 0; // indeks untuk text
            int j = 0; // indeks untuk pattern

            while (i < text.length()) {
                if (pattern.charAt(j) == text.charAt(i)) {
                    i++;
                    j++;
                }
                if (j == pattern.length()) {
                    System.out.println("Pattern ditemukan pada indeks " + (i - j));
                    j = lps[j - 1];
                } else if (i < text.length() && pattern.charAt(j) != text.charAt(i)) {
                    if (j != 0) {
                        j = lps[j - 1];
                    } else {
                        i++;
                    }
                }
            }
        }

        public static void main(String[] args) {
            String text = "ABABDABACDABABCABAB";
            String pattern = "ABABCABAB";
            KMPSearch(text, pattern);
        }


}

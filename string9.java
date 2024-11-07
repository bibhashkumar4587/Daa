public class string9 {
  private int[] stringPattern(String pattern) {
    int[] lps = new int[pattern.length()];
    int length = 0;
    int i = 1;

    while (i < pattern.length()) {
      if (pattern.charAt(i) == pattern.charAt(length)) {
        lps[i] = ++length;
        i++;
      } else {
        if (length != 0) {
          length = lps[length - 1];
        } else {
          lps[i] = 0;
          i++;
        }
      }
    }
    return lps;
  }

  public void KMPsearch(String text, String pattern) {
    int[] lps = stringPattern(pattern);
    int i = 0;
    int j = 0;

    while (i < text.length()) {
      if (pattern.charAt(j) == text.charAt(i)) {
        i++;
        j++;
      }

      if (j == pattern.length()) {
        System.out.println("Pattern found at index: " + (i - j));
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
    string9 kmp = new string9();
    String text = "ABABDABACDABABCABAB";
    String pattern = "ABAB";
    kmp.KMPsearch(text, pattern);
  }
}

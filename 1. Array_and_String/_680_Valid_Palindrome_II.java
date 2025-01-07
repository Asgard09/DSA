public class _680_Valid_Palindrome_II {
    public static boolean validPalindrome(String s) {
        int j = s.length() -1 ;
        for (int i = 0; i <= j; i++) {
            if (s.charAt(i) != s.charAt(j) && i!=j-1) {
                return false;
            }else if (i == j - 1) {
                return true;
            }
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "deeee";
        System.out.println(validPalindrome(s));
    }
}

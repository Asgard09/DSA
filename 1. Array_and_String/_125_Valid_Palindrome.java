public class _125_Valid_Palindrome {
    public static boolean isPalindrome(String s) {
        String newString = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int j = newString.length()-1;
        for(int i = 0; i<=j; i++){
            if (newString.charAt(i) != newString.charAt(j)) {
                return false;
            }
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = " ";
        System.out.println(isPalindrome(s));
    }
}

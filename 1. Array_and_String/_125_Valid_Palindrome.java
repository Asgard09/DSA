public class _125_Valid_Palindrome {
    public boolean isPalindrome(String s) {
        String newString = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int i = 0;
        int j = newString.length()-1;

        while (i<j) {
            if (newString.charAt(i) != newString.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "Was it a car or a cat I saw?";
        System.out.println(s.toLowerCase());
    }
}

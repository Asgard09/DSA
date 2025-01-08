public class _680_Valid_Palindrome_II {
    public static boolean validPalindrome(String s) {
        int j = s.length()-1;
        int i = 0;
        while(i<=j){
            if(s.charAt(i) != s.charAt(j)){
                return isValid(s,i+1,j) || isValid(s,i,j-1);
            }
            i++;
            j--;
        }
        return true;
    }

    public static boolean isValid(String s, int i, int j){
        while(i<=j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "deeee";
        System.out.println(validPalindrome(s));
    }
}

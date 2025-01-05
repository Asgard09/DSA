public class _1221_Split_a_String_in_Balanced_Strings {
    public static int balancedStringSplit(String s) {
        int count = 0, left=0, right = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == 'R') {
                right++;
            }
            else {
                left++;
            }
            if (left ==  right) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s= "LLLLRRRR";
        System.out.println(balancedStringSplit(s));
    }
}

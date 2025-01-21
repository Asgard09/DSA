import java.util.HashSet;
import java.util.Set;

public class _3_Longest_Substring_Without_Repeating_Characters {
    public static int lengthOfLongestSubstring(String s) {
        int left = 0;
        int longest = 0;
        Set<Character> charSet = new HashSet<>();  
        for(int right = 0; right<s.length();right++ ){
            // ensure in the set dont have any character like 's.charAt(right)'
            // left will be increase correct
            while (charSet.contains(s.charAt(right))) {
                charSet.remove(s.charAt(left));
                left++;
            }
            charSet.add(s.charAt(right));
            longest = Math.max(longest, right - left + 1);
        }
        return longest;
    }

    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s));
    }
}

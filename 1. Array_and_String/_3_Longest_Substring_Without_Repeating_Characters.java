import java.util.HashSet;
import java.util.Set;

public class _3_Longest_Substring_Without_Repeating_Characters {
    public static int lengthOfLongestSubstring(String s) {
        Set<Character> mySet = new HashSet<>();
        int res = 0;
        int left = 0;

        for (int right = 0 ; right<s.length(); right++){
            while(mySet.contains(s.charAt(right))){
                mySet.remove(s.charAt(left));
                left++;
            }

            mySet.add(s.charAt(right));

            res = Math.max(res, mySet.size());
        }

        return res;
    }
    public static void main(String[] args) {
        String s = "dvdf";
        System.out.println(lengthOfLongestSubstring(s));
    }
}

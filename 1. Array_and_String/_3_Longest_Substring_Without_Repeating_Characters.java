import java.util.HashSet;
import java.util.Set;

public class _3_Longest_Substring_Without_Repeating_Characters {
    public static int lengthOfLongestSubstring(String s) {
        Set<Character> mySet = new HashSet<>();
        int res = 0;
        int firstIndexOfSet = 0;
        
        for (int i = 0 ; i<s.length(); i++){
            while(mySet.contains(s.charAt(i))){
                mySet.remove(s.charAt(firstIndexOfSet));
                firstIndexOfSet++;
            }

            mySet.add(s.charAt(i));

            res = Math.max(res, mySet.size());
        }

        return res;
    }
    public static void main(String[] args) {
        String s = "dvdf";
        System.out.println(lengthOfLongestSubstring(s));
    }
}

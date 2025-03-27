import java.util.HashMap;


public class _424_Longest_Repeating_Character_Replacement {
    public static int characterReplacement(String s, int k) {
        HashMap<Character, Integer> freqMap = new HashMap<>();
        int start = 0;
        int res = 0;
        int maxCountInMap = 0;

        for(int end = 0; end<s.length(); end++){
            freqMap.put(s.charAt(end), freqMap.getOrDefault(s.charAt(end), 0)+1);
            maxCountInMap = Math.max(maxCountInMap, freqMap.get(s.charAt(end)));

            while (end - start + 1 - maxCountInMap > k) {
                freqMap.put(s.charAt(start), freqMap.getOrDefault(s.charAt(start), 0) - 1);
                start++;
            }

            res = Math.max(res, end - start + 1);
        }

        return res;
    }

    public static void main(String[] args) {
        String s = "AABABBA";
        System.out.println(characterReplacement(s, 1));
    }
}

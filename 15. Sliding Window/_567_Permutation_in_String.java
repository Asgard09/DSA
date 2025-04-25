import java.util.HashMap;
/*
 * permutation just consider the number of elemnts not order --> use HashMap
 * when HashMap1 equals HashMap2 --> the result is true
 */
public class _567_Permutation_in_String {
    public static boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        HashMap<Character, Integer> s1Count = new HashMap<>();
        HashMap<Character, Integer> s2Count = new HashMap<>();

        for(int i = 0; i < s1.length(); i++){
            s1Count.put(s1.charAt(i), s1Count.getOrDefault(s1.charAt(i), 0) + 1);
            s2Count.put(s2.charAt(i), s2Count.getOrDefault(s2.charAt(i), 0) + 1);
        }

        if (s2Count.equals(s1Count)) return true;

        int start = 0;

        for(int end = s1.length(); end<s2.length(); end++){
            Character charEnd = s2.charAt(end);
            s2Count.put(charEnd, s2Count.getOrDefault(charEnd, 0) + 1);

            Character charStart = s2.charAt(start);
            s2Count.put(charStart, s2Count.get(charStart) - 1);
            
            if (s2Count.get(charStart) == 0) s2Count.remove(charStart);
            if (s2Count.equals(s1Count)) return true;

            start++;
        }

        return false;
    }

    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "lecabee";

        System.out.println(checkInclusion(s1, s2));
    }
}
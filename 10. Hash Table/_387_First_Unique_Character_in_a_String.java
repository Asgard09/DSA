import java.util.HashMap;
import java.util.Map;

public class _387_First_Unique_Character_in_a_String {
    public static int firstUniqChar(String s) {

        Map<Character, Integer> freqMap = new HashMap<>();
        
        // Count character frequencies
        for (char c : s.toCharArray()) {
            //If the key is not found in the map, it returns a default value
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }
        
        // Find the first unique character
        for (int i = 0; i < s.length(); ++i) {
            if (freqMap.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String s = "loveleetcode";
        System.out.println(firstUniqChar(s));
    }
}

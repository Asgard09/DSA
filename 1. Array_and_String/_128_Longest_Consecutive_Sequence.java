import java.util.Arrays;
import java.util.HashSet;


public class _128_Longest_Consecutive_Sequence {
    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0; 
        HashSet<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        int maxLen = 0;
        for (int num : numSet) {
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (numSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }
                maxLen = Math.max(maxLen, currentStreak);
            }
        }
        
        return maxLen;
    }

    public static void main(String[] args) {
        int[] nums = {0,3,7,2,5,8,4,6,0,1};
        System.out.println(longestConsecutive(nums));
    }
    
}
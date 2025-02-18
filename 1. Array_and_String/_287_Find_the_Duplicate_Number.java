import java.util.HashMap;
import java.util.Map;

public class _287_Find_the_Duplicate_Number {
    public static int findDuplicate(int[] nums) {
        HashMap<Integer, Integer> myMap = new HashMap<>();

        for (int num : nums) {
            myMap.put(num, myMap.getOrDefault(num, 0) + 1);
        }

        /*Access each entry in hashmap */
        for (Map.Entry<Integer,Integer> entry : myMap.entrySet()) {
            if (entry.getValue() >= 2 ) {
                return entry.getKey();
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
        System.out.println(findDuplicate(nums));
    }
}

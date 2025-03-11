import java.util.HashSet;
import java.util.Set;

public class _217_Contains_Duplicate {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> mySet = new HashSet<>();

        for (int num : nums) {
            if (mySet.contains(num)) {
                return true;
            }
            mySet.add(num);
        }

        return false;
    }
}

import java.util.HashSet;
import java.util.Set;

public class _219_Contains_Duplicate_II {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> mySet = new HashSet<>();
        int index = 0;
        int result = 0;
        for(int i=0;i<nums.length ;i++)
            if(mySet.contains(nums[i])){
                index = i;
                break;
            } 
            else{
                mySet.add(nums[i]);
            }
               
        for(int i = 0; i<nums.length;i++){     
            if(nums[i] == nums[index]){
                result = Math.abs(i - index);  
                break; 
            }
        }
        if (result<=k) {
            return true;
        }else{
            return false;
        }
        
    }

    public static void main(String[] args) {
        int[] nums = {1,0,1,1};
        int k = 1;
        System.out.println(containsNearbyDuplicate(nums, k));
    }
}

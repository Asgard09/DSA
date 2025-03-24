import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _15_3Sum {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        for(int i = 0; i<nums.length; i++){
            int target = -nums[i];
            int j = i + 1;
            int k = nums.length - 1;

            while(j<k){
                int sum = nums[j] + nums[k];
                if(sum < target){
                    j++;
                }else if(sum > target){
                    k--;
                }else{
                    res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    continue;
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums).toString());
    }

}

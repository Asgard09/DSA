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
            /*Avoid duplicate i */
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            while(j<k){
                int sum = nums[j] + nums[k];
                if(sum < target){
                    j++;
                }else if(sum > target){
                    k--;
                }else{
                    res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                    /*Avoid duplicate j */
                    while (j<k && nums[j] == nums[j-1]) {
                        j++;
                    }
                }
            }
        }

        return res;
    }


    public static void main(String[] args) {
        int[] nums = {2,-3,0,-2,-5,-5,-4,1,2,-2,2,0,2,-4,5,5,-10};
        System.out.println(threeSum(nums).toString());
    }

}

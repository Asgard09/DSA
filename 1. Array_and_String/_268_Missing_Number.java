public class _268_Missing_Number {
    public static int missingNumber(int[] nums) {
        int res = nums.length;
        for(int i = 0; i<nums.length; i++){
            res+=(i - nums[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {3, 0, 1};
        System.out.println(missingNumber(nums));
    }
}

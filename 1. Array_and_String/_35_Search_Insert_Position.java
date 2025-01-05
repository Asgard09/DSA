public class _35_Search_Insert_Position {
    public static int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int j = 0;
        int result = 0; 
        if(target > nums[n-1]){
            return result = nums.length;
        }else if(target == 0){
            return result = 0;
        }
        
        for(int i = 0;i<n;i++){
            j = i+1;
            if(target == nums[i]){
                result = i;
            }else if(target <nums[i]){
                result = i-1;
            }else if(target >nums[i] && target<nums[j]){
                result = j;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,5};
        int target = 2;
        System.out.println(searchInsert(nums, target));
    }
}

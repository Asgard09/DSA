/*Always take mid compare with right, left (right, left always is first and last index before change) */
public class _153_Find_Minimum_in_Rotated_Sorted_Array {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        int mid = 0;

        while(left < right){
            mid = (left+right)/2;
            if(nums[mid]>nums[right]){
                left = mid + 1;
            }else{
                right = mid;
            }
        }
        return nums[left];
    }
}

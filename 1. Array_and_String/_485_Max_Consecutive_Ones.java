public class _485_Max_Consecutive_Ones {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int result = 0;
        int resultMax = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==1){
                result++;
                if(resultMax<result){
                    resultMax = result;
                }
            }
            else{
                result=0;
                continue;
            }
        }
        return resultMax;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(nums));
        System.out.println("Done");
    }
}

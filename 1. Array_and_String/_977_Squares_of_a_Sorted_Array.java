public class _977_Squares_of_a_Sorted_Array {
    public static int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int n = nums.length;
        int i =-1;
        while ((i+1)<n && nums[i+1]<0) {
            i++;
        }
        int j =n;
        while ((j-1)>=0 && nums[j-1]>=0) {
            j--;
        }
        int k = 0;
        while (i>=0 || j<n) {
            if(i>=0 && j<n){
                int ii = nums[i]*nums[i];
                int jj = nums[j]*nums[j];
                if(ii<=jj){
                    result[k] = ii;
                    i--;k++;
                }
                else{
                    result[k] = jj;
                    j++;k++;
                }
            }
            else if(i>=0){
                result[k] = nums[i] * nums[i];
                i--;k++;
            }
            else{
                result[k] = nums[j] * nums[j];
                j++;k++;
            }
        }
        return result; 
    }

    public static void main(String[] args) {
        int arr[] = {-4,-1,0,3,10};
        int newarr[] = sortedSquares(arr);
        System.out.println("DONE");
    }
}

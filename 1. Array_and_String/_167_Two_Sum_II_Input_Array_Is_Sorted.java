public class _167_Two_Sum_II_Input_Array_Is_Sorted {
    public static int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length-1;
        int[] res = new int[2];
        while (i<j) {
            int sum = numbers[i] + numbers[j];
            if (sum > target) {
                j--;
            }else if (sum < target) {
                i++;
            }else{
                res[0] = i +1;
                res[1] = j + 1;
                return res;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] numbers = {2,7,11,15};
        int target = 9;

        twoSum(numbers, target);
    }
}

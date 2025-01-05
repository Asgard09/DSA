public class _136_Single_Number {
    public int singleNumber(int[] nums) {
        
        int ans=0; //since XOR with 0 returns same number 
        for(int i=0; i<nums.length; i++){
            ans ^= nums[i];  // ans = (ans) XOR (array element at i) 
        }
        return ans; 
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c = a | b;
        System.out.println(c);
    }
}

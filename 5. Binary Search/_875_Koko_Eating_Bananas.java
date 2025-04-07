import java.util.Arrays;

/*Create a separate class BinarySearch is not use all cases  */
public class _875_Koko_Eating_Bananas {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = Arrays.stream(piles).max().getAsInt();
        int res = right;

        while(left <= right){
            int mid = (left+right)/2;
            int totalTime = 0;

            for(int pile: piles){
                totalTime += Math.ceil((double)pile/mid);
            }
            
            if(totalTime <= h){
                res = mid;
                right = mid - 1;
            }else{
                left = mid + 1;
            }      
        }

        return res;
    }
}

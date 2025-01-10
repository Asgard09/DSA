import java.util.Arrays;

public class _881_Boats_to_Save_People {
    public static int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int i = 0;
        int j = people.length -1;
        int res = 0;

        while (i<=j) {
            if (people[i] + people[j] <= limit) {
                i++;
                j--;
            }else{
                j--;
            }
            res++;
        }

        return res;
    }

    public static void main(String[] args) {
        int[] people = {1,2};
        int limit = 3;
        System.out.println(numRescueBoats(people, limit));
    }
}

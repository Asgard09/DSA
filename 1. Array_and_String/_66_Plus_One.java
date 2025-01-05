public class _66_Plus_One {
    public static int[] plusOne(int[] digits) {
        
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            if (digits[i] < 10) {
                return digits; // No carry, return early
            }
            digits[i] = 0; // Reset current digit and carry over
        }
        // If carry is still there, add a new digit at the start


        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
        
    }

    public static void print(int[] digits, int length ){
        for (int i = 0; i < length; i++) {
            System.out.println(digits[i]);
        }
    }

    public static void main(String[] args) {
        int[] digits = {4,3,9};
        print(plusOne(digits), digits.length+1);

    }
}

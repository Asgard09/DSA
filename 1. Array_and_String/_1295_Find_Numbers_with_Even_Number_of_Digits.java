public class _1295_Find_Numbers_with_Even_Number_of_Digits {
    public  static int findNumbers(int[] nums) {
        int count = 0;
        for (int ai : nums) {
            if(Tinhsochuso(ai)%2==0){
                count++;
            }
        }
        return count;
    }

    private static int Tinhsochuso(int ai) {
        int ketqua = ai;
        int demchuso = 0;
        while (ketqua != 0) {
            ketqua = ai/10;
            ai = ketqua;
            demchuso++;
        }
        return demchuso;
    }

    public static void main(String[] args) {
        int[] arr ={12,345,2,6,7896};
        int result = findNumbers(arr);
        System.out.println(result);
    }
}

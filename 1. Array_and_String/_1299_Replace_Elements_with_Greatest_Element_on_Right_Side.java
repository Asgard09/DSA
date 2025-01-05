public class _1299_Replace_Elements_with_Greatest_Element_on_Right_Side {
    public static int[] replaceElements(int[] arr) {
        
        int n=arr.length;
        int maxRight=-1;
        for(int i=n-1;i>=0;i--){
            int current=arr[i];
            arr[i]=maxRight;
            if(current>maxRight){
                maxRight=current;
            }
        }
        return arr;
    }

    public static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = {17,18,5,4,6,1};
        print(replaceElements(arr));
    }
}

public class _Merge_Sorted_Arrays {
    public static void merge(int[] n1, int m, int[] n2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = (m+n) - 1;
        while(k>=0){
            if(i<0){
                n1[k] = n2[j];
                j--;
            }
            else if(j<0){
                n1[k] = n1[i];
                i--;
            }
            else if(n1[i]>n2[j]){
                n1[k] = n1[i];
                i--;
            }
            else{
                n1[k] = n2[j];
                j--;
            }
            k--;
        }
    }
    public static void main(String[] args) {
        int[] n1 ={1,2,3,0,0,0};
        int[] n2 ={2,5,6};

        merge(n1, 3, n2, 3);
        System.out.println("DONE");
    }
}

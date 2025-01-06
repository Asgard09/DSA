public class _11_Container_With_Most_Water {
    public static int maxArea(int[] h) {
        int i = 0;
        int j = h.length -1;
        int maxArea = 0;

        while (i<j) {
            int width = j - i;
            int height = Math.min(h[i], h[j]);
            int area = width*height;
            maxArea = Math.max(maxArea, area);

            //find the h max
            if (h[i] < h[j]) {
                i++;
            }else{
                j--;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] h = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(h));
    }
}

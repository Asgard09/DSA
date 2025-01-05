public class _1672_Richest_Customer_Wealth {
    public static int maximumWealth(int[][] accounts) {
        int max = 0;
        
        for (int i = 0; i < accounts.length; i++) {   
            int total = 0;
            for (int j = 0; j < accounts[0].length; j++) {
                total += accounts[i][j];
            }
            if (max<total) {
                max = total;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[][] accounts = {{1,5},{7,3},{3,5}};
        System.out.println(maximumWealth(accounts)); 
        System.out.println("Done");
    }
}

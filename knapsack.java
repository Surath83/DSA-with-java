public class knapsack {
    public static int KnapSack(int val[],int wt[],int W,int n,int dp[][]){
        //tabulation O(N*W)
        if(W==0 || n==0){
            return 0;
        }
        if(dp[n][W] != -1){
            return dp[n][W];
        }
        if(wt[n-1] <= W){
            int ans1 = val[n-1]+KnapSack(val,wt,W-wt[n-1],n-1,dp);
            int ans2 = KnapSack(val,wt,W,n-1,dp);
            dp[n][W]=Math.max(ans1, ans2);
            return dp[n][W];
        }else{
            dp[n][W]= KnapSack(val,wt,W,n-1,dp);
            return dp[n][W];
        }
    }
    public static int tab(int val[],int wt[],int W){
        int n = val.length;
        int dp[][] = new int[n+1][W+1];
        for(int i=0;i<dp.length;i++){
            dp[i][0]= 0;
        }
        for(int j=0;j<dp[0].length;j++){
            dp[0][j]=0;
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<W+1;j++){
                int v = val[i-1];
                int w = wt[i-1];
                if(w <= j){
                    int incProfit = v+dp[i-1][j-w];
                    int excProfit = dp[i-1][j];
                    dp[i][j]=Math.max(incProfit,excProfit);
                }else{
                    int excProfit = dp[i-1][j];
                    dp[i][j] = excProfit;
                }
            }
        }
        print(dp);
        return dp[n][W];
    }
    public static void print(int dp[][]){
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String Args[]){
        int val[] = { 15,14,10,45,30};
        int wt[] = {2,5,1,3,4};
        int W = 7;
        int dp[][] = new int [val.length+1][W+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j] = -1;
            }
        }
        //System.out.println(KnapSack(val,wt,W,val.length,dp));
        System.out.println(tab(val,wt,W));
    }
}

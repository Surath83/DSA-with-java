import java.util.*;
public class catalan{//memoization
    public static int CatalanRec(int n,int dp[]){
        if(n==0 || n==1){
            return 1;
        }
        if(dp[n] != -1){
            return dp[n];
        }
        int ans=0;
        for(int i=0;i<=n-1;i++){
            ans += CatalanRec(i,dp) * CatalanRec(n-i-1,dp);
        }
        return dp[n]=ans;
    }
    public static void main(String[] args) {
        int n = 5;
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println("Catalan number is " + CatalanRec(n,dp));
    }
}
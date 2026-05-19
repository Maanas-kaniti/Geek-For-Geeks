class Solution {
    static int solve(int n, int[] dp){
        int n1 = n/2;
        int n2 = n/3;
        int n3 = n/4;
        if(n1+n2+n3<=n){
            return n;
        }
        if(dp[n]!=0){
            return dp[n];
        }
        dp[n] = solve(n/2,dp)+solve(n/3,dp)+solve(n/4,dp);
        return dp[n];
    }
    public int maxSum(int n) {
        int[] dp = new int[n+1];
        return solve(n , dp);
    }
}

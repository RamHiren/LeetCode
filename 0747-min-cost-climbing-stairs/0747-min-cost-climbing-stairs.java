class Solution {
    // public int minCostClimbingStairs(int[] c) {
    //     return rec(c.length,c);
    // }
    // public int rec(int i,int[]c){
    //     if(i==0||i==1){
    //         return 0;
    //     }

    //     int one = c[i-1] + rec(i-1,c);
    //     int second = c[i-2] + rec(i-2,c);
    //     return Math.min(one,second);
    // }

    // public int minCostClimbingStairs(int[] c) {
    //     int dp[] = new int[c.length+1];
    //     Arrays.fill(dp,-1);
    //     return rec(c.length,c,dp);
    // }
    // public int rec(int i,int[]c,int []dp){
    //     if(i==0||i==1){
    //         dp[i]=0;
    //         return 0;
    //     }
    //     if(dp[i]!=-1){
    //         return dp[i];
    //     }

    //     int one = c[i-1] + rec(i-1,c,dp);
    //     int second = c[i-2] + rec(i-2,c,dp);
    //     dp[i] = Math.min(one,second);
    //     return dp[i];
    // }

    public int minCostClimbingStairs(int[] c) {
      int p2 =0;
      int p1 =0;
      int ans =0;
      for(int i=2;i<=c.length;i++){
        int one = c[i-1] + p1;
        int second = c[i-2]+ p2;
        ans = Math.min(one,second);
        p2=p1;
        p1=ans;
      }
      return ans;
    }
}
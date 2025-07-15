class Solution {
    // public int rob(int[] a) {
    //     int dp[] = new int[a.length];
    //     Array.fill(dp,-1);
    //     return rec(a,a.length-1);
    // }

    // public int rec(int[] a,int i,dp){
    //     if(i==0){
    //         dp[i] = a[0];
    //         return a[0];
    //     }
    //     if(i==-1){
    //         dp[i] = -
    //         return 0;
    //     }

    //     if(dp!=-1)return dp[i];

    //     int last = Math.max(a[i]+rec(a,i-2),0+rec(a,i-1));
    //     return last;
    // }


    // public int rob(int[] a) {
    //     int dp[] = new int[a.length+1];
    //     Arrays.fill(dp,-1);
    //     return rec(a,a.length,dp);
    // }

    // public int rec(int[] a,int i,int[] dp){
    //     if(i==1){
    //         dp[i] = a[0];
    //         return a[0];
    //     }
    //     if(i==0){
    //         dp[i] = 0;
    //         return 0;
    //     }

    //     if(dp[i]!=-1)return dp[i];

    //     int pick = a[i-1]+rec(a,i-2,dp);
    //     int nopick = 0+ rec(a,i-1,dp);
    //     dp[i] = Math.max(pick,nopick);
    //     return dp[i];
    // }

    public int rob(int[] a) {
        int dp[] = new int[a.length+1];
        dp[0] = 0;
        dp[1] = a[0];
       for(int i=2;i<a.length+1;i++){
        int pick = a[i-1] + dp[i-2];
        int noPick = 0 + dp[i-1];
        dp[i] = Math.max(pick,noPick);
       }
        return dp[a.length];
    }

    
}
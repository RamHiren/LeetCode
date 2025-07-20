class Solution {
    public int minimumTotal(List<List<Integer>> l) {

       int dp [][] = new int [l.size()][l.get(l.size()-1).size()];

       for(int [] r:dp){
        Arrays.fill(r,Integer.MAX_VALUE);
       }
       int s=helper(l,0,0,dp);


        return s;
    }

    public int helper(List<List<Integer>> l,int i,int j,int[][] dp){
        if(l.size()<=i){
           
            return 0;
        }

        if(dp[i][j]!=Integer.MAX_VALUE){
            return dp[i][j];
        }

       int d = Math.min(helper(l,i+1,j,dp),helper(l,i+1,j+1,dp));
        dp[i][j] =  l.get(i).get(j)+d;
        return l.get(i).get(j)+d;
    }

}
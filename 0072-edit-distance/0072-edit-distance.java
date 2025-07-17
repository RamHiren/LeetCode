class Solution {
    public int minDistance(String w1, String w2) {
        int m = w1.length();
        int n = w2.length();
        int [][] ans = new int[m+1][n+1];

        for(int i=1;i<m+1;++i)ans[i][0]=i;
        for(int j=1;j<n+1;++j)ans[0][j]=j;

        for(int i=1;i<=m;++i){
            for(int j=1;j<=n;++j){
                if(w1.charAt(i-1)==w2.charAt(j-1)){
                    ans[i][j]=ans[i-1][j-1];
                }else{
                    ans[i][j] = Math.min(ans[i][j-1],Math.min(ans[i-1][j-1],ans[i-1][j]))+1;
                }
            }
        }

        return ans[m][n];
    }
}
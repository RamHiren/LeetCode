class Solution {
    public int maxProfit(int[] a) {
        int m = Integer.MAX_VALUE;
        int ans=0;

        for(int i=0;i<a.length;i++){
            if(a[i]<m){
                m=a[i];
            }else{
                ans = Math.max(ans,a[i]-m);
            }
        }
        return ans;
    }
}
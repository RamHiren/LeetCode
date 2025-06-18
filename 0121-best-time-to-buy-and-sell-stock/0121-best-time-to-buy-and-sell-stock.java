class Solution {
    public int maxProfit(int[] a) {
        int min = Integer.MAX_VALUE;
        int ans = 0;

        for(int i=0;i<a.length;i++){
            if(min>a[i]){
                min = a[i];
            }else{
                ans = Math.max(ans,a[i]-min);
            }
        }
        return ans;
    }
}
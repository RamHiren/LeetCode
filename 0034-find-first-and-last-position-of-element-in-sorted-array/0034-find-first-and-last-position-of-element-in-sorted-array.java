class Solution {
    public int[] searchRange(int[] a, int t) {
        int [] ans= {-1,-1};
        int f =0;
        
        for(int i=0;i<a.length;i++){
            if(a[i]==t){
                if(f==0){
                    ans[0] = i;
                    f=1;
                }
                ans[1]=i;
            }
        }

        return ans;
    }
}
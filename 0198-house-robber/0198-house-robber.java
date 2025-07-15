class Solution {
    public int rob(int[] a) {
        if(a.length==1){
            return a[0];
        }
        if(a.length==2){
            return Math.max(a[0],a[1]);
        }

        int t[] = new int[a.length+1];

        for(int i=0;i<a.length;i++){
            if(i<2){
                t[i+1] = a[i];
            }else{
                t[i+1] = Math.max(t[i-1],t[i-2]) + a[i];
            }
        }

        int ans =t[0];
        for(int i:t){
            ans = Math.max(i,ans);
        }
        return ans;
    }
}
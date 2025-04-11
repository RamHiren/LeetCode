class Solution {
    public int jump(int[] a) {
        if(a.length == 1) return 0;
        int ans =0;

        int finalPos =a.length -1;
        int cover = 0,lastJump = 0;

        for(int i=0;i<a.length;i++){
            cover = Math.max(cover,a[i]+i);

            if(i==lastJump){
                lastJump = cover;
                ans++;
            
            if(cover>=finalPos) return ans;
            }
        }

        return ans;
        
    }
}
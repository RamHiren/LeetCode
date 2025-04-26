class Solution {
    public int maxArea(int[] a) {
        int i=0;
        int j =a.length-1;
        

        int ans =0;
        while(i<j){
            int w = Math.abs(j - i);
            int h = Math.min(a[i],a[j]);

            ans = Math.max(ans,w*h);

            if(a[i]<a[j]){
                i++;
            }else{
                j--;
            }
        }

        return ans;
    }
}
class Solution {
    public int maxArea(int[] a) {
        int ans = 0;
        int s = 0;
        int e = a.length-1;


        while(s<e){
            int h = Math.min(a[s],a[e]);
            int w = e-s;
            int c = w*h;

            ans = Math.max(ans, c);
            if(a[s] < a[e]){
               s++;
            }else{
                e--;
            }
        }

        return ans;
    }
}
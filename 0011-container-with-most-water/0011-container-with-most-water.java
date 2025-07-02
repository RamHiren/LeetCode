class Solution {
    public int maxArea(int[] a) {
        int i=0;
        int j =a.length-1;
        int max =0;

        while(i<j){
            int h = Math.min(a[i],a[j]);
            int w = j-i;

            max = Math.max(max,h*w);

            if(h==a[i]){
                i++;
            }else{
                j--;
            }
        }

        return max;
    }
}
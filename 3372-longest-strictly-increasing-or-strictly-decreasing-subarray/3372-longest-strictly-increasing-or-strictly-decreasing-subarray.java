class Solution {
    public int longestMonotonicSubarray(int[] a) {
        int max =1;
        int in=1,de=1;

        for(int i=1;i<a.length;i++){
            if(a[i-1]<a[i]){
                in++;
                de=1;
            }
            else if(a[i-1]>a[i]){
                de++;
                in=1;
            }else{
                de=1;
                in=1;
            }
            max=Math.max(max,Math.max(in,de));
        }

       
        // if(max==0) return 1;

        return max;
    }
}
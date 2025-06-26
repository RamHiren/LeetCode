class Solution {
    public int maximumGap(int[] a) {
        if(a.length<2)return 0;
        Arrays.sort(a);
        int max =Integer.MIN_VALUE;
        
        for(int i=0;i<a.length-1;i++){
            max = Math.max(max,a[i+1]-a[i]);
        }

        return max;
    }
}
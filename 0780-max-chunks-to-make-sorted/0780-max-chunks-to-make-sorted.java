class Solution {
    public int maxChunksToSorted(int[] a) {
        int c=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            max=Math.max(max,a[i]);
            if(max < i+1){
                c++;
            }
        }
        
        return c;
    }
}
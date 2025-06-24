class Solution {
    public int pivotIndex(int[] a) {
        int sum =0;
        for(int i:a)sum+=i;

        int s =0;
        for(int i=0;i<a.length;i++){
            if(s==(sum-s-a[i])){
                return i;
            }
            s += a[i];
        }

        return -1;
    }
}
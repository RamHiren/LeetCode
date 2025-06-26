class Solution {
    public int findPeakElement(int[] a) {
        for(int i=0;i<a.length;i++){
            if((i==0 || a[i-1]<a[i]) &&((i==a.length-1) || a[i]>a[i+1])) return i;
        }
    return 0;

    }

}
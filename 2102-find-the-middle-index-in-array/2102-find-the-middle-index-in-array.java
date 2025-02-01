class Solution {
    public int findMiddleIndex(int[] a) {
        for(int i=0;i<a.length;i++){
            int l=0,r=0;
            for(int j=0;j<i;j++){
                l +=a[j];
            }
            for(int j=i+1;j<a.length;j++){
                r +=a[j];
            }

            if(r == l) return i;
        }
        return -1;
    }
}
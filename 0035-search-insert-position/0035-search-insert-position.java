class Solution {
    public int searchInsert(int[] a, int t) {
        int s=0;
        int e =a.length-1;

        while(s<=e){
            int m = s + (e-s)/2;

            if(a[m]==t){
                return m;
            }else if(a[m]>t){
                e = m-1;
            }else{
                s =m+1;
            }

        }
        return s;
    }
}
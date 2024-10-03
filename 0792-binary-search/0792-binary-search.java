class Solution {
    public int search(int[] a, int t) {
        int s =0;
        int e = a.length-1;

        while(s<=e){
            int m = s + (e-s)/2;

            if(t >a[m]){
                s =m +1;
            }else if(t<a[m]){
                e= m-1;
            }else{
                return m;
            }
        }
        return -1;
    }
}
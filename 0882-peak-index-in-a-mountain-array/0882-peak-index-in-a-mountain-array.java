class Solution {
    public int peakIndexInMountainArray(int[] a) {
        int s = 1;
        int e = a.length-2;
        
        while(s<=e){
            int m = (s+e)/2;
            if(a[m]>a[m-1] && a[m+1]<a[m]){
              return m;
            }
            else if(a[m+1]>a[m]){
                s = m+1;
            }else{
                e=m-1;
            }
        }
        return 0;
    }
}
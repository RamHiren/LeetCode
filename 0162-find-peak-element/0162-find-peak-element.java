class Solution {
    public int findPeakElement(int[] a) {
        // if(a.length == 1){
        //     return 0;
        // }
        // if(a.length == 2){
        //     if(a[0]>a[1]) return 0;
        //     else return 1;
        // }
        int s =1;
        int e = a.length -1;


        while(s<=e){
            int m = s + (e-s)/2;
            
            if(a[m]>a[(m+1)%a.length]&&a[m]>a[m-1]){
                return m;
            }else if(a[m]<a[(m+1)%a.length]){
                s = m +1;
            }else{
                e = m-1;
            }
        }
        return 0;
    }
}
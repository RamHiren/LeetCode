class Solution {
    public boolean search(int[] a, int t) {
        int s =0;
        int e = a.length -1;

        while(s<=e){
            int m = s + (e-s)/2;

            if(a[m]==t){
                return true;
            }

             if (a[s] == a[m]) {
                s++;
                continue;
            }
            
            if(a[s]<=a[m]){
                if(a[s]<=t && t<=a[m]){
                    e=m-1;
                }else{
                    s=m+1;
                }
            }else{
                if(a[m]<=t && t<=a[e]){
                    s = m+1;
                }else{
                    e = m-1;
                }
            }
        }

        return false;
    }
}
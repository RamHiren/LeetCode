class Solution {
    public int search(int[] a, int t) {
        int s =0;
        int e = a.length-1;

        while(s<=e){
            int m = s+(e-s)/2;
            if(a[m]==t){
                return m;
            }
            if(a[s]<=a[m]){ // left part sorted
                if(a[s]<=t && t<=a[m]){ //Left ma element aavelo che
                    e = m-1;
                }else{ //right ma element aavelo che
                    s = m+1;
                }
            }else{ //Right Part Sorted
                if(a[m]<=t && t<=a[e]){ //left ma j elemant aavelo che 
                    s = m+1;
                }else{ //right ma j elemant aavelo che
                    e = m-1;
                }
            }
        }
        return -1;
    }
}
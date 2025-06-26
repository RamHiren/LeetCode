class Solution {
    public char nextGreatestLetter(char[] a, char t) {
        int s =0;
        int e =a.length-1;
        int i=0;
        while(s<=e){
            int m = s + (e-s)/2;

            if(a[m]>t){
                i = m;
                e = m-1;
            }else{
                s=m+1;
            }
        }
        return a[i];
    }
}
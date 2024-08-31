class Solution {
    public int findNumbers(int[] a) {
        int c =0;
        for(int i=0;i<a.length;i++){
            int f=0;
            while(a[i]>0){
                a[i]/=10;
                f++;
            }
            if(f%2==0){
                c++;
            }
        }
        return c;
    }
}
class Solution {
    public int maxProfit(int[] a) {
       int m =0;

       for(int i=0;i<a.length-1;i++){
        if(a[i+1]-a[i]>0){
            m+=a[i+1]-a[i];
        }
       }
       return m;
    }
}
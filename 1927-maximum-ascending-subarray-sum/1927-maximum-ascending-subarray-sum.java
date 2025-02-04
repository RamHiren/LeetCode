class Solution {
    public int maxAscendingSum(int[] a) {
        int m=0;
        int s=a[0];

        for(int i=1;i<a.length;i++){
            if(a[i-1]<a[i]){
               
                s += a[i];
            }else{
                if(m<s){
                    m=s;
                   
                }
                s=0;
                s=a[i];
            }

        }


        return Math.max(m,s);
    }
}
class Solution {
    public int maxProduct(int[] a) {
        int max=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                 if(i==j) continue;
                if((a[i]-1)*(a[j]-1)>max){
                    max=(a[i]-1)*(a[j]-1);
                }
            }
        }
        return max;
    }
}
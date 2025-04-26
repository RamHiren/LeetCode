class Solution {
    public int[] twoSum(int[] a, int t) {
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]+a[j]==t){
                    return  new int[]{i+1,j+1};
                }
            }
        }
         return new int[]{-1,-1};
    }
}
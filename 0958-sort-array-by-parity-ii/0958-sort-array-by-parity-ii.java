class Solution {
    public int[] sortArrayByParityII(int[] a) {
         int[] ans = new int[a.length];

        int j=0;
         for(int i:a){
            if(i%2==0){
                ans[j]=i;
                j=j+2;
            }
         }
         j=1;
         for(int i:a){
            if(i%2!=0){
                ans[j]=i;
                j=j+2;
            }
         }
        return ans;
    }
}
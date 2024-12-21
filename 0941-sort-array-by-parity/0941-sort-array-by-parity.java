class Solution {
    public int[] sortArrayByParity(int[] a) {
        int[] ans = new int[a.length];
        int j=0;
        for(int i:a){
            if(i%2==0){
                ans[j++]=i;
            }
        }
        for(int i:a){
            if(i%2!=0){
                ans[j++]=i;
            }
        }
        return ans;
    }
}
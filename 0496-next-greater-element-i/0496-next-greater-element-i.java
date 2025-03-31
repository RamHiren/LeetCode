class Solution {
    public int[] nextGreaterElement(int[] a, int[] b) {
        int [] ans = new int[a.length];
        for(int i =0;i<a.length;i++){
            int j = 0;
            for(int k =0 ; k<b.length;k++){
                if(a[i]==b[k]){
                    j=k;
                    break;
                }
            }
            ans[i]=-1;
            for(int k = j;k<b.length;k++){
                if(a[i]<b[k]){
                    ans[i]=b[k];
                    break;
                }
            }
        }
        return ans;
    }
}